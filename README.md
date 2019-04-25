# eventApp [SpringBoot + Spring Data JPA] 

#IDE : Intellij IDEA 2018.2.4 (Community Edition). 

#postman : testing (localhost:8080/createsalle    > Headers>__```key:Content-Type __Value:application/json) 


Run Spring Boot app using Maven: 
```
mvn spring-boot:run
```
_____________________________________


eventApp is an application for making room reservation for 2 types of rooms : 

training(formation)/meeting(reunion).



# Identifications of the actors

As part of our analysis, the actors we have identified are:


• The administrator(super admin) : he is responsible for the different settings of the application. Its role is to manage 

environments and users.


• the trainer: it is the actor whose main role is to reserve a room for training or a meeting at a specific date.


• Room manager: the actor whose main role is to prepare the training / meeting rooms according to the list of reservations.


















