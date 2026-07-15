public class WizardCookie extends Cookie {

    private int mp;

    public WizardCookie(String name) {
        setName(name);
        setHp(40);
        this.mp = 50;
    }

    public WizardCookie(String name, int hp, int mp) {
        setName(name);
        setHp(hp);
        this.mp = mp;
    }

    public void showInfo() {
        System.out.println("쿠키 이름: " + getName() + ", 체력: " + getHp() + ", 마나: " + mp);
    }
}