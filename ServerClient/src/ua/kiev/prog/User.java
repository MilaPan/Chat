package ua.kiev.prog;

import java.util.UUID;

public class User {
    public UUID id;
    public String login;
    public String password;
    public String name;
    public String lastName;
    public String address;

    public User() {
        super();
    }

    public User(String login, String password, String name, String lastName, String address) {
        this.id = UUID.randomUUID();
        this.login = login;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "login " + login + '\'' +
                ", password " + password + '\'' +
                ", Username " + name + '\'' +
                ", UserLastname " + lastName + '\'' +
                ", address " + address;
    }
}

