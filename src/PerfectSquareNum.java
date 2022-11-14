import java.util.Scanner;

public class PerfectSquareNum {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int numInput = x.nextInt();


        int totSq = 0;
        int perfect = 0;
        for (int i = 1; i < numInput; i++) {
            totSq = i * i;
            if (totSq == numInput){
                perfect += numInput;
            }
        }

        if (numInput == perfect) {
            System.out.println(numInput + " is perfect square");
        } else {
            System.out.println(numInput + " is not perfect square");
        }

    } //end of main

} //End of class
