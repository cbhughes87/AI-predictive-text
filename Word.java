package Main;
import java.lang.String;
import java.util.ArrayList;

public class Word {
	private String word;
	private String type;
	private double probability;
	private String nType;
	private String nType2;
	private String nType3;
	
	
	public Word() {
		word = null;
		type = null;
		probability = 0;
	}
	
	public Word(String aWord) {
		word = aWord;
		type = null;
		probability = 0;
	}
	
	public Word(String aWord, String aType) {
		word = aWord;
		type = aType;
		probability = 0;
	}
	
	public Word(String aWord, String aType, double aNum) {
		word = aWord;
		type = aType;
		probability = aNum;
	}
	
	public Word(String aWord, String aType, double aNum, String nextType) {
		word = aWord;
		type = aType;
		probability = aNum;
		nType = nextType;
		nType2 = null;
		nType3 = null;
		
	}
	
	public Word(String aWord, String aType, double aNum, String nextType, String nextType2) {
		word = aWord;
		type = aType;
		probability = aNum;
		nType = nextType;
		nType2 = nextType2;
		nType3 = null;
	}
	
	public Word(String aWord, String aType, double aNum, String nextType, String nextType2, String nextType3) {
		word = aWord;
		type = aType;
		probability = aNum;
		nType = nextType;
		nType2 = nextType2;
		nType3 = nextType3;
	}
	
	public void setType(String aType) {
		type = aType;
	}
	
	public void setWord(String aWord) {
		word = aWord;
	}
	
	public String getWord() {
		return word;
	}
	
	public String getType() {
		return type;
	}
	
	public void setProbability(double anInt) {
		probability = anInt;
	}
	
	public double getProbability() {
		return probability;
	}
	
	public String getNType()
	{
		return this.nType;
	}
	
	public String getNType2()
	{
		return this.nType2;
	}
	
	public String getNType3()
	{
		return this.nType3;
	}
	
	public void genSentence(String aString, ArrayList<Word> wordList) {
		Word verb = null;
		Word obj = null;
		double verbProb = 0;
		double objProb = 0;
		double tempNum = 0;
		
		for(int i = 0; i < wordList.size(); i++) {
			if(wordList.get(i).getType().equalsIgnoreCase("verb")) {
				if(verbProb < wordList.get(i).getProbability()) {
					verb = wordList.get(i);
					verbProb = wordList.get(i).getProbability();
				}
			}
		}
		
		for(int i = 0; i < wordList.size(); i++) {
			if(verb.getNType3() != null) {
				if(wordList.get(i).getType().equalsIgnoreCase(verb.getNType()) || wordList.get(i).getType().equalsIgnoreCase(verb.getNType2()) || wordList.get(i).getType().equalsIgnoreCase(verb.getNType3())) {
					tempNum = 0.33 * wordList.get(i).getProbability() / verb.getProbability();
					if(tempNum > objProb) {
						objProb = tempNum;
						obj = wordList.get(i);
					}
				}
			}
			else if(verb.getNType2() != null) {
				 if(wordList.get(i).getType().equalsIgnoreCase(verb.getNType()) || wordList.get(i).getType().equalsIgnoreCase(verb.getNType2())) {
					 tempNum = 0.5 * wordList.get(i).getProbability() / verb.getProbability();
						if(tempNum > objProb) {
							objProb = tempNum;
							obj = wordList.get(i);
						}
				 }
			}
			else {
				tempNum = wordList.get(i).getProbability() / verb.getProbability();
				if(tempNum > objProb) {
					objProb = tempNum;
					obj = wordList.get(i);
				}
			}
		}
		
		System.out.println(aString + " " + verb.getWord() + " " + obj.getWord());
		
	}

}
