import java.util.ArrayList;

public class Unit {

    private int unitType;
    private int minPower;
    private int maxPower;
    private int attackPriority;
    private int defensePriority;
    private int movementsPerTour;//nombre de déplacements dispo à chaque tour
    private int diceScore; //score des dÈs de l'unitÈ lors d'une confrontation
    private int movementsNumber; //nombre de déplacements effectués pdt le tour en cours
        // O>> Soldat
        // 1 >>Cavalier
        //2>> Canon

    public ArrayList<Territory> listTravelledTerritories = new ArrayList<Territory>();


    public Unit(int unitType, int minPower, int maxPower, int attackPriority, int defensePriority, int movementsPerTour){
        this.unitType = unitType;
        this.minPower = minPower;
        this.maxPower = maxPower;
        this.attackPriority = attackPriority;
        this.defensePriority = defensePriority;
        this.movementsPerTour = movementsPerTour;
    }

    public boolean canMove()
    {
        if(this.movementsPerTour > this.movementsNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public void resetMovementsNumber()
    {
        this.movementsNumber = 0;
    }

    public int getUnitType() {
        return unitType;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getAttackPriority() {
        return attackPriority;
    }

    public void setAttackPriority(int attackPriority) {
        this.attackPriority = attackPriority;
    }

    public int getDefensePriority() {
        return defensePriority;
    }

    public void setDefensePriority(int defensePriority) {
        this.defensePriority = defensePriority;
    }

    public int getMovementsPerTour() {
        return movementsPerTour;
    }

    public void setMovementsPerTour(int movementsPerTour) {
        this.movementsPerTour = movementsPerTour;
    }

    public int getDiceScore() {
        return diceScore;
    }

    public void setDiceScore(int diceScore) {
        this.diceScore = diceScore;
    }

    public int getMovementsNumber() {
        return movementsNumber;
    }

    public void setMovementsNumber(int movementsNumber) {
        this.movementsNumber = movementsNumber;
    }
}
