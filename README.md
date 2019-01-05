# Java-Rest-API-Client
Java Clint for making calls to TOL Site via REST API, getting data from endpoint, and writing data to DB. Uses JAX-RS &amp; JPA (Jersey &amp; Hibernate).

Due to build requirements and constraints that i placed on this app (a time-sensitive build that will never see production release and will only ever run a couple of times), I decided to leave out the bells and whistles. Had I built it for release or for reuse of any kind, I would have implemented some form of error handling capabilities. 

As it is a very simple design with few dependencies, I left out Spring & Maven.

Neither TesterService.java nor Book.java are used in final build. TesterService.java is exactly what it sounds like. I left it in just in case I need to make any changes. You never know. Book.java, on the other hand, is the DTO that I was using before I realized that the structure on the server contained a nested class for the price info. I just left it in to "show my work".
 

