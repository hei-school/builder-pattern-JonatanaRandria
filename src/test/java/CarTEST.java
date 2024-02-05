import org.example.Builder.CarBuilder;
import org.example.Class.Builder;
import org.example.Director.Director;

public class CarTEST {
    Director director = new Director();
    CarBuilder builder = new CarBuilder();


    public void  getCar(Builder builder){
        System.out.println(builder);
    }


}
