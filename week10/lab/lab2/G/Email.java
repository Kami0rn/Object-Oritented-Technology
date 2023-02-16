package week05.week10.lab2.G;

public class Email {
    private String emailAddress;
    private String localPart;
    private String domainName;
    private String password;
    
    public Email(String firstName,String lastName,String domainName,String password){
        this.localPart = firstName+"."+lastName.charAt(0);
        this.domainName = domainName.toLowerCase()+".com";
        this.password = password;
        localPart = localPart.toLowerCase();
        setEmailAddress();



    }

    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(){
        emailAddress= localPart+"@"+domainName;
    }
    public String getLocalPart(){
        return localPart;
    }

    public String getDomainName(){
        return domainName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;
    }
    
    public void getInfo(){
        System.out.println("Email: "+getEmailAddress());
        System.out.println("Local Part: "+getLocalPart());
        System.out.println("Domain Name: "+getDomainName());
    }

}