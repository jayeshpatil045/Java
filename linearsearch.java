import java.util.*;
public class linearsearch{
    public static int linear(int num[] ,int key){
        for(int i=0;i< num.length;i++){
            if(num[i]==key){
               return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
     int num[]={12,34,56,18,99,77};
     int key= 56;
      int index=linear(num,key);
      if(index==-1){
        System.out.print("key is not found");
      }else{
        System.out.print("key is found   "+index);
      }
    }
}