package example.micronaut;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

@Controller("/micronaut-api")
public class HomeController {

    @Get(uri = "/index")
//    public Map<String, Object> index(HttpRequest<?> request) {
    public Map<String, Object> index(HttpRequest<?> request, AwsProxyRequest awsProxyRequest) {
        var bamToken = request.getHeaders().get("bamToken");
        System.out.println("Bam Token: " + bamToken);
        var cookie = request.getCookies().get("Cookie_1").getValue();
        System.out.println("Cookie value: " + cookie);
        System.out.println("Api gateway context: " + awsProxyRequest);
        var principalId = awsProxyRequest.getRequestContext().getAuthorizer().getPrincipalId();
        System.out.println("Authorizer principalId: " + principalId);
        var myContextValue = awsProxyRequest.getRequestContext().getAuthorizer().getContextValue("test");
        System.out.println("Authorizer context value : " + myContextValue);
        return Collections.singletonMap("message", "Hello World");
    }
}
