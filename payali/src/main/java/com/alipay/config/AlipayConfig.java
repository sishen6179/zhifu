﻿package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092300574192";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC1TTuKJ6bf6n9FS3rcQuNhSc716NxiKHpII3zI0QDaBywqDChsiVz/G/8UaW9glsRx4Muko19IyI4qPMRIufRaALhTgDbTGxpvF4ziB+YkvJBC+eLckllfRsWBH3E9POsys4egXOJLoYSor3xKPntsHCeI4XaGsZOInA35r2ikoEz3tHzgiN5Svcwwfdikle8sWd4q5fPtghlfniqk3mJ/PP4T5+qRqePcI+IuTWP1dcEfiDHaF0XZKCj1Bpaw5MPZUfQOY8Lfd/ShNHP66nSZyzdVAo5GZXd4EbykFbzjA2MzRI0JgJkEdmXF2MY0398WgOVQ58FzPzqLVqQcQFnHAgMBAAECggEAYislmBMMWqZAr6bFKcrWD/HFLIYf/s5oF/OPN7VjvqqvkTzwDoT6Y/Am2EiW1DgOupK78bO8fk6KG/i3V6HI24sUQ7Ji/T/pukmIMUORrEal3n4sBr7/wYUyoE4EJOJ9gACR6ZUhu04D5MrQg+r9LXa5OXbLlPdGKWxGbPI7uRdhVyXdnB/Ib5rwpdP4ziASL+84BzoNBZzr2FnsryOkAzNlUUv1oQO0toJxeJT0K5h0atv5o9WijhL49ox1+Fh23B37Au80lAjz2YkWcchGbbN1m2h7TyGcWsgweJj5y+xQNeMk7IM/ettxPlAVr3X5fiGZKGf8IU11ikdBgC02oQKBgQDonfdSMlcFZmhqI7bKl6CcafUzB03qpcHTEktZB2iO9rd6SS5lthgv2O1Jdvrb6vaqoW0k1QLauRAevOU0ikhQns8IsBQPVxZlXBPyV3JZlFzbCuYpVmnFmrbVung+voB59ZXsa5g/l9gQ1ix7dz7Bewkr1+wP4hA3GB5wkLl36QKBgQDHhr8NJVyffSPDNDv6BgbDxo2HjkpAfC8D4TboOxnHxKmjrFvFqYlwEYg7STP+8KamY+azn7oJiPJ9fWPZueQttYybZoxcb12t5cr9jmnG3I6GqK/yUoknHrm3Gy4eUXu9QyQCdQRL/ailsVkR6Ub2ErzpuHWJPtDc/H+UUbjmLwKBgQCe7Y5UcmBSKC2eltgEgqQRObN1McBiWO2cMBuasB0X0Ch7PBSfGVJdHnDAiLHMHzR4T+IqD/7rQRVqatSOmQvfSSFaZjLOaEm85rQaFvThjyQB4+hsxcVuZM4WKFiPRcixisDrzncuu6e7mRi7IjWWK2GQuu1lzKYXfjsN3VNaQQKBgH7TvfljOF8AsozQVRd2YTJssWXrInOe/Fug+r/fYWHENnidhLA+NeiQnGHjBDQXUDcP5YNkEmMhM9Jks+Wf7dTIRBo7sxjGiWuSV9eYgNAxPj+GVmDX6ep981ra4hPPg7IoTWlqbFLJaDv6YT2rZLnh60c9Qyj8TtNJhOcIk1ltAoGBALA8SR29YTAQJU9B1W9Gdt9LgjCs7YdYvEhAMRXxvpTTCS5KkgewdqO7Pvf8b+PDzIZK+egICEZk8KvurcYIqtOaCzr/glE51LXXlRs8YtYX2QzpsKgjSDIRvR5sF1CEfUhl/mXTUOFQ1dj5Xit5XScIYEJxZu1GbZSBoHV23Mv5";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu7x4oLozmilsYmGLdiE9SUaycOCxUE1Pjg4f90/SnfDW3pGh+2prMAiZUHbslyiUm2JAPKeXrK0P42UQ6v0pBW+Kmp+E51CbamiFx1hlRHscQK+8LppbHEDKYkrYBWV0wuyR8lZFTlaY7w2z0bRhGPWbJ5TtFi6V/T9t2qVzZibTBcrJCxboWmN7GBz6jX9F/liPxgC3KZtquSLH19fwf8K//C6r728InPokUbKah7HiDfuzBOVKcPLvu6Qv3+VErUfyVQT64PL8iOx68aeYd08vhcpRp8cgrATfmZBcwgAz4uNh9VpAg2yv+G0SMTtqiaubRhzhJM8fiEOG2I61bQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	//public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	public static String notify_url = "http://www.baidu.com";

	
	
	
	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	//public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	
	public static String return_url = "http://dangdang.com";

	
	
	
	
	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

