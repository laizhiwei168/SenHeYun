package com.cimc.senheyun.vo;

import java.io.Serializable;
import java.util.List;

public class PageBasics implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer pageIndex;		//默认是第一页
    private int pageSize = 10;		//每页显示的记录数，默认是10
    private int totalRecord;		//总记录数
    private int totalPage;			//总页数
    
    private Integer firstIndex = 0; // 起始索引 默认是0开始
    
    private String startTime; // 搜索条件
    private String endTime; // 搜索条件
	
	private String sort; // 是否倒序
	
	private String pkGroup; // 集团
	private List<Org> orgs; // 组织
	
	
	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalPage() {
		if(totalRecord % pageSize == 0){
			totalPage = totalRecord/pageSize;
		 }else{
			totalPage = totalRecord/pageSize + 1;
		 }
		return totalPage;
	}

	/*public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}*/

	public Integer getFirstIndex() {
		if(pageIndex!=null) {
			return pageIndex<=0?0:(pageIndex)*pageSize;
		}else {
			return firstIndex;
		}
		
	}

	public void setFirstIndex(Integer firstIndex) {
		this.firstIndex = firstIndex;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getPkGroup() {
		return pkGroup;
	}

	public void setPkGroup(String pkGroup) {
		this.pkGroup = pkGroup;
	}

		
	
	public List<Org> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<Org> orgs) {
		this.orgs = orgs;
	}
}

class Org{
	private String pkOrg;

	public String getPkOrg() {
		return pkOrg;
	}

	public void setPkOrg(String pkOrg) {
		this.pkOrg = pkOrg;
	}			
}
