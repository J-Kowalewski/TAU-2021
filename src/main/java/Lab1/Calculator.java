package Lab1;

public class Calculator {
    public int power(int x, int y) throws Exception {
        if(x<0||y<0){
            throw new Exception("X or Y < 0");
        }
        for(int i=0;i<y;i++){
            x=x*x;
        }
        return x;
    }
}
