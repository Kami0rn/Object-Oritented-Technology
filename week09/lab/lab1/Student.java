package week09.lab.lab1;

public class Student extends Person {
    private String id ;
    private String major ;
    public Student (String name, String gender, int age, String id , String major ){
        super(name,gender,age);
        this.id = id ; 
        this.major = major ;
    }
    //public final void getDetails() {
    
    //}

    public String getId(){
        return id ;
    }

    public String getMajor (){
        return major ;
    } 

    @Override
    public void getDetails(){
        System.out.println(super.getName() + "'s student ID is " + this.id + " and s/he studies "+this.major+".");
    }
    
}
