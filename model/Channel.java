package model;

import java.sql.Date;
import java.sql.Time;

public class Channel {

    private Integer id;
    private String title;
    private String description;
    private Date date;
    private Time hour;
    private Date duration;
    private Integer owner;

    public Channel(Integer id, String title, String description, Date date, Time hour, Date duration, Integer owner) {
        setDate(date);
        setDescription(description);
        setDuration(duration);
        setHour(hour);
        setId(id);
        setOwner(owner);
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Date getDuration() {
        return duration;
    }

    public Time getHour() {
        return hour;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOwner() {
        return owner;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addUser(Integer newuser) {

    }

    public void removeUser(Integer user) {

    }
}
