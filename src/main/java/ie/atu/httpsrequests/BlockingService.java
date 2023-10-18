package ie.atu.httpsrequests;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BlockingService {
    private final restTemplate restTemplate;

    public BlockingService(RestTemplate restTemplate) {this.restTemplate= restTemplate;}

    public String fetchDataBlocking(){
        //delay of 2 seconds simulations

    }
}
