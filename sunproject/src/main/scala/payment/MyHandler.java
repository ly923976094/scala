package payment;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

/**
 * Created by yodo1 on 17/4/9.
 */
class MyHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod();
        if (requestMethod.equalsIgnoreCase("POST")) {
            System.out.println("POST");
            /**
             *  request
             */
            // System.out.println(jsonObject.toString());
            InputStream reqBody = exchange.getRequestBody();
            BufferedReader reader = new BufferedReader(new InputStreamReader(reqBody));
            String temp = null;
            String result = "";
            while ((temp = reader.readLine()) != null) {
                // result += temp;
                temp = new String(temp.getBytes(), "utf-8");
                result += temp;
                //        System.out.println(temp);
            }
            // System.out.println(result);
            JSONObject reqJson1 = null;  //第一层
            JSONObject reqJson2 = null;  //第二层
            try {
                reqJson1 = new JSONObject(result);
                reqJson2 = new JSONObject(new String(reqJson1.getString("data").getBytes(),"utf-8"));
                // System.out.println(reqJson1.getString("data"));
                System.out.println("uid:" + reqJson2.getString("uid") + " orderid:" + reqJson2.getString("orderid")+ " item_code:" + reqJson2.getString("item_code"));
            } catch (JSONException e) {
                e.printStackTrace();
            }


            reader.close();
            reqBody.close();
            //   System.out.println();

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