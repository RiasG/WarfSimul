package progect.weapon;

import progect.damage.DamageList;
import progect.weapon.attacks.PrimaryAttack;
import progect.weapon.characters.Characters;
import progect.weapon.attacks.Attack;
import progect.weapon.characters.CharactersPrimary;
import progect.exceprions.NullCharactersException;
import progect.weapon.utility.NoiseLevel;

import javax.persistence.*;

@Entity
@Table(name = "ws_primary_weapon")
public class PrimaryWeapon extends Weapon implements AttackCreator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "primary_weapon_id")
    private Long weaponId;

    @Column(name = "multi_shot")
    private double multiShot;
    @Column(name = "reload_speed")
    private double reloadSpeed;
    @Column(name = "magazine_ammo")
    private int magazineAmmo;
    @Column(name = "full_ammo")
    private int fullAmmo;


    CharactersPrimary charactersPrimary;

    public PrimaryWeapon() {
    }

    public PrimaryWeapon(String name, double attackSpeed,
                         DamageList damageList,
                         double criticalChance, double criticalMultiplier, double statusChance,
                         double multiShot, double reloadSpeed, int magazineAmmo, int fullAmmo) {
        super(name, attackSpeed, damageList, criticalChance, criticalMultiplier, statusChance);
        this.multiShot = multiShot;
        this.reloadSpeed = reloadSpeed;
        this.magazineAmmo = magazineAmmo;
        this.fullAmmo = fullAmmo;
    }

    public PrimaryWeapon(Characters characters) {
        super(characters);
        charactersPrimary = (CharactersPrimary) characters;
    }

    @Override
    public PrimaryAttack attack() throws NullCharactersException {

        CharactersPrimary charactersPrimary = (CharactersPrimary) super.getCharacters();
        if (charactersPrimary == null) {
            NullCharactersException nullCharacters = new NullCharactersException("Отсутствуют характеристики оружия");
            ;
            throw nullCharacters;
        }
        PrimaryAttack attack = new PrimaryAttack(charactersPrimary.getDamageList(), charactersPrimary.getCriticalMultiplier(),
                charactersPrimary.getCriticalChance(), charactersPrimary.getStatusChance(), charactersPrimary.getMultiShot());

        return attack;
    }


}
