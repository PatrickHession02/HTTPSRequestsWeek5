package ie.atu.httpsrequests;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface TodoCLient {

    @GetMapping("/todos/1")
    todoResponse fetchData();

}
