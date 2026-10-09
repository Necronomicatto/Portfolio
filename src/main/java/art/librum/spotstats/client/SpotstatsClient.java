package art.librum.spotstats.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service 
public class SpotstatsClient {
    private final RestClient restClient;

    public SpotstatsClient(RestClient restClient) {
        this.restClient = builder.baseUrl("https://api.spotstats.com/v1/me").build();
    }

    public String getCurrentUser(String accessToken) {
        
        return restClient.get().uri("/me").header("Authorization", "Bearer" + accessToken).retrieve().body(String.class);
    }
}
