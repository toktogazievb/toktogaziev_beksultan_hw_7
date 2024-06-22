public class Warrior extends Hero {

    public Warrior(int health, int damage, String ability) {
        super(health, damage, ability);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior used a super attack!");;
    }
}
