public abstract class Observer {
    protected Subject subject;
    public boolean isActive;

    public abstract void update();

    public void changeState(boolean cond) {
        this.isActive = cond;
    }

}