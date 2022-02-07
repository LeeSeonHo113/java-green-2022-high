package site.metacoding.data01;

import java.util.List;
import java.util.Scanner;

import site.metacoding.data01.ResponseDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 시작일을 입력하세요 =====");
        System.out.println("ex) 20220110");
        String createDt = sc.nextLine();

        System.out.println("===== 종료일을 입력하세요 =====");
        System.out.println("ex) 20220115");
        String updateDt = sc.nextLine();

        List<Item> CovidList = DownloadCorona.getCovidList(createDt, updateDt);
        for (int i = 0; i < CovidList.size(); i++) {
            System.out.println("===========================");
            System.out.println("누적 의심신고 검사자 수 : " + CovidList.get(i).getAccExamCnt());
            System.out.println("등록일시 : " + CovidList.get(i).getCreateDt());
            System.out.println("사망자 수 : " + CovidList.get(i).getDeathCnt());
            System.out.println("확진자 수 : " + CovidList.get(i).getDecideCnt());
            System.out.println("게시글번호 : " + CovidList.get(i).getSeq());
            System.out.println("기준일 : " + CovidList.get(i).getStateDt());
            System.out.println("기준시간 : " + CovidList.get(i).getStateTime());
            System.out.println("업데이트날짜 : " + CovidList.get(i).getUpdateDt());
            System.out.println("===========================");
        }
    }
}