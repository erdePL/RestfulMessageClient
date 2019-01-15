package Main;

import RestfulMessageClient.Client.RestClient;
import RestfulMessageClient.Model.Message;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Message> messages = RestClient.getAllMessages();
        System.out.println(messages.get(0));
    }
}
