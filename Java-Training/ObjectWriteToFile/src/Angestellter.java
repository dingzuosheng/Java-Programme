public class Angestellter {
    private String name;
    private double gehalt;

    public Angestellter(String name, double gehalt){
        this.name = name;
        this.gehalt = gehalt;
    }

    public String getName(){
        return this.name;
    }

    public double getGehalt(){
        return this.gehalt;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGehalt(double gehalt){
        this.gehalt = gehalt;
    }
}
