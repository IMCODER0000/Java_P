package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println("===Index 입력 : 0(1) ===");
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("===Index 변경 : 0(1) ===");
        arr[2]= 10;
        arr[4] = 10;
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("===Index 조회 : 0(1) ===");
        System.out.println("arr[2] = " + arr[2]);
        System.out.println();

        System.out.println("===Index 검색 : 0(1) ===");

        int value = 10;
        boolean result = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                System.out.println("결과 : " + i + " 번째 순서에 그 값이 있음");
                result = true;
            }

        }
        if (!result){
            System.out.println("없     음");
        }




    }


}
