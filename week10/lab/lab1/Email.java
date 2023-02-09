package week10.lab.lab1;

public class Email implements ToolBox {
    private String emailAddress = "" ;
    private String localPart = "" ;
    private String domainName = "" ;
    private String password = "" ;
    
    public Email (String emailAddress,String password){
        this.emailAddress = emailAddress ;
        this.password = password ;
        setEmailOfUser(emailAddress);
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public String getLocalPart() {
        return localPart;
    }
    public String getDomainName() {
        return domainName;
    }
    public String  getPassword() {
        return password;
    }
    public void setEmailOfUser(String emailAddress){
        String[] arrOfemailAddress = emailAddress.split("@");
        this.localPart = arrOfemailAddress[0] ;
        this.domainName = arrOfemailAddress[1] ;
    }

    public void getInfo() {
        System.out.println("Email: "+ emailAddress );
        System.out.println("Local Part: "+ localPart);
        System.out.println("Domain Name: "+ domainName);

    };

    
    
    
    

    
}
