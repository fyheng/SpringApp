package spring2011.service;

public class Pages {
    private String pageType;
    private String pageNo;
    private String pageColor;

    public Pages() {

    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNno) {
        this.pageNo = pageNno;
    }


    public String getPageColor() {
        return pageColor;
    }

    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }

    public Pages(String pageType, String pageNo, String pageColor) {
        this.pageType = pageType;
        this.pageNo = pageNo;
        this.pageColor = pageColor;
    }

    public String getDetail(){
        return "Page Detail :\n" +
                "PageType "+getPageType()+"\n" +
                "PageNo "+getPageNo()+"\n" +
                "PageColor "+getPageColor()+"\n";
    }
}
