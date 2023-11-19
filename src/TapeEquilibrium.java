
// TapeEquilibrium problem solutions

public class TapeEquilibrium {
public static int solution(int arr[]){
       int sum_left = arr[0];
       int sum_right = 0;
       int diff = 0;
       int current_diff = 0;
       int sum = 0;
         for(int i=0;i<arr.length;i++){
               sum+=arr[i];
         }
         sum_right=sum-arr[0];
         diff = Math.abs(sum_left-sum_right);
         for(int i=1;i<arr.length;i++){
           sum_left+= arr[i];
           sum_right-=arr[i];
           current_diff = Math.abs(sum_left - sum_right);
           if(diff>current_diff){
               diff=current_diff;
           }

         }
    return diff;
}

    public static void main(String[] args) {
        int arr[] = {3,1,2,4,3};
        System.out.println(solution(arr));
    }
}
