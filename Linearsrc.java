import java.io.*;
import java.util.*;

public class Linearsrc{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int target=2;
        System.out.println(indexsrc(arr,target));
        System.out.println(elementsrc(arr,target));
        boolean ans=booleansrc(arr,target);
        System.out.println(ans); 
    }
    //RETURN TARGET VALUE IF FOUND ELSE RETURN MAX VALUE
    static int indexsrc(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return target;
            }

        }
        return Integer.MAX_VALUE;
    }
    //RETURN INDEX OF TARGET ELEMENT IF FOUND ELSE RETURN -1,COZ INDEX CAN'T BE -1 BUT ELEMENT CAN BE, HENCE WE RETURNED MAX VALUE IN PREVOUS FUNCTION
    static int elementsrc(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;    
    }
    //RETURN true IF FOUND ELSE RETURN false
    static boolean booleansrc(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }

        }
        return false;    
    }
}