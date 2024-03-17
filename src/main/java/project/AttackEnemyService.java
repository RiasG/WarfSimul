package project;

import project.calculated.DamageCalculator;
import project.calculated.EnemyDamageCalculate;
import project.damage.Damage;
import project.damage.DamageList;
import project.enemy.EnemyLifeScale;
import project.weapon.attacks.Attack;
import project.weapon.attacks.MeleeAttack;
import project.weapon.attacks.PrimaryAttack;

import java.util.LinkedList;

public class AttackEnemyService {
    private EnemyLifeScale enemyLifeScale;
    private Attack attack;
    private LinkedList<DamageList> damageInformation;

    public AttackEnemyService() {
    }

    public AttackEnemyService(EnemyLifeScale enemyLifeScale, Attack attack) {
        this.enemyLifeScale = enemyLifeScale;
        this.attack = attack;
    }

    public static EnemyLifeScale calculateAttack(EnemyLifeScale enemyLifeScale, Attack attack) {

        //EnemyLifeScale e = enemyLifeScale;

        DamageList damageList = attack.getAttackDamageList();
        double critChance = attack.getAttackCritChance();
        System.out.println("CritChance " + critChance);
        double critMulti = DamageCalculator.calculateMult(critChance);
        System.out.println("CritMult " + critMulti);

        if (attack instanceof PrimaryAttack) {
            PrimaryAttack primaryAttack = (PrimaryAttack) attack;
            int multiShot = DamageCalculator.calculateMult(primaryAttack.getMultiShot());
            System.out.println("MultiShot " + multiShot);

            double hitPoint = enemyLifeScale.getHealth().getHitPoint();
            for (Damage damage : damageList) {
                System.out.println("Damage " + damage.getAmountDamage());
                hitPoint -= damage.getAmountDamage();
                System.out.println("HP without 1 damage type " + hitPoint);
            }

            enemyLifeScale.getHealth().setHitPoint(hitPoint);
            System.out.println("Enemy hp " + enemyLifeScale.getHealth().getHitPoint());


        }

        return enemyLifeScale;
    }

    public void takeAttack() {

        double critChance = this.attack.getAttackCritChance();
        double critMult = this.attack.getAttackCritMulti();
        double statusChance = this.attack.getAttackStatusChance();
        EnemyLifeScale enemyLifeScale = this.enemyLifeScale;

        if (this.attack instanceof PrimaryAttack) {
            //PrimaryWeapon primaryWeapon = (PrimaryWeapon) weapon;
            PrimaryAttack primaryAttack = (PrimaryAttack) this.attack;

            DamageList attackDamageList = primaryAttack.getAttackDamageList();


            //attackDamageList = DamageCalculator.calculateCriticalDamageList(attackDamageList,critChance, critMult);

            int multiShot = DamageCalculator.calculateMult(primaryAttack.getMultiShot());
            for (int i = 0; i < multiShot; i++) {
                DamageList bufferDamages = new DamageList(
                        DamageCalculator.calculateCriticalDamageList(attackDamageList, critChance, critMult)
                );
                EnemyDamageCalculate.calculateEnemyDamage(enemyLifeScale, bufferDamages);
            }

        } else {

            if (this.attack instanceof MeleeAttack) {
                MeleeAttack meleeAttack = (MeleeAttack) this.attack;
                DamageList attackDamageList = meleeAttack.getAttackDamageList();
                attackDamageList = DamageCalculator.calculateCriticalDamageList(attackDamageList, critChance, critMult);
                EnemyDamageCalculate.calculateEnemyDamage(enemyLifeScale, attackDamageList);

            }
        }
    }


}
