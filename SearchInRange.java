public class SearchInRange {
    public static void main(String[] args) {
       int arr[]={1,2,3,4};
       int target=32;
       System.out.println(elementsrc(arr, target,1,3)); 
    }
    //return index of target in range
    static int elementsrc(int arr[],int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;    
    }
}
