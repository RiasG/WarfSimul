package progect.calculated;

import progect.damage.Damage;
import progect.damage.DamageList;

public class DamageCalculator {
    private DamageList damageList;

    public DamageCalculator() {
    }

    public static DamageList multiplyDamageList(DamageList damageList, double mult){
        DamageList damages = new DamageList();
        for (Damage d: damageList) {
            Damage damage = new Damage(d.getAmountDamage() * mult, d.getDamageType());
            damages.add(damage);
        }
        return damages;
    }


    public static double calculateCritMult(double critChance, double critMult){
        double cMult = critMult;

        cMult = cMult * calculateMult(critChance);

        return cMult;
    }

    /**
     * метод расчитывает множитель из шанса критического урона, статуса, мультивыстрела или других неоднозначиных показателей
     * например шанс критического урона 140%, в таком случае 100% шанс на выпадение крита, значит множитель 1
     * остаются 40%, и нужно вычилить выдает ли шанс или нет
     * если выпадет то множитель будет равен 2-м, нет, то так и останется 1
     * 50% - можитель 0, но есть 50% шанс на выпадение множителя 1
     * 327 - множитель 3, есть 27% шанс на выдения множителя 4
     *
     * @param chance
     * @return
     */
    public static int calculateMult(double chance){
        double chBuf = chance;
        int res = 0;
        double rand = Math.random() * 100;

        while (chBuf >= 1) {
            res += 1;
            chBuf -= 1;
        }
        if (rand <= chBuf * 100) res += 1;

        return  res;
    }


    public static DamageList calculateCriticalDamageList(DamageList damageList, double critChance, double critMult){
        double cMult = 1;
        DamageList dList = new DamageList();


        cMult = calculateCritMult(critChance, critMult);


        if (cMult > 1){
            dList = multiplyDamageList(damageList, cMult);
        } else dList.addAll(damageList);

        return dList;
    }



    public static double calculateArmorResist(double hpArmor){
        return hpArmor/(hpArmor + 300);
    }



    public static DamageList calculateWeakResDamage(DamageList attackList, DamageList weakResDL) {
        DamageList damages = new DamageList();

            for (Damage attackDamage : attackList){
                Damage newDamage = new Damage(attackDamage);
                for (Damage weakRes : weakResDL){
                    if (attackDamage.getDamageType() == weakRes.getDamageType()){
                        newDamage.setAmountDamage(attackDamage.getAmountDamage() * (1 - weakRes.getAmountDamage()));
                    }
                }
                damages.add(newDamage);
            }
        return damages;
    }

   /* public static DamageList calculateReturnWeakResDamage(DamageList attackList, DamageList weakResDL) {
        DamageList damages = new DamageList();

        for (int i = 0; i < attackList.size(); i++) {
            damages.add(new Damage(
                    attackList.get(i).getAmountDamage(), attackList.get(i).getDamageType(),
                    attackList.get(i).getDamagePercent())
            );
            for (int j = 0; j < weakResDL.size(); j++) {
                if (damages.get(i).getDamageType() == weakResDL.get(j).getDamageType()) {
                    //System.out.println("DamageType = " + weakResDL.get(j).getDamageType());
                    damages.get(i).setAmountDamage(
                            damages.get(i).getAmountDamage() * (1 - weakResDL.get(j).getAmountDamage())
                    );
                    //System.out.println("Damage = " + damages.get(i).getAmountDamage());
                }
            }
        }
        return damages;
    }*/

   /* public static DamageList calculateShieldDamage(DamageList attackList, HitPoint hitPoint) {
        DamageList damages = new DamageList();
        DamageList weakResDL = hitPoint.getWeaknessResistanceList();

        for (int i = 0; i < attackList.size(); i++) {
            damages.add(new Damage(attackList.get(i).getAmountDamage(), attackList.get(i).getDamageType()));
            System.out.println(damages.get(i).getAmountDamage() + "+++");
            for (int j = 0; j < hitPoint.getWeaknessResistanceList().size(); j++) {
                if (damages.get(i).getDamageType() == weakResDL.get(j).getDamageType()) {
                    System.out.println("DamageType = " + weakResDL.get(j).getDamageType());
                    damages.get(i).setAmountDamage(
                            damages.get(i).getAmountDamage() * (1 - weakResDL.get(j).getAmountDamage())
                    );
                    System.out.println("Damage = " + damages.get(i).getAmountDamage());
                }
            }
        }
        return damages;
    }*/


    public static DamageList calculateArmoredWeakResDamage(DamageList attackList, DamageList weakResDL, double armorHP){
        DamageList damages = new DamageList();
        double resist = 0;

        for (Damage attackDamage : attackList){
            Damage newDamage = new Damage(attackDamage);
            resist = calculateArmorResist(armorHP);
            for (Damage weakRes : weakResDL){
                if (attackDamage.getDamageType() == weakRes.getDamageType()){
                    resist = calculateArmorResist(armorHP * (1 + weakRes.getAmountDamage()));
                }
            }
            System.out.println("Resist " + resist);
            newDamage.setAmountDamage(attackDamage.getAmountDamage() * (1 - resist));
            damages.add(newDamage);
        }

        return damages;
    }


    public static DamageList calculateDamagePercent(DamageList damageList){
        DamageList damages = new DamageList();
        double damageSum = damageList.getDamageSum();
        for (Damage d: damageList) {
            damages.add(new Damage(d.getAmountDamage(), d.getDamageType(), d.getAmountDamage() / damageSum));
        }

        return damages;
    }

}
