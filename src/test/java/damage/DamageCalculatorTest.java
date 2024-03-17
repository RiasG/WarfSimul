package damage;

import org.junit.Test;
import project.calculated.DamageCalculator;
import project.damage.Damage;
import project.damage.DamageList;
import project.damage.DamageType;
import project.enemy.Armor;
import project.enemy.Health;

import static project.calculated.DamageCalculator.*;


public class DamageCalculatorTest {
    @Test
    public void testCalculateCrit() {
        double cChance = 1;
        double cMult = 2;
        System.out.println("Crit");
        System.out.println(calculateCritMult(cChance, cMult));
        System.out.println(cChance + " " + cMult);

        DamageList damageList = new DamageList();
        damageList.add(new Damage(40, DamageType.VIRAL));
        damageList.add(new Damage(10, DamageType.RADIATION));
        damageList.add(new Damage(25, DamageType.COLD));


        System.out.println("DList");
        damageList.show();
//        for (Damage d:damageList) {
//            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());
//
//        }

        damageList = calculateCriticalDamageList(damageList, cChance, cMult);

        System.out.println("Critical DList");
        damageList.show();
//        for (Damage d:damageList) {
//            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());
//
//        }


        DamageList weakRes = new DamageList();

        weakRes.add(new Damage(-0.25, DamageType.VIRAL));
        weakRes.add(new Damage(-0.75, DamageType.CORROSIVE));
        weakRes.add(new Damage(0.5, DamageType.RADIATION));
        weakRes.add(new Damage(0.75, DamageType.COLD));

        Health health = new Health(1000, weakRes);
        damageList = DamageCalculator.calculateWeakResDamage(damageList, health.getWeaknessResistanceList());

        System.out.println("WeakRes Crit DList");
        damageList.show();


    }

    @Test
    public void testCalculateHealthDamage() {
        DamageList damageList = new DamageList();
        damageList.add(new Damage(100, DamageType.TOXIC));
        damageList.add(new Damage(100, DamageType.CORROSIVE));
        damageList.add(new Damage(100, DamageType.RADIATION));
        damageList.add(new Damage(100, DamageType.GAS));
        damageList.add(new Damage(100, DamageType.VIRAL));
        damageList.add(new Damage(100, DamageType.SLASH));


        DamageList weakRes = new DamageList();

        weakRes.add(new Damage(-0.25, DamageType.VIRAL));
        weakRes.add(new Damage(-0.75, DamageType.CORROSIVE));
        weakRes.add(new Damage(0.5, DamageType.RADIATION));
        weakRes.add(new Damage(0.75, DamageType.SLASH));

        Health health = new Health(1000, weakRes);


        DamageList dL = new DamageList(DamageCalculator.calculateWeakResDamage(damageList, health.getWeaknessResistanceList()));

        for (Damage d : dL) {
            System.out.println(d.getAmountDamage() + " " + d.getDamageType() + " " + d.getDamagePercent());
        }
//        for (Damage d: damageList) {
//            System.out.println(d.getAmountDamage());
//        }
        for (Damage d : dL) {
            health.takeDamage(d.getAmountDamage());
        }
        System.out.println(health.getHitPoint());

    }

    @Test
    public void testCalculateArmorDamage() {
        DamageList damageList = new DamageList();
        damageList.add(new Damage(100, DamageType.VIRAL));
        damageList.add(new Damage(100, DamageType.GAS));
        damageList.add(new Damage(100, DamageType.CORROSIVE));
        damageList.add(new Damage(100, DamageType.RADIATION));
        damageList.add(new Damage(100, DamageType.TOXIC));
        damageList.add(new Damage(100, DamageType.SLASH));


        DamageList weakResist = new DamageList();
        weakResist.add(new Damage(-0.25, DamageType.VIRAL));
        weakResist.add(new Damage(-0.75, DamageType.CORROSIVE));
        weakResist.add(new Damage(0.5, DamageType.RADIATION));
        weakResist.add(new Damage(0.75, DamageType.SLASH));

        Armor armor = new Armor(1000, weakResist);

        DamageList dList = new DamageList(
                DamageCalculator.calculateArmoredWeakResDamage(
                        damageList, armor.getWeaknessResistanceList(), armor.getHitPoint())
        );


        System.out.println("New DamageList");
        for (Damage d : dList) {
            System.out.println(d.getAmountDamage());
        }

//        System.out.println("Old DamageList");
//        for (Damage d: damageList) {
//            System.out.println(d.getAmountDamage());
//        }

        Health health = new Health(1000, new DamageList());
        for (Damage d : dList) {
            health.takeDamage(d.getAmountDamage());
        }
        System.out.println(health.getHitPoint());

    }

    @Test
    public void testCalculateDamagePercent() {
        DamageList damageList = new DamageList();
        damageList.add(new Damage(324, DamageType.VIRAL));
        damageList.add(new Damage(12, DamageType.CORROSIVE));
        damageList.add(new Damage(73, DamageType.RADIATION));
        damageList.add(new Damage(252, DamageType.SLASH));

        damageList = DamageCalculator.calculateDamagePercent(damageList);

        for (Damage d : damageList) {
            System.out.println(d.getAmountDamage() + " " + d.getDamagePercent());
        }

    }
}