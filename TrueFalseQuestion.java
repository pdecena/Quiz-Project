import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	public TrueFalseQuestion(String question, String answer) {
		super(question);
		
		JPanel buttons = new JPanel();
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		this.question.add(buttons);
		initQuestionDialog();
				
		correctAnswer = answer;   //only TRUE or FALSE
		
	}//end of constructor
	
	/**A method to add buttons into the T/F question GUI
	 * 
	 * @param buttons
	 * @param label
	 */
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

}
