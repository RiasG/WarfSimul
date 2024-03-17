package project.weapon.attacks;

import project.damage.DamageList;

public class MeleeAttack extends Attack {


    public MeleeAttack() {
    }

    public MeleeAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                       double attackStatusChance) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
    }


}
