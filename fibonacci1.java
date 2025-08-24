import java.util.*;
public class fibonacci1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("enter ft:");
        int ft=sc.nextInt();
        System.out.println("enter st:");
        int st=sc.nextInt();
        if(n>=0){
            System.out.print(ft);
        }
        if(n>=1){
            System.out.print(","+st);
        }
        for(int i=1;i<=n;i++){
            int nt=ft+st;
            System.out.print(","+nt);
            ft=st;
            st=nt;
      }
    }
    
}