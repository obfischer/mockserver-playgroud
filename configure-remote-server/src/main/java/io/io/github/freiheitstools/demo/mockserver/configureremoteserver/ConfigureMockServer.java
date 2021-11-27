package io.io.github.freiheitstools.demo.mockserver.configureremoteserver;

import org.mockserver.client.MockServerClient;
import org.mockserver.model.MediaType;

import static org.mockserver.model.Cookie.cookie;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.mockserver.model.Parameter.param;

public class ConfigureMockServer {
    public static void main(String[] args) {
        new MockServerClient("localhost", 1080)
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/ships/NCC-74656/name")
                )
                .respond(
                        response()
                                .withContentType(MediaType.TEXT_PLAIN)
                                .withBody("Voyager")
                );
    }
}
