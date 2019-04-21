package com.pompey.upms.common.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * web辅助工具类
 * @author PompeyXu
 * @date 2019-04-21 00:21
 *
 */
public class WebUtil {
	private static final Logger logger = LoggerFactory.getLogger(WebUtil.class);
	
	private static final String UNKNOWN = "unknown";
	private static final String IP_DELIMITER = ",";
	private static final String LOCAL_IPV4 = "127.0.0.1";
	private static final String LOCAL_IPV6 = "0:0:0:0:0:0:0:1";
	
	/**
	 * 获取客户端IP
	 * @param request
	 * @return
	 * @throws
	 */
    public static final String getHost(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if (StringUtils.isEmpty(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isEmpty(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isEmpty(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (StringUtils.isEmpty(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (StringUtils.isEmpty(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }
        if (StringUtils.isEmpty(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip != null && ip.indexOf(IP_DELIMITER) > 0) {
            logger.info(ip);
            // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
            String[] ips = ip.split(",");
            for (String ip2 : ips) {
                String strIp = ip2;
                if (!"unknown".equalsIgnoreCase(strIp)) {
                    ip = strIp;
                    break;
                }
            }
        }
        if (LOCAL_IPV4.equals(ip) || LOCAL_IPV6.equals(ip)) {
            InetAddress inet = null;
            try { // 根据网卡取本机配置的IP
                inet = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                logger.error("getCurrentIP", e);
            }
            if (inet != null) {
                ip = inet.getHostAddress();
            }
        }
        logger.info("getRemoteAddr ip: " + ip);
        return ip;
    }
}
