package project.weapon.attacks;

import project.damage.DamageList;

public class SlamHeavyAttack extends MeleeAttack{
    public SlamHeavyAttack(DamageList attackDamageList,
                           double attackCritMulti, double attackCritChance,
                           double attackStatusChance) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
    }
}
