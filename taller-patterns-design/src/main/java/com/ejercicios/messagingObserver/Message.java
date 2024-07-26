package main.java.com.ejercicios.messagingObserver;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String content;
    private String sender;
    private long timestamp;

    public Message(String content, String sender, long timestamp) {
        this.content = content;
        this.sender = sender;
        this.timestamp = timestamp;
    }

    public String getFormattedTimestamp() {
        
        // Convertir el timestamp a un objeto Instant
        Instant instant = Instant.ofEpochMilli(timestamp);
        
        // Convertir Instant a ZonedDateTime en la zona horaria local
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        
        // Formatear la fecha y hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return zonedDateTime.format(formatter);
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "content=' " + content + '\'' +
                ", sender= '" + sender + '\'' +
                ", Fecha= " + getFormattedTimestamp() +
                '}';
    }


}
