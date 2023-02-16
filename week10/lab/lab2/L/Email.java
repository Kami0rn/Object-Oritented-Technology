package week05.week10.lab2.L;

public class Email {
    private String emailAddress;
    private String localPart;
    private String domainName;
    private String password;
    //private String firstname;
    //private String lastname;
    
   

    public Email(String fullname,String domainName,String password ){
        Person ps = new Person();
        this.domainName=domainName;
        this.password=password;
        this.localPart= ps.getFirstName() +"."+ps.getLastName().charAt(0);
        this.domainName=domainName+".com";
        localPart=localPart.toLowerCase();
        domainName=domainName.toLowerCase();
        emailAddress=this.localPart+'@'+this.domainName;
    }
    // public Email(String firstName,String lastName,String domainName){
    //     this.localPart=firstName+"."+lastName.charAt(0);
    //     this.domainName=domainName+".com";
    //     localPart=localPart.toLowerCase();
    //     domainName=domainName.toLowerCase();
    //     emailAddress=this.localPart+'@'+this.domainName;
    // }
    public String getEmailAddress(){
        return emailAddress;
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
    public void setPassword(String password){
        this.password=password;
    }
   
    public void getInfo(){
        System.out.println("Email address: "+getEmailAddress());
        System.out.println("Local Part: "+getLocalPart());
        System.out.println("Domain name: "+getDomainName());
    }

}