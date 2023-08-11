/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.citi.cititest.synonyms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luis
 */
@RestController
public class SynonymsController {
    @Autowired
    private SynonymsService synonymsService;
    
    @GetMapping("/synonyms/{word}")
    public Synonym getSynonyms(@PathVariable String word) {
            return synonymsService.getSynonyms(word);
    }
    
}
