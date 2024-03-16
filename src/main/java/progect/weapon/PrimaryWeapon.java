package progect.weapon;

import progect.weapon.attacks.PrimaryAttack;
import progect.weapon.characters.Characters;
import progect.weapon.attacks.Attack;
import progect.weapon.characters.CharactersPrimary;
import progect.exceprions.NullCharactersException;

import javax.persistence.*;

@Entity
@Table(name = "ws_weapons_primary")
public class PrimaryWeapon extends Weapon implements AttackCreator{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "primary_weapon_id")
    private Long charactersID;
    CharactersPrimary charactersPrimary;

    public PrimaryWeapon() {
    }

    public PrimaryWeapon(Characters characters) {
        super(characters);
        charactersPrimary = (CharactersPrimary) characters;
    }

    @Override
    public Attack attack() throws NullCharactersException {

        CharactersPrimary charactersPrimary = (CharactersPrimary) super.getCharacters();
        if(charactersPrimary == null) {
            NullCharactersException nullCharacters = new NullCharactersException("Отсутствуют характеристики оружия");;
            throw nullCharacters;
        }
        Attack attack = new PrimaryAttack(charactersPrimary.getDamageList(),charactersPrimary.getCriticalMultiplier(),
                charactersPrimary.getCriticalChance(), charactersPrimary.getStatusChance(),charactersPrimary.getMultiShot());

        return attack;
    }


}
