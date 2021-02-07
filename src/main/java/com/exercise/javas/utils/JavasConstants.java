package com.exercise.javas.utils;

public class JavasConstants {
    private JavasConstants(){}
    public static final String ACTION = "action";
    public static final String KEY = "key";
    public static final String TYPE = "type";
    public static final String BOARD_TYPE = "boardType";
    public static final String PG_NUM = "pgNum";
    public static final String SESSION = "session";
    public static final String POST_ID = "postId";
    public static final String DTO = "dto";
    public static final String MSG = "msg";
    public static final String JOBAD = "jobad";
    public static final String WANTAD = "wantad";
    public static final String LIST = "list";
    public static final String NULL_MSG = "nullErrorMsg";
    public static final String PAGE_LIST = "pagelist";
    public static final String TOTAL_COUNT = "totalCount";
    public static final String LIST_ONE = "listOne";
    public static final String BOARD_VIEW = "boardView";
    public static final String PHOTO = "photo";
    public static final String LOGIN_DTO = "loginDTO";
    public static final String COMMON_DATE_FORMAT = "YYYY-MM-dd HH:mm:ss";
    public static final String BOARD_TYPE_TITLE = "board_type_title";
    public static final String MYPAGE = "mypage";
    public static final String MEMINFO_MODIFY = "meminfomodify";
    public static final String NOTICE_RESULT = "noticeResult";
    public static final String IS_IDEXIST = "isIdExist";
    public static final String MSG_TYPE = "type";
    public static final String BOARD_TYPE_KOR = "boardTypeKor";
    public static final String PRE_BTN_HTML = "<a href='/javas/board/{boardType}?pgNum={startPage}{linkStr}'>\n" +
            "\t<img src='/javas/resources/images/left.png' width='45'>\n" +
            "</a>";
    public static final String PAGE_LIST_HTML_I = "<a href='/javas/board/{boardType}?pgNum={i}{linkStr}'" +
            "style='font-weight:bold;font-size:45px;'>{i}</a> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
    public static final String PAGE_LIST_HTML = "<a href='/javas/board/{boardType}?pgNum={i}{linkStr}'" +
            "style='font-size:45px;'>{i}</a> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
    public static final String NEXT_BTN_HTML = "<a href='/javas/board/{boardType}?pgNum={endPage}{linkStr}'>\n" +
            "\t<img src='/javas/resources/images/right.png' width='45'>\n" +
            "</a>";
}
