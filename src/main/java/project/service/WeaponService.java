package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.damage.DamageList;
import project.dao.PrimaryWeaponDao;
import project.weapon.PrimaryWeapon;
import project.weapon.Weapon;

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
