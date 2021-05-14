package gameProject;

public interface SaleService {
	void sale(Game game, Player player);
	void saleWithCampaign(Game game, Player player, Campaign campaign);

}
