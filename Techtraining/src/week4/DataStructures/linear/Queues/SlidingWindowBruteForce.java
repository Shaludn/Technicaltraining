package week4.DataStructures.linear.Queues;
public class SlidingWindowBruteForce {
    public static void main(String[] args) {
        /*
        Total Window Formula=n-k+1=> 8-3+1=6
        Total Windows=Total length-Windowsize+1
         */
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
