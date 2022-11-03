package EE7_1;

import java.util.TreeMap;

public interface DataElement {
    public TreeMap access(DataElementsVisitor vis);
}