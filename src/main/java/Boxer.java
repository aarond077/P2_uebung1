public class Boxer extends Person{
    private int Gewicht;
    int getGewicht(){ return Gewicht;}
    Boxer(int gewicht, String name, String vorname){
        Gewicht = gewicht;
        setName(name);
        setVorname(vorname);
    }
    boolean equals(Boxer other){
        if((other.getName() == getName()) && (other.getVorname() == getVorname()) && (other.getGewicht() == getGewicht())){
            return true;
        }
        else return false;
    }
}
