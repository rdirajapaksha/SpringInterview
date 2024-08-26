

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rdind
 */
public class Problem1 {

    private static int getSumUsingForLoop(int[] numArr) {

        int sum = 0;

        for (int num : numArr) {
            sum += num;
        }

        return sum;
    }

    private static int getSumUsingWhileLoop(int[] numArr) {

        int index = 0;
        int sum = 0;

        while (index < numArr.length) {

            sum += numArr[index];
            index++;

        }
        return sum;
    }

    private static int getSumUsingRescursion(int[] numArr) {

        int sum = 0;

        return sum;
    }

    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5, 6};
        int sumUsingForLoop = getSumUsingForLoop(numArr);
        int sumUsingWhileLoop = getSumUsingWhileLoop(numArr);
        int sumUsingRescursion = getSumUsingRescursion(numArr);

        System.out.println("Sum Using For Loop : " + sumUsingForLoop);
        System.out.println("Sum Using While Loop : " + sumUsingWhileLoop);
        System.out.println("Sum Using Rescursion : " + sumUsingRescursion);

    }
}
