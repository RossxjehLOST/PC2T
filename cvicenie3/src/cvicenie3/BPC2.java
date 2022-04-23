package cvicenie3;

import cvicenie3.Predmet;

public class BPC2 implements Predmet {

    private int points = 0;

    @Override
    public String getName() {
        return "BPC2";
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public boolean getZapocetStatus() {  // ak aktualny pocet bodov z predmetu presahuje minPoints, je uznany zapocet z predmetu
        if (points >= minPoints){
            return true;
        }
        return false;
    }

    public boolean addPointsProjekt(int points){ // pridanie bodov za projekt
        if(points > 30){
            System.out.println("Pocet bodov je viac nez 30");
            return false;
        }
        this.points += points;
        return true;
    }

    public boolean addPointsPolSemestralka(int points) { // pridanie bodov za semestralku
        if(points > 20){
            System.out.println("Pocet bodov je viac nez 20");
            return false;
        }
        this.points += points;
        return true;
    }

    public boolean addPointsSkuska(int points) { // pridanie bodov za skusku
        if(points > 50){
            System.out.println("Pocet je viac nez 50");
            return false;
        }
        this.points += points;
        return true;
    }


}
