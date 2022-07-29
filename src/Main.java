public class Main {
    public static void main(String[] args) {
        //ex1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1)
                System.out.print(numbers[i]);
            else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println(" ");
        double[] fractions = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractions.length; i++) {
            if (i == fractions.length - 1)
                System.out.print(fractions[i]);
            else {
                System.out.print(fractions[i] + ", ");
            }
        }
        System.out.println();
        int[] breakTime = new int[4];
        breakTime[0] = 10;
        breakTime[1] = 12;
        breakTime[2] = 14;
        breakTime[3] = 16;
        for (int i = 0; i < breakTime.length; i++) {
            if (i == breakTime.length - 1)
                System.out.print("перерыв в " + breakTime[i] + " часов.");
            else {
                System.out.print("перерыв в " + breakTime[i] + " часов, ");
            }
        }
        //ex3
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == numbers.length - 3)
                System.out.print(numbers[i]);
            else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println("");
        for (int i = fractions.length - 1; i >= 0; i--) {
            if (i == fractions.length - 3)
                System.out.print(fractions[i]);
            else {
                System.out.print(fractions[i] + ", ");
            }
        }
        System.out.println("");

        for (int i = breakTime.length - 1; i >= 0; i--) {
            if (i == breakTime.length - 4)
                System.out.print("перерыв в " + breakTime[i] + " часов. ");
            else {
                System.out.print("перерыв в " + breakTime[i] + " часов, ");
            }
        }
        //ex4
        System.out.println(" ");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        int plusOne = 1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0 && i == numbers.length - 1)
                System.out.print(number[i] + plusOne);
            else if (number[i] % 2 != 0)
                System.out.print(number[i] + plusOne + ", ");
            else {
                System.out.print(number[i] + ", ");
            }
        }
    }
}