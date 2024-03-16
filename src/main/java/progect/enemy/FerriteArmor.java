package progect.enemy;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;

public class FerriteArmor extends Armor{



    public FerriteArmor() {
        DamageList weakResDL = new DamageList();

        weakResDL.add(new Damage(0.5, DamageType.CORROSIVE));

        super.setWeaknessResistanceList(weakResDL);
    }
}
