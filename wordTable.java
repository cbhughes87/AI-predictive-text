package Main;
import java.util.ArrayList;
import java.util.Random;
import java.lang.String;

public class wordTable {
	private ArrayList<Word> wordList;
	public ArrayList<Word> getWordList()
	{
		return this.wordList;
	}
	
	public wordTable() {
		
		Random generator = new Random();
	
		wordList = new ArrayList<Word>();
		Word word1 = new Word("Sarah", "person", (generator.nextInt(50)/100.0));
		Word word19 = new Word("Dylan", "person", (generator.nextInt(50)/100.0));
		Word word20 = new Word("Joe", "person", (generator.nextInt(50)/100.0));
		Word word6 = new Word("he", "person", (generator.nextInt(50)/100.0));
		Word word7 = new Word("she", "person", (generator.nextInt(50)/100.0));
		Word word2 = new Word("runs", "verb", (generator.nextInt(50)/100.0), "place", "adverb");
		Word word5 = new Word("eats", "verb", (generator.nextInt(50)/100.0), "thing", "adverb");
		Word word8 = new Word("jumps", "verb", (generator.nextInt(50)/100.0), "adverb", "place");
		Word word10 = new Word("likes", "verb", (generator.nextInt(50)/100.0), "thing", "place", "person");
		Word word11 = new Word("reads", "verb", (generator.nextInt(50)/100.0), "adverb", "thing", "person");
		Word word12 = new Word("sees", "verb", (generator.nextInt(50)/100.0), "thing", "person", "place");
		Word word30 = new Word("is", "verb", (generator.nextInt(50)/100.0), "adjective", "thing", "place");
		Word word3 = new Word("fast", "adverb", (generator.nextInt(50)/100.0));
		Word word4 = new Word("slow", "adverb", (generator.nextInt(50)/100.0));
		Word word31 = new Word("quickly", "adverb", (generator.nextInt(50)/100.0));
		Word word32 = new Word("eagerly", "adverb", (generator.nextInt(50)/100.0));
		Word word24 = new Word("calmly", "adverb", (generator.nextInt(50)/100.0));
		Word word15 = new Word("blue", "adjective", (generator.nextInt(50)/100.0));
		Word word26 = new Word("red", "adjective", (generator.nextInt(50)/100.0));
		Word word27 = new Word("green", "adjective", (generator.nextInt(50)/100.0));
		Word word28 = new Word("brave", "adjective", (generator.nextInt(50)/100.0));
		Word word29 = new Word("firm", "adjective", (generator.nextInt(50)/100.0));
		Word word9 = new Word("home", "place", (generator.nextInt(50)/100.0));
		Word word13 = new Word("here", "place", (generator.nextInt(50)/100.0));
		Word word14 = new Word("there", "place", (generator.nextInt(50)/100.0));
		Word word16 = new Word("park", "place", (generator.nextInt(50)/100.0));
		Word word25 = new Word("Tucson", "place", (generator.nextInt(50)/100.0));
		Word word17 = new Word("dog", "thing", (generator.nextInt(50)/100.0));
		Word word18 = new Word("food", "thing", (generator.nextInt(50)/100.0));
		Word word21 = new Word("steak", "thing", (generator.nextInt(50)/100.0));
		Word word22 = new Word("fish", "thing", (generator.nextInt(50)/100.0));
		Word word23 = new Word("cat", "thing", (generator.nextInt(50)/100.0));
	
		
		wordList.add(word1);
		wordList.add(word2);
		wordList.add(word3);
		wordList.add(word4);
		wordList.add(word5);
		wordList.add(word6);
		wordList.add(word7);
		wordList.add(word8);
		wordList.add(word9);
		wordList.add(word10);
		wordList.add(word11);
		wordList.add(word12);
		wordList.add(word13);
		wordList.add(word14);
		wordList.add(word15);
		wordList.add(word16);
		wordList.add(word17);
		wordList.add(word18);
		wordList.add(word19);
		wordList.add(word20);
		wordList.add(word21);
		wordList.add(word22);
		wordList.add(word23);
		wordList.add(word24);
		wordList.add(word25);
		wordList.add(word26);
		wordList.add(word27);
		wordList.add(word28);
		wordList.add(word29);
		wordList.add(word30);
		wordList.add(word31);
		wordList.add(word32);	
	}

}


