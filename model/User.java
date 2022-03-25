package model;

import java.util.ArrayList;

public class User {

    private String name;
    private String firstname;
    private String mail;
    private String password;
    private Boolean admin;
    private Boolean active;

    public User(String name, String firstname, String mail, String password, Boolean admin, Boolean active) {
        setName(name);
        setFirstname(firstname);
        setMail(mail);
        setPassword(password);
        setAdmin(admin);
        setActive(active);
    }

    public String getName(String name) {
        return name;
    }

    public String getFirstname(String firstname) {
        return firstname;
    }

    public String getMail(String mail) {
        return mail;
    }

    public String getPassword(String password) {
        return password;
    }

    public String getAdmin(String admin) {
        return admin;
    }

    public String getActive(String active) {
        return active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void deactivateUser() {
        setActive(false);
    }

    public ArrayList<Channel> channelOwner() {
        ArrayList<Channel> result = [];
        for (Channel channel: channelList) {
            if (channel.owner == this) {
                result.add(channel);
            }
        }
        return result;
    }

    public channelGuest() {
        ArrayList<Channel> result = [];
        for (channel: channelList) {
            if (channel.guest.contain(this)) {
                result.add(channel);
            }
        }
        return result;
    }
}