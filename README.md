# jpa-mongodb
Create a Spring Boot Application that connects with MongoDB.


1. Create a free Mongo DB Hosting account on Mlab:

    https://mlab.com/signup/
    
2. Configure the datbase:

    * Create new database of SANDBOX Type
    
        ![](img/step-1.png)
    
    * Select any region
    
        ![](img/step-2.png)

    * Give a name to your DB
    
        ![](img/step-3.png)
        
    * Once your database is created copy the uri and replace the value on your application.properties
    
        ![](img/step-4.png)
        
    * Create a user and then replace the <dbuser> and <dbpassword>  on the MongoDB URI
    
        ![](img/step-5.png)
    
        
3. Download the sample project and replace the values on application.properties file with the ones from the database you created at Mlab.


4. Run the project and verify that the connection is correct.


5. Create two more models (User and Todo) with the following structure:

    User
    ````Javascript
        
        {
            "id": "12354",
            "name": "Charles Darwin",
            "email": "charles@natural.com"
        }
        
     
    ````     
    
    Todo
    ````Javascript
        
        {
            "description": "travel to Galapagos",
            "priority": 10,
            "dueDate": "Jan 10 - 1860"
            "responsible": "charles@natural.com"
            "status": "pending"
        }
    ````                  
    
    
6. Create a repository for each model(use the *CustomerRepository* as reference)     