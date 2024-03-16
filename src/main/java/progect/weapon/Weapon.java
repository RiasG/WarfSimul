package progect.weapon;

import progect.weapon.characters.Characters;
import progect.weapon.attacks.Attack;
import progect.exceprions.NullCharactersException;

public class Weapon implements AttackCreator{
    private Characters characters;

    public Weapon() {
    }

    public Weapon(Characters characters) {
        this.characters = characters;
    }

    @Override
    public Attack attack() throws NullCharactersException {
        return null;
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" +  '\'' +
                ", characters=" + characters +
                '}';
    }

}
