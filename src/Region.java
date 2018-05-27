import java.util.ArrayList;

public class Region {

    int regionID;

    private ArrayList<Territory> territoriesOfRegion = new ArrayList<Territory>();

    //constructor

    public Region(int regionID, ArrayList<Territory> territoriesOfRegion) {
        this.regionID = regionID;
        this.territoriesOfRegion = territoriesOfRegion;
    }

    //on fait une fonction qui vérifie si un joueur contrôle une région entière, ou pas

    public boolean isControlledBy(Player player) {

        for (int i = 0; i<this.territoriesOfRegion.size();i++) {

            if (this.territoriesOfRegion.get(i).getOwner() != player){

                return false;
            }
        }

        return true;


    }

    // getters and setters


    public int getRegionID() {
        return regionID;
    }

    public void setRegionID(int regionID) {
        this.regionID = regionID;
    }

    public ArrayList<Territory> getTerritoriesOfRegion() {
        return territoriesOfRegion;
    }

    public void setTerritoriesOfRegion(ArrayList<Territory> territoriesOfRegion) {
        this.territoriesOfRegion = territoriesOfRegion;
    }
}
