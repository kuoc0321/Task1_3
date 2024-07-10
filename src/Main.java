import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task1
        int[] arr1 = {1, 3, 4,4,4,4, 5, 7, 9, 11,};
        int[] arr2 = {2, 3, 4, 6, 8, 10};
        List<Integer> res = new ArrayList<>();
        BinarySearch bs = new BinarySearch();

        for (int i : arr1) {
            int a = bs.binarySearch(arr2, i);
            if (a != -1) {
                res.add(arr2[a]);
            }
        }

//        // In danh sách kết quả
//        System.out.println("Kết quả: " + res);


        // Task 3
        int target = 4;
        bs.binarySearchHeadTail(arr1, target);


    }
}