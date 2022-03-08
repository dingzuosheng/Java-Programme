package Pojo;

public class Sensor {
    private String id;
    private String name;

    public Sensor(){}

    public Sensor(final String id, final String name){
        this.id = id;
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
