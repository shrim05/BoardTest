package kr.or.myboard.vo;

public class Pagination {
	private int pageSize = 10; //한페이지당 게시글 수
	private int rangeSize = 5; // 한 블럭 당 페이지수
	private int curPage = 1; // 현재페이지
	private int curRange = 1; //현재 블럭
	private int listCnt; //총 게시글 수
	private int pageCnt; //총페이지 수
	private int rangeCnt; //총 블럭 수
	private int startPage = 1; //시작페이지
	private int endPage = 1; //끝페이지
	private int startIndex = 0; //시작index
	private int prevPage; //이전페이지
	private int nextPage; // 다음페이지
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getRangeSize() {
		return rangeSize;
	}
	public void setRangeSize(int rangeSize) {
		this.rangeSize = rangeSize;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getCurRange() {
		return curRange;
	}
	public void setCurRange(int curPage) {
		this.curRange = (int)((curPage-1)/rangeSize)+1;
	}
	public int getListCnt() {
		return listCnt;
	}
	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}
	public int getPageCnt() {
		return pageCnt;
	}
	public void setPageCnt(int listCnt) {
		this.pageCnt = (int) Math.ceil(listCnt*1.0/pageSize);
	}
	public int getRangeCnt() {
		return rangeCnt;
	}
	public void setRangeCnt(int pageCnt) {
		this.rangeCnt = (int) Math.ceil(pageCnt*1.0/rangeSize);
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int curPage) {
		this.startIndex = (curPage-1)*pageSize;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public Pagination() {
		super();
	}
	public Pagination(int listCnt, int curPage) {
		setCurPage(curPage);
		setListCnt(listCnt);
		//총페이지 수 
		setPageCnt(listCnt);
		setRangeCnt(pageCnt);
		rangeSetting(curPage);
		setStartIndex(curPage);
	}
	private void rangeSetting(int curPage) {
		setCurRange(curPage);
		this.startPage = (curRange - 1) * rangeSize + 1;
		this.endPage = startPage + rangeSize - 1;
		
		if(endPage > pageCnt) {
			this.endPage = pageCnt;
		}
		this.prevPage = curPage - 1;
		this.nextPage = curPage + 1;
	}
	
	
	
}
