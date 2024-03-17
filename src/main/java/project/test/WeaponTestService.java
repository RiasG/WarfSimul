package project.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WeaponTestService {
    private static final Logger LOG = LoggerFactory.getLogger(WeaponTestService.class);
    @Autowired
    WeaponTestDao dao;

    @Transactional
    public void saveWeaponTest() {
        WeaponTest weaponTest = new WeaponTest();
        weaponTest.setWeaponDamage(23.0);
        weaponTest.setWeaponName("asd");
        dao.save(weaponTest);
    }

}
