package project.weapon;

import project.weapon.attacks.Attack;
import project.exceprions.NullCharactersException;

public interface AttackCreator {
    Attack attack () throws NullCharactersException;


}
