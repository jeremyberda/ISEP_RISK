import java.util.ArrayList;

public class Region {

    int regionID;

    private ArrayList<Territory> territoriesOfRegion = new ArrayList<Territory>();

    public Region(int regionID, ArrayList<Territory> territoriesOfRegion) {
        this.regionID = regionID;
        this.territoriesOfRegion = territoriesOfRegion;
    }
}
