import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Tests_PUT {

    @Test
    public void Test_1(){

        JSONObject request = new JSONObject();

        request.put("name","yokput");
        request.put("job", "QA");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().put("https://reqres.in/api/users/2").
                then().statusCode(200).log().all();

        // contentType(ContentType.JSON).
        //                accept(ContentType.JSON).
        // üstteki iki alanı sor!!
        //put için put koyduk, post için post koyduğumuz gibi. onun dışında fark yok valla, ha bir de url olabilir
    }
}
