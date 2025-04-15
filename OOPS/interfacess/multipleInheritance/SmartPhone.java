package OOPS.interfacess.multipleInheritance;

public class SmartPhone implements Camera,MusicPlayer,Phone{


    @Override
    public void clickPhoto() {
        System.out.println("Clicking Photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    @Override
    public void powerOn() {
        System.out.println("Power On");
    }

    @Override
    public void forCall() {
        System.out.println("Making Call");
    }
}
