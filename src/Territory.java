import java.util.ArrayList;


public class Territory {

    private int soldiersNumber = 1;
    private int ridersNumber = 0;
    private int cannonsNumber = 0;
    private int TroopNumberATT;

    private int territoryID;

    private int[] adjacentTerritoriesID;

    private String[] adjacentTerritories;

    public String nameTerritory;

    public ArrayList<Unit> unitiesList = new ArrayList<Unit>();

    ArrayList<Unit> fightUnitiesList = new ArrayList<Unit>();

    private Player owner;


    public Territory(String nameTerritory, int territoryID, int[] adjacentTerritoriesID) {

        this.nameTerritory= nameTerritory;
        this.territoryID = territoryID;
        this.adjacentTerritoriesID = adjacentTerritoriesID;
    }

    /**
     * Permet de savoir si un territoire peut attaquer ou pas
     * @return true ou false s'il peut ou non attaquer
     */
    public boolean canAttackOrMove()
    {
        if((this.soldiersNumber + this.cannonsNumber + this.cannonsNumber < 2) || this.unitiesCanAttack() == false)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Verifie si au moins une unité peut, en cas de victoire, se déplacer sur le territoire conqui avant de lancer l'attaque
     * @return true si elles peuvent, false sinon
     */

    public boolean unitiesCanAttack()
    {
        for(int i = 0;i < this.unitiesList.size(); i++)
        {
            if(this.unitiesList.get(i).canMove())
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Verifie si sur le territoire au moins une troupe du type "type" peut attaquer
     * @param type
     * @return true si oui false sinon
     */
    public boolean UnitCanAttack(int type)
    {
        for(int i = 0;i < this.unitiesList.size(); i++)
        {
            if(this.unitiesList.get(i).getUnitType()== type && this.unitiesList.get(i).canMove())
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Permet de savoir si un territoire est conquis à l'issue d'un combat
     * @return true ou false s'il est conquis ou non
     */
    public boolean isconquered()
    {
        if(this.soldiersNumber + this.cannonsNumber + this.ridersNumber == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Permet de vérifier qu'un territoire appartient à un joueur donné
     * @param Player
     * @return true s'il appartient false sinon
     */
    public boolean belongsto(Player Player)
    {
        if(this.owner == Player)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Permet de savoir si deux territoires sont adjacents
     * @param territory
     * @return true s'ils sont adjacents false sinon
     */
    public boolean IsAdjacentTo(Territory territory)
    {
        for(int i = 0;i < this.adjacentTerritories.length;i++)
        {
            if(this.adjacentTerritories[i].equals(territory.getTerritoryID()))
            {
                return true;
            }
        }
        return false;
    }

    //ATTAQUE
    /**
     * Permet de savoir combien de dés seront utilisés en attaque
     * @return le nombre de dés utilisés en attaque
     */
    public int calculDiceNmbreATT()
    {
        if(this.soldiersNumber + this.cannonsNumber + this.ridersNumber == 2)
        {
            return 1;
        }
        else if(this.soldiersNumber + this.cannonsNumber + this.ridersNumber == 3)
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }

    /**
     * Permet de savoir combien de dés seront utilisés en défense
     * @return le nombre de dés utilisés en défense
     */
    public int calculDEFNumber()
    {
        if(this.soldiersNumber + this.cannonsNumber + this.ridersNumber == 1)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    /**
     * Lance une attaque
     * @param territoryDEF
     */
    public void attack(Territory territoryDEF)
    {
        //On determine le nombre de troupes qui vont défendre
        int DEFNumber= territoryDEF.calculDEFNumber();

        //On determine quelles troupes en fonction de leur priorité
        territoryDEF.chooseUnitFightDEF(DEFNumber);

        //On lance les dés
        this.rollDice();
        territoryDEF.rollDice();

        //On tri le lancer par ordre décroissant
        this.sortDice();
        territoryDEF.sortDice();

        //On check si on doit gérer les priorités
        this.sortByPriorityATT();
        territoryDEF.sortByPriorityDEF();

        //Resultat du combat
        this.determineFightResult(territoryDEF);


        //On met à jour les variables (unités et propriétaire)
        this.updateTerritoryOwner(territoryDEF);
    }

    /**
     * Définit la liste des unités qui vont défendre
     * @param DEFNumber nombre de des en défense
     * @return la liste
     */
    public void chooseUnitFightDEF(int DEFNumber)
    {
        int soldiers = this.soldiersNumber;
        int cannons = this.cannonsNumber;
        int riders = this.ridersNumber;

        for(int i = 0;i<DEFNumber;i++)
        {
            if(soldiers > 0)
            {
                this.addFightUnit(0,0);
                soldiers--;
            }
            else if(cannons > 0)
            {
                this.addFightUnit(2,0);
                cannons--;
            }
            else if(riders > 0)
            {
                this.addFightUnit(1,0);
                riders--;
            }
        }

    }

    /*
     * Permet de réaliser n lancement de des
     * @param DiceNmbr int le nombre de des qu'on veut lancer
     * @return une liste avec les résultats
     */
    public void rollDice()
    {
        for(int i = 0;i<this.fightUnitiesList.size();i++)
        {
            int scoreMin = this.fightUnitiesList.get(i).getMinPower();
            int scoreMax = this.fightUnitiesList.get(i).getMaxPower();

            int random = (int) (Math.random() * (scoreMax - scoreMin)+1 - 0) + scoreMin;

            this.fightUnitiesList.get(i).setDiceScore(random);
        }
    }

    /*
     * Tri une liste de dés dans l'ordre décroissant
     * @param DiceList ArrayList<Integer>  la liste à trier
     * @return la liste triée dans l'ordre croissant
     */
    public void sortDice()
    {
        for(int i = 0;i < this.fightUnitiesList.size();i++)
        {
            for(int j = 0;j < this.fightUnitiesList.size();j++)
            {
                if(this.fightUnitiesList.get(i).getDiceScore() > this.fightUnitiesList.get(j).getDiceScore())
                {
                    Unit pivot = this.fightUnitiesList.get(i);

                    this.fightUnitiesList.set(i, this.fightUnitiesList.get(j));
                    this.fightUnitiesList.set(j, pivot);
                }
            }
        }
    }

    /*
     * Trie la liste des unités d'attaque en cas d'égalité en fonction des priorités
     * @param list
     */
    public void sortByPriorityATT()
    {
        for(int i = 0; i < this.fightUnitiesList.size();i++)
        {
            for(int j = 0;j < this.fightUnitiesList.size();j++)
            {
                if(this.fightUnitiesList.get(i).getAttackPriority() < this.fightUnitiesList.get(j).getAttackPriority() && this.fightUnitiesList.get(i).getDiceScore() == this.fightUnitiesList.get(j).getDiceScore())
                {
                    Unit pivot = this.fightUnitiesList.get(i);

                    this.fightUnitiesList.set(i, this.fightUnitiesList.get(j));
                    this.fightUnitiesList.set(j, pivot);
                }
            }
        }
    }

    /*
     * Trie la liste des unités d'attaque en cas d'égalité en fonction des priorités
     * @param list
     */
    public void sortByPriorityDEF()
    {
        for(int i = 0; i < this.fightUnitiesList.size();i++)
        {
            for(int j = 0;j < this.fightUnitiesList.size();j++)
            {
                if(this.fightUnitiesList.get(i).getDefensePriority() < this.fightUnitiesList.get(j).getDefensePriority() && this.fightUnitiesList.get(i).getDiceScore() == this.fightUnitiesList.get(j).getDiceScore())
                {
                    Unit pivot = this.fightUnitiesList.get(i);

                    this.fightUnitiesList.set(i, this.fightUnitiesList.get(j));
                    this.fightUnitiesList.set(j, pivot);
                }
            }
        }
    }

    /*
     * Effectue la comparaison des valeurs des dés
     * @param listDiceATT les valeurs des dés d'attaque
     * @param listDiceDEF les valeurs des dés de défense
     * @param territoryDEF le territoire qui se défend
     * @return la liste des territoires qui ont gagné
     */
    public void determineFightResult(Territory territoryDEF)
    {
        ArrayList<Territory> winnerList = new ArrayList<Territory>();

        int compare;

        if(this.fightUnitiesList.size() > territoryDEF.fightUnitiesList.size())
        {
            compare = territoryDEF.fightUnitiesList.size();
        }
        else
        {
            compare = this.fightUnitiesList.size();
        }

        for(int i = 0; i < compare;i++)
        {
            if(this.fightUnitiesList.get(i).getDiceScore() > territoryDEF.fightUnitiesList.get(i).getDiceScore())
            {
                winnerList.add(this);
                territoryDEF.updateUnitsOnTerritory(territoryDEF.fightUnitiesList.get(i));
            }
            else
            {
                winnerList.add(territoryDEF);
                this.updateUnitsOnTerritory(this.fightUnitiesList.get(i));
            }


        }
        Main.Risk.winnerList = winnerList;


    }


    /*
     * Met à jour l'affichage et le nombre d'unités
     * @param Unit unities
     * @param Territory territory
     */
    public void updateUnitsOnTerritory(Unit unities)
    {
        this.unitiesList.remove(unities);
        if(unities.getUnitType() == 0)
        {
            this.addSoldiers(-1);
        }
        else if(unities.getUnitType() == 1)
        {
            this.addRiders(-1);
        }
        else if(unities.getUnitType() == 2)
        {
            this.addCannons(-1);
        }
    }

    /*
     * Met à jour le proprietaire d'un territoire
     * @param territoryATT le territoire qui attaque
     * @param territoryDEF territoire qui était attaqué
     */
    public void updateTerritoryOwner(Territory territoryDEF)
    {
        if(territoryDEF.isconquered())
        {
            territoryDEF.changeOwner(this);

        }
    }

    //ATTAQUE


    //MODIFICATIONS
    /**
     * Deploie des toupes sur le territoire séléctionné
     */
    public void deployUnit(Player player)
    {
        if(player.getCannonsNumberDeploy() > 0)
        {
            this.addUnitOnTerritory(new Unit(2,4,9,3,2,1));//Canon
            this.addCannons(1);

            player.setCannonsNumberDeploy(player.getCannonsNumberDeploy() - 1);
        }
        else if(player.getRidersNumberDeploy() > 0)
        {
            this.addUnitOnTerritory(new Unit(1,2,7,1,3,3));//Cavalier
            this.addRiders(1);
            player.setRidersNumberDeploy(player.getRidersNumberDeploy() - 1);
        }
        else
        {
            this.addUnitOnTerritory(new Unit(0,1,6,2,1,2));//Soldat
            this.addSoldiers(1);
            player.setSoldiersNumberDeploy(player.getSoldiersNumberDeploy() - 1);
        }
    }

    /**
     * Permet d'ajouter des soldats sur un territoire
     * @param soldiersNumber
     */
    public void addSoldiers(int soldiersNumber)
    {
        this.soldiersNumber = this.soldiersNumber + soldiersNumber;
    }

    /**
     * Permet d'ajouter des Cavaliers sur un territoire
     * @param ridersNumber
     */
    public void addRiders(int ridersNumber)
    {
        this.ridersNumber = this.ridersNumber + ridersNumber;
    }

    /**
     * Permet d'ajouter des Canons sur un territoire
     * @param cannonsNumber
     */
    public void addCannons(int cannonsNumber)
    {
        this.cannonsNumber = this.cannonsNumber + cannonsNumber;
    }




    public void addUnitOnTerritory(Unit unit)
    {
        this.unitiesList.add(unit);
    }

    /*
     * Ajoute des unités dans la liste
     * @param type le type d'unité
     * @param rang 0 par défaut
     * @param listDefUnit
     * @param territoryDEF
     * @return l'unité à ajouter
     */
    public void addFightUnit(int type,int rang)
    {
        if(this.fightUnitiesList.size() == 0 && this.unitiesList.get(rang).getUnitType() == type)
        {
            this.fightUnitiesList.add(this.unitiesList.get(rang));
        }
        else if(this.unitiesList.get(rang).getUnitType() == type && this.fightUnitiesList.contains(this.unitiesList.get(rang)) == false && this.unitiesList.size() > 0)
        {
            this.fightUnitiesList.add(this.unitiesList.get(rang));
        }
        else
        {
            addFightUnit(type, rang+1);
        }
    }

    /*
     * Renvoit une unitée qui peut se déplacer
     * @param int type Le type de l'unité
     * @param int rang 0 par défaut
     * @return l'unité ou null si aucune ne peut se déplacer
     */
    public Unit moveUnit(int type, int rang)
    {
        if(rang == this.unitiesList.size())
        {
            return null;
        }
        else if(this.unitiesList.get(rang).getUnitType() == type && this.unitiesList.get(rang).canMove() && this.canAttackOrMove())
        {
            Unit moveUnit = this.unitiesList.get(rang);
            this.unitiesList.remove(rang);

            switch(moveUnit.getUnitType())
            {
                case 0:
                    this.addSoldiers(-1);
                    break;
                case 1:
                    this.addRiders(-1);
                    break;
                case 2:
                    this.addCannons(-1);
                    break;
            }
            return moveUnit;
        }
        else
        {
            return moveUnit(type,rang+1);
        }
    }

    /**
     * Remet à zéro les déplacement des unités sur un territoire
     */
    public void resetTerritoryUnitMovements()
    {
        for(int i = 0;i<this.unitiesList.size();i++)
        {
            this.unitiesList.get(i).resetMovementsNumber();
            this.unitiesList.get(i).listTravelledTerritories.clear();
        }
    }

    /**
     * Passe le territoire conquis sous le controle du propriétaire du territoire vainqueur
     * @param winnerTerritory territoire de l'attaquant
     */
    public void changeOwner(Territory winnerTerritory)
    {
        this.owner.addTerritory(-1);
        this.owner.removeControlledTerritory(this);

        winnerTerritory.owner.addTerritory(1);
        winnerTerritory.owner.addControlledTerritory(this);

        this.owner = winnerTerritory.owner;
    }

    /**
     *
     * @param territory2
     * @param movement
     */
    public void movement(Territory territory2, Unit movement)
    {
        movement.setMovementsNumber(movement.getMovementsNumber() + 1);
        territory2.addUnitOnTerritory(movement);

        if(movement.getUnitType() == 0)
        {
            territory2.addSoldiers(1);
        }
        else if(movement.getUnitType()  == 1)
        {
            territory2.addRiders(1);
        }
        else if(movement.getUnitType() == 2)
        {
            territory2.addCannons(1);
        }

    }

    /*
     * Remet les troupes sur le territoire après un combat
     */
    public void resetTroops()
    {
        this.soldiersNumber = 0;
        this.ridersNumber = 0;
        this.cannonsNumber = 0;

        this.fightUnitiesList.clear();

        for(int i = 0; i<this.unitiesList.size();i++)
        {
            if(this.unitiesList.get(i).getUnitType() == 0)
            {
                this.soldiersNumber++;
            }
            else if(this.unitiesList.get(i).getUnitType() == 1)
            {
                this.ridersNumber++;
            }
            if(this.unitiesList.get(i).getUnitType() == 2)
            {
                this.cannonsNumber++;
            }
        }
    }







    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public int getTerritoryID() {
        return territoryID;
    }

    public int getTotalNmbrTroop()
    {
        return this.cannonsNumber + this.ridersNumber + this.soldiersNumber;
    }

    public int getTroopNumberATT() {
        return TroopNumberATT;
    }

    public void setTroopNumberATT(int TroopNumberATT) {
        this.TroopNumberATT = TroopNumberATT;
    }

    public ArrayList<Unit> getUnitiesList() {
        return unitiesList;
    }

    public void setUnitiesList(ArrayList<Unit> unitiesList) {
        this.unitiesList = unitiesList;
    }

    public String[] getAdjacentTerritories() {
        return adjacentTerritories;
    }

    public int getSoldiersNumber() {
        return soldiersNumber;
    }

    public int getRidersNumber() {
        return ridersNumber;
    }

    public int getCannonsNumber() {
        return cannonsNumber;
    }


}
