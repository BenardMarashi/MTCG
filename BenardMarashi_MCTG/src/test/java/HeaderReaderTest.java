package test.java;

import org.junit.jupiter.api.Test;
import server.HeaderReader;

import static org.assertj.core.api.Assertions.assertThat;

class HeaderReaderTest {

    private HeaderReader classUnderTest = new HeaderReader();

    @Test
    void testIngestContentType() {
        // AAA, Arrange, Act, Assert
        // given, when, then
        classUnderTest.ingest("Content-Type: application/json");

        assertThat(classUnderTest.getHeader("Content-Type"))
                .isEqualTo("application/json");
    }

    @Test
    void testIngestHost() {
        classUnderTest.ingest("Host: localhost:8080");

        assertThat(classUnderTest.getHeader("Host"))
                .isEqualTo("localhost:8080");
    }

    @Test
    void testIngestContentLength() {
        classUnderTest.ingest("Content-Length: 44");

        assertThat(classUnderTest.getHeader("Content-Length"))
                .isEqualTo("44");
        assertThat(classUnderTest.getContentLength())
                .isEqualTo(44);
    }

    @Test
    void testIngestNoContentLength() {
        assertThat(classUnderTest.getHeader("Content-Length"))
                .isNull();
        assertThat(classUnderTest.getContentLength())
                .isZero();
    }

}

