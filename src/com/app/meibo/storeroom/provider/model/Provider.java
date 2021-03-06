package com.app.meibo.storeroom.provider.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 供应商
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createdate 2012-12-6 下午9:23:30
 */
@Entity
@Table(name="provider")
public class Provider {
	private Integer id;
	private String companyName;// 单位名称、
	private String companyAddress;// 单位地址、
	private String linkman;// 联系人、
	private String contact;// 联系方式、
	private String site;// 网站、
	private String email;// 邮箱、
	private List<Commodity> commodities;// 可供应的产品名称、产品单价、产品图片
	private Date createDate = new Date();
	private int isDelete = 0;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public String getLinkman() {
		return linkman;
	}

	public String getContact() {
		return contact;
	}

	public String getSite() {
		return site;
	}

	public String getEmail() {
		return email;
	}

	@OneToMany(mappedBy = "provider")
	public List<Commodity> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
