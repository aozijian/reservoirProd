package com.nit.reservoir.service.model.system;


import java.io.Serializable;

/**
 * Created by aozijian on 2017/4/20.
 * 菜单实体类
 */
public class Menu implements Serializable{

    private String id;  //菜单ID
    private int sortId;  //排序ID
    private String parentId;  //菜单父ID
    private String name;  //菜单名称
    private String url;  //菜单链接地址
    private String description;  //菜单描述
    private Menu parentMenu;  //父级菜单

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Menu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(Menu parentMenu) {
        this.parentMenu = parentMenu;
    }
}
