package main.java.com.ejercicios.messagingObserver;

public class DesktopDevice implements Device {
    private String id;

    public DesktopDevice(String id) {
        this.id = id;
    }

    @Override
    public void notify(Message message) {
        System.out.println("DesktopDevice " + id + " received message: " + message);
    }
}
