package com.example.SecurityUse.tuils;


import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页数据封装类
 */
public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(List<T> list, int pageNum, int pageSize) {
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageNum);
        result.setPageSize(pageSize);
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(PageInfo<T> pageInfo) {
        CommonPage<T> result = new CommonPage<T>();
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    //    /**
//     * 将SpringData分页后的list转为分页信息
//     */
//    public static <T> CommonPage<T> restPage(Page<T> pageInfo) {
//        CommonPage<T> result = new CommonPage<T>();
//        result.setTotalPage(pageInfo.getTotalPages());
//        result.setPageNum(pageInfo.getNumber());
//        result.setPageSize(pageInfo.getSize());
//        result.setTotal(pageInfo.getTotalElements());
//        result.setList(pageInfo.getContent());
//        return result;
//    }
    public static <T> CommonPage<T> restPage(List<T> list, Integer page, Integer pageSize, Long total, Integer totalPage) {
        CommonPage<T> result = new CommonPage<T>();
        result.setTotalPage(totalPage);
        result.setPageNum(page);
        result.setPageSize(pageSize);
        result.setTotal(total);
        result.setList(list);
        return result;
    }

    public static <T> CommonPage<T> restPage(PageInfo pageInfo, List<T> list) {
        CommonPage<T> result = new CommonPage<T>();
        result.setTotalPage((int) pageInfo.getPages());
        result.setPageNum((int) pageInfo.getPageNum());
        result.setPageSize((int) pageInfo.getSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(list);
        return result;
    }

    public static <T> CommonPage<T> restPage(List<T> list) {
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

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

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
