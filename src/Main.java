import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double[] nums = new double[12];
        double sum=0;
        for (int i=0; i<12; i++){
            nums[i] = scanner.nextDouble();
        }

        for (double element : nums){
            sum += element;
        }
        System.out.println("average = " + sum/nums.length);
    }

}
