import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
         int n;
         Scanner scan = new Scanner(System.in);
         n = scan.nextInt();
         
         int d = 0;
         int w = 0;
         
         while(n != 0){
             double bit = n % 10;
             n = n / 10;
             d += bit * Math.pow(2,w);
             w += 1;
         }
         System.out.println(":" +d);
    }
}