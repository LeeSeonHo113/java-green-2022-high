package site.metacoding.data00;

import java.util.Map;
import java.util.Scanner;

import site.metacoding.data00.ResponseDto.Response.Body.Items.Item;
import site.metacoding.data01.ResponseDto.Covid;

public class MainCovid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시작일을 입력하세요.");
        System.out.println("ex) 20220110");
        String createDt = sc.nextLine();

        System.out.println("종료일을 입력하세요.");
        System.out.println("ex) 20220115");
        String updateDt = sc.nextLine();

        Map<String, String> CovidMap = DownloadCovid.getCovidList(createDt, updateDt);
        System.out.println("데이터는 : " + CovidMap.get("") + "입니다.");
    }
}