package main.java.com.ejercicios.messagingObserver;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private List<Device> devices;

    public User(String id) {
        this.id = id;
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public void notifyDevices(Message message) {
        for (Device device : devices) {
            device.notify(message);
        }
    }

    public String getId() {
        return id;
    }
}
