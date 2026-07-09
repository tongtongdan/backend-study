public class Main {
    public static void main(String[] args) {
        Cookie cookie=new Cookie("용감한 쿠키");
        System.out.println(cookie.getHp());
        cookie.run();
        cookie.run();
        cookie.setHp(150);
        System.out.println(cookie.getHp());
        cookie.run();
    }
}