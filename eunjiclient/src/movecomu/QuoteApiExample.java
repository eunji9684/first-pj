package movecomu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

public class QuoteApiExample {
	public static String getQuote() {
		String apiUrl = "https://api.adviceslip.com/advice"; // 대체할 실제 API URL

		try {
			// URL 객체 생성
			URL url = new URL(apiUrl);

			// HttpURLConnection 객체 생성
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			// 요청 메서드 설정 (GET, POST 등)
			conn.setRequestMethod("GET");

			// 응답 코드 확인 (200은 성공)
			int responseCode = conn.getResponseCode();
				
				if (responseCode == 200) {
				// API 응답 데이터를 InputStream으로 받기
					InputStream inputStream = conn.getInputStream();

				// InputStream을 문자열로 변환하여 사용
					String responseData = convertInputStreamToString(inputStream);
				
				
				
				try {
					JSONObject jsonData = new JSONObject(responseData);
					JSONObject slipObject = jsonData.getJSONObject("slip"); // "slip" 키에 해당하는 JSONObject 가져오기
					String advice = slipObject.getString("advice");
					System.out.println(advice);
					return advice;
					
					
				} catch (JSONException e) {
					
					e.printStackTrace();
				}
				
				
				// InputStream 사용 후 반드시 닫아주어야 함
				inputStream.close();
				System.out.println(responseData);
				return responseData;
			} else {
				System.out.println("API 호출에 실패하였습니다. 응답 코드: " + responseCode);
				//return null;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	// InputStream을 문자열로 변환하는 메서드
	private static String convertInputStreamToString(InputStream inputStream) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		StringBuilder stringBuilder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line).append("\n");
		}
		reader.close();
		
		return stringBuilder.toString();
	}
}
