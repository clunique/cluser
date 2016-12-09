package com.cluser.dao.model.extended;

import java.util.Collections;
import java.util.List;

public class PageableView<T> {

    private int page = 0;
    private int size = 0;
    private int total = 0;
    private List<T> items = Collections.emptyList();
    private String[] sort;

    public static <T> PageableView<T> EMPTY() {
        return new PageableView<>();
    }

    public PageableView() {}

    public PageableView(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public PageableView(int page, int size, int total, List<T> rows, String[] sort) {
        this.page = page;
        this.size = size;
        this.total = total;
        this.items = rows;
        this.sort = sort;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String[] getSort() {
        return sort;
    }

    public void setSort(String[] sort) {
        this.sort = sort;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
