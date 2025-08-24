import java.util.*;
public class reverse2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=sc.nextInt();
        int rn=0;
        int on=num;
        while(num!=0){
           int rem=num%10;
           rn=rn*10+rem;
           num/=10;
        }
        System.out.println("original no is:"+on);
        System.out.println("reversed no is:"+rn);
            
            
            
        }
    }