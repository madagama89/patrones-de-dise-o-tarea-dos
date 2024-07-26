package main.java.com.ejercicios;

import main.java.com.ejercicios.messagingObserver.*;

public class mainMessagingObserver {
    public static void main(String[] args) {
       
        // Crear usuarios y dispositivos
        User user = new User("marlongama");
        Device mobileDevice = new MobileDevice("Android");
        Device desktopDevice = new DesktopDevice("desktop");

        user.addDevice(mobileDevice);
        user.addDevice(desktopDevice);

        // Registrar usuarios en el servicio de mensajería
        MessagingService messagingService = new MessagingService();
        messagingService.registerUser(user);

        // Enviar un mensaje y notificar a los dispositivos del usuario
        Message message = new Message("Hello, World!", "Claudia Bojaca", System.currentTimeMillis());
        messagingService.sendMessage("marlongama", message);
    }
}
