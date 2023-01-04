package week03.lab;

public class DrawingRectangle {
    public static void main(String[] args){
        drawRectangle(5);
        System.out.println();
        drawRectangle(6, 4);
        System.out.println();
        drawRectangle(7, 3, '#');
        System.out.println();
        drawRectangle(8, 12, '@');
    }
    public static void drawRectangle(int n){
        System.out.println("A Square");
        for(int i = 0; i<n; i ++){
            for(int j = 0; j<n; j ++){
                if( i == 0 || i == n-1 || j == 0 || j == n){
                    System.out.print("0 ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void drawRectangle(int n, int n1){
        System.out.println("A Rectangle");
        for(int i = 0; i<n1; i ++){
            for(int j = 0; j<n; j ++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static void drawRectangle(int n, int n1, char c){
        if(c == '#'){
            System.out.println("A Parallelogram");
            for(int i = 0; i<n1; i++){
                for(int j=n1-1-i; j>0; j--){
                    System.out.print("  ");
                }
                for(int k = 0; k<n; k++){
                    System.out.print(c+" ");
                }
                System.out.println();
            }
        } else {
            drawRectangle(n, n1);
        }
    }
}
