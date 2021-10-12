package modules.user.domain;

 import modules.utils.IdGenerator;

 import javax.persistence.Entity;
 import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int userid;
    private String role;
    private String username;


    public User(){

    }
    public User(String username) {
        userid = (int) IdGenerator.getNextId();
        role = "user";
        this.username = username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}