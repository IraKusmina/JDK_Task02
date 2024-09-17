package client;

import server.ServerWindow;

public interface ClientView {
    void sendMessage(String message);

    void disconnectFromServer();

}
