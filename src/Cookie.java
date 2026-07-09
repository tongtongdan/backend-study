public class Cookie {
    private String name;
    private int hp;

    Cookie(String name){
        this.name = name;
        this.hp = 100;
    }

    public void run(){
        this.hp -=10;
        System.out.println("이름은" + this.name + "이고요 " + this.hp + "hp입니다.");
    }

    public void attack(){
        System.out.println(this.name + "가 공격합니다.");
   }

   public int getHp(){
        return hp;
   }

   public void setHp(int hp){
        this.hp = hp;
   }
}