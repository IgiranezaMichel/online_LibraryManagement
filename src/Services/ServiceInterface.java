/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Table.Books;
import Table.Client;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServiceInterface extends Remote{
    public String InsertCLientSignUp(Client c) throws RemoteException;
    public List<Client> VerifyClient(String username, String password)throws RemoteException;
    public String SaveBooks(Books b) throws RemoteException;

    public String UpdateBook(Books b) throws RemoteException;

    public String DeleteBook(Books b) throws RemoteException;

    public List<Books> DisplayBooks() throws RemoteException;

    public String PurchasedBooks(String SerialNumber, String TelNum)throws RemoteException;

    public List<Client> DisplayPurchasedBooks() throws RemoteException;

    public List<Client> DisplayPurchasedBooks(String telephone) throws RemoteException;
  
}
