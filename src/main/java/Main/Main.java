package Main;

import RestfulMessageClient.Client.RestClient;
import RestfulMessageClient.Model.Message;

import java.util.List;

public class Main {
    public static void main(String[] args){
        String messageReturned = RestClient.removeAllMessages();
        System.out.println(messageReturned);
    }
}
