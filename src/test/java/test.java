import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class test {
    @Value("${reggie.path}")
     String basePath;

    @Test
    public void test1(){
        System.out.println(basePath);
    }
}
