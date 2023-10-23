package ie.atu.httpsrequests;

import org.springframework.stereotype.Service;

@Service
public class FeignService {
    private final TodoCLient todoCLient;


    public FeignService(TodoCLient todoCLient) {
        this.todoCLient = todoCLient;
    }
    public  ToDoResponse fetchData(){
        ToDoResponse td = todoCLient.fetchData();
        System.out.println(td);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return td;
    }
}
