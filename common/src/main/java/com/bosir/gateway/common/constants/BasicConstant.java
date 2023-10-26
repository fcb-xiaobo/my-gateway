package com.bosir.gateway.common.constants;

import java.util.regex.Pattern;

/**
 * 基础常量类
 */
public class BasicConstant {
    String DEFAULT_CHARSET = "UTF-8";

    String PATH_SEPARATOR = "/";

    String PATH_PATTERN = "/**";

    String QUESTION_SEPARATOR = "?";

    String ASTERISK_SEPARATOR = "*";

    String AND_SEPARATOR = "&";

    String EQUAL_SEPARATOR = "=";

    String BLANK_SEPARATOR_1 = "";

    String BLANK_SEPARATOR_2 = " ";

    String COMMA_SEPARATOR = ",";

    String SEMICOLON_SEPARATOR = ";";

    String DOLLAR_SEPARATOR = "$";

    String PIPELINE_SEPARATOR = "|";

    String BAR_SEPARATOR = "-";
    String COLON_SEPARATOR = ":";

    String DIT_SEPARATOR = ".";

    String HTTP_PREFIX_SEPARATOR = "http://";

    String HTTPS_PREFIX_SEPARATOR = "https://";

    String HTTP_FORWARD_SEPARATOR = "X-Forward-For";

    Pattern param_pattern = Pattern.compile("\\{(.*?)\\}");

    String date_format = "yyyy-MM-dd HH:mm:ss";

    String enable = "Y";

    String DISABLE = "N";


}
