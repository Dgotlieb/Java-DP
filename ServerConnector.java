import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class ServerConnector {
    private static ServerConnector instance = null;

    private ServerConnector() { }

    public static ServerConnector getInstance() {
        if (instance == null) {
            instance = new ServerConnector();
        }
        return instance;
    }

    public void connectToServer(String url) throws IOException {
        URL myURL = new URL(url);
        URLConnection myConnection = myURL.openConnection();
        myConnection.connect();
        System.out.println("Connected to " + url);
    }
}
