package com.cme.common;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.text.StringEscapeUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 编码类
 * create by dracula on 2020-12-09
 */
public class EncodeUtils {
    private static final String DEFAULT_URL_ENCODING = "UTF-8";
    /**
     * Hex编码.
     */
    public static String hexEncode(byte[] input) {
        return Hex.encodeHexString(input);
    }

    /**
     * Hex解码.
     */
    public static byte[] hexDecode(String input) {
        try {
            return Hex.decodeHex(input.toCharArray());
        } catch (DecoderException e) {
            throw new IllegalStateException("Hex Decoder exception", e);
        }
    }

    /**
     * Base64编码.
     */
    public static String base64Encode(byte[] input) {
        return Base64.encodeBase64String(input);
    }

    /**
     * Base64编码, URL安全(对URL不支持的字符如+,/,=转为其他字符, 见RFC354 8) .
     */
    public static String base64UrlEncode(byte[] input) {
        return Base64.encodeBase64URLSafeString(input);
    }

    /**
     * Base64解码.
     */
    public static byte[] base64Decode(String input) {
        return Base64.decodeBase64(input);
    }

    /**
     * URL 编码, Encode默认为UTF-8.
     */
    public static String urlEncode(String input) {
        return urlEncode(input, DEFAULT_URL_ENCODING);
    }

    /**
     * URL 编码.
     */
    public static String urlEncode(String input, String encoding) {
        try {
            return URLEncoder.encode(input, encoding);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("Unsupported Encoding Exception", e);
        }
    }

    /**
     * URL 解码, Encode默认为UTF-8.
     */
    public static String urlDecode(String input) {
        return urlDecode(input, DEFAULT_URL_ENCODING);
    }

    /**
     * URL 解码.
     */
    public static String urlDecode(String input, String encoding) {
        try {
            return URLDecoder.decode(input, encoding);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("Unsupported Encoding Exception", e);
        }
    }

    /**
     * Html转码.
     */
    public static String htmlEscape3(String html) {
        return StringEscapeUtils.escapeHtml3(html);
    }

    public static String htmlEscape4(String html) {
        return StringEscapeUtils.escapeHtml4(html);
    }

    /**
     * Html 反转码.
     */
    public static String htmlUnescape3(String htmlEscaped) {
        return StringEscapeUtils.unescapeHtml3(htmlEscaped);
    }

    public static String htmlUnescape4(String htmlEscaped) {
        return StringEscapeUtils.unescapeHtml4(htmlEscaped);
    }

    /**
     * Xml转码.
     */
    public static String xmlEscape(String xml) {
        //return StringEscapeUtils.escapeXml10(xml);
        return StringEscapeUtils.escapeXml11(xml);
    }

    /**
     * Xml 反转码.
     */
    public static String xtmlUnescape(String xmlEscaped) {
        return StringEscapeUtils.unescapeXml(xmlEscaped);
    }
}
