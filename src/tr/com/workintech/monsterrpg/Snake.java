package tr.com.workintech.monsterrpg;

public class Snake extends Monster implements Poisonable, Bleedable {
    public Snake(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }
}
