public class StrengthBoost extends HeroDecorator {
    /*
    very similiar to SpeedBost structure. Comments are there.
    */
    public StrengthBoost(Hero hero) {

        super(hero);
    }

    @Override
    public void showInfo() {

        super.showInfo();

        System.out.println("  + Strength Boost applied!");
    }
}
