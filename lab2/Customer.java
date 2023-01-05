package week05.lab.lab2;
import java.util.* ;
public class Customer {
    private String cid = "";
    private String cname = "";
    private String ctype = "";
    public Customer() {
    }
    public Customer(Sring cid,String cname,String ctype) {
        this.cid = cid;
        this.cname = cname;
        this.ctype = ctype;
    }
    public String getType() {
    return ctype;
    }
    
}