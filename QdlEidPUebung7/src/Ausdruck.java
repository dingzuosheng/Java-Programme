
public interface Ausdruck {
    Ausdruck addiere(Ausdruck ausdruck);
    Ausdruck multipliziere(Ausdruck ausdruck);
    double zuDouble();
    boolean equals(Ausdruck ausdruck);
}
