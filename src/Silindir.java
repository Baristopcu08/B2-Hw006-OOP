public class Silindir extends Daire {
    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        setYukseklik(yukseklik);
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik < 0) yukseklik = 0;
        this.yukseklik = yukseklik;

    }

    @Override
    public double getAlan() {
        return Math.round((2 * super.getAlan() + 2 * Math.PI*getYaricap()* yukseklik)*100.0)/100.0;

    }

    public double getHacim(){
        return Math.round(super.getAlan()*yukseklik*100.0)/100.0;
    }
}
