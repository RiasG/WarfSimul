package progect.weapon;

import progect.weapon.attacks.Attack;
import progect.exceprions.NullCharactersException;

public interface AttackCreator {
    Attack attack () throws NullCharactersException;


}
