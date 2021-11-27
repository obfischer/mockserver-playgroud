package io.io.github.freiheitstools.demo.mockserver.configureremoteserver;

import org.mockserver.client.MockServerClient;
import org.mockserver.verify.VerificationTimes;

import static org.mockserver.model.HttpRequest.request;

public class ResetMockServer {
    public static void main(String[] args) {
        new MockServerClient("localhost", 1080).reset();
    }
}
