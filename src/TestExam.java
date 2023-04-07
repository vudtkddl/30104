import java.util.Scanner;

public class TestExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("500 이하의 자연수를 입력하세요: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n합계: " + sum);
        sc.close();
    }
}