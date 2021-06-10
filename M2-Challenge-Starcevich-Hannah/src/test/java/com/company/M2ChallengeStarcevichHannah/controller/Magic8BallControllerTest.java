package com.company.M2ChallengeStarcevichHannah.controller;

import com.company.M2ChallengeStarcevichHannah.model.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(Magic8BallController.class)
public class Magic8BallControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // create the jackson mapper for JSON to Java and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnAQuestionAndAnswerObject() throws Exception {

        Answer inputAnswer = new Answer();
        inputAnswer.setQuestion("Is this is a test?");

        String inputJson = mapper.writeValueAsString(inputAnswer);

        mockMvc.perform(
                post("/magic")
                    .content(inputJson)
                    .contentType(MediaType.APPLICATION_JSON)
        )     .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").isNotEmpty());

    }

}