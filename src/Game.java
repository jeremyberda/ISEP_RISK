import java.awt.*;
import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Collections;

public class Game {

    public ArrayList<Player> playersList = new ArrayList<Player>();
    public ArrayList<Territory> listTerritories = new ArrayList<Territory>();
    public ArrayList<Region> regionsList = new ArrayList<Region>();
    public ArrayList<Player> eliminatedPlayersList= new ArrayList<Player>();

    public int playersNumber;

    public int tour = 0;

    //Constructor ??

//------------------------

    // fonction qui initialise les territoires

    public void territoriesInitialization() {

        // LISTES DES ID DES TERRITOIRES ADJACENTS

        //AmÈrique du nord
        int[] listAlaska = {1, 5, 30};
        int[] listNorthWestTerritory = {0, 2, 5, 4};
        int[] listGreenland = {1, 3, 4, 23};
        int[] listQuebec = {2, 4, 7};
        int[] listOntario = {1, 2, 3, 5, 6, 7};
        int[] listAlberta = {0, 1, 4, 6};
        int[] listWesternUnitedStates = {4, 5, 7, 8};
        int[] listEasternUnitedStates = {3, 4, 6, 8};
        int[] listCentralAmerica = {6, 7, 9};

        //AmÈrique du Sud
        int[] listVenezuela = {8, 10, 12};
        int[] listPeru = {9, 11, 12};
        int[] listArgentina = {10, 12};
        int[] listBrazil = {9, 10, 11, 13};

        //Afrique
        int[] listNorthAfrica = {12, 14, 17, 18, 19, 21};
        int[] listCongo = {13, 15, 17};
        int[] listSouthAfrica = {14, 16, 17};
        int[] listMadagascar = {16, 17};
        int[] listEastAfrica = {13, 14, 15, 16, 18, 35};
        int[] listEgypt = {13, 17, 19, 35};

        //Europe
        int[] listSouthernEurope = {13, 18, 20, 21, 25, 35};
        int[] listNorthernEurope = {19, 21, 22, 24, 25};
        int[] listWesternEurope = {19, 20, 21, 22};
        int[] listGreatBritain = {20, 21, 23, 24};
        int[] listIceland = {2, 22, 24};
        int[] listScandinavia = {20, 22, 23, 25};
        int[] listUkraine = {19, 20, 24, 26, 34, 35};

        //Asie
        int[] listUral = {25, 27, 33, 34};
        int[] listSerbia = {26, 28, 29, 32, 33};
        int[] listIrkutsk = {27, 29, 30, 32};
        int[] listYakutsk = {27, 28, 30};
        int[] listKamchatka = {0, 28, 29, 31, 32};
        int[] listJapan = {30, 32};
        int[] listMongolia = {27, 28, 30, 31, 33};
        int[] listChina = {26 ,27, 32, 34, 36, 37};
        int[] listAfghanistan = {25, 26, 33, 35, 36};
        int[] listMiddleEast = {17, 18, 19, 25, 34, 36};
        int[] listIndia = {33, 34, 35, 37};
        int[] listSiam = {33, 36, 38};

        //Oceanie
        int[] listIndonesia = {37, 39, 41};
        int[] listWesternAustralia = {38, 40, 41};
        int[] listEasternAustralia = {39, 41};
        int[] listNewGuinea = {38, 39, 40};






        // LISTE DES TERRITOIRES

        //AmÈrique du Nord

        listTerritories.add(new Territory("Alaska",0,listAlaska));
        listTerritories.add(new Territory("Territoires du N-O",1,listNorthWestTerritory));
        listTerritories.add(new Territory("Groenland",2,listGreenland));
        listTerritories.add(new Territory("QuÈbec",3,listQuebec));
        listTerritories.add(new Territory("Ontario",4,listOntario));
        listTerritories.add(new Territory("Alberta",5,listAlberta));
        listTerritories.add(new Territory("E-U de l'Ouest",6,listWesternUnitedStates));
        listTerritories.add(new Territory("E-U de l'Est",7,listEasternUnitedStates));
        listTerritories.add(new Territory("AmÈrique Centrale",8,listCentralAmerica));

        //AmÈrique du Sud

        listTerritories.add(new Territory("Venezuela",9,listVenezuela));
        listTerritories.add(new Territory("PÈrou",10,listPeru));
        listTerritories.add(new Territory("Argentine",11,listArgentina));
        listTerritories.add(new Territory("BrÈsil",12,listBrazil));

        //Afrique

        listTerritories.add(new Territory("Afrique du Nord",13,listNorthAfrica));
        listTerritories.add(new Territory("Congo",14,listCongo));
        listTerritories.add(new Territory("Afrique du Sud",15,listSouthAfrica));
        listTerritories.add(new Territory("Madagascar",16,listMadagascar));
        listTerritories.add(new Territory("Afrique de l'Est",17,listEastAfrica));
        listTerritories.add(new Territory("Egypte",18,listEgypt));

        //Europe

        listTerritories.add(new Territory("Europe du Sud",19,listSouthernEurope));
        listTerritories.add(new Territory("Europe du Nord",20,listNorthernEurope));
        listTerritories.add(new Territory("Europe de l'Ouest",21,listWesternEurope));
        listTerritories.add(new Territory("Grande-Bretagne",22,listGreatBritain));
        listTerritories.add(new Territory("Islande",23,listIceland));
        listTerritories.add(new Territory("Scandinavie",24,listScandinavia));
        listTerritories.add(new Territory("Ukraine",25,listUkraine));

        //Asie

        listTerritories.add(new Territory("Oural",26,listUral));
        listTerritories.add(new Territory("Serbie",27,listSerbia));
        listTerritories.add(new Territory("Tchita",28,listIrkutsk));
        listTerritories.add(new Territory("Yakoutie",29,listYakutsk));
        listTerritories.add(new Territory("Kamchatka",30,listKamchatka));
        listTerritories.add(new Territory("Japon",31,listJapan));
        listTerritories.add(new Territory("Mongolie",32,listMongolia));
        listTerritories.add(new Territory("Chine",33,listChina));
        listTerritories.add(new Territory("Afghanistan",34,listAfghanistan));
        listTerritories.add(new Territory("Moyen-Orient",35,listMiddleEast));
        listTerritories.add(new Territory("Inde",36,listIndia));
        listTerritories.add(new Territory("Siam",37,listSiam));

        //OcÈanie

        listTerritories.add(new Territory("IndonÈsie",38,listIndonesia));
        listTerritories.add(new Territory("Australie de l'Ouest",39,listWesternAustralia));
        listTerritories.add(new Territory("Australie de l'Est",40,listEasternAustralia));
        listTerritories.add(new Territory("Nouvelle-GuinÈe",41,listNewGuinea));


        //ICI FAUDRA AJOUTER FONCTION QUI AJOUTE UNE UNITEE A CHAQUE INSTANCE DE TERRITOIRE

        // ---------------------------------------


        //  On liste les territoires de chaque région dans une arraylist

        ArrayList<Territory> territoriesNorthAmerica = new ArrayList<Territory>();

        for (int i=0; i<9;i++) {

            territoriesNorthAmerica.add(listTerritories.get(i));
        }

        ArrayList<Territory> territoriesSouthAmerica = new ArrayList<Territory>();

        for (int i=9;i<13;i++) {

            territoriesSouthAmerica.add(listTerritories.get(i));
        }

        ArrayList<Territory> territoriesAfrica = new ArrayList<Territory>();

        for (int i=13;i<19;i++) {

            territoriesAfrica.add(listTerritories.get(i));
        }

        ArrayList<Territory> territoriesEuropa = new ArrayList<Territory>();

        for (int i=19;i<26;i++) {

            territoriesEuropa.add(listTerritories.get(i));
        }

        ArrayList<Territory> territoriesAsia = new ArrayList<Territory>();

        for (int i=26;i<38;i++) {

            territoriesAsia.add(listTerritories.get(i));
        }

        ArrayList<Territory> territoriesAustralia = new ArrayList<Territory>();

        for (int i=38;i<42;i++) {

            territoriesAustralia.add(listTerritories.get(i));
        }

        //on initialise les régions et on les ajoute dans une liste

        regionsList.add(new Region(0,territoriesNorthAmerica));
        regionsList.add(new Region(0,territoriesSouthAmerica));
        regionsList.add(new Region(0,territoriesAfrica));
        regionsList.add(new Region(0,territoriesEuropa));
        regionsList.add(new Region(0,territoriesAustralia));







    }


    // cette fonction permet de générer aléatoirement les territoires pour chaque joueur

    public void setRandomTerritories(int playersNumber) {

        ArrayList<Integer> randomTerritoriesList = new ArrayList<Integer>();

        //On ajoute les territoires de la liste de territoires, à la liste de territoires random à distribuer entre chaque joueur

        for (int i=0;i<listTerritories.size();i++){

            randomTerritoriesList.add(new Integer(i));
        }

        //Et on mélange la liste

        Collections.shuffle(randomTerritoriesList);

        int indexPlayer = 0;

        for (int i=0;i<listTerritories.size();i++){

            this.listTerritories.get(randomTerritoriesList.get(i)).setOwner(this.playersList.get(indexPlayer)); // on définit le propriétaire

            this.playersList.get(indexPlayer).addTerritory(1); //on ajoute un territoire à sa liste de territoires qu'il possède

            indexPlayer++;

            // Si l'index des joueurs est égale à la longueur de la liste des joueurs (donc au nombre de joueurs), on remet l'index à 0 pour continuer à distribuer les territoires aléatoirement et au même nombre pour chacun

            if (indexPlayer== this.playersList.size()) {

                indexPlayer = 0;
            }

        }


    }




}
