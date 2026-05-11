public class BasicHero implements Hero {
    private String name;

    public BasicHero(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.print("Hero: " + name);
    }
}
