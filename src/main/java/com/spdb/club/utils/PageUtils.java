package com.spdb.club.utils;


/**
 * @ClassName PageUtils 类
 * @Description 分页工具类
 * @Author 许茂
 * @Date 2021/3/20 21:23
 * @Version 1.0
 */
public class PageUtils {
    //总记录数
    private int totalRecord=0;
    //总页数(默认1，通过计算获得)
    private int totalPage=1;
    //每页记录条数(默认10，可通过传参数修改)
    private int pageSize=10;
    //当前页
    private int pageNo=1;

    public void randPage(int pageNo){
        if(pageNo>=1&&pageNo<=totalPage)
            this.pageNo=pageNo;
    }
    public void nextPage(){
        if(pageNo+1<=totalPage)
            this.pageNo++;
    }
    public void prePage(){
        if(pageNo-1>=1)
            this.pageNo--;
    }
    public PageUtils(){

    }

    public PageUtils (int totalRecord){
        this.totalRecord = totalRecord;
        setTotalPage(getTotalPage());
    }
    public PageUtils (int totalRecord,int pageSize){
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;
        setTotalPage(getTotalPage());
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        if(this.totalRecord%this.pageSize==0)
            totalPage = this.totalRecord/this.pageSize;
        else
            totalPage = this.totalRecord/this.pageSize + 1;
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "PageUtils{" +
                "totalRecord=" + totalRecord +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
