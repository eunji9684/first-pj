package kang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GyazoImageFetcher {
    private static final String GYAZO_LIST_API_URL = "https://api.gyazo.com/api/images";
    public static String gyazoAccessToken = "ZuWSQ-9D3FScMfsndzaSjm9-VGEXZox9ZklO1480J-A"; // Gyazo API 인증 토큰을 넣으세요.


    public static ArrayList<String> fetchAndExtractGyazoImages(String accessToken) {
        int pageNumber = 1;
        int imagesPerPage = 100; // 필요에 따라 페이지 당 이미지 수를 조정할 수 있습니다.

        ArrayList<String> allImageUrls = new ArrayList<>();

        while (true) {
            String jsonData = fetchGyazoImages(accessToken, pageNumber, imagesPerPage);
            if (jsonData == null || jsonData.isEmpty()) {
                break; // 더 이상 데이터가 없거나 오류가 발생했습니다.
            }

            ArrayList<String> imageUrls = extractImageUrls(jsonData);
            allImageUrls.addAll(imageUrls);

            if (imageUrls.size() < imagesPerPage) {
                break; // 이미지의 마지막 페이지에 도달했습니다.
            }

            pageNumber++;
        }

        return allImageUrls;
        // 이제 allImageUrls에 모든 페이지에서 가져온 모든 이미지 URL이 포함되어 있습니다.
        // 원하는 작업을 수행하세요.
    }
	
    public static String fetchGyazoImages(String accessToken, int page, int perPage) {
        try {
            URL url = new URL(GYAZO_LIST_API_URL + "?page=" + page + "&per_page=" + perPage);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + accessToken);

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                
                
                return response.toString();
            } else {
                System.out.println("Gyazo 이미지를 가져오는데 실패했습니다. HTTP 오류 코드: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<String> extractImageUrls(String jsonData) {
        JSONArray jsonArray;
		try {
			jsonArray = new JSONArray(jsonData);
			ArrayList<String> imageUrls = new ArrayList<>(); 

	        for (int i = 0; i < jsonArray.length(); i++) {
	            JSONObject jsonObject = jsonArray.getJSONObject(i);
	            String imageUrl = jsonObject.getString("url");

	            imageUrls.add(imageUrl);
	        }
	        return imageUrls;
		} catch (JSONException e) {
			e.printStackTrace();
		}
        return null;
    }
    
  
}