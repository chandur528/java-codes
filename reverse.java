public class reverse{
    public static void main(String args[]){
        int num=54321;
        int rn=0;
        int on=num;
        while(num!=0){
            int rem=num%10;
            rn=rn*10+rem;
            num/=10;
        }
        System.out.println("original number is:"+on);
        System.out.println("reversed number is:"+rn);
    }
}