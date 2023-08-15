package com.example.SecurityUse.tuils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModelProperty;

/**
 * FileName: BaseCriteria.java
 * Created : Z
 * time:2021/4/14 10:46
 * message: BaseCriteria类
 */
public class BaseCriteria {

    private static final Integer PAGE = 1;

    private static final Integer PAGE_SIZE = 10;

    @ApiModelProperty("当前页 默认 1")
    private Integer page;
    @ApiModelProperty("每页数据 默认 10")
    private Integer size;

    public Integer getPage() {
        if(this.page == null){
            return PAGE;
        }
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        if(this.size == null){
            return PAGE_SIZE;
        }
        return size;
    }

    public void setsize(Integer size) {
        this.size = size;
    }

    public Page getPageObject(){
        return new Page(this.getPage(),this.getSize());
    }
}
