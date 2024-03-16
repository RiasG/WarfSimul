package progect.enemy;

import progect.damage.DamageList;

public class HitPoint {
    private double hitPoint;
    private DamageList weaknessResistanceList;

    public HitPoint() {
    }


    public HitPoint(double hitPoint, DamageList weaknessResistanceList) {
        this.hitPoint = hitPoint;
        this.weaknessResistanceList = weaknessResistanceList;
    }

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

    public DamageList getWeaknessResistanceList() {
        return weaknessResistanceList;
    }

    public void setWeaknessResistanceList(DamageList weaknessResistanceList) {
        this.weaknessResistanceList = weaknessResistanceList;
    }

    public boolean takeDamage(double damage){
        if (damage <= 0 ) return false;
        else {
            this.hitPoint -= damage;
            return true;
        }
    }
}
