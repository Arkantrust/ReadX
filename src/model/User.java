package model;
import java.util.Calendar;

public abstract class User {

    protected String name;
    protected String id;
    protected Calendar initDate; // Date the user signed up
    
    public User(String name, String id, Calendar initDate) {
        this.name = name;
        this.id = id;
        this.initDate = initDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
    public Calendar getInitDate() {
        return initDate;
    }
    public void setInitDate(Calendar initDate) {
        this.initDate = initDate;
    }
}
