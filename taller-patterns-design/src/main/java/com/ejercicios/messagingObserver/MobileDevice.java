package main.java.com.ejercicios.messagingObserver;

public class MobileDevice implements Observer {
    private String id;

    public MobileDevice(String id) {
        this.id = id;
    }

    @Override
    public void notify(Message message) {
        System.out.println("MobileDevice " + id + " mensaje recibido: " + message);
    }
}

