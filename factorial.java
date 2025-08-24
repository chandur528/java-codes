import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int no=sc.nextInt();
        if(no<0){
            System.out.println("negative value is not allowed");
        }else{
            int factorial=1;
            for(int i=1;i<=no;i++){
                factorial*=i;
                
            }
            System.out.println("the value is:"+factorial);
        }
    }
}