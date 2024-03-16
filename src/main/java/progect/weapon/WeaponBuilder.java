package progect.weapon;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;
import progect.weapon.characters.Characters;
import progect.weapon.characters.CharactersPrimary;
import progect.weapon.utility.NoiseLevel;

public class WeaponBuilder {
    Weapon weapon;

    WeaponBuilder(){
        Characters characters = new CharactersPrimary();
        characters.setName("PrimaryWeapon");
        characters.setAttackSpeed(10);
        characters.setCriticalChance(0.7);
        characters.setCriticalMultiplier(2);
        DamageList damages = new DamageList();
        damages.add(new Damage(50, DamageType.VIRAL));
        damages.add(new Damage(120, DamageType.PUNCTURE));
        damages.add(new Damage(542, DamageType.TOXIC));
        damages.add(new Damage(18, DamageType.COLD));
        damages.add(new Damage(40, DamageType.IMPACT));

        characters.setDamageList(new DamageList());
        characters.setNoiseLevel(NoiseLevel.NOISE);
        characters.setDisposition(1.2);
        characters.setStatusChance(0.3);
        weapon.setCharacters(characters);

    }

    public Weapon buildWeapon(Characters characters){


        return null;

    }

    public Weapon getWeapon() {
        return weapon;
    }
}
