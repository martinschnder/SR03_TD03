package model;

public class User {

    private String name;
    private String firstname;
    private String mail;
    private String password;
    private Bool admin;
    private Bool active;

    public getName(String name) {
        return name;
    }
    
    public getFirstname(String firstname) {
        return firstname;
    }
    
    public getMail(String mail) {
        return mail;
    }
    
    public getPassword(String password) {
        return password;
    }
    
    public getAdmin(String admin) {
        return admin;
    }
    
    public getActive(String active) {
        return active;
    }



    public setName(String name) {
        this.name = name;
    }
    
    public setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public setMail(String mail) {
        this.mail = mail;
    }
    
    public setPassword(String password) {
        this.password = password;
    }
    
    public setAdmin(String admin) {
        this.admin = admin;
    }
    
    public setActive(String active) {
        this.active = active;
    }

    public addUser(String name, String firstanme, String mail, String password, Bool admin, Bool active) {
        setName(name);
        setFirstname(firstanme);
        setMail(mail);
        setPassword(password);
        setAdmin(admin);
        setActive(active);
    }

    public deactivateUser() {
        setActive(false);
    }

    public channelOwner() {
        ArrayList<Channel> result = [];
        for (channel: channelList) {
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