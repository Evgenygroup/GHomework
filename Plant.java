public abstract class Plant {

    private String displayName;
    private int height;
    private int age;

    public Plant(String displayName, int height, int age) {
        this.displayName = displayName;
        this.height = height;
        this.age = age;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public void doYear() {
        doSpring();
        doSummer();
        doAutumn();
        doWinter();
        this.age++;
        System.out.println("age of the " + getDisplayName() + " is now " + getAge());

    }

    private void doSpring() {

        setHeight(getHeight() + growRate());
        System.out.println(getDisplayName() + " has grown in Spring. It's height= " + getHeight());
    }


    private void doWinter() {
        System.out.println(getDisplayName() + " does not grow in Winter. It's height=" + getHeight());
    }

    protected abstract void doSummer();

    protected abstract void doAutumn();

    protected abstract int growRate();


}
