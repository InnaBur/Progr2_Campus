package campus02.pr2.UE0430.a_ArraySort;

import java.util.Arrays;

public class IntSortierung {

    public static void main(String[] args) {
        int[] arr = {200, 56, 7, 5, 11, -4, 100, 9, 0};

        int[] arrNachSort = new int[arr.length];

        Arrays.sort(arr);

        char[] arrCh = {'B', 'O', 'f', 'd', 'Q'};
        Arrays.sort(arrCh);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCh));


        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (temp > arr[j]) {
                    if (j != 0) {
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            arrNachSort[i] = temp;
        }

        System.out.println(Arrays.toString(arrNachSort));

    }
}
