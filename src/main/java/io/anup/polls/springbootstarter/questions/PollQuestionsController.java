package io.anup.polls.springbootstarter.questions;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollQuestionsController {
	
	@RequestMapping("/questions")
	public List<PollQuestion> getAllPollQuestions(){
		return Arrays.asList(
				new PollQuestion("Favourite programming language?","2015-08-05T08:40:51.620Z","Java"),
				new PollQuestion("Favourite programming language?","2015-08-05T08:40:51.620Z","Phython"),
				new PollQuestion("Favourite programming language?","2015-08-05T08:40:51.620Z","C++")
				);
	}

}
