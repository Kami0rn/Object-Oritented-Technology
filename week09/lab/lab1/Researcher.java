package week09.lab.lab1;

public class Researcher extends Employee {
    private String workplace;
    public Researcher(String name, String gender, int age, String position,double salary, String workplace) {
    super(name, gender, age, position, salary);
    this.workplace = workplace;
    }
    public String getWorkplace() {
    return workplace;
    }
    public void setWorkplace(String workplace) {
    this.workplace = workplace;
    }
    @Override
    public final void getDetails() {
    super.getDetails();;
    System.out.println(super.getName() + " is a " + this.getClass().getSimpleName() + ".");
    }
}
