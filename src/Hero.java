public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String ability;

    public Hero(int health, int damage, String ability) {
        this.health = health;
        this.damage = damage;
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void applySuperAbility() {
    }
}
