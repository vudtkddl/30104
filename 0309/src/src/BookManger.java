package src;
import java.util.Scanner;

public class BookManger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름을 입력하세요>> ");
        String name = scan.nextLine();
        System.out.println(name + "님, 도서관에 오신 것을 환영합니다!");

        Book b1 = new Book("이것이 자바다", "신용권", 100);
        Book b2 = new Book("정보 보안 개론", "양대일", 200);
        Book b3 = new Book("모의해킹이란 무엇인가", "조정원", 300);
        Book b4 = new Book("인생의 태도", "웨인 다이어", 400);

        System.out.println("현재 대여 가능한 책은 " + b1.book_count + "권입니다.");

        b1.rental();
        b2.rental();
        b3.rental();
        b1.back();
        b3.back();
        b2.check();
        b3.check();

        System.out.println("현재 대여 가능한 책은 " + b1.book_count + "권입니다.");
    }
    public static class Book {
        String title;
        String writer;
        int number;
        boolean pos;
        static int book_count;

        // 생성자 1: 기본 생성자
        public Book() {
            book_count++;
        }

        // 생성자 2: title, writer, number를 한 번에 초기화하는 생성자
        public Book(String title, String writer, int number) {
            this.title = title;
            this.writer = writer;
            this.number = number;
            book_count++;
        }

        // 대여 기능 메소드
        public void rental() {
            if (book_count > 0) {
                book_count--;
                pos = false;
                System.out.println(number + "번 대여 완료");
            } else {
                System.out.println("이미 모든 책이 대여중입니다.");
            }
        }

        // 반납 기능 메소드
        public void back() {
            book_count++;
            pos = true;
            System.out.println(number + "번 반납 완료");
        }

        // 대여 가능 여부 확인 메소드
        public void check() {
            if (pos == true) {
                System.out.println(title + "은(는) 대여 가능합니다.");
            } else {
                System.out.println(title + "은(는) 이미 대여중입니다.");
            }
        }
    }

}