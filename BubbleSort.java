/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author kulik-sy
 */

/*public class BubbleSort {
 * 
 * public static void sort(int[] arr) {
 * 
 * for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
 * 
 * for (int index = 0; index < barrier; index++) {
 * 
 * if (arr[index] > arr[index + 1]) {
 * 
 * int tmp = arr[index];
 * 
 * arr[index] = arr[index + 1];
 * 
 * arr[index + 1] = tmp;
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * }*/
public class BubbleSort {

    public static void sort(int[] arr) {

        for (int barrier = 1; barrier < arr.length; barrier++) {

            for (int index = barrier; index >= 1; index--) {

                if (arr[index] < arr[index - 1]) {

                    int tmp = arr[index];

                    arr[index] = arr[index - 1];

                    arr[index - 1] = tmp;

                }

            }

        }

    }

}
class TestBubbleSort {


    public static void main(String[] args) {


        int[][] data = {


                {},


                {1},


                {0, 3, 2, 1},


                {6, 8, 3, 5, 4, 1, 2, 0, 9, 7},
                
             

        };


        for (int[] arr : data) {


            System.out.print(Arrays.toString(arr) + " -> ");


            BubbleSort.sort(arr);


            System.out.println(Arrays.toString(arr));


        }


    }


}