public class Magic extends Hero {

    public Magic(int health, int damage, String ability) {
        super(health, damage, ability);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic used a buff for attacks!");;
    }
}
