package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		String userAnswer = "no";
		Word aWord = new Word();
		
		do
		{
			ArrayList<Word> wordList = new ArrayList<Word>();
			
			wordTable wordTable = new wordTable();
			wordList = wordTable.getWordList();
			
			for(Word w: wordList)
			{
				System.out.println("Word is: " + w.getWord());
			}
	
			Scanner finput;
			String input;
			System.out.println("Please enter a subject:");
			finput = new Scanner(System.in);
			input = finput.nextLine();
			
			aWord.genSentence(input, wordList);
			
			System.out.println("Would you like to continue?(y/Y): ");
			String userIn;
			userIn = finput.nextLine();
			userAnswer = userIn;
			
			
		}while(userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));
		
		
	}

}

