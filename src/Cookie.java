public class Cookie {
    private String name;
    private int hp;

    public Cookie(String name){
        this.name=name;
        hp=100;
    }
    public void run(){
        hp-=10;
        System.out.println("\'"+name+"\' 가 달립니다. 현재 체력: "+ hp + "hp");
    }
    public void attack(){
        System.out.println("\'"+name+"\' 가 공격합니다.");
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp=hp;
    }
}
