package progect;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;
import progect.weapon.MeleeWeapon;
import progect.weapon.utility.NoiseLevel;
import progect.weapon.PrimaryWeapon;
import progect.weapon.Weapon;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.PrimaryAttack;
import progect.weapon.characters.Characters;
import progect.weapon.characters.CharactersMelee;
import progect.weapon.characters.CharactersPrimary;


public class Main {
    public static void main(String[] args) {


        Characters characters = new CharactersPrimary("Karak", 2,45, new DamageList(), 0.3,2,0.4,
                NoiseLevel.NOISE, 1,0.5,30,500);
        characters.getDamageList().add(new Damage(23, DamageType.CORROSIVE));


        //characters = null;
        Weapon weapon = new PrimaryWeapon(characters);

            Attack attack = weapon.attack();
            weapon.attack();
            System.out.println(weapon.attack());
            System.out.println(attack.getAttackDamageList().getFirst().getDamageType());
            System.out.println(((PrimaryAttack)attack).getMultiShot());




        CharactersMelee charactersMelee = new CharactersMelee();
        charactersMelee.setHeavyAttackMulti(4);
        charactersMelee.setDamageList(new DamageList());
        charactersMelee.setBlockAngle(39);
        charactersMelee.getDamageList().add(new Damage(33,DamageType.ELECTRICITY));
        MeleeWeapon meleeWeapon = new MeleeWeapon(charactersMelee);


        System.out.println(meleeWeapon.getCharactersMelee().getHeavyAttackMulti());
        System.out.println(meleeWeapon.getCharactersMelee().getBlockAngle());
        System.out.println(charactersMelee.getDamageListWithMulti(
                charactersMelee.getAttackMulti()).getFirst().getDamageType().name());
        System.out.println(charactersMelee.getDamageListWithMulti(4).getFirst().getAmountDamage());
        System.out.println(charactersMelee.getDamageList().getFirst().getAmountDamage());
        System.out.println(charactersMelee.getDamageList().getFirst().getDamageType().name());
        System.out.println(meleeWeapon.attack().getAttackDamageList().getFirst().getDamageType());



        /*
        DamageList damageList = new DamageList();

        damageList.add(new Damage(233,damage.DamageType.BLAST));
        damageList.add(new Damage(11,damage.DamageType.CORROSIVE));
        System.out.println(damageList);
        for (Damage d: damageList) {
        System.out.println(d.getDamageType());

        }

*/


    }
}
