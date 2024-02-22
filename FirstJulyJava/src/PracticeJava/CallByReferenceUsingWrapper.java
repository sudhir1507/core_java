package PracticeJava;

public class CallByReferenceUsingWrapper {
    public static void main(String[] args) {
        int primitiveValue = 10;
        IntegerWrapper wrapper = new IntegerWrapper(20);

        // Passing primitive value
        modifyPrimitive(primitiveValue);
        System.out.println("Primitive value after method call: " + primitiveValue); // Output: 10

        // Passing object reference
        modifyObject(wrapper);
        System.out.println("Object value after method call: " + wrapper.getValue()); // Output: 30
    }

    public static void modifyPrimitive(int value) {
        value = 100;
    }

    public static void modifyObject(IntegerWrapper wrapper) {
        wrapper.setValue(30);
    }
}

class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
