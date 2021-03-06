package gameProject;

import java.util.Iterator;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Veritabanına oyun kaydedildi : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Veritabanındaki oyun bilgisi güncellendi : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Veritabanından silindi : " + game.getName());
		
		
	}

	@Override
	public void addMultiple(Game[] games) {
		for (Game game:games) {
			add(game);
		}
		
	}

}
