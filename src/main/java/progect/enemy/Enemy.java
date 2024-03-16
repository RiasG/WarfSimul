package progect.enemy;

import progect.AttackEnemyService;
import progect.damage.DamageList;
import progect.weapon.attacks.Attack;

public class Enemy {
   private double hitPoint;
   private EnemyLifeScale enemyLifeScale;
   private int enemyLevel;

   public Enemy() {
   }



   public Enemy(EnemyLifeScale enemyLifeScale, int enemyLevel) {
      this.enemyLifeScale = enemyLifeScale;
      this.enemyLevel = enemyLevel;
   }

   public Enemy(EnemyLifeScale enemyLifeScale) {
      this.enemyLifeScale = enemyLifeScale;
   }

   public EnemyLifeScale enemyLifeCondition() {
      return enemyLifeScale;
   }

   public void setEnemyLifeScale(EnemyLifeScale enemyLifeScale) {
      this.enemyLifeScale = enemyLifeScale;
   }

   public void takeAttack(Attack attack){
      AttackEnemyService.calculateAttack(enemyLifeScale, attack);


//      DamageList damageList = new DamageList();
//      AttackEnemyService attackService = new AttackEnemyService(this.enemyLifeCondition(), attack);
//      attackService.takeAttack();
   }

   public boolean isLife(){
      if (enemyLifeScale.getHealth().getHitPoint() <= 0){
         return false;
      } else return true;
   }


   public EnemyLifeScale getEnemyLifeScale() {
      return enemyLifeScale;
   }
}
