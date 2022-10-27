package logic;

public class Bagi {

    public double divide;
    

    public Bagi (double x, double y){
        this.divide = proses(x, y);
    }

    public Bagi(int x, int y){
        this.divide = proses(x, y);
    }
    public Bagi (String x){
        this.divide = proses(x);
    }

    double proses (int x, int y){
        return (double) (x/y);
    }

    double proses (double x, double y){
        return x/y;
    }
    double proses (String x){
        var arr = x.split(" ");
        return Double.parseDouble(arr[0])/ Double.parseDouble(arr[1]);
    }

}
