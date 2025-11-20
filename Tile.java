public class Tile {
    private String value;
    private boolean showing;
    private boolean matched;

    public Tile(String v) {
        this.value = v;
        this.showing = false;
        this.matched = false;
    }

    public String getValue() {
        return value;
    }

    public boolean isShowing() {
        return showing;
    }

    public void setShowing(boolean show) {
        this.showing = show;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean m) {
        this.matched = m;
    }
}
