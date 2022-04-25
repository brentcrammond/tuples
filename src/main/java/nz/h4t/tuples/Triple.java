package nz.h4t.tuples;

public record Triple<T1, T2, T3>(T1 t1, T2 t2, T3 t3) {
    public T1 left() {
        return t1;
    }

    public T2 middle() {
        return t2;
    }

    public T3 right() {
        return t3;
    }
}
