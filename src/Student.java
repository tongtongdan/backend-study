import lombok.Getter;

@Getter
class Student{
    int number;
    String name;
    Integer score;

    Student(){ //기본 생성자
    }

    Student(int number, String name){
        this.number = number;
        this.name = name;
    }

    private Student(int number, String name, Integer score){
        this.number = number;
        this.name = name;
        this.score = score;
    }

    public static Student stu(int number, String name, Integer score){
       return new Student(number , name, score);
    }

    void setNumber(int number){
        this.number = number;
    }

    int getNumber(){
        return number;
    }

    String getName(){
        return name;
    }

    Integer getScore(){
        return score;
    }
}