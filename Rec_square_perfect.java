public class Rec_square_perfect {
  public static void main(String[] args) {
    int num = (Integer.parseInt(args[0]) >= 0) ? Integer.parseInt(args[0]) : 0;

    boolean result = isSquarePerfectRecursive(num, 0);

    System.out.println(result);
  }

  public static boolean isSquarePerfectRecursive(int x, int init) {
    int square = init * init;

    if (square == x){
      return true;
    } else if (square > x) {
      return false;
    } else {
      return isSquarePerfectRecursive(x, init + 1);
    }    
  }
}
