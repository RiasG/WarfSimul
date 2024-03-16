package progect.enemy;

import progect.damage.DamageList;

public class EnemyLifeCondition {
    private Health health;
    private Armor armor;
    private Shield shield;

    public EnemyLifeCondition(Health health, Armor armor, Shield shield) {
        this.health = health;
        this.armor = armor;
        this.shield = shield;
    }

    public EnemyLifeCondition() {

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
