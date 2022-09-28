package org.example.application.demo;

import org.example.server.Application;
import org.example.server.Request;
import org.example.server.Response;

public class DemoApp  implements Application{

    @Override
    public Response handle(Request request){
        Response response = new Response();
        response.setStatus(200);
        response.setMessage("ok");
        return response;
    }
}
