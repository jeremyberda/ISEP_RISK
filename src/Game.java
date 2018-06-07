import java.awt.*;
import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;

import java.util.Arrays;
import java.util.Collections;

public class Game {

    public ArrayList<Player> playersList = new ArrayList<Player>();
    public ArrayList<Territory> listTerritories = new ArrayList<Territory>();
    public ArrayList<Region> regionsList = new ArrayList<Region>();
    public ArrayList<Player> eliminatedPlayersList= new ArrayList<Player>();

    ArrayList<Territory> winnerList = new ArrayList<Territory>();

    public ArrayList<Rectangle> listRectangles = new ArrayList<Rectangle>();

    public int playersNumber;

    public int tour = 0;

    //Constructor ??

//------------------------

    // fonction qui initialise les territoires

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }

    public ArrayList<Rectangle> getListRectangles() {
        return listRectangles;
    }

    public void setListRectangles(ArrayList<Rectangle> listRectangles) {
        this.listRectangles = listRectangles;
    }

    public void territoriesInitialization() throws InterruptedException {

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
        int[] listSiberia = {26, 28, 29, 32, 33};
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


        System.out.println("BOB : " + this.playersList.get(0).getName());

        // Amérique du Nord

        Territory Alaska = new Territory("Alaska",0,listAlaska);
        Territory NorthWestTerritory = new Territory("Territoires du N-O",1,listNorthWestTerritory);
        Territory Greenland = new Territory("Groenland",2,listGreenland);
        Territory Quebec = new Territory("Quebec",3,listQuebec);
        Territory Ontario = new Territory("Ontario",4,listOntario);
        Territory Alberta = new Territory("Alberta",5,listAlberta);
        Territory WesternUnitedStates = new Territory("E-U de l'Ouest",6,listWesternUnitedStates);
        Territory EasterUnitedStates = new Territory("E-U de l'Est",7,listEasternUnitedStates);
        Territory CentralAmerica = new Territory("Amérique Centrale",8,listCentralAmerica);

        // Amérique du Sud

        Territory Venezuela = new Territory("Venezuela",9,listVenezuela);
        Territory Peru = new Territory("Pérou",10,listPeru);
        Territory Argentina = new Territory("Argentine",11,listArgentina);
        Territory Brazil = new Territory("Brésil",12,listBrazil);

        //Afrique

        Territory NorthAfrica = new Territory("Afrique du Nord",13,listNorthAfrica);
        Territory Congo = new Territory("Congo",14,listCongo);
        Territory SouthAfrica = new Territory("Afrique du Sud",15,listSouthAfrica);
        Territory Madagascar = new Territory("Madagascar",16,listMadagascar);
        Territory EastAfrica = new Territory("Afrique de l'Est",17,listEastAfrica);
        Territory Egypt = new Territory("Egypte",18,listEgypt);

        //Europe

        Territory SouthernEurope = new Territory("Europe du Sud",19,listSouthernEurope);
        Territory NorthernEurope = new Territory("Europe du Nord",20,listNorthernEurope);
        Territory WesternEurope = new Territory("Europe de l'Ouest",21,listWesternEurope);
        Territory GreatBritain = new Territory("Grande-Bretagne",22,listGreatBritain);
        Territory Iceland = new Territory("Islande",23,listIceland);
        Territory Scandinavia = new Territory("Scandinavie",24,listScandinavia);
        Territory Ukraine = new Territory("Ukraine",25,listUkraine);

        //Asie


        Territory Ural = new Territory("Oural",26,listUral);
        Territory Siberia = new Territory("Sibérie",27,listSiberia);
        Territory Irkutsk = new Territory("Tchita",28,listIrkutsk);
        Territory Yakutsk = new Territory("Yakoutie",29,listYakutsk);
        Territory Kamchatka = new Territory("Kamchatka",30,listKamchatka);
        Territory Japan = new Territory("Japon",31,listJapan);
        Territory Mongolia = new Territory("Mongolie",32,listMongolia);
        Territory China = new Territory("Chine",33,listChina);
        Territory Afghanistan = new Territory("Afghanistan",34,listAfghanistan);
        Territory MiddleEast = new Territory("Moyen-Orient",35,listMiddleEast);
        Territory India = new Territory("India",36,listIndia);
        Territory Siam = new Territory("Siam",37,listSiam);

        //Australie


        Territory Indonesia = new Territory("Indonésie",38,listIndonesia);
        Territory WesternAustralia = new Territory("Australie de l'Ouest",39,listWesternAustralia);
        Territory EasternAustralia = new Territory("Australie de l'Est",40,listEasternAustralia);
        Territory NewGuinea = new Territory("Nouvelle-Guinée",41,listNewGuinea);

        listTerritories.addAll(Arrays.asList(Alaska, NorthWestTerritory, Greenland, Quebec, Ontario, Alberta, WesternUnitedStates, EasterUnitedStates,CentralAmerica,Venezuela, Peru, Argentina, Brazil, NorthAfrica, Congo,SouthAfrica, Madagascar, EastAfrica, Egypt, SouthernEurope, NorthernEurope, WesternEurope, GreatBritain, Iceland, Scandinavia, Ukraine, Ural, Siberia, Yakutsk, Irkutsk, Kamchatka, Japan, Mongolia, China, Afghanistan, MiddleEast, India, Siam, Indonesia, WesternAustralia, EasternAustralia, NewGuinea));


        ArrayList<Integer> randomTerritoriesList = new ArrayList<Integer>();

        //On ajoute les territoires de la liste de territoires, à la liste de territoires random à distribuer entre chaque joueur

        for (int i=0;i<listTerritories.size();i++){

            randomTerritoriesList.add(new Integer(i));
            Main.Risk.listTerritories.get(i).addUnitOnTerritory(new Unit(0,1,6,2,1,2));
            //System.out.print(i);
        }

        //Et on mélange la liste

        Collections.shuffle(randomTerritoriesList);

        int indexPlayer = 0;


        for (int i=0;i<listTerritories.size();i++){

            this.listTerritories.get(randomTerritoriesList.get(i)).setOwner(this.playersList.get(indexPlayer)); // on définit le propriétaire

            this.playersList.get(indexPlayer).addTerritory(1); //on ajoute un territoire à sa liste de territoires qu'il possède

            indexPlayer++;

            // Si l'index des joueurs est égale à la longueur de la liste des joueurs (donc au nombre de joueurs), on remet l'index à 0 pour continuer à distribuer les territoires aléatoirement et au même nombre pour chacun

            if (indexPlayer == this.playersList.size()) {

                indexPlayer = 0;
            }

        }


        //this.playersList.get(0).setPlayerColor(StdDraw.RED);
        //this.playersList.get(1).setPlayerColor(StdDraw.BLUE);
        //Alaska.setOwner(this.playersList.get(0));
        //Alberta.setOwner(this.playersList.get(1));
        //Japan.setOwner(this.playersList.get(0));

        //On associe les rectangles de la MAP à leur territoire

        //Amérique du Nord

        Rectangle rectAlaska = new Rectangle(65,515,32,17, Alaska);
        Rectangle rectNorthWestTerritory = new Rectangle(170,525,32,17, NorthWestTerritory);
        //System.out.println("CA PASSE ICI?");
        Rectangle rectGreenland = new Rectangle(365,555,32,17, Greenland);
        Rectangle rectQuebec = new Rectangle(300,462,32,17, Quebec);
        Rectangle rectOntario = new Rectangle(225,462,32,17, Ontario);
        Rectangle rectAlberta = new Rectangle(153,470,32,17, Alberta);
        Rectangle rectWesternUnitedStates = new Rectangle(160,410,32,17, WesternUnitedStates);
        Rectangle rectEasterUnitedStates = new Rectangle(240,382,32,17,EasterUnitedStates);
        Rectangle rectCentralAmerica = new Rectangle(175,320,32,17, CentralAmerica);

        //Amérique du Sud

        Rectangle rectVenezuela = new Rectangle(255,270,32,17, Venezuela);
        Rectangle rectPeru = new Rectangle(250,190,32,17, Peru);
        Rectangle rectArgentina = new Rectangle(270,115,32,17, Argentina);
        Rectangle rectBrazil = new Rectangle(330,210,32,17, Brazil);

        //Afrique

        Rectangle rectNorthAfrica = new Rectangle(480,230,32,17, NorthAfrica);
        Rectangle rectCongo = new Rectangle(562,152,32,17, Congo);
        Rectangle rectSouthAfrica = new Rectangle(570,85,32,17, SouthAfrica);
        Rectangle rectMadagascar = new Rectangle(670,65,32,17, Madagascar);
        Rectangle rectEastAfrica = new Rectangle(630,190,32,17, EastAfrica);
        Rectangle rectEgypt = new Rectangle(585,258,32,17, Egypt);

        //Europe

        Rectangle rectSouthernEurope = new Rectangle(532,360,32,17, SouthernEurope);
        Rectangle rectNorthernEurope = new Rectangle(530,407,32,17, NorthernEurope);
        Rectangle rectWesternEurope = new Rectangle(445,325,32,17, WesternEurope);
        Rectangle rectGreatBritain = new Rectangle(417,414,32,17, GreatBritain);
        Rectangle rectIceland = new Rectangle(460,500,32,17, Iceland);
        Rectangle rectScandinavia = new Rectangle(535,495,32,17, Scandinavia);
        Rectangle rectUkraine = new Rectangle(630,460,32,17, Ukraine);

        //Asie

        Rectangle rectUral = new Rectangle(740,470,32,17, Ural);
        Rectangle rectSiberia = new Rectangle(780,520,32,17, Siberia);
        Rectangle rectYakutsk = new Rectangle(870,545,32,17, Yakutsk);
        Rectangle rectIrkutsk = new Rectangle(855,460,32,17, Irkutsk);
        Rectangle rectKamchatka = new Rectangle(960,535,32,17, Kamchatka);
        Rectangle rectJapan = new Rectangle(970,385,32,17, Japan);
        Rectangle rectMongolia = new Rectangle(860,405,32,17, Mongolia);
        Rectangle rectChina = new Rectangle(833,340,32,17, China);
        Rectangle rectAfghanistan = new Rectangle(720,390,32,17, Afghanistan);
        Rectangle rectMiddleEast = new Rectangle(660,310,32,17, MiddleEast);
        Rectangle rectIndia = new Rectangle(780,300,32,17, India);
        Rectangle rectSiam = new Rectangle(860,260,32,17, Siam);

        //Australie

        Rectangle rectIndonesia = new Rectangle(870,167,32,17, Indonesia);
        Rectangle rectWesternAustralia = new Rectangle(910,70,32,17, WesternAustralia);
        Rectangle rectEasternAustralia = new Rectangle(1010,100,32,17, EasternAustralia);
        Rectangle rectNewGuinea = new Rectangle(970,190,32,17, NewGuinea);


        //listTerritories.addAll(Arrays.asList(Alaska, NorthWestTerritory, Greenland, Quebec, Ontario, Alberta, WesternUnitedStates, EasterUnitedStates,CentralAmerica,Venezuela, Peru, Argentina, Brazil, NorthAfrica, Congo,SouthAfrica, Madagascar, EastAfrica, Egypt, SouthernEurope, NorthernEurope, WesternEurope, GreatBritain, Iceland, Scandinavia, Ukraine, Ural, Siberia, Yakutsk, Irkutsk, Kamchatka, Japan, Mongolia, China, Afghanistan, MiddleEast, India, Siam, Indonesia, WesternAustralia, EasternAustralia, NewGuinea));
        listRectangles.addAll(Arrays.asList(rectAlaska,rectNorthWestTerritory,rectGreenland,rectQuebec,rectOntario,rectAlberta,rectWesternUnitedStates, rectEasterUnitedStates, rectCentralAmerica, rectVenezuela, rectPeru,rectArgentina,rectBrazil,rectNorthAfrica,rectCongo,rectSouthAfrica,rectMadagascar,rectEastAfrica, rectEgypt,rectSouthernEurope,rectNorthernEurope,rectWesternEurope,rectGreatBritain,rectIceland,rectScandinavia,rectUkraine,rectUral,rectSiberia,rectYakutsk,rectIrkutsk,rectKamchatka,rectJapan,rectMongolia,rectChina,rectAfghanistan,rectMiddleEast,rectIndia,rectSiam,rectIndonesia,rectWesternAustralia,rectEasternAustralia,rectNewGuinea));

        for (int i=0;i<listRectangles.size();i++) {

            listRectangles.get(i).DrawRectangle();
            Thread.sleep(100);
        }

        /*listTerritories.add(new Territory("Alaska",0,listAlaska));
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

        //Australie

        listTerritories.add(new Territory("IndonÈsie",38,listIndonesia));
        listTerritories.add(new Territory("Australie de l'Ouest",39,listWesternAustralia));
        listTerritories.add(new Territory("Australie de l'Est",40,listEasternAustralia));
        listTerritories.add(new Territory("Nouvelle-GuinÈe",41,listNewGuinea));*/


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
        regionsList.add(new Region(1,territoriesSouthAmerica));
        regionsList.add(new Region(2,territoriesAfrica));
        regionsList.add(new Region(3,territoriesEuropa));
        regionsList.add(new Region(4,territoriesAsia));
        regionsList.add(new Region(5,territoriesAustralia));








    }


    // cette fonction permet de générer aléatoirement les territoires pour chaque joueur

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }

    /*public void setRandomTerritories(int playersNumber) {

        ArrayList<Integer> randomTerritoriesList = new ArrayList<Integer>();

        //On ajoute les territoires de la liste de territoires, à la liste de territoires random à distribuer entre chaque joueur

        for (int i=0;i<listTerritories.size();i++){

            randomTerritoriesList.add(new Integer(i));
            System.out.print(i);
        }

        //Main.Risk.listTerritories.get(i).getTerritoryID();


        //Et on mélange la liste

        Collections.shuffle(randomTerritoriesList);

        int indexPlayer = 0;

        System.out.println("TAILLE LISTE JOUEURS TAHU : " + this.playersList.size());

        for (int i=0;i<listTerritories.size();i++){

            System.out.println("TEST AVANT");
            this.listTerritories.get(randomTerritoriesList.get(i)).setOwner(this.playersList.get(indexPlayer)); // on définit le propriétaire
            System.out.println("TEST APRES");
            System.out.println("JOUEUR DU TER : " + this.listTerritories.get(randomTerritoriesList.get(i)).getOwner().getPlayerColor());

            this.playersList.get(indexPlayer).addTerritory(1); //on ajoute un territoire à sa liste de territoires qu'il possède

            indexPlayer++;

            // Si l'index des joueurs est égale à la longueur de la liste des joueurs (donc au nombre de joueurs), on remet l'index à 0 pour continuer à distribuer les territoires aléatoirement et au même nombre pour chacun

            if (indexPlayer == this.playersList.size()) {

                indexPlayer = 0;
            }

        }*/






    }





