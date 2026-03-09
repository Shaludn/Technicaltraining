package Assignment3.Module7;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {10,7,8,9,1,5};
        quickSort(arr, 0, arr.length - 1);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*A pivot is an element chosen from the array to divide it.

In the code:

pivot = arr[high]

The last element is used as pivot.

4️⃣ Example

Array:

        [10,7,8,9,1,5]

Pivot:

        5
Step 1

Compare elements with pivot.

        10 > 5  → ignore
7  > 5  → ignore
8  > 5  → ignore
9  > 5  → ignore
1  < 5  → swap

Array becomes:

        [1,7,8,9,10,5]
Step 2

Place pivot in correct position.

Swap pivot with i+1.

Array becomes:

        [1,5,8,9,10,7]

Pivot index = 1

Result

Left side:

        [1]

Right side:

        [8,9,10,7]

Now Quick Sort runs again on both parts.

        5️⃣ Visual Idea

Before partition:

        10 7 8 9 1 | 5
pivot

After partition:

        1 | 5 | 8 9 10 7

Everything left of pivot < pivot
Everything right of pivot > pivot

6️⃣ Time Complexity
Case	Complexity
Best Case	O(n log n)
Average Case	O(n log n)
Worst Case	O(n²)

Worst case occurs when:

array is already sorted

        (if pivot chosen poorly)
*/
