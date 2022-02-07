package site.metacoding.data01;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
public class ResponseDto {
    private Covid Covid;
    private Corona corona;
    private Response response; // 변수명을 꼭 동일하게!!

    @Data
    @AllArgsConstructor
    public class Covid {
        private Response response;

        @Data
        @AllArgsConstructor
        class Response {
            private Header header; // 변수명을 꼭 동일하게!!
            private Body body; // 변수명을 꼭 동일하게!!

            @Data
            @AllArgsConstructor
            class Header {
                private String resultCode;
                private String resultMsg;
            }

            @Data
            @AllArgsConstructor
            class Body {
                private Items items;
                private int numOfRows;
                private int pageNo;
                private int totalCount;

                @Data
                @AllArgsConstructor
                class Items {
                    private List<Item> item;

                    @Data
                    @AllArgsConstructor
                    class Item {
                        private String createDt;
                        private String updateDt;
                    }
                }
            }
        }
    }

    @Data
    @AllArgsConstructor
    public class Corona {
        private Response response;

        @Data
        @AllArgsConstructor
        class Response {
            private Header header; // 변수명을 꼭 동일하게!!
            private Body body; // 변수명을 꼭 동일하게!!

            @Data
            @AllArgsConstructor
            class Header {
                private String resultCode;
                private String resultMsg;
            }

            @Data
            @AllArgsConstructor
            class Body {
                private Items items;
                private int numOfRows;
                private int pageNo;
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
                        private String stateDt;
                        private String stateTime;
                        private String updateDt;
                    }
                }
            }
        }
    }

    @Data
    @AllArgsConstructor
    class Response {
        private Header header; // 변수명을 꼭 동일하게!!
        private Body body; // 변수명을 꼭 동일하게!!

        @Data
        @AllArgsConstructor
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
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
                    private String stateDt;
                    private String stateTime;
                    private String updateDt;
                }
            }
        }
    }
}