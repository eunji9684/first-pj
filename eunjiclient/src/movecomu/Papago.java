package movecomu;

//네이버 Papago NMT API 예제
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;
public class Papago {
	

 public static String getTranslatedString(String stmt) {
     String clientId = "ApcjDWtyQerGQgxrd7D7";//애플리케이션 클라이언트 아이디값";
     String clientSecret = "D_JiGiCF7m";//애플리케이션 클라이언트 시크릿값";
     
     String statement = stmt;
     String srcLangType = PapagoDetectLangs.getLangCode(statement);
     String tarLangType = "ko";
     
     
     try {
         String text = URLEncoder.encode(statement, "UTF-8");
         String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
         URL url = new URL(apiURL);
         HttpURLConnection con = (HttpURLConnection)url.openConnection();
         con.setRequestMethod("POST");
         con.setRequestProperty("X-Naver-Client-Id", clientId);
         con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
         
         // post request
         String postParams = "source="+ srcLangType +"&target="+ tarLangType +"&text=" + text;
         con.setDoOutput(true);
         DataOutputStream wr = new DataOutputStream(con.getOutputStream());
         wr.writeBytes(postParams);
         wr.flush();
         wr.close();
         
         int responseCode = con.getResponseCode();
         BufferedReader br;
         
         if(responseCode==200) { // 정상 호출
             br = new BufferedReader(new InputStreamReader(con.getInputStream()));
         } else {  // 에러 발생
             br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
         }
         
         String inputLine;
         StringBuffer response = new StringBuffer();
         while ((inputLine = br.readLine()) != null) {
             response.append(inputLine);
         }
         br.close();
         
         
         JSONObject json = new JSONObject(response.toString());
         JSONObject msgObj = json.getJSONObject("message");
         JSONObject resultObj = msgObj.getJSONObject("result");
         String translatedText = resultObj.getString("translatedText");
         return translatedText;
         
     } catch (Exception e) {
    	 
    
         System.out.println(e);
     }
	return null;
 }
}