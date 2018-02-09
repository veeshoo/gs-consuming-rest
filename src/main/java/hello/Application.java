package hello;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        //Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//        log.info(quote.toString());
        
        Topic[] topicList = restTemplate.getForObject("http://localhost:8080/topics", Topic[].class);
        for(Topic t : topicList) {
        	System.out.println("Id: "+t.getId());
        	System.out.println("Name: "+t.getName());
        	System.out.println("Description: "+t.getDescription());
        	System.out.println("----------------------");
        }
    }

}
