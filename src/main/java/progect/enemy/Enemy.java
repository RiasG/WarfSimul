package progect.enemy;

import progect.AttackEnemyService;
import progect.damage.DamageList;
import progect.weapon.attacks.Attack;

public class Enemy {
   private EnemyLifeCondition enemyLifeCondition;
   private int enemyLevel;

   public Enemy() {
   }


   public Enemy(EnemyLifeCondition enemyLifeCondition, int enemyLevel) {
      this.enemyLifeCondition = enemyLifeCondition;
      this.enemyLevel = enemyLevel;
   }

   public Enemy(EnemyLifeCondition enemyLifeCondition) {
      this.enemyLifeCondition = enemyLifeCondition;
   }

   public EnemyLifeCondition enemyLifeCondition() {
      return enemyLifeCondition;
   }

   public void setEnemyLifeCondition(EnemyLifeCondition enemyLifeCondition) {
      this.enemyLifeCondition = enemyLifeCondition;
   }

   public void takeAttack(Attack attack){
      DamageList damageList = new DamageList();
      AttackEnemyService attackService = new AttackEnemyService(this.enemyLifeCondition(), attack);
      attackService.takeAttack();
   }

   public boolean isLife(){
      if (enemyLifeCondition.getHealth().getHitPoint() <= 0){
         return false;
      } else return true;
   }

}
