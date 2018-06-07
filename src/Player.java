import java.util.*;
import java.awt.Color;

public class Player {

    private String name;
    private int idPlayer;
    private Color playerColor;
    private int territoriesNumber;
    int numberTerritoriestoAdd;
    private int troopNumberDeploy;
    private int soldiersNumberDeploy;
    private int ridersNumberDeploy;
    private int cannonsNumberDeploy;
    private int unitNumber;
    private int capturedTerritoriesNumber;

    public ArrayList<Territory> controlledTerritoriesList = new ArrayList<Territory>();

    //private Game risk = Main.Risk;

    // Constructor

    public Player(String name, int idPlayer) {
        this.name = name;
        this.idPlayer = idPlayer;
        //
        // this.playerColor = playerColor;
    }

    // verifie si le joueur a perdu, ou pas

    public boolean playerLost() {

        if (this.territoriesNumber == 0){

            return true;
        }
        else {

            return false;
        }
    }

    //Ajoute un nombre à définir au nombre de territoires du joueur

    public void addTerritory(int numberTerritoriestoAdd) {

        this.territoriesNumber = territoriesNumber + numberTerritoriestoAdd ;
    }

    // Ajoute un territoire à la liste de territoires du joueur

    public void addControlledTerritory(Territory territory) {

        this.controlledTerritoriesList.add(territory);
    }

    // Enlève un territoire à la liste de territoires du joueur

    public void removeControlledTerritory (Territory territory) {

        this.controlledTerritoriesList.remove(territory);
    }

    /*
     * Renvoit le nombre de troupes que le joueur doit recevoir
     * @param Player player pour lequel on veut savoir le nombre de troupe qu'il obtient au début du tour
     * @param type type d'apport, 0 début de partie 1 jeu
     * @return nombre de troupes
     */
    public void calculUnitNumberDeploy(boolean begin)
    {
        if(begin)//Debut de partie
        {
            if(Main.Risk.playersList.size() == 2)
            {
                this.setTroopNumberDeploy(19);
            }
            else if(Main.Risk.playersList.size() == 3)
            {
                this.setTroopNumberDeploy(21);
            }
            else if(Main.Risk.playersList.size() == 4)
            {
                this.setTroopNumberDeploy(20);
            }
            else if(Main.Risk.playersList.size() == 5)
            {
                this.setTroopNumberDeploy(17);
            }
            else
            {
                this.setTroopNumberDeploy(13);
            }
        }
        else
        {

            this.setTroopNumberDeploy((int) (Math.floor(this.territoriesNumber/3) + this.regionBonus() + this.regionBonus()));


        }
    }

    //Bonus pour les territoires capturés (50% de chance d'avoir une troupe en plus par territoire gagné)

    public int newTerritoriesBonus() {

        int bonus = 0;

        for (int i=0; i<this.capturedTerritoriesNumber;i++) {
            Random chance = new Random();
            int r = chance.nextInt(2);
            bonus = bonus + r;

        }

        return bonus;
    }

    //bonus de région si un joueur contrôle entièrement le continent

    public int regionBonus () {

        int bonus = 0;

        for (int i =0; i< Main.Risk.regionsList.size();i++) {

            if (Main.Risk.regionsList.get(i).isControlledBy(this)) {

                if (i==0) { //NorthAmerica

                    bonus = bonus + 4;
                }

                if (i == 1) {//SouthAmerica

                    bonus = bonus + 2;

                }

                if (i == 2) { //Africa

                    bonus += 3;

                }

                if (i == 3) { //Europa

                    bonus = bonus + 4;
                }
                if (i == 4) { // Asia

                    bonus = bonus + 6;
                }

                if (i == 5) { // Australia

                    bonus = bonus + 2;

                }
            }
        }

        return bonus;
    }



    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }

    public int getTerritoriesNumber() {
        return this.territoriesNumber;
    }

    public void setTerritoriesNumber(int territoriesNumber) {
        this.territoriesNumber = territoriesNumber;
    }


    public int getSoldiersNumberDeploy() {
        return soldiersNumberDeploy;
    }

    public void setSoldiersNumberDeploy(int soldiersNumberDeploy) {
        this.soldiersNumberDeploy = soldiersNumberDeploy;
    }

    public int getRidersNumberDeploy() {
        return ridersNumberDeploy;
    }

    public int getTroopNumberDeploy() {
        return troopNumberDeploy;
    }

    public void setTroopNumberDeploy(int troopNumberDeploy) {
        this.troopNumberDeploy = troopNumberDeploy;
    }

    public void setRidersNumberDeploy(int ridersNumberDeploy) {
        this.ridersNumberDeploy = ridersNumberDeploy;
    }

    public int getCannonsNumberDeploy() {
        return cannonsNumberDeploy;
    }

    public void setCannonsNumberDeploy(int cannonsNumberDeploy) {
        this.cannonsNumberDeploy = cannonsNumberDeploy;
    }

    public ArrayList<Territory> getControlledTerritoriesList() {
        return controlledTerritoriesList;
    }

    public void setControlledTerritoriesList(ArrayList<Territory> controlledTerritoriesList) {
        this.controlledTerritoriesList = controlledTerritoriesList;
    }
}
