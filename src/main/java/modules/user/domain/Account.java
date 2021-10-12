package modules.user.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Account {
    @Id
    private int accountId;
    private String username;
    private String firstname;
    private String lastname;
    private String prefix;
    private String email;
    public String password;
    private Date date;

    @OneToMany
    @JoinColumn
    private List<User> users = new ArrayList<>();

    private static ArrayList<Account> alleAccounts = new ArrayList<>();


    public Account(int accountId,String username, String firstname, String lastname, String prefix, String email, String password, Date date) {
        this.accountId = accountId;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.prefix = prefix;
        this.email = email;
        this.password = password;
        this.date = date;

    }

    public Account(String username, String firstname, String lastname, String prefix, String email, String password) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.prefix = prefix;
        this.email = email;
        this.password = password;
        this.date = new Date();

    }


    public static Account createUser(int accountId, String username, String firstname, String lastname, String prefix, String email, String password, Date date) {
        if(alleAccounts.stream().noneMatch(e -> e.username.equals(username))){
            Account account = new Account(accountId, username, firstname, lastname,prefix, email, password, date);
            return account;
        }
        else if (username.equals("") || password.equals("")){
            return null;
        }
        return null;
    }

    public Account() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAccountid() {
        return accountId;
    }

    public void setAccountid(int accountid) {
        this.accountId = accountid;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}