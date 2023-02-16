package week05.week10.lab2.G;

import java.util.Scanner;

public class Person {
        private String firstName;
        private String fullName;
        private String middleName;
        private String lastName;
        private Email email;
        Scanner sc=new Scanner(System.in);

        public  Person(String fullName,String domainName,String password){
            setNameOfUser(fullName);
            email=new Email(domainName,password);
            
            this.fullName=fullName;

        }
        
        public String getFirstName(){
            return firstName;
        }
        public String getMiddleName(){
            return middleName;
        }
        public String getLastName(){
            return lastName;
        }
        public Email getEmail(){
            return email;
        }
        
        public void setNameOfUser(String fullName){
            String[] parts=fullName.split(" ");
            firstName=parts[0];
            middleName=parts[1];
            lastName=parts[2];
        }
        public void getInfo(){
            
            email.getInfo();
        }
        public void verifyUser(Scanner sc){
            System.out.printf("Enter the password of \"%s\":",email.getEmailAddress());
            String pass=sc.next();
            
            if(pass.equals(email.getPassword())){
            System.out.println("FullName: "+fullName);
            System.out.println("First Name: "+firstName);
            System.out.println("Maiddle Name: "+middleName);
            System.out.println("Last Name: "+lastName);
            getInfo();
            }
            else{
                System.out.println("You don't have permission to access the account data!");
            }
        }

}