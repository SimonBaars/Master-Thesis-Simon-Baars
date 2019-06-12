public String wordOfNumbers(int max){
	Random r = new Random();
	StringBuilder word = new StringBuilder();
	for(int i = 0; i<=size; i++){
		word.append(i);
	}
	word.append("that's it")
	return word.toString();
}

public void printWordOfNumbers(int max){
	Random r = new Random();
	StringBuilder word = new StringBuilder();
	for(int i = 0; i<=size; i++){
		word.append(i);
		System.out.println("Appended "+i);
	}
	System.out.println(word);
	word.append("that's it");
}

