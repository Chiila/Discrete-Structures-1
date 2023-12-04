import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
       
        int n;
        
        int cilla = 1;
        
        int binary[] = new int[10];
        
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        
            
        while(n != 0)
        {
            binary [cilla++] = n % 2;
            n = n/2;
        }
        
        System.out.print(":");
        for(int j = cilla - 1; j > 0; j--)
        {
        System.out.print(binary[j]);
        }
        System.out.print("\n");  
    }
  }