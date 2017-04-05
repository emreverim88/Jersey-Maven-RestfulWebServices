package org.emreverim.database;

import org.emreverim.model.Message;
import org.emreverim.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Emrecan on 4.04.2017.
 */
public class Database {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Profile> profiles = new HashMap<>();

    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }

    public static Map<Long, Message> getMessages() {
        return messages;
    }

}
