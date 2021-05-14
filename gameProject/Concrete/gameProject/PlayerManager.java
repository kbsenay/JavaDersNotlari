package gameProject;

public class PlayerManager implements PlayerService {
	private PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (this.playerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Veritabanýna kaydedildi : " + player.getFirstName() + " " +  player.getLastName());
		}else {
			System.out.println("Kullanýcý bilgileri hatalý!");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Veritabaný kaydý güncellendi : " + player.getFirstName() + " " +  player.getLastName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Veritabaný kaydý silindi : " + player.getFirstName() + " " +  player.getLastName());
		
	}

}
