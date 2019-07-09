package com.boot.api.core;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Author : Peng Xue
 * Date  : 2019/7/2
 */
public class PageFormat<T> {
    private int pageNo;
    private int pageSize;
    private List<T> records;
    private int count;


    public PageFormat(PageInfo pageInfo) {
        this.setRecords(pageInfo.getList());
        this.setPageNo(pageInfo.getPageNum());
        this.setPageSize(pageInfo.getPageSize());
        this.setCount((int)pageInfo.getTotal());

    } public PageFormat(List<T> list) {
        PageInfo pageInfo=new PageInfo(list);
        this.setRecords(pageInfo.getList());
        this.setPageNo(pageInfo.getPageNum());
        this.setPageSize(pageInfo.getPageSize());
        this.setCount((int)pageInfo.getTotal());
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}


