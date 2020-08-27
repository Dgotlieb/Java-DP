import java.io.IOException;

public class SingletonTest {
    public static void main(String[] args) throws IOException {
        ServerConnector serverConnector = ServerConnector.getInstance();
        serverConnector.connectToServer("https://www.google.com");
    }
}