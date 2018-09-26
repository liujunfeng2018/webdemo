package com.mybatis.pojo;

import java.util.Date;

public class Agentsms {
    private String usercode;

    private String username;

    private String mobile;

    private String flag;

    private Date inputdate;

    private String claimtype;

    private String operatorcode;

    private String comcode;

    private String companyname;

    private String gradetype;

    private String recordid;

    private String comcode2;

    private String companyname2;

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public String getClaimtype() {
        return claimtype;
    }

    public void setClaimtype(String claimtype) {
        this.claimtype = claimtype == null ? null : claimtype.trim();
    }

    public String getOperatorcode() {
        return operatorcode;
    }

    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode == null ? null : operatorcode.trim();
    }

    public String getComcode() {
        return comcode;
    }

    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getGradetype() {
        return gradetype;
    }

    public void setGradetype(String gradetype) {
        this.gradetype = gradetype == null ? null : gradetype.trim();
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public String getComcode2() {
        return comcode2;
    }

    public void setComcode2(String comcode2) {
        this.comcode2 = comcode2 == null ? null : comcode2.trim();
    }

    public String getCompanyname2() {
        return companyname2;
    }

    public void setCompanyname2(String companyname2) {
        this.companyname2 = companyname2 == null ? null : companyname2.trim();
    }
}