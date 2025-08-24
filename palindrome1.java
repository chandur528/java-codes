import java.util.Scanner;
public class palindrome1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word:");
        String str=sc.next();
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
            
        }else{
            System.out.println("not palindrome");
        }
        
    }
}