package gameProject;

public class PlayerManager implements PlayerService {
	private PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (this.playerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Veritaban�na kaydedildi : " + player.getFirstName() + " " +  player.getLastName());
		}else {
			System.out.println("Kullan�c� bilgileri hatal�!");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Veritaban� kayd� g�ncellendi : " + player.getFirstName() + " " +  player.getLastName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Veritaban� kayd� silindi : " + player.getFirstName() + " " +  player.getLastName());
		
	}

}
