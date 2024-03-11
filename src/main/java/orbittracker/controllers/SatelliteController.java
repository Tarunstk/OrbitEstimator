package orbittracker.controllers;

import orbittracker.models.JulianDate;
import orbittracker.models.Satellite;
import orbittracker.services.JulianDateService;
import orbittracker.services.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/satellites")
public class SatelliteController {

    private final SatelliteService satelliteService;
    private final JulianDateService julianDateService;

    @Autowired
    public SatelliteController(SatelliteService satelliteService, JulianDateService julianDateService) {
        this.satelliteService = satelliteService;
        this.julianDateService = julianDateService;
    }

    @PostMapping({"add", "add/"})
    public void addSatellite(@RequestBody Satellite satellite) {
        satelliteService.addSatellite(satellite);
    }

    @GetMapping({"julian_date", "julian_date/"})
    public Double getJulianDate(@RequestBody Optional<JulianDate> julianDate) {
        return julianDate.map(julianDateService::getJD).orElseGet(() -> julianDateService.getJD(null));
    }

    @GetMapping({"", "/"})
    public List<Satellite> getAllSatellites() {
        return satelliteService.getAllSats();
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getSatelliteByName(@PathVariable String name, UriComponentsBuilder builder) {
        // Remove trailing slashes and handle the request
        String cleanedName = cleanTrailingSlashes(name);

        List<Satellite> startingMatches = satelliteService.getStartingMatches(cleanedName);
        if (!startingMatches.isEmpty()) {
            // Return the list of starting matches
            return ResponseEntity.ok(startingMatches);
        }

        Satellite exactMatch = satelliteService.getSat(cleanedName);
        if (exactMatch != null) {
            // Return the exact match
            return ResponseEntity.ok(exactMatch);
        }

        // No matches found
        return ResponseEntity.notFound().build();
    }

    // Helper method to remove trailing slashes
    private String cleanTrailingSlashes(String input) {
        return input.replaceAll("/+$", "");
    }


}
