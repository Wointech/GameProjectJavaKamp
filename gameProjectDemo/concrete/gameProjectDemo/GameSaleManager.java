package gameProjectDemo;

public class GameSaleManager implements GameSaleService{

	@Override
	public void campaignSale(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kişisine kampanyasız satış gerçekleşmiştir..");
		
	}

	@Override
	public void saleWithoutCampaign(Player player, Campaign campaign) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kişisine " + campaign.getName() + " kampanyası dahilinde satış gerçekleşmiştir..");
		
	}


}
