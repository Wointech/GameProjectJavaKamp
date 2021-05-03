package gameProjectDemo;

public interface GameSaleService {
	
	void campaignSale(Player player);
	void saleWithoutCampaign(Player player, Campaign campaign);

}
