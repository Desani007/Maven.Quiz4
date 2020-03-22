package rocks.zipcode.quiz4.collections.culonary;

public class Curry implements Spice  {
    String name="curry";
    int addedAmount =0;

    public String getName() {
        return name;
    }


    public int getAmount(){
       return this.addedAmount;
    }
    public void setAmount(){
        addedAmount+=addedAmount++;


    }


}
