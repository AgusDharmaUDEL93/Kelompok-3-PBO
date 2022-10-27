package logic;

public class Jumlah {

    public double sum;
    

    public Jumlah (double x, double y){
        this.sum = proses(x, y);
    }

    public Jumlah (int x, int y){
        this.sum = proses(x, y);
    }
    public Jumlah (String x){
        this.sum = proses(x);
    }

    double proses (int x, int y){
        return (double) (x+y);
    }

    double proses (double x, double y){
        return x+y;
    }
    double proses (String x){
        var arr = x.split(" ");
        return Double.parseDouble(arr[0]) + Double.parseDouble(arr[1]);
    }

}