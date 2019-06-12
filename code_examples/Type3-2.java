// Refactored
public List<String> wordOfNumbers(int size){
	return wordOfNumbers(n, size, false);
}

public void printWordOfNumbers(int size){
	System.out.println(wordOfNumbers(n, size, true));
}

public StringBuilder wordOfNumbers(int size, 
									boolean doPrint){
	Random r = new Random();
	StringBuilder word = new StringBuilder();
	for(int i = 0; i<size; i++){
		word.append(i);
		if(doPrint) System.out.println("Appended "+i);
	}
	word.append("that's it");
	return word;
}


