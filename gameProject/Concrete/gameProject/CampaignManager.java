package gameProject;

public class CampaignManager implements CampaignService{

	@Override
	public void create(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " isimli kampanya eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " isimli kampanya güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " isimli kampanya silindi.");
		
	}

}
