package Lab3Package;

import java.util.ArrayList;

public class Zoo {

    private String location;
    private int numCompounds;
    private int zooID;
    public static int numZoos;
    private ArrayList<Compound> compounds;

    public Zoo(String location, int numCompounds) {
        this.location = location;
        this.numCompounds = numCompounds;
        compounds = new ArrayList<Compound>();
        numZoos++;
        this.zooID = numZoos;
        for (int i = 0; i < numCompounds; i++){
            addCompound(new Compound());
        }
    }

    private void addCompound(Compound compound) {
        this.compounds.add(compound);
    }

    public Zoo(){
        this.setLocation("Unknown");
        this.numCompounds = 30;
        numZoos++;
        this.zooID = numZoos;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCompounds(){
        return numCompounds;
    }

    public void buildNewCompound(){
        this.numCompounds++;
    }

    public int getZooID(){
        return zooID;
    }


    public String printInfo(){
        return "Location: " + getLocation() + ", Compounds: " + getCompounds();
    }



}
