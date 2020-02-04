<%@page import="java.util.Locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>News</title>
</head>
<body>
	<%
		Locale locale=request.getLocale();
		if(locale.getLanguage().equals(new Locale("en").getLanguage())){
			out.println("Two weeks ago, teacher Trey Payne's basketball shoes were stolen from his classroom in the Logan Middle School. As a gesture to cheer him up, a group of students pitched in money and gifted him a pair of brand new kicks.");
		}else if(locale.getLanguage().equals(new Locale("hi").getLanguage())){
			out.println("दो हफ्ते पहले, शिक्षक ट्रे पायने के बास्केटबॉल जूते लोगान मिडिल स्कूल में उनकी कक्षा से चोरी हो गए थे। उसे खुश करने के लिए एक इशारे के रूप में, छात्रों के एक समूह ने पैसे में पिच किया और उसे एक नया ब्रैंड किक्स गिफ्ट किया।");
		}else if(locale.getLanguage().equals(new Locale("te").getLanguage())){
			out.println("రెండు వారాల క్రితం, ఉపాధ్యాయుడు ట్రే పేన్ యొక్క బాస్కెట్‌బాల్ బూట్లు లోగాన్ మిడిల్ స్కూల్‌లోని తన తరగతి గది నుండి దొంగిలించబడ్డాయి. అతన్ని ఉత్సాహపరిచే సంజ్ఞగా, విద్యార్థుల బృందం డబ్బును సమకూర్చుకుంది మరియు అతనికి సరికొత్త కిక్‌లను బహుమతిగా ఇచ్చింది.");
		}
	%>
</body>
</html>