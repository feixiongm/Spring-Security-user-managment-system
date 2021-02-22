package com.spring.wiremock;

import com.github.tomakehurst.wiremock.client.WireMock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class MockServer {

    public static void main(String[] args) {
        WireMock.configureFor(8062);
        WireMock.removeAllMappings();

        stubFor(get(urlPathEqualTo("/order/1")).willReturn(aResponse().withBody("{\"id\":1}").withStatus(200)));
    }

}
