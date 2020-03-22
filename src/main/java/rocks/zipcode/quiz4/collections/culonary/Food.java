package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food   {
    Spice spice;
    List<Spice> spiceList = new ArrayList<>();







public List<Spice> getAllSpices() {



        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount()  {
        Map<Class<? extends Spice>, Integer>  map = new HashMap();


        for (Spice spice :spiceList){
            map.put(spice.getClass(),spiceList.size());
     }
        return (Map<SpiceType, Integer>) map;
    }

    public void applySpice(Spice spice) {

    spiceList.add(spice);


    }


}
