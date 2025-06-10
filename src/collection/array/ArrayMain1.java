package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("===인덱스 입력 ==");
        arr[0] =1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =4;
        System.out.println(Arrays.toString(arr));
        arr[2]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println("====조회===");
        System.out.println("arr[3] : " + arr[3]);
        System.out.println("===배열 검색 ===");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0 ; i<arr.length ; i++){
            System.out.println("arr[ " + i + " ] :" +arr[i]);
            if(arr[i] == value){
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}
