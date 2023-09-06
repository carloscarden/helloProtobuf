package com.example;

import io.grpc.Metadata;

public class Constants {
    public static final String JWT_SIGNING_KEY = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIyIiwianRpIjoiNTliZjBkMmQ5YmQ3OWIwNWM1NWIxNmM4YWFlZjYxMjkzNDc3YmRhNjM5ZTU5YmJmMzY3YWJmZjQ1M2Y3NDc1ZjhkODQxMGZkMzhjYjcyN2UiLCJpYXQiOjE2OTQwMjcwOTUsIm5iZiI6MTY5NDAyNzA5NSwiZXhwIjoxNjk0MDMwNjk1LCJzdWIiOiIzMzY1MjI4My1iZTNlLTQ4MzItOTc2ZC0yYmE4OWQ4NTc2ZGUiLCJzY29wZXMiOltdLCJwcm92aW5jaWFfaWQiOjF9.A7BUekyrcFgpLG9RZWTOxGeZ5EMXpBZmt57yjapZeokYy1bZTGF6qUJTPHcJjfKdzsicZ2GweCY1E5m-LoCwwl22cHuYjfzSf8LJ4dhhTcfvy9GlIqcvd0WMu2xCWyAr50s2R1Cs-pJfMT5yM2_06DSP4Rl914Y91LzBGCZD9ILR3joKoN_a4DmMENlYQrubEVLi7z3GKatCDptNEUmePA_5KFFBPCnskooiETlcDIZ3yNSuvCGa3DXeBscWyqUr-Yf71RGOSPhTFyvvksK9x6dqchqIAwo_gQ0snaWFmVT3rfxifkPeL9G6fR33vf7WwL_WDHt0dXv3CHgrkXmE0P5Z326gMITIwjsMs8hzvXn3xxN5MuCtbMWO0VLQKjwxFGvoeBdZ9oefgSKlmf6_uVWmEYu7m-l3XyW20mP6GWSEz0wtpDYyDTvUUkTpKhzB8riVerGuHy3HEiWb2BOHmN1QN0MfVQwMEFbQZEi3TRZbdm1LCNSghwY3Zm1ORZHIhdAhb15qzqhV38LELb4T6jxh5bXbSBdbR-KAkys3XoLiTti5kotebC_pSG8ZALiZQl0Vb9bqGJBC9bltgAM_U52HDbpxx7ipGdGNm8O58bq_pISuMn_cFs4AVO_jI7_ZsqMI_FlAN1ibfdL8SvUKAsfWOkDIBml2mjG5BWzK4ro";
    public static final String BEARER_TYPE = "";

    public static final String HOST = "titulos-app-stg.educacion.gob.ar";

    public static final Metadata.Key<String> AUTHORIZATION_METADATA_KEY = 
                Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);

    private Constants() {
        throw new AssertionError();
    }

}
