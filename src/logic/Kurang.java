package logic;

public class Kurang {

    public double min;
    

    public Kurang (double x, double y){
        this.min = proses(x, y);
    }

    public Kurang(int x, int y){
        this.min = proses(x, y);
    }
    public Kurang (String x){
        this.min = proses(x);
    }

    double proses (int x, int y){
        return (double) (x-y);
    }

    double proses (double x, double y){
        return x-y;
    }
    double proses (String x){
        var arr = x.split(" ");
        return Double.parseDouble(arr[0])- Double.parseDouble(arr[1]);
    }
}