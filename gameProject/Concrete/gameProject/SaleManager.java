package gameProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class SaleManager implements SaleService {
	
	private CampaignService campaignService;
	
	public SaleManager() {
		
	}
	

	public SaleManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}

	@Override
	public void sale(Game game, Player player) {
		System.out.println(player.getFirstName() + " " + game.getName() + " oyununu satýn aldý.");
		
	}

	@Override
	public void saleWithCampaign(Game game, Player player, Campaign campaign) {
		double reducedPrice = game.getUnitPrice() * ((100-campaign.getDiscountRate())/100);
		
		LocalDate start = campaign.getStartDate();
		LocalDate end = campaign.getExpirationDate();
		LocalDate today = LocalDate.now();
		
		if (start.getDayOfMonth() <= today.getDayOfMonth() && today.getDayOfMonth() <= end.getDayOfMonth()) {
			System.out.println(game.getName() + " isimli oyun " + campaign.getCampaingName() + " kampanyasý ile " + 
		 "% " + campaign.getDiscountRate() + " indirimli olarak " + reducedPrice + " TL'ye satýn alýndý.");
		
		}else {
			System.out.println("Kampanya bitmiþtir. " + game.getName() + " oyununu standar fiyat üzerinden satýn alýndý.");
		}
		
	}

}
