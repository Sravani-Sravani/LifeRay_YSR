package com.kpmg.login.portlet.util;

import com.kpmg.login.constants.CitizenLoginPortletKeys;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import java.util.Random;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class CustomUtil {
	  
	public static int generateOtp() {
		String time = String.valueOf(System.currentTimeMillis()).trim();
		String subString;
		Random rand = new Random();
		subString = String.format("%04d", rand.nextInt(10000));
		// _log.info("otpp : "+subString);
		int otp = Integer.parseInt(subString.trim());
		if (otp > 999 && otp < 10000) {
			return otp;
		} else {
			return generateOtp();
		}
	}
 
	private static final Log _log = LogFactoryUtil.getLog(CustomUtil.class.getName());

	public static String getCharacterDataFromElement(Element e) {
		Node child = e.getFirstChild();
		if (child instanceof CharacterData) {
			CharacterData cd = (CharacterData) child;
			return cd.getData();
		}
		return "?";
	}

	public static String getMaskedMobileNumber(String phoneNumber) {

		if (phoneNumber != null && !phoneNumber.trim().equals("")) {
			if (!phoneNumber.toLowerCase().contains("nil")) {
				String firstNumber = "";
				String restNumber = "";

				if (phoneNumber.length() > 8) {
					firstNumber = phoneNumber.substring(0, 4);
				} else if (phoneNumber.length() == 8) {
					firstNumber = phoneNumber.substring(0, 2);
				}
				restNumber = phoneNumber.substring(firstNumber.length(), phoneNumber.length());
				phoneNumber = firstNumber + restNumber.replaceAll("\\d(?=(?:\\D*\\d){3})", "*");
			} else {
				phoneNumber = "0";
			}
		}
		return phoneNumber;
	}
}
