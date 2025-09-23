package rw.rca.FirstProject.Pillars;

public class Student extends Person{
    private String code;
    private String school;
    private String combination;

    public Student(){}

    public Student(String fName, String lName, String gender, int age, String code, String school, String combination){
//        impossible mission if the properties are private

//        this.firstName = fName;
//        this.lastName = lName;
//        this.gender = gender;
//        this.age = age;

//        u send data there
        super(fName, lName, age, gender);
        this.code = code;
        this.school = school;
        this.combination = combination;
    }

    public String getCode() {
        return code;
    }

    public String getSchool() {
        return school;
    }

    public String getCombination() {
        return combination;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    @Override
    public void printMe(){
        super.printMe();
        System.out.println("I am a student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", school='" + school + '\'' +
                ", combination='" + combination + '\'' +
                super.toString()+
                '}';
    }
}
