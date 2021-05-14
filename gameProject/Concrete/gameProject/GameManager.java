package gameProject;

import java.util.Iterator;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Veritabanýna oyun kaydedildi : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Veritabanýndaki oyun bilgisi güncellendi : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Veritabanýndan silindi : " + game.getName());
		
		
	}

	@Override
	public void addMultiple(Game[] games) {
		for (Game game:games) {
			add(game);
		}
		
	}

}
