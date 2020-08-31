import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	QuestionDialog question;
	String correctAnswer;

	Question(String question){
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel("  "+question+"  ",JLabel.CENTER));
	}

	/** This method initializes the question as set up by the MultipleChoice and TrueFalse
	 *  classes.
	 */
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	
	/** This method checks if user has input a valid character.
	 * 
	 * @param question
	 * @return string answer for possible use in other parts
	 **/
	String ask() {
		question.setVisible(true);
		return question.answer;
	}//end ask()
	
	/**This method checks if answers are correct given a question and a correct answer.
	 * This method uses member variables nQuestions and nCorrect to count how many
	 * questions were asked and how many the user got correct, respectively.
	 * 
	 * @param question is a string variable that is the question being asked
	 * @param correctAnswer is a string variable that is the correct answer for the given question
	 **/
	public void check() {
		String answer = ask();
		nQuestions += 1;
		
		if(answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is "+correctAnswer);
		}
	} //end of check()
	
	public static void showResults() {
		JOptionPane.showMessageDialog(null, "You got "+nCorrect+" out of "+nQuestions+" questions correct!");
	}// end of showResults
}
