package Homework1;

//child class
public class OverNight extends Parcel {

    //variables
    private boolean Signature;
    //constructors
    public OverNight(String ID, double Weight, boolean Signature){
        super(ID,Weight);
        this.Signature=Signature;
    }
}
