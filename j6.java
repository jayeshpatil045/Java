import java.util.*;
public class j6{
    public static void dectonum(int binnum){
    int pow=0;
    int decnum=0;
    while(binnum > 0){
        int lastnum= binnum%10;
        decnum = decnum +(lastnum * (int)Math.pow(2,pow));
        pow++;
        binnum = binnum/10;
    }
    System.out.println(decnum);
    
}
   public static void main(String args[]){
   dectonum(1010);
}
}
