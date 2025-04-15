package OOPS.innerClasses.MemberClass;

public class test {
    public static void main(String[] args) {
        Car car = new Car("Safari");
        Car.Engine engine =  car.new Engine();
        engine.start();
        engine.stop();

    }
}
