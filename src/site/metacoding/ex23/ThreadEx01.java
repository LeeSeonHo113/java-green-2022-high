package site.metacoding.ex23;

public class ThreadEx01 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } // 밀리세컨즈 1/1000초
        System.out.println(2);
    }

}
