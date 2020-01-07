package com.cimc.senheyun.vo;

import java.util.List;

public class PageOutVo<T> {

    private int firstPage=0;		//页码，默认是第一页	
    private int firstIndex=0;	  //起始索引
    private int pageSize=0;		//每页显示的记录数，默认是10
    private int totalRecord;		//总记录数
    private int totalPage;			//总页数
    private List<T> rows;      //对应的当前页记录
    
    

    public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getFirstIndex() {
       return firstIndex;
    }
 
    public void setFirstIndex(int firstIndex) {
       this.firstIndex = firstIndex;
    }
 
    public int getPageSize() {
       return pageSize;
    }
 
    public void setPageSize(int pageSize) {
       this.pageSize = pageSize;
		//通过起始索引计算起始页
       if(pageSize>0){
           int firstPageTo=1;
           if(firstIndex==0){
           	firstPageTo=1;
           }else if(firstIndex % pageSize>0){
           	firstPageTo=(firstIndex / pageSize)+1;
           }else {
           	firstPageTo=(firstIndex / pageSize);
           }
   	    this.setFirstPage(firstPageTo);
       }
    }
    
    public static void main(String[] agrs){
    	System.out.println(3/2);
    }
 
    public int getTotalRecord() {
       return totalRecord;    
    }
 
    public void setTotalRecord(int totalRecord) {
       this.totalRecord = totalRecord;
       int totalPage=0;
       if(pageSize>0){
    	   totalPage = totalRecord%pageSize==0 ? totalRecord/pageSize : totalRecord/pageSize + 1;
       }
       this.setTotalPage(totalPage);
    }
 
    public int getTotalPage() {
       return totalPage;
    }
 
    public void setTotalPage(int totalPage) {
       this.totalPage = totalPage;
    }

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}


	

 
  

}
