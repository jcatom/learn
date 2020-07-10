package cc.jml1024.learn.api.qry;

public class BaseQry {
    private Integer pageNum;
    private Integer pageSize;
    private Boolean hasPaging;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getHasPaging() {
        return hasPaging;
    }

    public void setHasPaging(Boolean hasPaging) {
        this.hasPaging = hasPaging;
    }
}
