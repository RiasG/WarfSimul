package project.enemy;

import project.damage.DamageList;

public class Armor extends HitPoint {

    public Armor() {
    }


    public Armor(double hitPoint, DamageList weaknessDamageList) {
        super(hitPoint, weaknessDamageList);
    }
}
