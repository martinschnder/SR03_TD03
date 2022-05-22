package model;

import java.sql.Time;

public class Message {

    private Integer user;
    private String content;
    private Time hour;
    private Integer channel;

    public Message(Integer user, String content, Time hour, Integer channel) {
        setChannel(channel);
        setContent(content);
        setHour(hour);
        setUser(user);
    }

    public Integer getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public Time getHour() {
        return hour;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public void setUser(Integer user) {
        this.user = user;
    }
}