package com.company.M2ChallengeStarcevichHannah.controller;

import com.company.M2ChallengeStarcevichHannah.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
//    URI: /word
//    Method: GET
//    Request Body: None
//    Response Body: Definition

    private static int idCounter = 0;
    Random random = new Random();

    private static List<Word> wordList = new ArrayList<>(Arrays.asList(
            new Word(idCounter++, "mudita", "(n) taking delight in the happiness of others, vicarious joy; opposite of schadenfreude - Sanskrit"),
            new Word(idCounter++, "komorebi", "(n) sunlight filtering through trees - Japanese"),
            new Word(idCounter++, "tsundoku", "(n) the act of buying a book and leaving it unread, often piled together without other unread books - Japanese"),
            new Word(idCounter++, "voorpret", "(n) pre-fun, the sense of enjoyment felt before a part or event takes place - Dutch"),
            new Word(idCounter++, "depaysement", "(n) the disorientation felt in a foreign country or culture, the sense of being a fish out of water - French"),
            new Word(idCounter++, "fernweh", "(n) a longing to travel, missing a place your never been - German"),
            new Word(idCounter++, "meraki", "(v) to do something with soul, creativity, or love; when you leave a piece of yourself in your work - Greek"),
            new Word(idCounter++, "gigil", "(n) the overwhelming urge to squeeze or pinch something very cute - Filipino"),
            new Word(idCounter++, "lagom", "(n) just the right amount - Swedish"),
            new Word(idCounter++, "desenrascoanco", "(n) the last minute improvisation of a hasty but perfectly sound solution; pulling a MacGuyver - Portuguese")
    ));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getWord() {

        Word selectedWord = null;

        //generate random number
        int randomId = random.nextInt(wordList.size());

        for(Word word : wordList){
            if(word.getId() == randomId){
                selectedWord = word;
                break;
            }
        }
        return selectedWord;
    }
}
