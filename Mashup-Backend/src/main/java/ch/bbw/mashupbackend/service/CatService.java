package ch.bbw.mashupbackend.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class CatService {

    Random random = new Random();
    private String url = "https://cataas.com/cat/gif";

    public byte[] getCat() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<byte[]> response = restTemplate.getForEntity(url, byte[].class);

            return response.getBody();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }


    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}