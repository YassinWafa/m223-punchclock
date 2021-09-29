package ch.zli.m223.punchclock.security;

import java.util.Base64;

public class SecurityConstants {
    public static final String unencodedSECRET = "SecurityKeyToGenJWTs";
    public static final String SECRET = Base64.getEncoder().encodeToString(unencodedSECRET.getBytes());

    public static final long EXPIRATION_TIME = 864_000_000;
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users/sign-up";
}
