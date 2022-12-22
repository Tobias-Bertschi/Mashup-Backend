package ch.bbw.mashupbackend.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HoroscopeService {

    private String url = "https://aztro.sameerkumar.website/?sign=scorpio&day=today";

    public String createHoroscope() {

        try {
            RestTemplate restTemplate = new RestTemplate();
            String test = "";
            ResponseEntity<String> response = restTemplate.postForEntity(url, test, String.class);

            return response.getBody().toString();
        } catch (
                Exception e) {
            System.out.println(e);
        }

        return "fail";

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}