import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

public class ApiTest {

    String url = "https://dog-facts-api.herokuapp.com/api/v1/resources/dogs";

    @Test
    public void GetStatusCodeShouldBeOKTest() throws IOException {
        HttpUriRequest request = new HttpGet("https://dog.ceo/api/breeds/list/all");
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void BadRequestTest() throws IOException {
        HttpUriRequest request = new HttpGet("https://dog.ceo/api/breeds/list/bad");
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_NOT_FOUND);
    }

    @Test
    public void GetResponseShouldExistTest() throws IOException {
        HttpUriRequest request = new HttpGet("https://dog.ceo/api/breeds/list/all");
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        String jsonFromResponse = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(jsonFromResponse);
        assertNotNull(jsonFromResponse);
    }

    @Test
    public void SpecificValueTest() throws IOException {
        String breed = "hound";
        HttpUriRequest request = new HttpGet("https://dog.ceo/api/breed/"+breed+"/list");
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        String jsonFromResponse = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(jsonFromResponse);
        assertNotNull(jsonFromResponse);
    }

    @Test
    public void KeyFromJsonTest() throws IOException {
        String breed = "hound";

        HttpUriRequest request = new HttpGet("https://dog.ceo/api/breed/"+breed+"/list");
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        String jsonFromResponse = EntityUtils.toString(httpResponse.getEntity());

        System.out.println(jsonFromResponse);

        String[] segments = jsonFromResponse.split("\"");
        String key = segments[3];

        System.out.println(key);

        request = new HttpGet("https://dog.ceo/api/breed/hound/"+key+"/images/random");
        httpResponse = HttpClientBuilder.create().build().execute(request);
        jsonFromResponse = EntityUtils.toString(httpResponse.getEntity());

        System.out.println(jsonFromResponse);

        assertNotNull(jsonFromResponse);
    }
}
