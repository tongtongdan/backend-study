public class Main {
    public static void main(String[] args) {
        Student person=Student.enterance(2,"김태성",100);
        System.out.println(person.getNumber());
        person.setNumber(4);
        System.out.println(person.getNumber());
    }
}