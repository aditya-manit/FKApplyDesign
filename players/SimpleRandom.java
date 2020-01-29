package game;

import java.util.List;
import java.util.Random;

public class SimpleRandom extends AbstractPlayer {

	public SimpleRandom(PlayerColor player) {
		super(player);
	}

	@Override
	public Move getMove(Board board, List<Move> legalMoves) {
		Random randomNumberSource = new Random();
		int randomNumber  = randomNumberSource.nextInt(legalMoves.size());
		return legalMoves.get(randomNumber);
	}

	@Override
	public String getName() {
		return "Simple Random";
	}

}

