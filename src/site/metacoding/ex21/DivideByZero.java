// package site.metacoding.ex21;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class DivideByZero {
// public static void main(String[] args) {
// // InputMismatchException

// // 통신, 사용자 입력 예외처리!!

// // 버퍼를 비우던, 스캐너를 새로 만들던 해야 함.

// while (true) {
// Scanner sc = new Scanner(System.in);
// System.out.println("반복 시작");
// }

// try {
// int x = sc.nextInt();
// int result = x / 0;
// System.out.println("받은 값 : " + x);
// } catch (Exception e) {
// System.out.println("============================================================");
// System.out.println("문자를 넣지마세요.");
// System.out.println("============================================================");
// e.printStackTrace();
// sc.nextLine(); // 버퍼 비우기!!
// }
// }
// }
