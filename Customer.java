package week05.lab.lab2;
//import java.util.* ;
public class Customer {
    private String cid = "";
    private String cname = "";
    private String ctype = "";
    public Customer() {
    }
    public Customer(String cid,String cname,String ctype) {
        this.cid = cid;
        this.cname = cname;
        this.ctype = ctype;
    }
    public String getCtype() {
        return ctype;
    }

    public String getCname() {
        return cname ;
    }

    public void setCname(String cname){
        this.cname = cname ;
    }

    public void setCtype(String ctype){
        this.ctype = ctype ;
    }


    public String getCid(){
        return cid ;
    }

    public void setCid(String cid){
        this.cid = cid ;
    } 
}