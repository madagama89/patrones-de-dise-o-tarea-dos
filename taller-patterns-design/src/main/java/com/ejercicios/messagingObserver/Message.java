package main.java.com.ejercicios.messagingObserver;

public class Message {
    private String content;
    private String sender;
    private long timestamp;

    public Message(String content, String sender, long timestamp) {
        this.content = content;
        this.sender = sender;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{content='" + content + "', sender='" + sender + "', timestamp=" + timestamp + "}";
    }
}
