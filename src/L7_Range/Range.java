package L7_Range;


public class Range<T extends Number> {
    private final T top;
    private final T down;

    public Range(T top, T down) {
        this.top = top;
        this.down = down;
    }

    @Override
    public String toString() {
        return "Range{" +
                "top=" + top +
                ", down=" + down +
                '}';
    }

    public T getTop() {
        return top;
    }

    public T getDown() {
        return down;
    }

    public void met() {
        if (down.hashCode() > top.hashCode())
            throw new IllegalArgumentException("Error: нижняя граница должна быть не больше, чем верхняя");
    }
}
