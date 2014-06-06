package jp.pizza;

import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class PizzaData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String pizza;
     
    @Persistent
    private String name;
    
    @Persistent
    private String address;
    
    @Persistent
    private String tel;
     
    @Persistent
    private String comment;
     
    @Persistent
    private Date datetime;
 
    public PizzaData(String pizza,String name, String address, String tel,String comment, Date datetime) {
        super();
        this.pizza = pizza;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.comment = comment;
        this.datetime = datetime;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getPizza() {
        return pizza;
    }
 
    public void setPizza(String pizza) {
        this.pizza = pizza;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getTel() {
        return tel;
    }
 
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    public String getComment() {
        return comment;
    }
 
    public void setComment(String comment) {
        this.comment = comment;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
