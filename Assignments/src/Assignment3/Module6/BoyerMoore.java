package Assignment3.Module6;

public class BoyerMoore {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 5, 2, 3, 3};
        int i, count = 0;
        int candidate = 0;
        for (i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (candidate == arr[i]) {
                count++;
            } else
                count--;
        }
        System.out.println("Majority element in boyer moore : " + candidate);
    }
}
