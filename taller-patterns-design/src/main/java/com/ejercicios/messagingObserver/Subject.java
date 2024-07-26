package main.java.com.ejercicios.messagingObserver;

public interface Subject {
    
    void addDevice(Observer observer);
    void removeDevice(Observer observer);
    void notifyDevices(Message message);
    String getId();
}

