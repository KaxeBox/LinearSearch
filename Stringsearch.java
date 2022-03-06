import java.io.*;
import java.util.*;
/**
 * Stringsearch
 */
//STRING IS AN ARRAY OF CHARACTERS
public class Stringsearch {

    public static void main(String[] args) {
       String str="Kulsum";
       char target='u';
       System.out.println(search(str, target));
       System.out.println(searcharray(str, target));

    }
    //for loop
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return
         false;
    }
    //foreach loop > convert string to char array
    static boolean searcharray(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return
         false;
    }
}