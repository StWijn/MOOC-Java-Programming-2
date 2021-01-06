public class Hideout<T> {
    private T willekeurigObject;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        willekeurigObject = toHide;
    }

    public T takeFromHideout() {
        if (willekeurigObject != null) {
            T t2 = willekeurigObject;
            willekeurigObject = null;
            return t2;
        }
        return null;
    }

    public boolean isInHideout() {
        if (willekeurigObject != null) {
            return true;
        }
        return false;
    }

}
