public boolean containsOnlyRedCircles(List<Circle> listOfCircles){
	return listOfCircles.stream().allMatch(Shape::isRed);
}

public Apple getEdibleAppleFromBasket(FruitBasket<Apple> appleBasket){
	return appleBasket.getFruitContainer().getAppleByCriterium(Fruit::hasNotYetBeenEaten);
}
