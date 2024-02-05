import java.util.*;
class j4{
    public static void main(String arr[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= n-i+1 ;j++){
                System.out.print("*");
            }
              System.out.println();
        }
      
    }

    
}