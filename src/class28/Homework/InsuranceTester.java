package class28.Homework;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList <Insurance> insurances = new ArrayList<>();
        insurances.add (new Car("Geico","Toyota"));
        insurances.add (new Pet("PetLove","dog"));
        insurances.add (new Health ("Allianz"));

       /* for (int i = 0; i < insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
        }*/
        for (Insurance x : insurances) {
            x.getQuote();
            x.cancelInsurance();
        }
        /*Iterator<Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()) {
            Insurance i = iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }*/
    }}




