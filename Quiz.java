/* This creates a quiz question as per week 3 assignment */

public class Quiz {

	public static void main(String[] args) {
		Question question = new MultipleChoiceQuestion(
				"What is Vin Diesel's real name? (Enter the letter of your choice)",
				"Vin Diesel",
				"Dwayne Johnson",
				"Mark Wahlberg",
				"Lamont Chen",
				"Mark Sinclair",
				"E"
				);
		
		Question question2 = new MultipleChoiceQuestion(
				"In Pirates of the Caribbean: The Curse of the Black Pearl, Will Turner's father's name is?",
				"Vin Diesel",
				"Bootstrap Bill",
				"Admiral Blackmoor",
				"One-Eyed Will",
				"Postman Pat",
				"B"
				);
		
		Question question3 = new MultipleChoiceQuestion(
				"Actor Gary Sinise, known for his role in CSI, is also known for?",
				"Genie in Aladdin",
				"Othello in Othello",
				"Lt. Dan in Forest Gump",
				"Ms. Doubtfire in Ms. Doubtfire",
				"Barbossa in Pirates of the Caribbean: The Curse of the Black Pearl",
				"C"
				);
		
		Question question4 = new MultipleChoiceQuestion(
				"Actor Steve Buscemi, known for his role as Mr. Pink, is also a?",
				"Bounty Hunter",
				"Restaurant Chef",
				"NASA Scientist",
				"New York Firefighter",
				"Mob Boss",
				"D"
				);
		
		Question question5 = new MultipleChoiceQuestion(
				"Actor Dwayne 'The Rock' Johnson started as a professional wrestler. His signature move was?",
				"The People's Elbow",
				"DDT",
				"Tombstone",
				"The Triple Sowcow",
				"The Stone Cold Stunner",
				"A"
				);
		
		Question question6 = new TrueFalseQuestion(
				"Actor Tom Cruise does his own stunts.",
				"TRUE"
				);
		
		Question question7 = new TrueFalseQuestion(
				"Star Wars Episode IV is the fourth movie in the series.",
				"FALSE"
				);
		
		Question question8 = new TrueFalseQuestion(
				"Actor Jason Statham is trained in martial arts.",
				"TRUE"
				);
		
		Question question9 = new TrueFalseQuestion(
				"Actor Jackie Chan first debuted on film as a stunt man for Bruce Lee.",
				"TRUE"
				);
		
		question.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		question6.check();
		question7.check();
		question8.check();
		question9.check();
		
		Question.showResults();
	} //end of main()
	
}
