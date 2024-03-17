package progect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;
import progect.dao.PrimaryWeaponDao;
import progect.weapon.PrimaryWeapon;
import progect.weapon.Weapon;
import progect.weapon.characters.Characters;
import progect.weapon.characters.CharactersPrimary;
import progect.weapon.utility.NoiseLevel;

@Service
public class WeaponService {

    @Autowired
    private PrimaryWeaponDao primaryWeaponDao;

    @Transactional
    public void saveWeapon() {
        Weapon primaryWeapon = new PrimaryWeapon("Karak", 10,
                new DamageList(), 1.0, 2, 1, 1.0, 1, 30, 500);


        primaryWeaponDao.save(primaryWeapon);
    }
}
