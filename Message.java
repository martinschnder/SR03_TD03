import java.sql.Time;

public class Message {

    private User sender;
    private String content;
    private Time hour;
    private Channel channel;

    public Message(User sender, String content, Time hour, Channel channel) {
        setChannel(channel);
        setContent(content);
        setHour(hour);
        setSender(sender);
    }

    public User getUser() {
        return sender;
    }

    public User getContent() {
        return content;
    }

    public Time getHour() {
        return hour;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
}