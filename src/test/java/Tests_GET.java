import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Tests_GET {

    @Test
    public void Test_1(){

        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
        log().all();

        // response'u console'a loglamak için .log().all()  yapıyoruz
    }

    @Test
    public void Test_2(){

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
    }


    @Test
    public void Test_3(){

        given().
                get("https://reqres.in/api/users?page=2").
                //                 get("https://reqres.in/api/users").
                then().
                statusCode(200).
               // body("data.id[0]", equalTo(7)).
        body("data.first_name", hasItems("Tobias", "Byron"));
      //        body("data.first_name", hasItem("kardo"));
    }
}


