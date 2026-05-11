public abstract class HeroDecorator implements Hero {
    protected Hero decoratedHero;

    public HeroDecorator(Hero hero) {
        this.decoratedHero = hero;
    }

    @Override
    public void showInfo() {
        decoratedHero.showInfo();
    }
}
