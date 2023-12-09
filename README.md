API uses JPA repository model.
Each Entity has RESTAPI interface where routes/filters are defined.
spring data JPA has naming conventions that you must follow, a guide with details available here (https://www.javaguides.net/2018/11/spring-data-jpa-query-creation-from-method-names.html).

To build Docker Image:
  -> I chose maven lifecycle menu, hold ctrl and highlighted 'clean' + 'package', which builds the jar file. There are other ways, but this works.
  -> next open my terminal and run 'docker build -t keyin/qap2_dec_2023 .' 
  -> confirm the image 'keyin/qap2_dec_2023:latest' was created in docker desktop
  -> back in terminal run 'docker-compose up' (will use docker-compose.yml to launch image with specified config.)

  application should now be running from docker image, can confirm in docker desktop that status is running.
  Assuming mysql service is running you should be able to start testing with postman.

  Postman collection to be uploaded with project as well.
  
