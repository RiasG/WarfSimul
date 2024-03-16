package progect.weapon.utility;

import progect.damage.DamageList;

public class Projectile {
    private DamageList damageList;
    private double critMulti;
    private double critChance;
    private double statusChance;

    //private damage.DamageType damageWithStatus;
    //private double statusMulti;

    public Projectile() {
    }

    public Projectile(DamageList damageList, double critMulti, double critChance, double statusChance) {
        this.damageList = damageList;
        this.critMulti = critMulti;
        this.critChance = critChance;
        this.statusChance = statusChance;
    }

    public DamageList getDamageList() {
        return damageList;
    }

    public void setDamageList(DamageList damageList) {
        this.damageList = damageList;
    }

   /* public double getStatusMulti() {
        return statusMulti;
    }

    public void setStatusMulti(double statusMulti) {
        this.statusMulti = statusMulti;
    }*/

    public double getCritMulti() {
        return critMulti;
    }

    public void setCritMulti(double critMulti) {
        this.critMulti = critMulti;
    }

    public double getCritChance() {
        return critChance;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

    public double getStatusChance() {
        return statusChance;
    }

    public void setStatusChance(double statusChance) {
        this.statusChance = statusChance;
    }

    @Override
    public String toString() {
        return "Projectile{" +
                "damageList=" + damageList +
                ", critMulti=" + critMulti +
                ", critChance=" + critChance +
                ", statusChance=" + statusChance +
                '}';
    }
}
