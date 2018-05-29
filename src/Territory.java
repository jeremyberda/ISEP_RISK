import java.util.ArrayList;


public class Territory {

    private int territoryID;

    private int[] adjacentTerritoriesID;



    public ArrayList<Unit> unitiesList = new ArrayList<Unit>();

    ArrayList<Unit> fightUnitiesList = new ArrayList<Unit>();

    private Player owner;


    public Territory(int territoryID, int[] adjacentTerritoriesID) {
        this.territoryID = territoryID;
        this.adjacentTerritoriesID = adjacentTerritoriesID;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
