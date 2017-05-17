package com.nit.reservoir.service.model.system;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by aozijian on 2017/5/16.
 * 用户实体类
 */
public class User implements Serializable{

    private int id;  //用户ID
    private String userName;  //用户名
    private String password;  //密码
    private int gender;  //性别{1=男;2=女}
    private int roleId;  //角色ID{1=后台管理员;2=水库监测员;3=水库系统管理员;4=水库调度员;5=超级管理员}
    private String headImg;  //用户头像
    private int creatorId;  //创建者ID
    private Date createTime;  //创建时间
    private int modifyId;  //修改者ID
    private Date modifyTime;  //修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getModifyId() {
        return modifyId;
    }

    public void setModifyId(int modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
