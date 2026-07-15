public class WizardCookie extends Cookie{
    private int mp=50;
    public WizardCookie(String name){
        super(name);
    }
    public WizardCookie(String name, int hp,int mp){
        super(name,hp);
        this.mp=mp;
    }
    public void showInfo(){
        System.out.println("쿠키 이름: "+getName()+", 체력: "+getHp()+", 마나: "+this.mp);
    }
}
