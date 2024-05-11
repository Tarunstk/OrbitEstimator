# OrbitEstimator
An application that computes your satellite orbit based on the orbital parameters provided at epoch. 

### How to run
This application can be run on docker. You will need to  clone the repo and run the docker commands. 

Prerequisites: You will need docker installed in your machine. 

1) Clone this Project. 
2) After cloning, navigate to the project directory from your terminal and run: ********docker compose start********.
3) This should start 2 containers: One containing the Springboot Application and the other a PostgreSQL database. 
4) Use Postman to test the application. 
5) The docker container containing the Springboot application is exposed on port 8081. 
6) On Postman you can use the following HTTP get request: http://localhost:8081/home/satellites to fetch Keplerian data of all satellites in the database. 
