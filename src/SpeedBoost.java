/**

  * This class adds the SpeedBost on top of the existing hero
  *
  * @author Ivan Torriani
  * @version 1.0
  *
  */

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
        super.showInfo(); //get existing showInfo content

        System.out.println("  + speed bost added"); //add speed effect
    }
}
