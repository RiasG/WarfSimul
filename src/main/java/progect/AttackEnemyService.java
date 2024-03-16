package progect;

import progect.calculated.DamageCalculator;
import progect.calculated.EnemyDamageCalculate;
import progect.damage.DamageList;
import progect.enemy.EnemyLifeCondition;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.MeleeAttack;
import progect.weapon.attacks.PrimaryAttack;

import java.util.LinkedList;

public class AttackEnemyService {
    private EnemyLifeCondition enemyLifeCondition;
    private Attack attack;
    private LinkedList<DamageList> damageInformation;
    public AttackEnemyService() {
    }
    public AttackEnemyService(EnemyLifeCondition enemyLifeCondition, Attack attack) {
        this.enemyLifeCondition = enemyLifeCondition;
        this.attack = attack;
    }
    public void takeAttack(){

        double critChance = this.attack.getAttackCritChance();
        double critMult = this.attack.getAttackCritMulti();
        double statusChance = this.attack.getAttackStatusChance();
        EnemyLifeCondition enemyLifeCondition = this.enemyLifeCondition;

        if (this.attack instanceof PrimaryAttack){
            //PrimaryWeapon primaryWeapon = (PrimaryWeapon) weapon;
            PrimaryAttack primaryAttack = (PrimaryAttack) this.attack;

            DamageList attackDamageList = primaryAttack.getAttackDamageList();


            //attackDamageList = DamageCalculator.calculateCriticalDamageList(attackDamageList,critChance, critMult);

            int multiShot = DamageCalculator.calculateMult(primaryAttack.getMultiShot());
            for (int i = 0; i < multiShot; i++) {
                DamageList bufferDamages = new DamageList(
                        DamageCalculator.calculateCriticalDamageList(attackDamageList,critChance, critMult)
                );
                EnemyDamageCalculate.calculateEnemyDamage(enemyLifeCondition, bufferDamages);
            }

        } else{

            if (this.attack instanceof MeleeAttack){
                MeleeAttack meleeAttack = (MeleeAttack) this.attack;
                DamageList attackDamageList = meleeAttack.getAttackDamageList();
                attackDamageList = DamageCalculator.calculateCriticalDamageList(attackDamageList, critChance, critMult);
                EnemyDamageCalculate.calculateEnemyDamage(enemyLifeCondition, attackDamageList);

            }
        }
    }


}
