import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/health", Main::health);
        server.createContext("/binary-search", Main::binarySearch);
        server.start();
        System.out.println("Java service running on 8080");
    }

    private static void health(HttpExchange exchange) throws IOException {
        respond(exchange, "{\"status\":\"ok\",\"service\":\"java-binary-search\"}");
    }

    private static void binarySearch(HttpExchange exchange) throws IOException {
        respond(exchange, "{\"result\":\"search simulation complete\"}");
    }

    private static void respond(HttpExchange exchange, String body) throws IOException {
        exchange.getResponseHeaders().add("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, body.getBytes().length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(body.getBytes());
        }
    }
}
