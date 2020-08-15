package lv.ksenija_java.springProject.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserAndRole {
    private @Id @GeneratedValue long id;
    private String userName;
    private String role;

    public UserAndRole() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserAndRole(String userName, String role) {
        this.userName = userName;
        this.role = role;

    }

}
