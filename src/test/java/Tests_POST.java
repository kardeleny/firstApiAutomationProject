import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Tests_POST {

    @Test
    public void Test_1(){

        JSONObject request = new JSONObject();

        request.put("name", "kardo");
        request.put("job", "QA");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().post("https://reqres.in/api/users").
        then().statusCode(201).log().all();
    }
}
