package com.oracle.common;

import java.io.Serializable;
import java.util.List;

/**
 * 通用分页工具类
 */
public class PageResult implements Serializable {

    private Integer pageNo; //当前页
    private Integer pageSize; //每页多少条
    private Integer totalPages; //共多少页
    private long total;  //共多少条数据

    private List rows;      //当前页的数据

    public PageResult() {
    }

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
