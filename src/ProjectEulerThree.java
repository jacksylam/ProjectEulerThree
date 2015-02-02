import java.util.ArrayList;

/**
 * Created by Jack on 2/1/2015.
 */
public class ProjectEulerThree {
  public static void main(String[] args) {
    ArrayList<Double> factors = new ArrayList<Double>();
    double divider = 2;
    double num = 600851475143.0;

    while(num > 1){
      while(num % divider == 0){
       factors.add(divider);
        num /= divider;
      }
      divider++;
      if(divider*divider > num){
        if(num > 1){
          factors.add(num);
        }
        break;
      }
    }

    System.out.println(factors.get(factors.size()-1));
  }
}
