import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Tests_DELETE {

    @Test
    public void Test_1(){


                given().delete("https://reqres.in/api/users/2").
                then().statusCode(204).log().all();

        // contentType(ContentType.JSON).
        //                accept(ContentType.JSON).
        // üstteki iki alanı sor!!
        //put için put koyduk, post için post koyduğumuz gibi. onun dışında fark yok valla, ha bir de url olabilir
    }
}
