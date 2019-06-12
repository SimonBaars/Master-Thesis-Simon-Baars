public Optional<Niece> getNiece(Person p){
	if(p.hasNiece())
		return p.getNiece();
	return Optional.empty();
}

public Optional<Piece> getPiece(Pie p){
	if(p.isNotYetEaten())
		return p.getPiece();
	return Optional.empty();
}