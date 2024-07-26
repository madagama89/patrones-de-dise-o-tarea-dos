package main.java.com.ejercicios.messagingObserver;

import java.util.ArrayList;
import java.util.List;

public class User implements Subject {
   
    private String id;
    private List<Observer> devices;

    public User(String id) {
        this.id = id;
        this.devices = new ArrayList<>();
    }

    @Override
    public void addDevice(Observer observer) {
        devices.add(observer);
    }

    @Override
    public void removeDevice(Observer observer) {
        devices.remove(observer);
    }

    @Override
    public void notifyDevices(Message message) {
        for (Observer device : devices) {
            device.notify(message);
        }
    }

    @Override
    public String getId() {
        return id;
    }
}
