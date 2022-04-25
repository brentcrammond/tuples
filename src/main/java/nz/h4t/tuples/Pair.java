package nz.h4t.tuples;

public record Pair<T1, T2>(T1 t1, T2 t2) {
    public T1 left() {
        return t1;
    }

    public T2 right() {
        return t2;
    }

    public T1 car() {
        return t1;
    }

    public T2 cdr() {
        return t2;
    }
}
