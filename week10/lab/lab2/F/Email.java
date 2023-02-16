package week05.week10.lab2.F;

public class Email {
    private String emailAddress;
    private String localPart;
    private String domainName;
    private String password;
    

    public Email(String localPart, String domainName, String password){
        //String f = Person.getFirstName()
        this.localPart = localPart.toLowerCase();
        this.domainName = domainName.toLowerCase();
        this.emailAddress = this.localPart+"@"+this.domainName;
        this.password = password;
    }
    /*  public Email(String firstName,String lastName,String domainName){
         this.localPart=firstName+"."+lastName.charAt(0);
         this.domainName=domainName+".com";
         localPart=localPart.toLowerCase();
         domainName=domainName.toLowerCase();
         emailAddress=this.localPart+'@'+this.domainName;
     }*/
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