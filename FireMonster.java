class FireMonster extends Monster {

    // TODO : add constructor and initialize type to "air"
    
    public FireMonster(String name, int attack) {
        super(name, attack, "fire");

    }

    @Override
    public boolean attack(Monster opponent) {
        // TODO Auto-generated method stub
         // TODO : create an attack method which deals x2 damage to "air"
         int damage;
         if("air".equals(opponent.getType())){
            damage = this.getAttack()*2;
         }
         else {
            damage = this.getAttack();
         }
         opponent.setLife(opponent.getLife()-damage);
         
        return opponent.isKO();
    }
}