package project.weapon;

import project.calculated.DamageCalculator;
import project.damage.DamageList;
import project.weapon.attacks.*;
import project.weapon.characters.CharactersMelee;
import project.weapon.characters.Characters;
import project.exceprions.NullCharactersException;

public class MeleeWeapon extends Weapon implements AttackMeleeCreator{
    private CharactersMelee charactersMelee;


    public MeleeWeapon() {
    }
    public MeleeWeapon(Characters characters) {
        super(characters);
        this.charactersMelee = (CharactersMelee) characters;
    }



    @Override
    public Attack attack () throws NullCharactersException{
        if (charactersMelee == null){
            throw new NullCharactersException("Отсутствуют хараткеристики оружия");
        }
        return new MeleeAttack(
                charactersMelee.getDamageListWithMulti(charactersMelee.getAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance()
        );
    }

    @Override
    public Attack heavyAttack() throws NullCharactersException{
        return new HeavyAttackMelee(
                charactersMelee.getDamageListWithMulti(charactersMelee.getHeavyAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance()
        );
    }

    @Override
    public Attack slamLightAttack(){
        return new SlamLightAttack(
                charactersMelee.getDamageListWithMulti(charactersMelee.getSlamAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance()
        );
    }

    @Override
    public Attack slamHeavyAttack(){
        return new SlamHeavyAttack(
                charactersMelee.getDamageListWithMulti(charactersMelee.getSlamHeavyAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance()
        );
    }

   @Override
    public Attack radialLightAttack(){
       DamageList dList = DamageCalculator.multiplyDamageList(
               charactersMelee.getRadialAttackDamage(), charactersMelee.getRadialAttackMulti()
       );
        return new RadialMeleeAttack(dList, charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance(), charactersMelee.getRadialAttackRadius()
        );
    }

    @Override
    public Attack heavyRadialAttack(){
        DamageList dList = DamageCalculator.multiplyDamageList(
                charactersMelee.getRadialAttackDamage(), charactersMelee.getHeavyRadialAttackMulti()
        );
        return new HeavyRadialMeleeAttack(
                dList, charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance(), charactersMelee.getHeavyRadialAttackRadius()
        );
    }

    @Override
    public Attack slideAttack(){

        DamageList dList = DamageCalculator.multiplyDamageList(
                charactersMelee.getSlideAttackDamage(), charactersMelee.getSlideAttackMulti()
        );
        return new SlideAttack(dList, charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance()
        );
    }


    public CharactersMelee getCharactersMelee() {
        return charactersMelee;
    }
}
