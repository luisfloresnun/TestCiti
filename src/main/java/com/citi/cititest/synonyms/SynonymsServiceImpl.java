package com.citi.cititest.synonyms;
import com.citi.cititest.util.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luis
 */
@Service
public class SynonymsServiceImpl implements SynonymsService{
    private static final Logger log = LoggerFactory.getLogger(SynonymsServiceImpl.class);
    @Override
    public Synonym getSynonyms(String word) {
        try{
            HttpResponse<String> response = Unirest.get(Constants.BASE_URI + word + Constants.EXTERNAL_SERVICE_PATH)
            .header(Constants.X_RAPID_API_KEY, Constants.API_KEY)
            .header(Constants.X_RAPID_API_HOST, Constants.API_HOST)
            .asString();        
            Gson g = new Gson();  
            Synonym s = g.fromJson(response.getBody(), Synonym.class);
            return s;

        }catch(JsonSyntaxException e){
            log.error("Error when Synonyms Service was called : "+e.getMessage());
            return null;
        }
        
    }
    
}
