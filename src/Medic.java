public class Medic extends Hero {
    private double healPoints;

    public Medic(int health, int damage, String ability) {
        super(health, damage, ability);
//        this.healPoints = healPoints;
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used a heal!");
        ;
    }

    public void increaseExperience() {
        healPoints = healPoints+healPoints * 0.1;
        System.out.println(healPoints);
    }
}
