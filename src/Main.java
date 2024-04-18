import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("exercise 1");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;

        double[] weight = {1.57, 7.654, 9.986};

        String[] fruits = {"orange", "apple", "lemon", "banana"};

        System.out.println("exercise 2");
        System.out.print(box[0] + ", ");
        System.out.print(box[1] + ", ");
        System.out.print(box[2]);
        System.out.println(" ");
        int i = 0;
        for (; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ", ");
        }
        System.out.print(weight[i]);
        System.out.println(" ");
        int j = 0;
        for (; j < fruits.length - 1; j++) {
            System.out.print(fruits[j] + ", ");
        }
        System.out.print(fruits[j]);
        System.out.println(" ");
        System.out.println("exercise 3");
        int k = box.length-1;
        for (; k > 0; k--) {
            System.out.print(box[k] + ", ");
        }
        System.out.print(box[k]);
        System.out.println(" ");
        int l = weight.length-1;
        for (; l > 0; l--) {
            System.out.print(weight[l] + ", ");
        }
        System.out.print(weight[k]);
        System.out.println(" ");
        int m = fruits.length-1;
        for (; m > 0; m--) {
            System.out.print(fruits[m] + ", ");
        }
        System.out.print(fruits[m]);
        System.out.println(" ");
        System.out.println("exercise 4");
        for (int n = 0; n < box.length; n++) {
            if (box[n] % 2 != 0) {
                box[n] += 1;
            }
        }
        System.out.println(Arrays.toString(box));

    }
}