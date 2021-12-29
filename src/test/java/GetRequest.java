import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequest {

    @Test
    void test1(){
     Response response = get("https://reqres.in/api/users?page=2");

        System.out.println(response.asString());
        System.out.println(response.getStatusCode());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    void test2(){
        Response response = get("https://reqres.in/api/users/2");

        System.out.println(response.asString());
        System.out.println(response.getStatusCode());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    void test3(){
        Response response = get("https://reqres.in/api/users/2");

        System.out.println(response.getBody());
        System.out.println(response.getStatusCode());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);

        // hata aldım neden: link https://www.youtube.com/watch?v=JJ7Tp7_fX4c&list=PLhW3qG5bs-L8dDZPP1tpQldU4tzZdPfRv
  //      given().get("https://reqres.in/api/users/2")
    //            .then()
      //          .statusCode(200)
        //        .body("data.id[0]", equalTo(7));

    }
}