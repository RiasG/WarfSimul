package progect.weapon.attacks;

import progect.damage.DamageList;

public class HeavyRadialMeleeAttack extends RadialMeleeAttack {
    public HeavyRadialMeleeAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                                  double attackStatusChance, double radialAttackRadius) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance, radialAttackRadius);
    }
}
