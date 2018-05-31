import java.util.ArrayList;


public class Territory {

    private int territoryID;

    private int[] adjacentTerritoriesID;

    private String nameTerritory;

    ArrayList<Unit> unitsList = new ArrayList<Unit>();



    public ArrayList<Unit> unitiesList = new ArrayList<Unit>();

    ArrayList<Unit> fightUnitiesList = new ArrayList<Unit>();

    private Player owner;


    public Territory(String nameTerritory, int territoryID, int[] adjacentTerritoriesID) {

        this.nameTerritory= nameTerritory;
        this.territoryID = territoryID;
        this.adjacentTerritoriesID = adjacentTerritoriesID;
    }

    public void addUnitOnTerritory(Unit unit)
    {
        this.unitsList.add(unit);
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
