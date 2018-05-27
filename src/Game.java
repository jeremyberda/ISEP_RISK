import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;

public class Game {

    public ArrayList<Player> playersList = new ArrayList<Player>();
    public ArrayList<Territory> listTerritories = new ArrayList<Territory>();
    public ArrayList<Region> regionsList = new ArrayList<Region>();

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

        listTerritories.add(new Territory(0,listAlaska));
        listTerritories.add(new Territory(1,listNorthWestTerritory));
        listTerritories.add(new Territory(2,listGreenland));
        listTerritories.add(new Territory(3,listQuebec));
        listTerritories.add(new Territory(4,listOntario));
        listTerritories.add(new Territory(5,listAlberta));
        listTerritories.add(new Territory(6,listWesternUnitedStates));
        listTerritories.add(new Territory(7,listEasternUnitedStates));
        listTerritories.add(new Territory(8,listCentralAmerica));

        //AmÈrique du Sud

        listTerritories.add(new Territory(9,listVenezuela));
        listTerritories.add(new Territory(10,listPeru));
        listTerritories.add(new Territory(11,listArgentina));
        listTerritories.add(new Territory(12,listBrazil));

        //Afrique

        listTerritories.add(new Territory(13,listNorthAfrica));
        listTerritories.add(new Territory(14,listCongo));
        listTerritories.add(new Territory(15,listSouthAfrica));
        listTerritories.add(new Territory(16,listMadagascar));
        listTerritories.add(new Territory(17,listEastAfrica));
        listTerritories.add(new Territory(18,listEgypt));

        //Europe

        listTerritories.add(new Territory(19,listSouthernEurope));
        listTerritories.add(new Territory(20,listNorthernEurope));
        listTerritories.add(new Territory(21,listWesternEurope));
        listTerritories.add(new Territory(22,listGreatBritain));
        listTerritories.add(new Territory(23,listIceland));
        listTerritories.add(new Territory(24,listScandinavia));
        listTerritories.add(new Territory(25,listUkraine));

        //Asie

        listTerritories.add(new Territory(26,listUral));
        listTerritories.add(new Territory(27,listSerbia));
        listTerritories.add(new Territory(28,listIrkutsk));
        listTerritories.add(new Territory(29,listYakutsk));
        listTerritories.add(new Territory(30,listKamchatka));
        listTerritories.add(new Territory(31,listJapan));
        listTerritories.add(new Territory(32,listMongolia));
        listTerritories.add(new Territory(33,listChina));
        listTerritories.add(new Territory(34,listAfghanistan));
        listTerritories.add(new Territory(35,listMiddleEast));
        listTerritories.add(new Territory(36,listIndia));
        listTerritories.add(new Territory(37,listSiam));

        //OcÈanie

        listTerritories.add(new Territory(38,listIndonesia));
        listTerritories.add(new Territory(39,listWesternAustralia));
        listTerritories.add(new Territory(40,listEasternAustralia));
        listTerritories.add(new Territory(41,listNewGuinea));




    }




}
