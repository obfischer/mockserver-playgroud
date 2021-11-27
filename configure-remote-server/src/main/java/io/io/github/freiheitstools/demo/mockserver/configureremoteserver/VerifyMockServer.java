package io.io.github.freiheitstools.demo.mockserver.configureremoteserver;

import org.mockserver.client.MockServerClient;
import org.mockserver.model.MediaType;
import org.mockserver.verify.VerificationTimes;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class VerifyMockServer {
    public static void main(String[] args) {
        new MockServerClient("localhost", 1080)
                .verify(
                        request()
                                .withPath("/ships/NCC-74656/name"),
                        VerificationTimes.exactly(1)
                );
    }
}
