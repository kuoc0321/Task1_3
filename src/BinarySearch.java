import java.util.ArrayList;
import java.util.List;

public class BinarySearch
{
    public static int binarySearch(int[] arr,int value){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(arr[mid] == value)
            {
                return mid;
            }
            if(arr[mid] < value)
            {
                left  = mid + 1;
            }
            else{
                right = mid - 1;
            }

        }
        return -1;
    }
    public void binarySearchHeadTail(int[] arr, int value){
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(arr[mid] == value)
            {
                int head = mid;
                int tail = mid;
                while(head >= 0 && arr[head] == arr[head - 1]){
                    head -=1;
                }
                res.add(head);
                while(tail<=  arr.length && arr[tail] == arr[tail + 1]){
                    tail += 1;
                }
                res.add(tail);
                break;
            }
            if(arr[mid] < value)
            {
                left  = mid + 1;
            }
            else{
                right = mid - 1;
            }

        }
        System.out.println(res);
    }
}
