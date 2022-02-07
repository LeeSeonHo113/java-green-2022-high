package site.metacoding.data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Data
        @AllArgsConstructor
        class Header {
            private int resultCode;
            private int resultMsg;
        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;
            private String dataType;
            private int pageNo;
            private int numOfRows;
            private int totalCount;

            @Data
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
                    private String accExamCnt;
                    private String createDt;
                    private int deathCnt;
                    private int decideCnt;
                    private int seq;
                    private int stateDt;
                    private String stateTime;
                    private String updateDt;
                }
            }
        }
    }
}