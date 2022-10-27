package logic;

public class Kali {
    public double multiple;

    public Kali (double x, double y){
        this.multiple = proses(x,y);
    }
    public Kali (int x, int y){
        this.multiple = proses(x,y);
    }
    public Kali (String x){
        this.multiple = proses(x);
    }
    double proses(int x, int y){
        return (double) x*y;
    }
    double proses(double x, double y){
        return x*y;
    }
    double proses(String x){
        var arr = x.split(" ");
        return Double.parseDouble(arr[0])* Double.parseDouble(arr[1]);
    }
}