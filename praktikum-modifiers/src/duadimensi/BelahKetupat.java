package duadimensi;

public class BelahKetupat {
    Double diagonal1;
    Double diagonal2;
    final Double seperdua = 0.5;

    public BelahKetupat(Double d1, Double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public Double luas() {
        return seperdua * diagonal1 * diagonal2;
    }
}
// L=0.5 * d1 * d2