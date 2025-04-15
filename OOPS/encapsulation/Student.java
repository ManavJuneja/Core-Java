package OOPS.encapsulation;

public class Student {
    //properties and behaviour
    private String name;//instance variable
    private int rollNo;
    private int age;
    public Student(){
        this.name = "None";
        this.rollNo = 0;
        this.age = 0;
    }
    public Student(String name, int rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;//this method jis object pe call karwao ge uss method ke obj ki baat ho rahi ha
    }
    public void setAge(int age){
        if(age < 0){
            age = 0;
        }
        this.age = age;
    }
    public void setRollNo(int rollNo){
        if(rollNo < 0){
            rollNo = 0;
        }
        this.rollNo = rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return  name;
    }
    public int getAge(){
        return age;
    }
//    public static void main(String[] args) {
////        String name;//local variable
//    }
}
