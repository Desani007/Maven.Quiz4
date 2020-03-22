package rocks.zipcode.quiz4.collections.culonary;

/**
 * @author leon on 27/12/2018.
 */
public class Ginger implements Spice {
    String name="ginger";
    int addedAmount=0;


    public String getName() {
        return name;
    }

    public int getAmount(){
        return this.addedAmount;
    }
    public void setAmount() {
        addedAmount += addedAmount++;

    }
    }
