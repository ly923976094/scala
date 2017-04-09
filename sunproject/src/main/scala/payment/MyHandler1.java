package payment;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by yodo1 on 17/4/9.
 */
class MyHandler1 implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod();
        if (requestMethod.equalsIgnoreCase("POST")) {

            /**
             *   response
             */
            Headers responseHeaders = exchange.getResponseHeaders();
            responseHeaders.set("Content-Type", "application/json;charset=utf-8");
            //         responseHeaders.set("Content-Type", "text/plain");
            exchange.sendResponseHeaders(200, 0);
            JSONObject resJson = null;
            try {
                resJson = new JSONObject("{'ok1':'11','ok':'1'}");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            OutputStream responseBody = exchange.getResponseBody();
            responseBody.write(resJson.toString().getBytes());
            responseBody.close();
        }
    }
}