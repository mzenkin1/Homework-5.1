import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int [] weight = new int[3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;

        double [] Weight = {1.57, 7.654, 9.986};

        int [] month = new int[12];
        month [0] = 1;
        month [1] = 2;
        month [2] = 3;
        month [3] = 4;
        month [4] = 5;
        month [5] = 6;
        month [6] = 7;
        month [7] = 8;
        month [8] = 9;
        month [9] = 10;
        month [10] = 11;
        month [11] = 12;

        System.out.println("Задача 2");


        for (int i = 0; i < weight.length; i++) {
           if (i == weight.length - 1) {
               System.out.println(weight[i]);
               break;
           }
           System.out.print(weight[i] + ", ");
        }

        for (int i = 0; i < Weight.length; i++) {
            if (i == Weight.length -1) {
                System.out.println(Weight[i]);
                break;
            }
            System.out.print(Weight[i] + ", ");
        }

        for (int i = 0; i < month.length; i++) {
            if (i == month.length -1) {
                System.out.println(month[i]);
                break;
            }
            System.out.print(month[i] + ", ");
        }

        System.out.println("Задача 3");

        for (int i = weight.length -1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");

            }
        }

        System.out.println();

        for (int i = Weight.length -1; i >= 0; i--) {
            System.out.print(Weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = month.length -1; i >= 0; i--) {
            System.out.print(month[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println("Задача 4");

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;

            }
        }

        System.out.println(Arrays.toString(weight));





    }
}