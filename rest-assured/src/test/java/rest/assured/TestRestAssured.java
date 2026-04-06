package rest.assured;

import io.restassured.RestAssured;
import org.junit.Test;

public class TestRestAssured {


    @Test
    public void test1() {
        RestAssured
                .given()
                .when()
                .get("http://novel.hctestedu.com/book/listClickRank")
                .then()
                .log()
                .all();
    }
}
