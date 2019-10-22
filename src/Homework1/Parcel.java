package Homework1;

public class Parcel {
    private String ID; //id for parcel
    private double Weight; //weight for parcel

    //constructors
    public Parcel(){
        this.ID="";
        this.Weight=0;
    }

    public Parcel(String ID, double Weight){
        this.Weight=Weight;
        this.ID=ID;
    }

    public Parcel(String ID){
        this.Weight=1;
        this.ID=ID;
    }

    //getters
    public double getWeight(){
        return Weight;
    }
    public String getID(){
        return ID;
    }
    //setters
    public void setID(String ID){
        this.ID=ID;
    }
    public void setWeight(double Weight){
        this.Weight=Weight;
    }

    //String toString
    public String toString(){
        return("The ID for parcel is "+ ID + "and the weight is " + Weight +"lb");
    }

    //equal method
    public boolean equals(Parcel obj) {
        if (this.ID.equalsIgnoreCase(obj.getID())) {
            return true;
        } else{
            return false;
        }
    }

    //testing if the ID meets some criteria
    public String testCriteria( char first, char second, int numberTimesSecond){
        int count =0;
        for (int i=0;i<this.ID.length();i++){
            if(this.ID.charAt(i)==first){
                for (int j=i+1;j<this.ID.length();j++){
                    if(this.ID.charAt(j)==second){
                        count++;
                    }
                }
            }
        }
        if (count==numberTimesSecond){
            return ("Yes, m appears exactly 2 times after the x.");
        }
        else if(count<numberTimesSecond || count>numberTimesSecond){
            return ("No, m appears "+ count +" times.");
        }
        else if(count==0){
            return ("No, m does not appear");
        }
        else{
            return ("No, x does not appear.");
        }
    }

    //main method
    public static void main(String[] args) {
        Parcel one= new Parcel("dc4x1m43m2",45);
        Parcel two=new Parcel ("ddc4x1m4mm",60);
        //printing out two parcel objects.
        System.out.println(one.toString());
        System.out.println(two.toString());
        //testing out methods.
        String result1 = one.testCriteria('x','m',2);
        String result2 = two.testCriteria('x','m',2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(one.equals(two));
        //printing out text representation of the second object
        System.out.println("The ID for the second parcel is "+ two.getID() + " and the weight is " + two.getWeight() + "lbs");
    }
}
