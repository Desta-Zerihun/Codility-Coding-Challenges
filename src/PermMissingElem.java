// This is an implementation for finding the missing element in a given array.
public class PermMissingElem {
    public static int findMissing(int arr[]){
        long actual_sum = 0;
        long expected_sum = 0;
        long max_number = arr.length + 1;
        for(int i:arr){
            actual_sum += i;
        }
        expected_sum = (max_number*(max_number+1)/2);
        return (int) (expected_sum - actual_sum);

    }

    public static void main(String[] args) {
        int arr1[] = {2,3,1,5};
        System.out.println(findMissing(arr1));
        int arr2[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(findMissing(arr2));
        int arr3[] = {};
        System.out.println(findMissing(arr3));

    }
}
