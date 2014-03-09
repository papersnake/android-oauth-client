package com.wuman.oauth.samples.stmall;

/**
 * Constants for stmall's 2.0 implementation.
 * 
 * @author David Wu
 */
public class stmallConstants {

    public static final String CLIENT_ID = "1000000001";

    public static final String CLIENT_SECRET = "2000000002";

    public static final String AUTHORIZATION_CODE_SERVER_URL = "http://stmall.sinaapp.com/Api/Oauth/authorize";

    public static final String AUTHORIZATION_IMPLICIT_SERVER_URL = "http://stmall.sinaapp.com/Api/Oauth/authorize";

    public static final String TOKEN_SERVER_URL = "http://stmall.sinaapp.com/Api/Oauth/access_token";

    public static final String REDIRECT_URL = "http://localhost/Callback";

    private stmallConstants() {
    }

}