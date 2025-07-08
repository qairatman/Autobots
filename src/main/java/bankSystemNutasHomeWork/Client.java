package bankSystemNutasHomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {
    public String fullName ;
    private String clientId ;
    private String PIN ;

    public Client(String fullName, String PIN) {
        this.fullName = fullName;
        this.clientId = UUID.randomUUID().toString();
        this.PIN = PIN;
    }

   static List<BankAccount> listOfAccounts = new ArrayList<>();


    public boolean authenticate(String PIN){
        return this.PIN.equals(PIN);
    }

   static void addAccount(BankAccount bankAccount){
        listOfAccounts.add(bankAccount);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
