package Main;

import java.util.ArrayList;

public class Sentence {
	private int subject;
	private int verb;
	private int object;
	private int adjective;
	private int adverb;
	private double probability;
	
	public Sentence() {
		subject = 0;
		verb = 0;
		object = 0;
		adjective = 0;
		adverb = 0;
		probability = 0;
	}
	
	public void checkSentence(String aString, ArrayList<Word> wordList) {
		String delims = "[ ]+";
		String[] tokens = aString.split(delims);
		
		for (int i = 0; i < tokens.length; i++) {
			for(int j = 0; j < wordList.size(); j++) {
				if(tokens[i].equalsIgnoreCase(wordList.get(j).getWord())) {
					if(wordList.get(j).getType().equals("person")) {
						if(subject == 0) {
							subject = 1;
						}
						else {
							object = 1;
						}
						
					}
					else if(wordList.get(j).getType().equalsIgnoreCase("place")) {
						if(subject == 0) {
							subject = 1;
						}
						else {
							object = 1;
						}
						
					}
					else if(wordList.get(j).getType().equalsIgnoreCase("thing")) {
						if(subject == 0) {
							subject = 1;
						}
						else {
							object = 1;
						}
						
					}
					else if(wordList.get(j).getType().equalsIgnoreCase("verb")) {
						verb = 1;
						
					}
					else if(wordList.get(j).getType().equalsIgnoreCase("adjective")) {
						adjective = 1;
						
					}
					else if(wordList.get(j).getType().equalsIgnoreCase("adverb")) {
						adverb = 1;
						
					}
				}
			}
		}
		    
	}
	
	
	public double findProbability() {
		
		
		
		return probability;		
		
	}

}
