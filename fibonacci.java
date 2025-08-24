public class fibonacci{
    public static void main(String args[]){
        int n=10;
        int ft=0;
        int st=1;
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
  System.out.println();
    }  
    
}    
    
