import java.util.ArrayList;

public class Player {
	
	private final String id;
	private ArrayList<String> purchased;
	
	/**
	 * Constructor for Player
	 * @param s line from csv file
	 */
	public Player(String id) {
		this.id = id;
		purchased = new ArrayList<String>();
	}
	
	/**
	 * get the id from player
	 * @return long for player id
	 */
	public String getId(){
		return this.id;
	}
	

	public void addPurchase(String purchased){
		this.purchased.add(purchased);
	}
	
	public ArrayList<String> getPurchased(){
		ArrayList<String> temp = new ArrayList<String>();
		for (int i=0; i<purchased.size(); i++) {
			temp.add(purchased.get(i));
		}
		return temp;
	}
	
	public void printPurchase(){
		for(int i = 0; i < purchased.size(); i++ ) {
			System.out.print(purchased.get(i) + " ");
			System.out.println();
		}
	}
	
}
