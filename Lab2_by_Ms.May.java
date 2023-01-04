package week4.lab;

public class Lab2 {
    public static void main(String[] agse){
        drawRectangle(5);
        System.out.println();
        drawRectangle(6, 4);
        System.out.println();
        drawRectangle(7, 3, '#');
        System.out.println();
        drawRectangle(8, 12, '@');  
    }
    public static void drawRectangle(int length ) {
        System.out.println("A Square");
        for (int i = 1; i <= length ;i++ ){
            for(int j = 1; j <= length;j++ ){
                if(i == 1 || i == length || j == 1 || j == length ){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    } 
    public static void drawRectangle(int length, int width ) {
        System.out.println("A Rectangle");
        for (int i = 1; i <= width ;i++ ){
            for(int j = 1; j <= length;j++ ){
                System.out.print("X ");
            }
            System.out.println("  ");
        }
    } 
    public static void drawRectangle(int length, int width,char ch) {
        if( ch == '#'){
            System.out.println("A Parallelogram");
            for (int i = 0; i < width ;i++ ){
                for(int j = 0; j < length+width;j++ ){
                    if(i+j < width-1 || i+j > (width+length)-1){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("# ");
                    }
                }
            System.out.println();
            }
        }
        else{
            drawRectangle(length,width);
        }
    }
}
