package main.java.com.ejercicios;

import main.java.com.ejercicios.messagingObserver.*;

public class mainMessagingObserver {
    public static void main(String[] args) {
       
        // Crear un sujeto (User)
        User user = new User("madagama");

        // Crear observadores (dispositivos)
        Observer mobileDevice = new MobileDevice("Android");
        Observer desktopDevice = new DesktopDevice("desktop");

        // Añadir dispositivos al usuario
        user.addDevice(mobileDevice);
        user.addDevice(desktopDevice);

        // Crear un mensaje
        Message message = new Message("Se te olvido pagar tu factura, PAGA YA!", "Claro", System.currentTimeMillis());

        // Notificar a todos los dispositivos
        user.notifyDevices(message);
    }
}
