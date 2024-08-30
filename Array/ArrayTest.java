import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the input: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("\nEnter inputs: ");
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();//System.out.print(array[i] = sc.nextInt());
        }
        System.out.print("\nOutput: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}