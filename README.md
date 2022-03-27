# MVC Application Using Java and HTML
This is a simple to-do list web application that communicates with a MySQL database, built using Spring Framework (Java) and Maven.

## Running the App
To run the to-do list app:
1. Download the source code and move to the required destination.
2. Open the working directory in Spring Tool Suite 4.
3. Open `/src/main/resources/application.properties`.
4. Change the MySQL attributes according to your convinience. <br>
    1. Change `todolist` in _spring.datasource.url_ to your schema's name.
    2. Change `root` in _spring.datasource.username_ to the required user name.
    3. Change `password` in _spring.datasource.password_ to the respective user's password.
    4. Save and close the file.
5. Right click the project folder `to-do-list`, goto `Run As` and click on `Spring Boot App`.

Your app is now running! It can be viewed @ `localhost:8080`!

## Output Screenshots
### Adding Tasks ###
![Add Task](https://github.com/HariRaagavTR/todolist-using-spring-maven/blob/main/screenshots/AddTask.jpg)
![Task Added](https://github.com/HariRaagavTR/todolist-using-spring-maven/blob/main/screenshots/TaskAdded.jpg)
### Updating Tasks ###
![Update Task](https://github.com/HariRaagavTR/todolist-using-spring-maven/blob/main/screenshots/UpdateTask.jpg)
![Task Updated](https://github.com/HariRaagavTR/todolist-using-spring-maven/blob/main/screenshots/TaskUpdated.jpg)
### Deleting Tasks ###
![Task Deleted](https://github.com/HariRaagavTR/todolist-using-spring-maven/blob/main/screenshots/TaskDeleted.jpg)
