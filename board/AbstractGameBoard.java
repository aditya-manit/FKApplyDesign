package game;

import java.util.Observable;

public abstract class AbstractGameBoard extends Observable implements Board{
	
	protected int size;	
	
	/**
	 * {@inheritDoc}
	 */
	public int getSize() {
		return size;
	}

}
