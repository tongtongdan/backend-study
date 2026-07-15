public class Student extends Man{

    String school;
    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void showInfo(){
        System.out.println("이름: "+ name);
        System.out.println("나이: "+ age);
        System.out.println("학교: "+ school);
    }
}