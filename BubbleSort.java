import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabets: ");
        String input = sc.nextLine();
        // System.out.println("something something");
        char[] alpha = input.toCharArray();
        char temp;

        for(int i = 0; i< alpha.length; i++){
            for(int j = i + 1; j < alpha.length; j++){
                if(alpha[i] > alpha[j]){
                    temp = alpha[i];
                alpha[i] = alpha[j];
                alpha[j] = temp;
                }
            }
        }

        System.out.println(new String(alpha));
        sc.close();
        long end = System.currentTimeMillis();
        System.out.println("Time Taken By Program is" + (end-start));
    }
}


// this is first line

//this is second line
 
// emergency changes... 

// adding something again for hello world branch