package main.java.com.ejercicios.messagingObserver;

public class MobileDevice implements Device {
    private String id;

    public MobileDevice(String id) {
        this.id = id;
    }

    @Override
    public void notify(Message message) {
        System.out.println("MobileDevice " + id + " received message: " + message);
    }
}
