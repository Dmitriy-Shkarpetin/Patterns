package structural.adapter;

public class Radio {
    public void listenToMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
    }
}