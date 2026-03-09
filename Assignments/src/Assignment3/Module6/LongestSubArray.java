package Assignment3.Module6;
public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        System.out.println("Longest length = " + maxLength);
    }
}
