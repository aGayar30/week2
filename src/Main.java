import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<>();
        double sum=0;
        for (int i=0; i<10; i++){
            nums.add(scanner.nextDouble());
        }

        for (Double element : nums){
            sum += element;
        }
        System.out.println("a verage = " + sum/nums.size());
    }

}
