package cc.spring.dto;

import java.security.Timestamp;

public class MyShopListDTO {
	private int applyCode;
	private int memberCode;
	private int quantity;
	private Timestamp applyDate;
	private String clientId;
	private String name;
	private String phone;
	private String email;
	private String zipcode;
	private String address1;
	private String address2;
	private String companyName;
	private int groupbuyingCode;
	private int businessCode;
	private int statusCode;
	private Timestamp deadLine;
	private String title;
	private String productName;
	private String productPrice;
	private Timestamp regDate;
	private String path;
	private String sysName;
	
	public MyShopListDTO() {}
	//일반회원 구매목록용 생성자
	public MyShopListDTO(int applyCode,int membercode,int quantity,Timestamp applyDate,String name,String companyName,
			int groupbuyingCode,int businessCode,int statusCode,Timestamp deadLine,String title, String productName,
			String productPrice,Timestamp regDate,String path,String sysName ) {
		super();
		this.applyCode = applyCode;
		this.memberCode = membercode;
		this.quantity = quantity;
		this.applyDate = applyDate;
		this.name = name;
		this.companyName = companyName;
		this.groupbuyingCode = groupbuyingCode;
		this.businessCode = businessCode;
		this.statusCode = statusCode;
		this.deadLine = deadLine;
		this.title = title;
		this.productName = productName;
		this.productPrice = productPrice;
		this.regDate = regDate;
		this.path = path;
		this.sysName = sysName;
	}
	
	//사업자회원 공구글별 구매자 정보 리스트용 생성자
	public MyShopListDTO(int applyCode, int memberCode, int quantity, Timestamp applyDate, 
			String clientId, String name,String phone, String email, String zipcode, String address1, String address2, String productPrice) {
		super();
		this.applyCode = applyCode;
		this.memberCode = memberCode;
		this.quantity = quantity;
		this.applyDate = applyDate;
		this.clientId = clientId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.zipcode= zipcode;
		this.address1 = address1;
		this.address2 = address2;
		this.productPrice = productPrice;
	}
	
	
	public int getApplyCode() {
		return applyCode;
	}
	public void setApplyCode(int applyCode) {
		this.applyCode = applyCode;
	}
	public int getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Timestamp getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getGroupbuyingCode() {
		return groupbuyingCode;
	}
	public void setGroupbuyingCode(int groupbuyingCode) {
		this.groupbuyingCode = groupbuyingCode;
	}
	public int getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(int businessCode) {
		this.businessCode = businessCode;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Timestamp getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Timestamp deadLine) {
		this.deadLine = deadLine;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	@Override
	public String toString() {
		return "MyShopListDTO [applyCode=" + applyCode + ", memberCode=" + memberCode + ", quantity=" + quantity
				+ ", applyDate=" + applyDate + ", name=" + name + ", companyName=" + companyName + ", groupbuyingCode="
				+ groupbuyingCode + ", businessCode=" + businessCode + ", statusCode=" + statusCode + ", deadLine="
				+ deadLine + ", title=" + title + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", regDate=" + regDate + ", path=" + path + ", sysName=" + sysName + "]";
	}

	
}