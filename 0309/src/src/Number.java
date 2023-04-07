package src;
import java.util.Scanner;
import java.util.Random;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(50) + 1;
        int count = 0;
        boolean correct = false;
        
        while (count < 5) {
            System.out.print("1부터 50까지의 숫자를 입력하세요: ");
            int guess = scanner.nextInt();
            count++;

            if (guess == target) {
                System.out.println("맞았습니다!");
                correct = true;
                break;
            } else if (guess < target) {
                System.out.println("입력한 숫자보다 큽니다.");
            } else {
                System.out.println("입력한 숫자보다 작습니다.");
            }
        }

        if (!correct) {
            System.out.println("정답은 " + target + "입니다.");
        }
        
        scanner.close();
    }
}