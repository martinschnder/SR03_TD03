import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Channel {

    private Integer id;
    private String title;
    private String description;
    private Date date;
    private Time hour;
    private Integer duration;
    private User owner;
    private ArrayList<User> guests;

    public Channel(Integer id, String title, String description, Date date, Time hour, Integer duration, User owner,
            ArrayList<User> guests) {
        setDate(date);
        setDescription(description);
        setDuration(duration);
        setGuests(guests);
        setHour(hour);
        setId(id);
        setOwner(owner);
        setGuests(guests);
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDuration() {
        return duration;
    }

    public ArrayList<User> getGuests() {
        return guests;
    }

    public Time getHour() {
        return hour;
    }

    public Integer getId() {
        return id;
    }

    public User getOwner() {
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

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setGuests(ArrayList<User> guests) {
        this.guests = guests;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addUser(User newuser) {
        getGuests().add(newuser);
    }

    public void removeUser(User user) {
        if (getGuests().contains(user)) {
            getGuests().remove(user);
        } else {
            System.out.println("L'utilisateur n'existe pas");
        }
    }
}
