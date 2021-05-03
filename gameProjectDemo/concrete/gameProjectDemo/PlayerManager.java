package gameProjectDemo;

public class PlayerManager implements PlayerService{

	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		
		if(playerCheckService.checkIfRealPerson(player)) {
			
			System.out.println(player.getFirstName() + " Eklendi");
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý");
		}
		
		
		
	}

	@Override
	public void delete(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}

}
