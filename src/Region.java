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

        int bonus = 0;

        for (int i = 0; i<this.territoriesOfRegion.size();i++) {

            if (this.territoriesOfRegion.get(i).)
        }


    }
}
