import java.nio.file.OpenOption;

class WaterMonster extends Monster {

    // TODO : add constructor and initialize type to "air"
    
    public WaterMonster(String name, int attack ) {
        super(name, attack, "water");

    }

    @Override
    public boolean attack(Monster opponent) {
        // Auto-generated method stub
         // create an attack method which deals x2 damage to "fire"
         int damage;
         if("fire".equals(opponent.getType())){
            damage = this.getAttack()*2;
         }
         else {
            damage = this.getAttack();
         }
         opponent.setLife(opponent.getLife()-damage);
         
        return opponent.isKO();
    }

   
}