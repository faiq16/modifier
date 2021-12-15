package duadimensi;

public class Trapesium {
    Double AB;
    Double CD;
    Double tinggi;
    final Double dua = 2.0;

public Trapesium (Double AB, Double CD, Double tinggi) {
    this.AB = AB;
    this.CD = CD;
    this.tinggi = tinggi;
}
    
public Double luas() {
    return ((AB + CD) * tinggi) / dua;
}

}
// ((AB + CD) * t) / 2 