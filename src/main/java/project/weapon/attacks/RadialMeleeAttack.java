package project.weapon.attacks;

import project.damage.DamageList;

public class RadialMeleeAttack extends MeleeAttack{

    private double radialAttackRadius;

    public RadialMeleeAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                             double attackStatusChance, double radialAttackRadius) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.radialAttackRadius = radialAttackRadius;
    }
}
