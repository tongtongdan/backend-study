public class Cookie {
    protected String name;
    protected int hp;

    public Cookie(String name) {
        this.name = name;
        this.hp = 100;
    }
    public Cookie(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    void run(){
        this.hp -= 10;
        System.out.println(name + "가 달립니다. 현재 체력: " + hp + "hp");
    }

    void attack(){
        System.out.println(name + "가 공격합니다.");
    }

    int getHp(){
        return hp;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() { return name; }
}


