import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MinikubeServiceClient {


    private static final String HELLO = "http://locslhost"+ "/hello";
    private static final String WORLD = "http://localhost"+ "/world";

    private static String fetchResponse(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                return content.toString();
            } else {
                System.out.println("Request failed: "+ responseCode);
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String helloResponse = fetchResponse(HELLO);
        String worldResponse = fetchResponse(WORLD);

        if (helloResponse != null && worldResponse != null) {
            String combinedResponse = helloResponse + " " + worldResponse;
            System.out.println(combinedResponse);
        } else {
            System.out.println("Request failed");
        }
    }
}
