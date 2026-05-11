public abstract class HeroDecorator implements Hero {

    protected Hero heroReference; //reference to an hero

    public HeroDecorator(Hero hero) { //constructor

        this.heroReference = hero;
        //assign hero as a reference so it can 
        //be updated during runtime

    }

    @Override
    public void showInfo() { //override hero showInfo

        heroReference.showInfo();

    }
}
