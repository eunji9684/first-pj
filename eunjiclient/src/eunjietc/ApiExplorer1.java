package eunjietc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorer1 {
	  public static void main(String[] args) {
	        try {
	            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1480523/MetalMeasuringResultService/MetalService"); /*URL*/
	            urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=wiLuPkhoEGKfKZI40BR0qLo2m5prazeMnvg82m70%2B39eYg6dHcYOSAWAvpxbORAwaEFbcr0xBnCNpOS%2FodUH6A%3D%3D"); /*Service Key*/
	            urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
	            urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
	            urlBuilder.append("&" + URLEncoder.encode("resultType", "UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*결과형식(JSON)*/

	            // 원하는 값으로 파라미터 설정하기
	            urlBuilder.append("&" + URLEncoder.encode("date", "UTF-8") + "=" + URLEncoder.encode("20230720", "UTF-8")); /*검색조건 날짜 (예시 : 20230724)*/
	            urlBuilder.append("&" + URLEncoder.encode("stationcode", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*검색조건 측정소코드*/
	            urlBuilder.append("&" + URLEncoder.encode("itemcode", "UTF-8") + "=" + URLEncoder.encode("90303", "UTF-8")); /*검색조건 항목코드*/
	            urlBuilder.append("&" + URLEncoder.encode("timecode", "UTF-8") + "=" + URLEncoder.encode("RH02", "UTF-8")); /*검색조건 시간구분*/

	            URL url = new URL(urlBuilder.toString());
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("GET");
	            conn.setRequestProperty("Content-type", "application/json");

	            System.out.println("Response code: " + conn.getResponseCode());

	            BufferedReader rd;
	            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            } else {
	                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	            }

	            StringBuilder sb = new StringBuilder();
	            String line;
	            while ((line = rd.readLine()) != null) {
	                sb.append(line);
	            }
	            rd.close();
	            conn.disconnect();

	            System.out.println(sb.toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
