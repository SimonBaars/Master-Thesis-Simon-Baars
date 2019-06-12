// Refactored
public void printNice(String s){
	printNice(s, "=====================");
}

public void printNice2(String s){
	printNice(s, "---------------------");
}

public void printNice(String s, String decoration){
	System.out.println(decoration);
	System.out.println(s);
	System.out.println(decoration);
}

