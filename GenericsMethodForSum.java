public class GenericsMethodForSum<E extends Number> {
    E result;

    public void sum(E a, E b) {
        if (a instanceof Integer) {
            result = (E) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Float) {
            result = (E) Float.valueOf(a.floatValue() + b.floatValue());
        } else {
            throw new IllegalArgumentException("Unsupported type for summation");
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        GenericsMethodForSum<Integer> g = new GenericsMethodForSum<>();
        GenericsMethodForSum<Float> g1 = new GenericsMethodForSum<>();

        Integer a = new Integer(5);
        Integer b = new Integer(6);
        g.sum(a, b);

        Float c = new Float(5.4);
        Float d = new Float(6.5);
        g1.sum(c, d);
    }
}

