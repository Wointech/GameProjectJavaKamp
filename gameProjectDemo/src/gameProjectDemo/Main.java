package gameProjectDemo;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player(1, "Ömer", "yýldýrým", "455452121", 1996);
		Player player2 = new Player(2, "Murat", "yýldýrým", "45458455", 1994);
		
		Campaign campaign1 = new Campaign(1, "Dev Ýnidirim");
		Campaign campaign2 = new Campaign(2, "Ýndirimli saatler");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player1);
		playerManager.add(player2);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.campaignSale(player1);
		gameSaleManager.saleWithoutCampaign(player2, campaign2);

		
	}

}
