package server;

import client.Client;
import client.ClientGUI;

import java.util.List;

public class Server{
    Client client;
    List<Client> clientList;
    boolean work;
    ServerView serverview;

    public Server(ServerView serverView){
        this.serverview = serverView;
    }

    public void connectUser(Client client){
        if (!work){
            return false;
        }
        clientList.add(client);
        return true;
    }

    public void disconnectUser(Client client){

    }

    public String getHistory(){
        return "";
    }

    public void sendMessage(String text){

    }


}
