public class Flower extends Plant {
    private static int GROW = 10;

    public Flower(String displayName, int height, int age) {
        super(displayName, height, age);
    }


    @Override
    protected void doSummer() {
        System.out.println(getDisplayName() + " does not grow in Summer.It's height =" + getHeight());
    }

    @Override
    protected void doAutumn() {
        setHeight(0);
        System.out.println(getDisplayName() + " is cut  in Autumn.It's height =0");
    }

    @Override
    protected int growRate() {
        return GROW;
    }
}