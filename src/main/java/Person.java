public abstract class Person {
    private String Name;
    private String Vorname;
    String getName(){return Name;}
    void setName(String name){Name = name;}
    String getVorname(){return Vorname;}
    void setVorname(String vorname){Vorname = vorname;}
    public String toString(){
        return "<" + Name + ">, " + "<" + Vorname + ">";
    }
}
