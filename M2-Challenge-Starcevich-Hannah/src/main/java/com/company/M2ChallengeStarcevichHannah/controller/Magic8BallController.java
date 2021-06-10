package com.company.M2ChallengeStarcevichHannah.controller;

import com.company.M2ChallengeStarcevichHannah.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class Magic8BallController {
//    URI: /magic
//    Method: POST
//    Request Body: question
//    Response Body: Answer

    private static int idCounter = 0;
    Random random = new Random();

    private static List<String> answerList = new ArrayList<>(Arrays.asList(
            "hmm, not right now. Try back again later...",
            "Absolutely not!",
            "Maybe, but no one can know for sure...",
            "When there's a will, there's a way!",
            "If only life were that simple...",
            "100% yes, you hit the nail on the head!",
            "Yes indeed!",
            "I mean I guess..."));

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer postQuestionGetAnswer(@RequestBody @Valid Answer answer) {

        //generate random number
        int randomId = random.nextInt(answerList.size());

        // grab the selected answer from the answerList at the index of the random number
        String selectedAnswer = answerList.get(randomId);

        // update the Answer object with random answer response
        answer.setAnswer(selectedAnswer);
        answer.setId(idCounter++);

        return answer;
    }
}
