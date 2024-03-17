package project.enemy;

import project.damage.Damage;
import project.damage.DamageList;
import project.damage.DamageType;

public class FerriteArmor extends Armor{



    public FerriteArmor() {
        DamageList weakResDL = new DamageList();

        weakResDL.add(new Damage(0.5, DamageType.CORROSIVE));

        super.setWeaknessResistanceList(weakResDL);
    }
}
