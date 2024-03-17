package project.enemy;

import project.damage.DamageList;

public class EnemyLifeScale {
    private Health health;
    private Armor armor;
    private Shield shield;

    public EnemyLifeScale(Health health, Armor armor, Shield shield) {
        this.health = health;
        this.armor = armor;
        this.shield = shield;
    }

    public EnemyLifeScale(Health health) {
        this.health = health;
    }

    public EnemyLifeScale() {

    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void takeDamage(DamageList damageList){

    }

}
