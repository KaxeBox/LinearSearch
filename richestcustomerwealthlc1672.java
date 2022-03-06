/**
 * richestcustomerwealthlc1672
 */
public class richestcustomerwealthlc1672 {

    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
    
    static  public int maximumWealth(int[][] accounts) {
            int max=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<accounts.length;i++){sum=0;
    for(int j=0;j<accounts[0].length;j++){
    sum+=accounts[i][j];}
            if(sum>max)max=sum;}
            return max;
        }
    
}