<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <c:set var="path" value="${pageContext.request.contextPath}"/>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JQuery-->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<!-- Bootstrap - CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<!-- Bootstrap - JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<!-- Bootstrap - icon -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css"
	rel="stylesheet">
<!-- Font 기본 : {font-family: 'NanumSquareNeoBold'}-->
<link
	href="https://hangeul.pstatic.net/hangeul_static/css/nanum-square-neo.css"
	rel="stylesheet">
<!-- awesome font -icon -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
	rel="stylesheet"
	integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<!-- gbn css -->
<link href="${path}/resources/css/gnb.css" rel="stylesheet" type="text/css">
<style>
   * {
      font-family: NanumSquareNeo;
    }

    input{
      border-radius: 5px;
      padding: 5px;
    }
    .container {
      margin-top: 100px;
      border: 1px solid black;
    }
    th,
  td {
    font-size: 20px;
  }
  </style>
  
</head>
<body>
	<c:import url="../commons/gnb.jsp">
		</c:import>


  <div class="container">
    <br>

    <div class="header position-relative">

      <div class="checkbox ">

        <div class="form-check form-check-inline">
          <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
          <label class="form-check-label" for="inlineCheckbox1">일상</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
          <label class="form-check-label" for="inlineCheckbox2">정보</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
          <label class="form-check-label" for="inlineCheckbox2">질문</label>
        </div>

      </div>


      
        <div class="position-absolute top-0 end-0">

          <input type="text" placeholder="제목이나 작성자로 검색">
          <button class="btn btn-outline-primary" type="button"><i class="bi bi-search"></i></button>
         
        </div>

    

    </div>

    <div class="table-responsive mt-5">

      <table class="table table-hover">
        <thead>
          <tr style="font-size: large;">
            <th>번호</th>
            <th>제목</th>
            <th>글쓴이</th>
            <th>작성일</th>
            <th>조회수</th>
            <th>추천수</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>265121</td>
            <td>엌 아래글 진짜 관리자임?</td>
            <td>ㅇㅇ</td>
            <td>2020.04.23</td>
            <td>1000</td>
            <td>100</td>
          </tr>
          <tr>
            <td>265120</td>
            <td>본인 방금 추천 많이 받아서 개념글 상상함</td>
            <td>운영자</td>
            <td>2020.04.23</td>
            <td>7000</td>
            <td>150</td>
          </tr>
          <tr>
            <td>265121</td>
            <td>엌 아래글 진짜 관리자임?</td>
            <td>ㅇㅇ</td>
            <td>2020.04.23</td>
            <td>1000</td>
            <td>100</td>
          </tr>
          <tr>
            <td>265120</td>
            <td>본인 방금 추천 많이 받아서 개념글 상상함</td>
            <td>운영자</td>
            <td>2020.04.23</td>
            <td>7000</td>
            <td>150</td>
          </tr>
          <tr>
            <td>265121</td>
            <td>엌 아래글 진짜 관리자임?</td>
            <td>ㅇㅇ</td>
            <td>2020.04.23</td>
            <td>1000</td>
            <td>100</td>
          </tr>
          <tr>
            <td>265120</td>
            <td>본인 방금 추천 많이 받아서 개념글 상상함</td>
            <td>운영자</td>
            <td>2020.04.23</td>
            <td>7000</td>
            <td>150</td>
          </tr>
          <tr>
            <td>265121</td>
            <td>엌 아래글 진짜 관리자임?</td>
            <td>ㅇㅇ</td>
            <td>2020.04.23</td>
            <td>1000</td>
            <td>100</td>
          </tr>
          <tr>
            <td>265120</td>
            <td>본인 방금 추천 많이 받아서 개념글 상상함</td>
            <td>운영자</td>
            <td>2020.04.23</td>
            <td>7000</td>
            <td>150</td>
          </tr>
          <tr>
            <td>265121</td>
            <td>엌 아래글 진짜 관리자임?</td>
            <td>ㅇㅇ</td>
            <td>2020.04.23</td>
            <td>1000</td>
            <td>100</td>
          </tr>
          <tr>
            <td>265120</td>
            <td>본인 방금 추천 많이 받아서 개념글 상상함</td>
            <td>운영자</td>
            <td>2020.04.23</td>
            <td>7000</td>
            <td>150</td>
          </tr>

        </tbody>
      </table>

      <br>

      <nav aria-label="...">
        <ul class="pagination justify-content-center">
          <li class="page-item disabled">
            <a class="page-link">
              < </a>
          </li>
          <li class="page-item"><a class="page-link" href="#">1</a></li>
          <li class="page-item active" aria-current="page">
            <a class="page-link" href="#">2</a>
          </li>
          <li class="page-item"><a class="page-link" href="#">3</a></li>
          <li class="page-item">
            <a class="page-link" href="#">></a>
          </li>
        </ul>
        
      </nav>

	<div style="float:right;">
 	 <a href="/board/freeWrite"><button class="btn btn-outline-primary" type="button">작성하기</button></a> 
 	 </div>
      
     
      
    </div>

  </div>
	
  <script>
  $(".btn").on("click",function(){
		 a href="/board/write";
	})
  </script>
</body>
</html>