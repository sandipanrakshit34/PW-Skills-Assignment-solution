// 2. 2. WAP to traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.

public class ASS_CODE2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int elem : arr) {
            if (elem % 2 == 0)
                System.out.println(elem);

        }
    }
}
