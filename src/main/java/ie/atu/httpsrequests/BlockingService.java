package ie.atu.httpsrequests;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BlockingService {
    private final RestTemplate restTemplate;

    public BlockingService(RestTemplate restTemplate) {this.restTemplate= restTemplate;}

    public String fetchDataBlocking(){
        //delay of 2 seconds simulations
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("https://jsonplaceholder.typicode.come/todos/1", String.class);

    }
}
