package wrappers.strings;

/**
 * Created by Subhi on 13-Apr-16.
 */
public class StringWrapper {
    private String string;

    public StringWrapper(String value ) {
        this.string = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == String.class) {
            obj = new StringWrapper((String) obj);
        }
        StringWrapper ws = (StringWrapper)obj;
        return this.string.equals(ws.string);
    }
    @Override
    public int hashCode() {
        return this.string.hashCode();
    }
}
