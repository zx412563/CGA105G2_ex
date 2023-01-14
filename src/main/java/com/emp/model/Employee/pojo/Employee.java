package com.emp.model.Employee.pojo;

import javax.persistence.*;

@Entity
@Table(catalog = "cga105g2",name = "employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "EMP_ID")
  private Integer empId;
  @Column(name = "EMP__STATUS")
  private Integer empStatus;
  //@Column(name = "EMP_ACC")
  private String empAcc;
  @Column(name = "EMP_PWD")
  private String empPwd;
  @Column(name = "EMP_PER")
  private Integer empPer;
  @Column(name = "EMP_TIME")
  private java.sql.Timestamp empTime;
  @Column(name = "EMP_RTIME")
  private java.sql.Timestamp empRtime;


  public Integer getEmpStatus() {
    return empStatus;
  }

  public void setEmpStatus(Integer empStatus) {
    this.empStatus = empStatus;
  }


  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }


  public String getEmpPwd() {
    return empPwd;
  }

  public void setEmpPwd(String empPwd) {
    this.empPwd = empPwd;
  }


  public Integer getEmpPer() {
    return empPer;
  }

  public void setEmpPer(Integer empPer) {
    this.empPer = empPer;
  }


  public java.sql.Timestamp getEmpTime() {
    return empTime;
  }

  public void setEmpTime(java.sql.Timestamp empTime) {
    this.empTime = empTime;
  }


  public java.sql.Timestamp getEmpRtime() {
    return empRtime;
  }

  public void setEmpRtime(java.sql.Timestamp empRtime) {
    this.empRtime = empRtime;
  }

  public String getEmpAcc() {
    return empAcc;
  }

  public void setEmpAcc(String empAcc) {
    this.empAcc = empAcc;
  }
}