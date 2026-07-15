//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        WizardCookie wizardCookie1 = new WizardCookie("마법사 쿠키");
        WizardCookie wizardCookie2 = new WizardCookie("마법마법 쿠키", 120, 70);

        wizardCookie1.showInfo();
        wizardCookie2.showInfo();
    }
}