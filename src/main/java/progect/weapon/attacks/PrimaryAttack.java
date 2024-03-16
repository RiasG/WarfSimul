package progect.weapon.attacks;

import progect.damage.DamageList;

public class PrimaryAttack extends Attack {

    private double multiShot;

    public PrimaryAttack() {
        multiShot = 1;
    }

    public PrimaryAttack(DamageList damageList, double critMulti, double critChance, double statusChance, double multiShot) {
        super(damageList, critMulti, critChance, statusChance);
        this.multiShot = multiShot;

    }



    public double getMultiShot() {
        return multiShot;
    }
}
