class Arena {

    public static void main(String[] args) {
        
        // TODO : create two monsters
        AirMonster djinn = new AirMonster("Billy", 10);
        FireMonster tartofeu = new FireMonster("tartofeu", 6);

        // TODO : monsters attack each other
        do{
            //this.attack me renvoie un boolean, alors je peux le mettre dans le if
            if(!tartofeu.attack(djinn)){
                djinn.attack(tartofeu);
            }
        }while(!tartofeu.isKO() && !djinn.isKO());

        // ou do{}while (!tartofeu.attack(djinn)&& ! djinn.attack(tartofeu))
        
    }
}