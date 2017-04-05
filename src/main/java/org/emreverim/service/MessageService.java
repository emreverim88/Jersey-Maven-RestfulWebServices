package org.emreverim.service;

import org.emreverim.database.Database;
import org.emreverim.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Emrecan on 3.04.2017.
 */
public class MessageService {

    private Map<Long, Message> messages = new Database().getMessages();

    public MessageService(){

        messages.put(1L,new Message(1,"emrecan","demircan"));

        messages.put(2L,new Message(2,"sikerim","demircan"));
    }

    public List<Message> getAllmessages(){

        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(long id){

        return messages.get(id);
    }

    public Message addMessage(Message message){
        message.setId(messages.size()+1);
        messages.put(message.getId(),message);
        return message;
    }

    public Message updateMessage(Message message){

        messages.put(message.getId(),message);
        return message;
    }

    public Message removeMessage(long id){

        return messages.remove(id);
    }
}
