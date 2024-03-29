package project.service;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class WeaponServiceTest {
    @Autowired
    private WeaponService service;

    @Test
    public void testService() {
        service.saveWeapon();
    }
}