<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html class="no-js" lang="en">


<head>
    <meta charset="utf-8" />
    <meta http-equiv="x-ua-compatible" content="ie=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <title>後台</title>
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
        integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous" />

    <link rel="stylesheet" href="/CGA105G2/assets/css/vendor.css" />
    <link rel="stylesheet" href="/CGA105G2/assets/css/style.css" />
    <link rel="stylesheet" href="/CGA105G2/assets/custom.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        a {
            color: black;
        }

        .bg-warning {
            background-color: pink !important;

        }

        .get-in-touch {
            max-width: 800px;
            margin: 50px auto;
            position: relative;

        }

        .get-in-touch .title {
            text-align: center;
            text-transform: uppercase;
            letter-spacing: 3px;
            font-size: 3.2em;
            line-height: 48px;
            padding-bottom: 48px;
            color: #5543ca;
            background: #5543ca;
            background: -moz-linear-gradient(left, #f4524d 0%, #5543ca 100%) !important;
            background: -webkit-linear-gradient(left, #f4524d 0%, #5543ca 100%) !important;
            background: linear-gradient(to right, #f4524d 0%, #5543ca 100%) !important;
            /* -webkit-background-clip: text !important; */
            -webkit-text-fill-color: transparent !important;
        }

        .contact-form .form-field {
            position: relative;
            margin: 32px 0;
        }

        .contact-form .input-text {
            display: block;
            width: 100%;
            height: 36px;
            border-width: 0 0 2px 0;
            border-color: #5543ca;
            font-size: 18px;
            line-height: 26px;
            font-weight: 400;
        }

        .contact-form .input-text:focus {
            outline: none;
        }

        .contact-form .input-text:focus+.label,
        .contact-form .input-text.not-empty+.label {
            -webkit-transform: translateY(-24px);
            transform: translateY(-24px);
        }

        .contact-form .label {
            position: absolute;
            left: 20px;
            bottom: 11px;
            font-size: 18px;
            line-height: 26px;
            font-weight: 400;
            color: #5543ca;
            cursor: text;
            transition: -webkit-transform .2s ease-in-out;
            transition: transform .2s ease-in-out;
            transition: transform .2s ease-in-out,
                -webkit-transform .2s ease-in-out;
        }

        .contact-form .submit-btn {
            display: inline-block;
            background-color: #000;
            background-image: linear-gradient(125deg, #a72879, #064497);
            color: #fff;
            text-transform: uppercase;
            letter-spacing: 2px;
            font-size: 16px;
            padding: 8px 16px;
            border: none;
            width: 200px;
            cursor: pointer;
        }

        #div11 {
            width: 500px;
            text-align: center;
            margin: 0 auto;
        }
    </style>

</head>

<body>
    <div id="page-start-anchor"></div>

    <!-- header start -->
    <section class="header header-fixed-xl">
        <div class="header-main bg-warning">
            <div class="container" style="max-width: 1400px ">
                <div class="row" style="max-width: 1400px">
                    <nav class="navbar navbar-expand-lg navbar-light fs-md-6" id="header-navbar">
                        <!-- @*Navbar(白色)*@ -->
                        <a class="navbar-brand font-weight-bold" href="StoreStart.html">
                            <img src="/CGA105G2/assets/images/Logo.PNG" style="width: 100px; height: 100px" alt="" />FoodMap</a>
                        <!--            ps-->
                        <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ml-auto ">
                                <div class="navbar-spacer"></div>
                                <div class="navbar-spacer"></div>
                                <li class="nav-item">
                                    <a class="nav-link text-uppercase" data-toggle="none" href="./ContactUs.html">
                                        🚩前台查詢
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-uppercase" data-toggle="none" href="./Backstage-4.html">
                                        ✔️審核
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-uppercase" data-toggle="none" href="<%=request.getContextPath()%>/back-end/emp/empIndex2.jsp">
                                        📔訂單
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-uppercase active " data-toggle="none" href="<%=request.getContextPath()%>/back-end/emp/empIndex2.jsp">
                                        🗃️管理
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-uppercase" data-toggle="none" href="./Waiting.html">
                                        🚪Sing out
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </section>
    <!-- header end -->

    <!-- main -->
    <div class="container-fluid">
        <div class="row">
            <nav id="sidebar" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
                <div class="p-4 pt-5 sidebar__inner">
					<ul class="list-unstyled components mb-5 mt-5">
						<li class="mb-5 mt-5"><a href="#">
								<h2>員工管理</h2>
						</a></li>
						<li class="mb-5 mt-5"><a href="#pageSubmenu2"
							data-toggle="collapse" aria-expanded="false" class="dropdown">
								<h3>🔻員工資料</h3>
						</a>
							<ul class="list-unstyled collapse" id="pageSubmenu2">
									<hr>
								
								<li>
									<a href="<%=request.getContextPath()%>/back-end/emp/updateEmp2.jsp" >🔆員工查詢</a>
								</li>
								<li><a href="<%=request.getContextPath()%>/back-end/emp/addEmp2.jsp">🔆員工新增</a></li>
								<hr></li>
					</ul>
					</li>
					<li class="mb-5 mt-5"><a href="#pageSubmenu3"
						data-toggle="collapse" aria-expanded="false" class="dropdown">
							<h3>🔻員工權限</h3>
					</a>
						<ul class="collapse list-unstyled" id="pageSubmenu3">
							<li>
								<hr>
								<a href="./Backstage-empPer.html">🔆權限設定</a>
							</li>
							<li><a href="./Backstage-empPerAdd.html">🔆新增權限</a></li>
							<hr></li>
					</ul>
					</li>
					</ul>
				</div>
            </nav>
            <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4 shadow">
                <div
                    class=" d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-15 mt-5 border-bottom">
                    <h1 class="h2">🔆員工新增</h1>

                </div>
                <c:if test="${not empty errorMsgs}">
	<font style="color:red">請修正以下錯誤:</font>
	<ul>
		<c:forEach var="message" items="${errorMsgs}">
			<li style="color:red">${message}</li>
		</c:forEach>
	</ul>
</c:if>
                <div class=" shadow card-body  rounded mb-20 bg-secondary " id="div11" style="border-radius: 30px;">
                    <form METHOD="post" ACTION="<%=request.getContextPath()%>/back-end/emp/test" name="form1">
                        <div class="form-group ">
                            <label for="exampleInputname" >員工帳號</label><br>
                            <span id="select2" style="color:red"></span>
                            <input type="TEXT" id="select1" name="acc" class="form-control" id="exampleInputname" placeholder="name">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">員工密碼</label><br>
                            <span id="select4" style="color:red"></span>
                            <input type="password" id="select3" name="pwd" class="form-control" id="exampleInputPassword1"
                                placeholder="Password">
                        </div>
                        <input type="hidden" name="action" value="insert">

                        <button type="submit" class="btn btn-outline-dark mb-1 " data-toggle="modal"
                            data-target="#exampleModalCenter" onclick="addEmpAlert()">Submit</button>
                    </form>
                </div>

                <!-- 可刪(SweetAlert取代) -->
                <!-- <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog"
                    aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                    <div class="modal-dialog modal-dialog-centered" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalCenterTitle">Modal title</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                新增成功
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-outline-dark mb-1" data-dismiss="modal">關閉</button>
                                <button type="button" class="btn btn-outline-dark mb-1">確定</button>
                            </div>
                        </div>
                    </div>
                </div> -->

            </main>
            <section class="jumbotron jumbotron-fluid mb-0 bg-secondary">

            </section>



        </div>
    </div>




    <!-- main -->


    <!-- footer start -->
    <section class="footer " style=" width: 100%; position:relative; bottom:0; top:30% ;background-color:pink">
        <div class="container">
            <!-- 三張小圖 -->
            <div class="d-flex align-items-stretch justify-content-md-center py-10">
                <!-- 地址 -->
                <div class="card border-0 bg-secondary mb-4 ml-lg-9 w-25">
                    <div class="card-body py-17 px-10 text-center">
                        <div class="card-icon mb-6"><i class="material-icons">map</i></div>
                        <div
                            class="fs-1 lh-1 my-5 font-family-secondary text-uppercase font-weight-bold letter-spacing-caption text-muted">
                            Our address
                        </div>
                        <p class="mb-0 text-body">桃園市中壢區復興路46號9樓<br />Hollow Lane. NY 11706.</p>
                    </div>
                </div>
                <!-- 電話 -->
                <div class="card border-0 bg-secondary mb-4 ml-lg-9 w-25">
                    <div class="card-body py-17 px-10 text-center">
                        <div class="card-icon mb-6"><i class="material-icons">phone</i></div>
                        <div
                            class="fs-1 lh-1 my-5 font-family-secondary text-uppercase font-weight-bold letter-spacing-caption text-muted">
                            連絡電話
                        </div>
                        <p class="mb-0 text-body">0800-087-087</p>
                    </div>
                </div>
                <!-- 營業時間 -->
                <div class="card border-0 bg-secondary mb-4 ml-lg-9 w-25">
                    <div class="card-body py-17 px-10 text-center">
                        <div class="card-icon mb-6"><i class="material-icons">access_time</i></div>
                        <div
                            class="fs-1 lh-1 my-5 font-family-secondary text-uppercase font-weight-bold letter-spacing-caption text-muted">
                            營業時間
                        </div>
                        <p class="mb-0 text-body">11:00 AM - 9:00 PM</p>
                    </div>
                </div>
            </div>
            <!-- 跳轉到社群連結 -->
            <div class="d-flex align-items-center justify-content-center">
                <a href="home.html" class="footer-brand">FoodMap</a>
                <div class="brand-icons-list ml-10 ml-sm-20">
                    <!-- FB圖案 -->
                    <a href="#" class="brand-icon brand-icon-circle brand-icon-facebook">
                        <i class="fa fa-facebook-f"></i>
                    </a>
                    <!-- twitter圖案 -->
                    <a href="#" class="brand-icon brand-icon-circle brand-icon-twitter">
                        <i class="fa fa-twitter "></i>
                    </a>
                    <!-- ig圖案-->
                    <a href="#" class="brand-icon brand-icon-circle brand-icon-instagram">
                        <i class="fa fa-pinterest-p"></i>
                    </a>
                </div>
            </div>
            <!-- 頁底文字 -->
            <small class="d-flex align-items-center justify-content-center" style="margin:0px -10px 0px -10px;">
                TibaMe CGA105_2 MapFood
                <a href="#" data-toggle="smooth-scroll" data-target="#page-start-anchor">
                    <i class="material-icons text-black">arrow_upward</i>
                </a>
            </small>
        </div>
    </section>
    <!-- footer end -->

    <script src="/CGA105G2/assets/js/vendor.js"></script>
    <script src="/CGA105G2/assets/js/polyfills.js"></script>
    <script src="/CGA105G2/assets/js/app.js"></script>

    <!-- Bootstrap 4.6.2 & Vue 3 & jquery 3.4.1-->

    <!-- Bootstrap js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>

    <!-- Vue -->
    <script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>

    <script style="height: 50px;">
        const { createApp } = Vue;

        createApp({
            data() {
                return {
                    message: "Hello Vue!",
                };
            },
        }).mount("#app");
    </script>

    <!-- stickey bar: -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sticky-sidebar/3.3.1/sticky-sidebar.min.js"></script>

    <script>
        let a = new StickySidebar("#sidebar", {
            topSpacing: 40,
            bottomSpacing: 20,
            containerSelector: ".container",
            innerWrapperSelector: ".sidebar__inner"
        });
    </script>


    <!-- sweetalert2 -->
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@9"></script>
    <script>
        function addEmpAlert() {
            const swalWithBootstrapButtons = Swal.mixin({
                customClass: {
                    confirmButton: 'btn btn-outline-primary m-5 fs-5',

                },
                buttonsStyling: false
            })

            swalWithBootstrapButtons.fire({
                position: 'middle',
                icon: 'success',
                title: '新增成功',
                showConfirmButton: false,
                timer: 1500
            })
        }
    </script>
    <script>
  
          
        document.getElementById('select1').onblur = function( ) {
        	if(select1.value===null||select1.value===""){
            document.getElementById('select2').innerHTML="帳號請勿空白"
        	}else if (select1.value.length<2||select1.value.length>10 ){
        	document.getElementById('select2').innerHTML="請輸入長度2~12位英文或數字"
        	}else{
        		document.getElementById('select2').innerHTML="	"
        	};    
        };
        
        document.getElementById('select3').onblur = function( ) {
        	if(select1.value===null||select1.value===""){
            document.getElementById('select4').innerHTML="密碼請勿空白"
        	}else if (select1.value.length<2||select1.value.length>10 ){
        	document.getElementById('select4').innerHTML="請輸入長度2~12位英文或數字"
        	}else{
        		document.getElementById('select2').innerHTML="	"
        	};    
        };
    </script>

</body>

</html>