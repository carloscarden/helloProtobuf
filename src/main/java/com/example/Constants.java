package com.example;

import io.grpc.Metadata;

public class Constants {
    public static final String JWT_SIGNING_KEY = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIyIiwianRpIjoiZWYzZWQ5NTkwOWFkMjcwOWM3MjdjZmQ5YzQzNjFkMmFkOTE0NmI0ODcyMTdhNjYzODY0MjY3ODM1MTA4MTg3OTZkNjJhYTgyYWQ0OTMzNjUiLCJpYXQiOjE2OTQxODA4NTcsIm5iZiI6MTY5NDE4MDg1NywiZXhwIjoxNjk0MTg0NDU3LCJzdWIiOiIzMzY1MjI4My1iZTNlLTQ4MzItOTc2ZC0yYmE4OWQ4NTc2ZGUiLCJzY29wZXMiOltdLCJwcm92aW5jaWFfaWQiOjF9.mynMdKyalLUPmbwyWQY84zMKijLgt6WjDF8TtWqxjMGWIl8mq20o9OZxTkOFV2CnlTFr7TeO4n23ZBDzrmQycjoLvsq5PgxY0oja9FS8EIeoWBXaATjJOKjG7YzJUgwhRh0SypdRiF_YHwZN9mhZlTdQV8fDGKCUR8cluwJfgbzveTks6R_2sV6aMh2eNx0uXb8Q2k8hfBaKTPWdhum8kUDxQ4xDxGaP6fBzlQ4w8X3jMcuUqHXlpk2EFjyQA1bUNqc9hmv5UAkSyDMNey-P0s2Qt5qC3WJ3c3sULMMglYywjSv0Fquvp5oIG2zJ2-V-2INDkNXXdhgOcNQl5toMN2ltSBQ2mnWX7QexgisrPEcvSF4JZxfeFmu3eycgCB_Dn9OCzgnG9WGiqGW3J582T947FpR4G3AnoHbfSZZ8v2ijhuAEx8iHxB5Xh3BhBmIYuxy340SB9ZQ9gu7pe6_TXWp6aFGJPkhmGU0wRE1w3TJ7x0Baht4Lci4Gzq7yE7n95FyX1yqa2ze9KBovO_FLlEmJsCg__COgaOiBMPFUgRwoanWYgrow4PNUVxkOkQYdShKBc-KI0E2om4TZldIket7at-SsrT_LZETUnofRWzQG338dwVVfBDIdZ6unDnm-p70JKsyEyo1iUWXqT9unwlKsvHeHvy51c8MRgOT43PU";
    public static final String BEARER_TYPE = "";

    public static final String HOST = "titulos-app-stg.educacion.gob.ar";

    public static final Metadata.Key<String> AUTHORIZATION_METADATA_KEY = 
                Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);

    private Constants() {
        throw new AssertionError();
    }

}
