import java.util.*;
public class exp3 {
    public static void main(String args[]){
        System.out.print("Enter your number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}
