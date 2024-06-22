public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic(200, 10, "Buff attacks");
        Warrior warrior = new Warrior(250, 30, "Super attack");
        Medic medic = new Medic(270, 1, "Heal");
        medic.setHealPoints(20);
        Hero[] heroes = {magic, warrior, medic};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic) {
                ((Medic) heroes[i]).increaseExperience();
            }
        }


    }
}