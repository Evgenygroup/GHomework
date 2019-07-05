public class Tree extends Plant {

    private static int GROW = 2;

    public Tree(String displayName, int height, int age) {
        super(displayName, height, age);
    }

    @Override
    protected void doSummer() {
        setHeight(getHeight() + growRate());
        System.out.println(getDisplayName() + " has grown in Summer.It's height=" + getHeight());
    }

    @Override
    protected void doAutumn() {
        System.out.println(getDisplayName() + " does not grow in Autumn.It's height=" + getHeight());
    }

    @Override
    protected int growRate() {
        return GROW;
    }

}