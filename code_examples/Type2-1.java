public boolean containsOnlyRedCircles(List<Circle> circles){
	return circles.stream().allMatch(Shape::isRed);
}

public Apple getEdibleApple(FruitBasket<Apple> basket){
	return basket.getFruitContainer()
		.getAppleByCriterium(Fruit::hasNotYetBeenEaten);
}


