import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }


    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];
        int rI = array.length-1;
        for (int i = 0; i<array.length;i++) {
            newArray[i] = array[rI];
            rI -=1;
        }
        return newArray;
    }

}

