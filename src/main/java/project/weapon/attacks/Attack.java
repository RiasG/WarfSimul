package project.weapon.attacks;

import project.damage.DamageList;

public abstract class Attack {
    private DamageList attackDamageList;
    private double attackCritMulti;
    private double attackCritChance;
    private double attackStatusChance;


    public Attack() {
    }

    public Attack(DamageList attackDamageList, double attackCritMulti, double attackCritChance, double attackStatusChance) {
        this.attackDamageList = attackDamageList;
        this.attackCritMulti = attackCritMulti;
        this.attackCritChance = attackCritChance;
        this.attackStatusChance = attackStatusChance;
    }

    public double getAttackCritMulti() {
        return attackCritMulti;
    }

    public double getAttackCritChance() {
        return attackCritChance;
    }

    public double getAttackStatusChance() {
        return attackStatusChance;
    }

    public DamageList getAttackDamageList() {
        return attackDamageList;
    }

    public void setAttackDamageList(DamageList attackDamageList) {
        this.attackDamageList = attackDamageList;
    }

    public void setAttackCritMulti(double attackCritMulti) {
        this.attackCritMulti = attackCritMulti;
    }

    public void setAttackCritChance(double attackCritChance) {
        this.attackCritChance = attackCritChance;
    }

    public void setAttackStatusChance(double attackStatusChance) {
        this.attackStatusChance = attackStatusChance;
    }
}
