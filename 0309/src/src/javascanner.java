package src;
import java.util.Scanner;

public class javascanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("시작숫자: ");
        int a = scanner.nextInt();
        
        System.out.print("마지막 숫자: ");
        int b = scanner.nextInt();
        
        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        
        System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
    }
}