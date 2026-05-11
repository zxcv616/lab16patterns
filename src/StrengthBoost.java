/**

  * This class adds the StrengthBoost on top of the existing hero
  *
  * @author Ivan Torriani
  * @version 1.0
  *
  */
 
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
