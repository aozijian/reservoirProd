package com.nit.reservoir.service.model.reservoir;

import com.nit.reservoir.service.model.common.BasicModel;

import java.io.Serializable;
import java.util.Date;

/**
 * 水库实体类.
 */
public class Reservoir extends BasicModel implements Serializable{

    private String name;  //水库名称
    private String location;  //水库所在地
    private Date buildTime;  //水库建造时间
    private String river;  //水库所在流域
    private double content;  //水库容量
    private double pressure;  //水库最大承受压力

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public String getRiver() {
        return river;
    }

    public void setRiver(String river) {
        this.river = river;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
