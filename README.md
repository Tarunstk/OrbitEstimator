# OrbitEstimator
An application that computes your satellite orbit based on the orbital parameters provided at epoch. 

### How to run
This application can be run on docker by using cloning the repo and running the docker command. 

Prerequisites: You will need docker installed in your machine. 

1) Clone this Project. 
2) After cloning from your terminal run: docker compose start. 
3) This should 2 containers: One containing the Springboot Application and the other a PostgreSQL database. 
4) Use Postman to test the appliation. 
5) The docker container containing the Springboot application is exposed on port 8081. 
6) On Postman you can use the following HTTP get request: http://localhost:8081/home/satellites to fetch Keplerian data of all satellites in the database. 
