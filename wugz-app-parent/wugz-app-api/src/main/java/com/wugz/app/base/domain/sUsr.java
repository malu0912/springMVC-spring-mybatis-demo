package com.wugz.app.base.domain;

import java.io.Serializable;

public class sUsr  implements Serializable{
	
    private String instuCde;
    private String usrCde;
	private static final long serialVersionUID = 1L;
    private String extInd;
    private String runInd;
    private String usrName;
    private String usrIdTyp;
    private String usrIdNo;
    private String usrPassword;
    private String usrTel;
    private String usrEmail;
    private String usrBch;
    private String depCde;
    private String usrSts;
    private String restInd;
    private String usrRepassInd;
    private String passModiDt;
    private String usrRmk;
    private String lastChgDt;
    private String lastChgUsr;
    private String managInd;
    private String usrSuper;
    private String riskGrd;
    private String quGrd;
    private String specialRole;
    private String empDt;
    private String isRate;
    private Integer beginData;
    private Integer endData;
    private String limitCount;  // 用于测试机构用户查询次数
    private String useLimit;   // 用于判断是否添加测试机构用户查询次数
    
    public String getInstuCde() {
        return instuCde;
    }
    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }
    public String getUsrCde() {
        return usrCde;
    }
    @Override
	public String toString() {
		return "sUsr [instuCde=" + instuCde + ", usrCde=" + usrCde
				+ ", extInd=" + extInd + ", runInd=" + runInd + ", usrName="
				+ usrName + ", usrIdTyp=" + usrIdTyp + ", usrIdNo=" + usrIdNo
				+ ", usrPassword=" + usrPassword + ", usrTel=" + usrTel
				+ ", usrEmail=" + usrEmail + ", usrBch=" + usrBch + ", depCde="
				+ depCde + ", usrSts=" + usrSts + ", restInd=" + restInd
				+ ", usrRepassInd=" + usrRepassInd + ", passModiDt="
				+ passModiDt + ", usrRmk=" + usrRmk + ", lastChgDt="
				+ lastChgDt + ", lastChgUsr=" + lastChgUsr + ", managInd="
				+ managInd + ", usrSuper=" + usrSuper + ", riskGrd=" + riskGrd
				+ ", quGrd=" + quGrd + ", specialRole=" + specialRole
				+ ", empDt=" + empDt + ", isRate=" + isRate + ", beginData="
				+ beginData + ", endData=" + endData + ", limitCount="
				+ limitCount + ", useLimit=" + useLimit + "]";
	}
	public void setUsrCde(String usrCde) {
        this.usrCde = usrCde == null ? null : usrCde.trim();
    }
    
    public String getExtInd() {
        return extInd;
    }

    public Integer getBeginData() {
		return beginData;
	}

	public void setBeginData(Integer beginData) {
		this.beginData = beginData;
	}

	public Integer getEndData() {
		return endData;
	}

	public void setEndData(Integer endData) {
		this.endData = endData;
	}

	public void setExtInd(String extInd) {
        this.extInd = extInd == null ? null : extInd.trim();
    }

    public String getRunInd() {
        return runInd;
    }

    public void setRunInd(String runInd) {
        this.runInd = runInd == null ? null : runInd.trim();
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    public String getUsrIdTyp() {
        return usrIdTyp;
    }

    public void setUsrIdTyp(String usrIdTyp) {
        this.usrIdTyp = usrIdTyp == null ? null : usrIdTyp.trim();
    }

    public String getUsrIdNo() {
        return usrIdNo;
    }

    public void setUsrIdNo(String usrIdNo) {
        this.usrIdNo = usrIdNo == null ? null : usrIdNo.trim();
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword == null ? null : usrPassword.trim();
    }

    public String getUsrTel() {
        return usrTel;
    }

    public void setUsrTel(String usrTel) {
        this.usrTel = usrTel == null ? null : usrTel.trim();
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail == null ? null : usrEmail.trim();
    }

   
    public String getUsrBch() {
        return usrBch;
    }

    public void setUsrBch(String usrBch) {
        this.usrBch = usrBch == null ? null : usrBch.trim();
    }

    public String getDepCde() {
        return depCde;
    }

    public void setDepCde(String depCde) {
        this.depCde = depCde == null ? null : depCde.trim();
    }

    
    public String getUsrSts() {
        return usrSts;
    }

   
    public void setUsrSts(String usrSts) {
        this.usrSts = usrSts == null ? null : usrSts.trim();
    }

    public String getRestInd() {
        return restInd;
    }

    public void setRestInd(String restInd) {
        this.restInd = restInd == null ? null : restInd.trim();
    }

    
    public String getUsrRepassInd() {
        return usrRepassInd;
    }

   
    public void setUsrRepassInd(String usrRepassInd) {
        this.usrRepassInd = usrRepassInd == null ? null : usrRepassInd.trim();
    }

    public String getPassModiDt() {
        return passModiDt;
    }

   
    public void setPassModiDt(String passModiDt) {
        this.passModiDt = passModiDt == null ? null : passModiDt.trim();
    }

    public String getUsrRmk() {
        return usrRmk;
    }

    public void setUsrRmk(String usrRmk) {
        this.usrRmk = usrRmk == null ? null : usrRmk.trim();
    }

    public String getLastChgDt() {
        return lastChgDt;
    }

   
    public void setLastChgDt(String lastChgDt) {
        this.lastChgDt = lastChgDt == null ? null : lastChgDt.trim();
    }

    public String getLastChgUsr() {
        return lastChgUsr;
    }

    public void setLastChgUsr(String lastChgUsr) {
        this.lastChgUsr = lastChgUsr == null ? null : lastChgUsr.trim();
    }

   
    public String getManagInd() {
        return managInd;
    }

   
    public void setManagInd(String managInd) {
        this.managInd = managInd == null ? null : managInd.trim();
    }

    public String getUsrSuper() {
        return usrSuper;
    }

    public void setUsrSuper(String usrSuper) {
        this.usrSuper = usrSuper == null ? null : usrSuper.trim();
    }

    public String getRiskGrd() {
        return riskGrd;
    }

   
    public void setRiskGrd(String riskGrd) {
        this.riskGrd = riskGrd == null ? null : riskGrd.trim();
    }

    public String getQuGrd() {
        return quGrd;
    }

    public void setQuGrd(String quGrd) {
        this.quGrd = quGrd == null ? null : quGrd.trim();
    }

    
    public String getSpecialRole() {
        return specialRole;
    }

  
    public void setSpecialRole(String specialRole) {
        this.specialRole = specialRole == null ? null : specialRole.trim();
    }

    
    public String getEmpDt() {
        return empDt;
    }

    public void setEmpDt(String empDt) {
        this.empDt = empDt == null ? null : empDt.trim();
    }

   
    public String getIsRate() {
        return isRate;
    }

 
    public void setIsRate(String isRate) {
        this.isRate = isRate == null ? null : isRate.trim();
    }

	public String getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(String limitCount) {
		this.limitCount = limitCount;
	}

	public String getUseLimit() {
		return useLimit;
	}

	public void setUseLimit(String useLimit) {
		this.useLimit = useLimit;
	}
}