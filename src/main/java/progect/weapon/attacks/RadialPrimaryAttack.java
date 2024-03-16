package progect.weapon.attacks;

import progect.damage.DamageList;

public class RadialPrimaryAttack extends Attack{
    private double radialAttackRadius;

    public RadialPrimaryAttack(DamageList attackDamageList, double attackCritMulti,
                               double attackCritChance, double attackStatusChance, double radialAttackRadius) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.radialAttackRadius = radialAttackRadius;
    }
}
