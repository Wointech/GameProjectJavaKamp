package gameProjectDemo;

public class GameSaleManager implements GameSaleService{

	@Override
	public void campaignSale(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " ki�isine kampanyas�z sat�� ger�ekle�mi�tir..");
		
	}

	@Override
	public void saleWithoutCampaign(Player player, Campaign campaign) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " ki�isine " + campaign.getName() + " kampanyas� dahilinde sat�� ger�ekle�mi�tir..");
		
	}


}
