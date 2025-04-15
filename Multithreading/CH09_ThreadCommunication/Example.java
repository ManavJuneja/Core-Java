package Multithreading.CH09_ThreadCommunication;

class SharedResource{
    private int data;
    private boolean hasData;
//want to produce data but  has data is true then need to wait for already existed data to consume
    public synchronized void produce(int value){
        while (hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data = value;//bhi jo data produce kia haa uski value ko data mein daal do
        hasData = true;//hasData ko true kardo jis se pata chal jae bhi data ha
        System.out.println("Produced: " + value);
        notify();
    }
//Consume kab karega jab data hoga if data is not present then wait
    public synchronized int consume(){
        while(!hasData){//hasData = data is present !hasData = data nahi ha
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;//data katam ho gaya
        System.out.println("Consumed: " + data);
        notify();//notify kardo producer ko bhi ab produce karlo
        return data;//data consume kar lia data print karke
    }
}

class Producer implements Runnable{
    private SharedResource resource;
    public Producer(SharedResource resource){
        this.resource = resource;
    }
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            resource.produce(i);
        }
    }
}
class Consumer implements Runnable{
    private SharedResource resource;
    public Consumer(SharedResource resource){
        this.resource = resource;
    }
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            int value = resource.consume();
        }
    }
}
public class Example {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
