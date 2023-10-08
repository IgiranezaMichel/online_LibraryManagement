
package Table;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
@Entity
public class Client implements Serializable{
    @Id
    private String TelephoneNumber;
    private String Names;
    private String Gender;
    private String Profile;
    private String username;
    private String Password;
       @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ClientBooksRelation",joinColumns = @JoinColumn(name ="TelephoneNumber"),inverseJoinColumns = @JoinColumn(name = "SerialNumber"))
    private List<Books>books;

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getProfile() {
        return Profile;
    }

    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
