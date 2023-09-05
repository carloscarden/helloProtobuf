package com.example;

import io.grpc.Metadata;

public class Constants {
    public static final String JWT_SIGNING_KEY = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIyIiwianRpIjoiZThiODRjYzk0OGMwMWI4ZjgzN2MwNTQxZDgwYjVhZTg1MTI4NzJhM2Y4NzI5OThkMTg1NGM1ZTEzMGFiYTVkZjZkZDZkNDgyOGM0MGMyZTQiLCJpYXQiOjE2OTE2NzU2NzYsIm5iZiI6MTY5MTY3NTY3NiwiZXhwIjoxNjkxNjc5Mjc2LCJzdWIiOiIzMzY1MjI4My1iZTNlLTQ4MzItOTc2ZC0yYmE4OWQ4NTc2ZGUiLCJzY29wZXMiOltdLCJwcm92aW5jaWFfaWQiOjF9.foBQc4Jc9NR0ALMg3kRQXPV7bu6_ozchBfsn19uKcfib72UNzgfMKFsej9cdL4rYUEhO58nmuH_bxSzvL6nh7UaKSKzleFvnCkc7CuU_sSy5Q-PNvH777KRTOojfKBx-of51exKPLevCSm2txY88uIoXw4Zv_sEJ3BhDgacAuomm1lXmFZbKCyCv6wHpDcUjeXuxcWzJQOmpmRncIkHN0JsYDGDkfcJykVK5E-icG7eLyoUddC0n6rHhp4J6iOe5onaer0fMYA7gE_WfUYlA-FOj_QAhcylKbqvpryqRozZNN88YEWqEPUPDTr624FSikzs4DF1DcmRkpuz4AeAN1bvb_EcACUjmNct8ye556uUv43RDusY8hsruomFkeFlMKPfTHghRPMyN9FoBxSA4LanEXl1MD6Pf3qv7bCn0FlgvftyX9nmNVNBzaGg07SEBMAKRtUGdimHEZHRBJXaT1sN9AiZy1inxgU1MTh6KYFMpgBgu4XfRixe65pEmfgQpaVBa-L0bzN-kfTHCT9ujlBBfcA1ZIGw6TAI_nkbb-EWZ3_H35Yzn934s1DvpFnCf2X4tkH6dNthndvr2omirGPTXHlKsPtSwJ5I5Ly5L-M9SFkkiMzdFt12um5cCXjQDNZTlMBfX2blGC_X4zhURYXVk6AfB50VQS5uqPppnKsY";
    public static final String BEARER_TYPE = "";

    public static final String HOST = "titulos-app-stg.educacion.gob.ar";

    public static final Metadata.Key<String> AUTHORIZATION_METADATA_KEY = 
                Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);

    private Constants() {
        throw new AssertionError();
    }

}
