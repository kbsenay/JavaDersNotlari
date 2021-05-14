package gameProject;

import java.util.Iterator;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Veritaban�na oyun kaydedildi : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Veritaban�ndaki oyun bilgisi g�ncellendi : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Veritaban�ndan silindi : " + game.getName());
		
		
	}

	@Override
	public void addMultiple(Game[] games) {
		for (Game game:games) {
			add(game);
		}
		
	}

}
