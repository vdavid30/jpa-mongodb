package eci.cosw.data.model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@Configuration
public class AppConfiguration {

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {

        // Set credentials
        MongoCredential credential = MongoCredential.createCredential("vdavid30", "davidlabdatabase", "fcpremix79".toCharArray());
        ServerAddress serverAddress = new ServerAddress("ds119442.mlab.com", 19442);

        // Mongo Client
        MongoClient mongoClient = new MongoClient(serverAddress, credential, new MongoClientOptions.Builder().build());


        return new SimpleMongoDbFactory(mongoClient, "davidlabdatabase");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is("Alice"));
        Customer customer = mongoOperation.findOne(query, Customer.class);


        return mongoTemplate;

    }

}
