public class minimumNumber {
    public static void main(String[] args) {
        int arr[]={1,2,-1,3,9};
        System.out.println(minnum(arr));
    }
    //assume size of arr is !0
    static int minnum(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
    
}
