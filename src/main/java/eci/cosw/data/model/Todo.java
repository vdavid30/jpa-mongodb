package eci.cosw.data.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Todo {
    @Id
    private String responsible;

    private String description;
    private int priority;
    private String dueDate;
    private String status;
    public Todo(){}
    public Todo(String description, int priority, String dueDate, String responsible, String status){
        this.description=description;
        this.priority=priority;
        this.dueDate=dueDate;
        this.responsible=responsible;
        this.status=status;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo[description=%s, priority='%s', dueDate='%s',responsible='%s',status='%s']",
                description, priority, dueDate, responsible, status);
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getResponsible() {
        return responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
