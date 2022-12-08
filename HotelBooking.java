package week02 ;

import java.util.Scanner;

public class HotelBooking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("will you book a room? (yes/no) : ");
        String book = sc.nextLine();
        int numOfRoom,prizeOfRoom,numOfTable,totalPrize = 0 ;

        if(book.equals("yes")){
            System.out.print("Please select your room type ('common': 5,000 Baht / 'extra': 7,000 baht ) : ");
            String typeOfRoom = sc.nextLine();
            if (typeOfRoom.equals("common")) {
                prizeOfRoom = 5000 ;
                totalPrize += 5000 ;
                System.out.print("How many room you will book? : ");
                numOfRoom = sc.nextInt() ;
                System.out.print("Would you like to take a breakfast ? (yes/no):");
                System.out.println("debug 1 ");
                
                String breakFast = sc.nextLine();
                if (breakFast.equals("yes")) {
                    totalPrize += 150*numOfRoom ;
                }
                else if (breakFast.equals("no")) {
                    totalPrize += 0;
                    System.out.println("debug 2 ");
                }
                
                
            }
            else if (typeOfRoom.equals("extra")) {
                prizeOfRoom = 7000 ;
                totalPrize += 7000 ;
                System.out.print("How many room you will book? : ");
                numOfRoom = sc.nextInt() ;
                System.out.print("Would you like to take a breakfast ? (yes/no):");
                String breakFast = sc.nextLine() ;
                if (breakFast.equals("yes")) {
                    totalPrize += 150*numOfRoom ;
                }
                else if (breakFast.equals("no")) {
                    totalPrize += 0;
                }else{
                    totalPrize += 0;
                }
            }
            else {
                System.out.print("err code 1 ");
            }
        

        }
        else if (book.equals("no")) {
            System.out.print("Will you book a table? (yes/no):");
            String bookTableString = sc.nextLine();
            if (bookTableString.equals("yes")) {
                System.out.print("How many table you will book? : ");
                numOfTable = sc.nextInt() ;
                totalPrize += numOfTable * 500 ;
            }else if ((bookTableString.equals("no"))) {
                System.out.print("Why you still here? Fxck off!!!! ");
            }
        }
        else {
            System.out.print("err code 2 ");
        
        }

        double total = totalPrize*(1.75/100) ;
        double vat = totalPrize-total ;
        System.out.println("Prize is "+totalPrize) ;
        System.out.println("VAT is "+vat) ;
        System.out.println("Total prize is (Include VAT 1.75)"+total) ;
        sc.close();
    }
}