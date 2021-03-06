package priv.zproo.myalgo.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5};
        funSelectionSort(a);
        // 输出拍好顺序后的数组
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            System.out.println(i1);
        }
    }

    static void funSelectionSort(int[] array) {
        for (int i = 0; i < array.length -1 ; i++) {
            int mink = i;

            // 每次从未排序的数组中找到最小值坐标
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[mink]) {
                    mink = j;
                }
            }

            // 将最小值放到最前面（元素交换）
            swap(array, i, mink);
        }
    }

    // 交换数组元素
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
