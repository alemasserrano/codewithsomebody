package com.shellhacks.codewithsomebody.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String displayName;

    public LoggedInUser(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    // need to connect the db here in order to get the user id and displayname as well as config for profile
    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
