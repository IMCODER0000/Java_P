package collection.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        System.out.println();
        //배열의 첫번째 위치에 추가
        //기존 배열의 데이터를 오른쪽으로 한칸씩 밀고 첫번째에 삽입
        System.out.println("배열의 첫번째 위치에 999 추가 O(n)");

        int newValue = 999;

//        int[] newArray = addFirst(arr, newValue);
//        System.out.println(Arrays.toString(newArray));

        addFirst2(arr, newValue);


        System.out.println("배열의 index(2) 위치에 777 추가 O(n)");
        int index = 2;
        int value = 777;
        addAt(arr, index, value);
        System.out.println(Arrays.toString(arr));


        addLast(arr, 5);


    }

    private static void addLast(int[] arr, int i) {

        arr[arr.length-1] = i;
        System.out.println(Arrays.toString(arr));

    }


    private static void NewA(int a) {
        a = 1000;
    }

    private static void addAt(int[] arr, int index, int value) {

        for(int i = arr.length-1; i>index; i--){

            arr[i] = arr[i - 1];

        }

        arr[index] = value;

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static int[] addFirst(int[] arr, int newValue){

        for(int i=1; i<arr.length; i++ ){

            arr[arr.length-i] = arr[arr.length-i-1];


        }

        arr[0]=newValue;

        return arr;


    }

    public static void addFirst2(int[] arr, int newValue) {

        for(int i = arr.length-1 ; i>0; i--){

            arr[i] = arr[i-1];

        }
        arr[0] = newValue;

        System.out.println(Arrays.toString(arr));
        System.out.println();

    }



}
