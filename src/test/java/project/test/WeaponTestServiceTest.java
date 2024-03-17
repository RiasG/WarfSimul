package project.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class WeaponTestServiceTest {
    @Autowired
    private WeaponTestService wts;

    @Test
    public void testSave() {
        wts.saveWeaponTest();

    }
}