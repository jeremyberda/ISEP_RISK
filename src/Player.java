import java.util.*;
import java.awt.Color;

public class Player {

    private String name;
    private int idPlayer;
    private Color playerColor;
    private int territoriesNumber;
    private int soldiersNumber;
    private int canoonsNumber;
    private int ridersNumber;
    private int unitNumber;
    private int controlledTerritoriesNumber;

    public ArrayList<Territory> controlledTerritoriesList = new ArrayList<Territory>();

    private Game risk = Main.risk;

    // Constructor

    public Player(String name, int idPlayer, Color playerColor) {
        this.name = name;
        this.idPlayer = idPlayer;
        this.playerColor = playerColor;
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

    //Ajoute  1 au nombre de territoires du joueur

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

    // attribut les armées si on est au début de partie, ou pas. Vu qu'on distribue déjà un soldat à l'initialisation pour chaque territoire, ici, on adapte le nombre

    public void setArmy (boolean beginning) {

        if (beginning) {

            switch (risk.playersList.size()) {

                case 2:
                    this.setSoldiersNumber(19);
                    break;

                case 3:
                    this.setSoldiersNumber(21);
                    break;

                case 4:
                    this.setSoldiersNumber(20);
                    break;

                case 5:
                    this.setSoldiersNumber(17);
                    break;

                case 6:
                    this.setSoldiersNumber(13);
            }


        }

        else {

            this.setSoldiersNumber((int) (Math.floor(this.territoriesNumber/3) + this.regionBonus() + this.newTerritoriesBonus()));
        }
    }

    //Bonus pour les territoires capturés (50% de chance d'avoir une troupe en plus par territoire gagné)

    public int newTerritoriesBonus() {

        int bonus = 0;

        for (int i=0; i<this.controlledTerritoriesNumber;i++) {
            Random chance = new Random();
            int r = chance.nextInt(2);
            bonus = bonus + r;

        }

        return bonus;
    }

    //bonus de région

    public int regionBonus () {

        int bonus = 0;

        // A COMPLETER
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

    public int getSoldiersNumber() {
        return soldiersNumber;
    }

    public void setSoldiersNumber(int soldiersNumber) {
        this.soldiersNumber = soldiersNumber;
    }

    public int getCanoonsNumber() {
        return canoonsNumber;
    }

    public void setCanoonsNumber(int canoonsNumber) {
        this.canoonsNumber = canoonsNumber;
    }

    public int getRidersNumber() {
        return ridersNumber;
    }

    public void setRidersNumber(int ridersNumber) {
        this.ridersNumber = ridersNumber;
    }

    public ArrayList<Territory> getControlledTerritoriesList() {
        return controlledTerritoriesList;
    }

    public void setControlledTerritoriesList(ArrayList<Territory> controlledTerritoriesList) {
        this.controlledTerritoriesList = controlledTerritoriesList;
    }
}
