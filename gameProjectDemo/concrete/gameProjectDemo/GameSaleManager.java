package gameProjectDemo;

public class GameSaleManager implements GameSaleService{

	@Override
	public void campaignSale(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kiþisine kampanyasýz satýþ gerçekleþmiþtir..");
		
	}

	@Override
	public void saleWithoutCampaign(Player player, Campaign campaign) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kiþisine " + campaign.getName() + " kampanyasý dahilinde satýþ gerçekleþmiþtir..");
		
	}


}
