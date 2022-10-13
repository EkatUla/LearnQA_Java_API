import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class FirstTest {
    @Test
    public void helloFirst(){
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }
}
