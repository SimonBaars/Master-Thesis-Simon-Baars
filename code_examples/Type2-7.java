// Refactored
public void printWeather(){
	printNice(this::myFancyPrint);
}

public void printWeather2(){
	printNice(System.out::println);
}

public void printWeather(Consumer<String> printFunction){
	System.out.println("=====================");
	printFunction.accept("The weather is nice");
	System.out.println("=====================");
}

public void myFancyPrint(String s){
	Arrays.stream(s.toCharArray()).boxed()
		.map(e -> "(" + e + ")")
		.collect(Collectors.joining());
}
