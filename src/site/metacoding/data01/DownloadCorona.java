package site.metacoding.data01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import site.metacoding.data01.ResponseDto.Response.Body.Items.Item;

public class DownloadCorona {
    public static List<Item> getCovidList(
            String createDt,
            String updateDt) {

        Map<String, String> CovidMap = DownloadCovid.getCovidList();
        String accExamCnt = CovidMap.get(createDt);
        String stateDt = CovidMap.get(updateDt);

        try {
            URL url = new URL(
                    "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&startCreateDt=20220110&endCreateDt=20220115&accExamCnt"
                            + accExamCnt + "&updateDt=" + updateDt +
                            "&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            return result;
        } catch (Exception e) {
            System.out.println("데이터 조회중 오류가 발생했습니다.");
        }
        return null;
    }
}