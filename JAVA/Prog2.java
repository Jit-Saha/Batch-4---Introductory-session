import java.util.*;
public class Prog2 {
    int unitcost = 10;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        Prog2 ob = new Prog2();
        int units = sc.nextInt(); 
        System.out.println("The electricity bill for " +units+ " is : " + units * ob.unitcost);   
    }   
}

