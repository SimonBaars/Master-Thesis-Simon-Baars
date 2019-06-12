// Original
public void printWeather(){
	System.out.println("=====================");
	myFancyPrint("The weather is nice");
	System.out.println("=====================");
}

public void printWeather2(){
	System.out.println("=====================");
	System.out.println("The weather is nice");
	System.out.println("=====================");
}

public void myFancyPrint(String s){
	Arrays.stream(s.toCharArray()).boxed()
		.map(e -> "(" + e + ")")
		.collect(Collectors.joining());
}
