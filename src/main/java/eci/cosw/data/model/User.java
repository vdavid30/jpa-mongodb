package eci.cosw.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;

    private String name;
    private String email;
    public User(){ }
    public User(String id, String name, String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    @Override
    public String toString() {
        return String.format(
                "User[id=%s, name='%s', email='%s']",
                id, name, email);
    }
    public String getEmail() { return email; }

    public String getId() { return id; }

    public String getName() { return name; }

    public void setEmail(String email) { this.email = email; }

    public void setId(String id) { this.id = id; }

    public void setName(String name) { this.name = name; }


}
