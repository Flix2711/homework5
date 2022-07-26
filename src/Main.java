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
        double[] q = {1.57, 7.654, 9.986};
        for (int t = 0; t < q.length; t++) {
            if (t == q.length - 1)
                System.out.print(q[t]);
            else {
                System.out.print(q[t] + ", ");
            }
        }
        System.out.println(" ");
        int[] breakTime = new int[4];
        breakTime[0] = 10;
        breakTime[1] = 12;
        breakTime[2] = 14;
        breakTime[3] = 16;
        for (int r = 0; r < breakTime.length; r++) {
            if (r == breakTime.length - 1)
                System.out.print("перерыв в " + breakTime[r] + " часов.");
            else {
                System.out.print("перерыв в " + breakTime[r] + " часов, ");
            }
        }
    }
}

