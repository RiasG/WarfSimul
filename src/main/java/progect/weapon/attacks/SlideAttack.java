package progect.weapon.attacks;

import progect.damage.DamageList;

public class SlideAttack extends MeleeAttack{
    public SlideAttack() {
    }

    public SlideAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance, double attackStatusChance) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
    }
}
