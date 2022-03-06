/**
 * evendigitsLeetcode1295
 */
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//using the least optimized method->while loop
/** 1st method
public class evendigitsLeetcode1295 {

    public static void main(String[] args) {
        int nums[]= {12,345,2,6,33,7896};
        System.out.println(findnumbers(nums));
    }
    static int findnumbers(int nums[]){
        int count=0;
        for(int n:nums){
            if(evendigit(n)){
                count++;
            }
        }
        return count;
    }
    static boolean evendigit(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count%2==0;
    }


}
*/
public class evendigitsLeetcode1295 {

    public static void main(String[] args) {
        int nums[]= {12,345,2,6,33,7896};
        System.out.println(findnumbers(nums));
    }
    static int findnumbers(int nums[]){
        int count=0;
        for(int n:nums){
            if(digits2(n)){
                count++;
            }
        }
        return count;
    }
    static boolean digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int h=(int)(Math.log10(num)) + 1;
        return h%2==0;
    }


}