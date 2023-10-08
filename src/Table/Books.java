
package Table;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
@Entity
public class Books implements Serializable{
    @Id
    private String SerialNumber;
    private String BookName;
    private String AuthorName;
    private String PublicationYear;
    private  int PurchasingPrice;
    private int NumberOfAvailbleBook;
    private String PublicationDate;
    @Column(nullable = false,columnDefinition = "mediumblob")
    private  byte [] profile;

    public byte[] getProfile() {
        return profile;
    }

    public void setProfile(byte[] profile) {
        this.profile = profile;
    }
       @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ClientBooksRelation",joinColumns = @JoinColumn(name ="SerialNumber"),inverseJoinColumns = @JoinColumn(name = "TelephoneNumber"))
    private List<Client>clients;

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public String getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(String PublicationYear) {
        this.PublicationYear = PublicationYear;
    }

    public int getPurchasingPrice() {
        return PurchasingPrice;
    }

    public void setPurchasingPrice(int PurchasingPrice) {
        this.PurchasingPrice = PurchasingPrice;
    }

    public int getNumberOfAvailbleBook() {
        return NumberOfAvailbleBook;
    }

    public void setNumberOfAvailbleBook(int NumberOfAvailbleBook) {
        this.NumberOfAvailbleBook = NumberOfAvailbleBook;
    }
    public String getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(String PublicationDate) {
        this.PublicationDate = PublicationDate;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

  
}
