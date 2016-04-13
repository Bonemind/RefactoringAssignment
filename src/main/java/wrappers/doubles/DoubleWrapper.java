package wrappers.doubles;

/**
 * Created by Subhi on 13-Apr-16.
 */
public class DoubleWrapper {
    private double doubleValue;

    public DoubleWrapper(double value ) {
        this.doubleValue = value;
    }

    public double getValue() {
        return this.doubleValue;
    }

    public void add(DoubleWrapper doubleWrapper) {
        this.doubleValue += doubleWrapper.getValue();
    }

    public void add(double value) {
        this.doubleValue += value;
    }

    @Override
    public boolean equals(Object obj) {
        DoubleWrapper doubleWrapper = (DoubleWrapper) obj;
        return this.doubleValue == doubleWrapper.doubleValue;
    }
    @Override
    public int hashCode() {
        return Double.valueOf(this.doubleValue).hashCode();
    }
}

