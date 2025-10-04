package com.elearn.service;

import com.elearn.model.User;

import java.io.Serializable;
import java.util.*;

public class AuthService implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, User> users = new HashMap<>();

    public boolean register(String username, String password, String role) {
        if (users.containsKey(username)) return false;
        if (!"student".equalsIgnoreCase(role) && !"instructor".equalsIgnoreCase(role)) return false;
        users.put(username, new User(username, password, role.toLowerCase()));
        return true;
    }

    public User login(String username, String password) {
        User u = users.get(username);
        if (u == null) return null;
        if (!u.getPassword().equals(password)) return null;
        return u;
    }

    public Collection<User> getAllUsers() { return users.values(); }
    public Map<String, User> internalUsers() { return users; }
    public void setInternalUsers(Map<String,User> m) { this.users = m; }
}


