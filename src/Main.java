public class Main {
    public static void main(String[] args) {
        Cookie cookie = new Cookie("용현 쿠키");

        System.out.println(cookie.getHp());

        cookie.run();
        cookie.run();

        cookie.setHp(200);
        System.out.println(cookie.getHp());
        cookie.run();


    }
}