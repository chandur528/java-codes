public class palindrome{
    public static void main(String args[]){
        String str="madam";
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        if(str.equals(rev)){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
    }
}