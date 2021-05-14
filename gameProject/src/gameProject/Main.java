package gameProject;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Player player = new Player(1, "Kadir Burçin", "Þenay", LocalDate.of(1983, 7, 8), "19364240212");
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player);
		
		System.out.println("-------------------------------------------------------------------------");
		
		Game game = new Game(1, "Fifa 2021", 300);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		System.out.println("-------------------------------------------------------------------------");
		
		Campaign campaign = new Campaign(1, "Yaza Merhaba", 25, LocalDate.of(2021, 4, 10), LocalDate.of(2021, 5, 15)); //Tarihler deðiþince çalýþýyor.
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.create(campaign);
		
		System.out.println("-------------------------------------------------------------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game, player);
		
		System.out.println("-------------------------------------------------------------------------");
		
		SaleManager saleManager2 = new SaleManager(new CampaignManager());
		saleManager2.saleWithCampaign(game, player, campaign);
	}

}
