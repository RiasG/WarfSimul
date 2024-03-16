package progect.weapon.attacks;

import progect.damage.DamageList;

public class SlamLightAttack extends MeleeAttack{

    public SlamLightAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                           double attackStatusChance) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
    }
}
