package Multithreading.CH03_WhichImplementationToUse;
//When one class is already extending another class.
//Then it will become compulsion to implement runnable
//Because java doesn't have multiple inheritance
public class A extends B implements Runnable{
    @Override
    public void run(){

    }
}
