package com.company.M2ChallengeStarcevichHannah.controller;

import com.company.M2ChallengeStarcevichHannah.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
//    URI: /quote
//    Method: GET
//    Request Body: None
//    Response Body: Quote

    private static int idCounter = 0;
    Random random = new Random();

    private static List<Quote> quotesList = new ArrayList<>(Arrays.asList(
            new Quote(idCounter++, "Walt Disney", "The Best Way To Get Started Is To Quit Talking And Begin Doing."),
            new Quote(idCounter++, "Winston Churchill", "The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty."),
            new Quote(idCounter++, "Anonymous", "You learn more from failure than from success. Don't let it stop you. Failure builds character."),
            new Quote(idCounter++, "Steve Jobs", "If you are working on something exciting that you really care about, you don't have to be pushed. The vision pulls you."),
            new Quote(idCounter++, "Helen Keller", "Security is mostly a superstition. Life is either a daring adventure or nothing."),
            new Quote(idCounter++, "Franklin D. Roosevelt", "The only limit to our realization of tomorrow will be our doubts of today."),
            new Quote(idCounter++, "Michael Scott", "Would I rather be feared or loved? Easy. Both. I want people to be afraid of how much they love me."),
            new Quote(idCounter++, "Zig Ziglar", "You don't have to be great to start, but you have to start to be great."),
            new Quote(idCounter++, "Dr. Seuss", "You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose."),
            new Quote(idCounter++, "Ralph Waldo Emerson", "Life is a succession of lessons which must be lived to be understood.")
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {

        Quote selectedQuote = null;

        //generate random number
        int randomId = random.nextInt(quotesList.size());

        for(Quote quote : quotesList){
            if(quote.getId() == randomId){
                selectedQuote = quote;
                break;
            }
        }
        return selectedQuote;
    }
}
