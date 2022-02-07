package site.metacoding.ex23;

public class ThreadEx04 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            // 이 부분이 run 메서드 내부
        });
        t1.start();
        System.out.println("메인쓰레드 종료");
    }
}
