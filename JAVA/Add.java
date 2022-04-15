import java.util.*;
public class Add {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        // System.out.println("Enter 3 nos:");
        // int b,c,a = sc.nextInt();
        // b = sc.nextInt();
        // c = sc.nextInt();
        // System.out.println("res: "+(a+b+c));
        int s=0;
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++){
            s+=sc.nextInt();
        }
        System.out.println(Math.sqrt(s));
        int pro=1;
        for(int i=1;i<10;i++){
            System.out.println("13 x "+i+"="+(13*i));
        }
    }
}
