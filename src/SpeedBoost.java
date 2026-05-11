public class SpeedBoost extends HeroDecorator {

    public SpeedBoost(Hero hero) {

        super(hero);

    }

    @Override
    public void showInfo() { 
    /*
    Override show info to show that a speed bost
    has been "added"
    */
        super.showInfo();
        System.out.println("  + speed bost added");
    }
}
