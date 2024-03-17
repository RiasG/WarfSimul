package progect.damage;

import java.util.Collection;
import java.util.LinkedList;

public class DamageList extends LinkedList<Damage> {


    public DamageList() {
    }

    public DamageList(Collection<? extends Damage> c) {
        for (Damage d : c) {
            super.add(new Damage(d));
        }

    }

    public double getDamageSum(){
        double sum = 0;

        for (Damage d:this) {
            sum += d.getAmountDamage();
        }

        return sum;
    }

    public void show(){
        for (Damage d: this) {
            System.out.println("Amount damage = " + d.getAmountDamage() + " " + "Damage Type = " + d.getDamageType() + " " +
                    "Damage Percent = " + d.getDamagePercent()
            );
        }
    }

    @Override
    public boolean addAll(Collection<? extends Damage> c) {
        for (Damage d : c) {
            super.add(new Damage(d));
        }

        return true;
    }

}
