package OOPS.singletonPattern;

public class test {
    public static void main(String[] args) {
        School.getInstance();//in first time the obj is set then it will return directly
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
    }
}
