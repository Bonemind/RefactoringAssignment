package wrappers.ints;

/**
 * Created by Subhi on 13-Apr-16.
 */
public class IntWrapper {
    private int intValue;

    public IntWrapper(int value ) {
        this.intValue = value;
    }

    @Override
    public boolean equals(Object obj) {
        IntWrapper intWrapper = (IntWrapper) obj;
        return this.intValue == intWrapper.intValue;
    }
    @Override
    public int hashCode() {
        return this.intValue;
    }
}

