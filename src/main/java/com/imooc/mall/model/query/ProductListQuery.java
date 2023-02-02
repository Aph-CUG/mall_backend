package com.imooc.mall.model.query;

import java.util.List;

/**
 * 描述： 查询商品列表的Query
 */

public class ProductListQuery {
    public String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    private List<Integer> categoryIds;
}
