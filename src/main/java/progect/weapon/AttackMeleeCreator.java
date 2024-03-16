package progect.weapon;

import progect.weapon.attacks.Attack;

public  interface AttackMeleeCreator extends AttackCreator{
   Attack heavyAttack() ;
   Attack slamLightAttack();
   Attack slamHeavyAttack();
   Attack radialLightAttack();
   Attack heavyRadialAttack();
   Attack slideAttack();
}
