public class Trio <T>{
    //declaring instance data variables
    private T item1, item2, item3;
    //two constructors
    public Trio(T item1, T item2, T item3){
        this.item1=item1;
        this.item2=item2;
        this.item3=item3;
    }
    public Trio(T item){
        item1= item;
        item2= item;
        item3= item;
    }
    //getters

    public T getItem1(){
        return item1;
    }

    public T getItem2() {
        return item2;
    }

    public T getItem3() {
        return item3;
    }

    //setters

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public void setItem3(T item3) {
        this.item3 = item3;
    }

    //toString

    @Override
    public String toString() {
        return item1.toString()+"\t"+item2.toString()+"\t"+item3.toString();
    }

    //reset
    public void reset(T obj){
        this.item1=obj;
        this.item2=obj;
        this.item3=obj;
    }

    //count method
    public int count (T item){
        int count=0;
        if(this.item1.equals(item))
            count++;
        if(this.item2.equals(item))
            count++;
        if(this.item3.equals(item))
            count++;
        return count;
    }

    //hasDuplicates method
    public boolean hasDuplicates(){
        if(item1.equals(item2)||item2.equals(item3)||item1.equals(item3))
            return true;
        return false;
    }

    //equals method
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Trio<?>){
            Trio<?> objT= (Trio<?>) obj;
            if(this.item1.equals(objT.item1)){
                if(this.item2.equals(objT.item2)){
                    if(this.item3.equals(objT.item3))
                        return true;
                }
                else if(this.item2.equals(objT.item3)){
                    if(this.item3.equals(objT.item2))
                        return true;
                }
            }
            else if(this.item1.equals(objT.item2)){
                if(this.item2.equals(objT.item3)){
                    if(this.item3.equals(objT.item1))
                        return true;
                }
            }
            else if(this.item1.equals(objT.item3)){
                if(this.item2.equals(objT.item1)){
                    if(this.item3.equals(objT.item2))
                        return true;
                }
            }
        }
        return false;
    }
}
