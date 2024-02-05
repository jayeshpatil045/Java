import java.util.*;
public class largest{
    public static int larg(int num[]){
    int large = Integer.MIN_VALUE;
    for(int i =0; i<num.length;i++){
        if(large < num[i]){
            large = num[i];
        }
    }
    return large;
    }
    public static void main(String args[]){
     int num[]={12,48,99,22,77};
    System.out.print("largest value  "+ larg(num));
        }
}
