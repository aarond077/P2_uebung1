public class Student extends Person{
    int Matrikelnummer = 0; //Matrikelnummer
    int getMatrikelnummer(){return Matrikelnummer;} //getter function
    Student(int matrikelnummer, String name, String vorname){ //Konstruktor
        Matrikelnummer = matrikelnummer;
        setName(name);
        setVorname(vorname);
    }
    boolean equals(Student other){
        if((other.getName() == getName() && (other.getVorname() == getVorname()) && (other.getMatrikelnummer() == getMatrikelnummer()))){
            return true;}
        else return false;
    }
}
