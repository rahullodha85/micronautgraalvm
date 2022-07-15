//package example.micronaut;
//import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
//import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.oracle.svm.core.annotate.Inject;
//import io.micronaut.function.aws.MicronautRequestHandler;
//
//public class FunctionRequestHandler extends MicronautRequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
//    @Inject
//    ObjectMapper objectMapper;
//
//    @Override
//    public APIGatewayProxyResponseEvent execute(APIGatewayProxyRequestEvent input) {
//        return null;
//    }
//}
