package pl.kamilprzenioslo.immutability;

public class Class {
    private final String immutable;
    private String mutable;

    public Class(String immutable, String mutable) {
        this.immutable = immutable;
        this.mutable = mutable;
    }

    public String getImmutable() {
        return immutable;
    }

    public String getMutable() {
        return mutable;
    }

    public void setMutable(String mutable) {
        this.mutable = mutable;
    }
}
