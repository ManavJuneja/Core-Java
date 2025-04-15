package OOPS.innerClasses.MemberClass;

public class Car {
    private String model;
    private boolean isEngineON;

    public Car(String model){
        this.model = model;
        this.isEngineON = false;
    }
    //Member class
    class Engine{
        void start(){
            if(!isEngineON){
                isEngineON = true;
                System.out.println(model + "Engine started");
            }else{
                System.out.println(model + "Engine stopped");
            }
        }
        void stop(){
            if(!isEngineON){
                isEngineON = false;
                System.out.println(model + "Engine stopped");
            }else{
                System.out.println(model + "engine is already of");
            }
        }
    }



}
