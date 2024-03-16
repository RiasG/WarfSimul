package progect.calculated;

import org.junit.Test;
import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;
import progect.enemy.Armor;
import progect.enemy.EnemyLifeScale;
import progect.enemy.Health;
import progect.enemy.Shield;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.PrimaryAttack;

public class EnemyDamageCalculateTest {

    @Test
    public void enemyDamageCalculateTest(){


        DamageList damageList = new DamageList();
        damageList.add(new Damage(1000, DamageType.VIRAL));
        damageList.add(new Damage(1000, DamageType.CORROSIVE));
        damageList.add(new Damage(1000, DamageType.RADIATION));
        damageList.add(new Damage(1000, DamageType.SLASH));


        DamageList weakResHealth = new DamageList();
        weakResHealth.add(new Damage(-0.75, DamageType.VIRAL));
        weakResHealth.add(new Damage(-0.25, DamageType.SLASH));
        weakResHealth.add(new Damage(0.75, DamageType.GAS));
        weakResHealth.add(new Damage(0.5, DamageType.RADIATION));

        DamageList weakResArmor = new DamageList();
        weakResArmor.add(new Damage(-0.75, DamageType.CORROSIVE));
        weakResArmor.add(new Damage(-0.25, DamageType.COLD));
        weakResArmor.add(new Damage(0.75, DamageType.VIRAL));
        weakResArmor.add(new Damage(0.5, DamageType.SLASH));

        DamageList weakResShield = new DamageList();
        weakResShield.add(new Damage(-0.75, DamageType.MAGNETIC));
        weakResShield.add(new Damage(-0.5, DamageType.COLD));
        weakResShield.add(new Damage(-0.25, DamageType.PUNCTURE));
        weakResShield.add(new Damage(0.5, DamageType.RADIATION));
        weakResShield.add(new Damage(0.5, DamageType.SLASH));


        Health health = new Health(500, weakResHealth);
        Armor armor = new Armor(900, weakResArmor);
        Shield shield = new Shield(0,weakResShield);

        EnemyLifeScale enemyLife = new EnemyLifeScale(health, armor, shield);

        Attack attack = new PrimaryAttack(damageList,3,1,1,2);

        damageList = EnemyDamageCalculate.calculateEnemyDamage(enemyLife,attack.getAttackDamageList());

        System.out.println("AFTER ATTACK-------------");
        for (Damage d:attack.getAttackDamageList()){
            System.out.println("Attack DL = " + d.getAmountDamage());
        }

        for (Damage d:damageList){
            System.out.println("DL = " + d.getAmountDamage());
        }

        System.out.println("Enemy shield = " + enemyLife.getShield().getHitPoint());
        System.out.println("Enemy armor = " + enemyLife.getArmor().getHitPoint());
        System.out.println("Enemy health = " + enemyLife.getHealth().getHitPoint());


    }

    @Test
    public void testTakeDamage(){
        DamageList damageList = new DamageList();
        damageList.add(new Damage(100, DamageType.VIRAL));
        damageList.add(new Damage(100, DamageType.CORROSIVE));
        damageList.add(new Damage(100, DamageType.RADIATION));
        damageList.add(new Damage(100, DamageType.SLASH));


        DamageList weakResHealth = new DamageList();
        Health health = new Health(400, weakResHealth);

        damageList = EnemyDamageCalculate.calculateTakeDamage(damageList,health);

        for (Damage d : damageList){
            System.out.println("Attack DL = " + d.getAmountDamage());
        }

        System.out.println("HP " + health.getHitPoint());

        damageList = new DamageList();
        damageList.add(new Damage(345, DamageType.VIRAL));
        damageList.add(new Damage(284, DamageType.CORROSIVE));
        damageList.add(new Damage(54, DamageType.RADIATION));
        damageList.add(new Damage(732, DamageType.SLASH));



        health = new Health(500, weakResHealth);

        damageList = EnemyDamageCalculate.calculateTakeDamage(damageList,health);

        for (Damage d : damageList){
            System.out.println("Attack DL = " + d.getAmountDamage());
        }

        System.out.println("HP " + health.getHitPoint());


        damageList = new DamageList();
        damageList.add(new Damage(10, DamageType.VIRAL));
        damageList.add(new Damage(43, DamageType.CORROSIVE));
        damageList.add(new Damage(23, DamageType.RADIATION));
        damageList.add(new Damage(45, DamageType.SLASH));



        health = new Health(500, weakResHealth);

        damageList = EnemyDamageCalculate.calculateTakeDamage(damageList,health);

        for (Damage d : damageList){
            System.out.println("Attack DL = " + d.getAmountDamage());
        }

        System.out.println("HP " + health.getHitPoint());

    }

}