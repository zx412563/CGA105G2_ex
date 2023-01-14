<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<html class="no-js" lang="en">

<head>
  <meta charset="utf-8" />
  <meta http-equiv="x-ua-compatible" content="ie=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

  <title>🗃️管理</title>
  <!-- Bootstrap css -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
    integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous" />
  <!-- jquery 3.4.1  css -->
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/CGA105G2/resources/demos/style.css">

  <link rel="stylesheet" href="/CGA105G2/assets/css/vendor.css" />
  <link rel="stylesheet" href="/CGA105G2/assets/css/style.css" />
  <link rel="stylesheet" href="/CGA105G2/assets/custom.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <!-- <link rel="stylesheet" href="/assets/css/carousel.css" /> -->


  <style>
    body {
      height: 100%;
    }

    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      -ms-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }

    a {
      color: black;
    }
  </style>
</head>

<body>
  <div id="page-start-anchor"></div>

  <!-- header start -->
  <section class="header header-fixed-xl">
    <div class="header-main bg-warning">
      <div class="container" style="max-width: 1400px">
        <div class="row" style="max-width: 1400px">
          <nav class="navbar navbar-expand-lg navbar-light fs-md-6" id="header-navbar">
            <!-- @*Navbar(白色)*@ -->
            <div>
              <a class="navbar-brand font-weight-bold" href="Member.html">
                <img src="/CGA105G2/assets/images/Logo.PNG" style="width: 100px; height: 100px" alt="" /></a>
            </div>
            <form class="form-inline my-2 my-md-0">
              <input class="form-control" type="text" placeholder="Search">
            </form>

            <!--            ps-->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
              aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav ml-auto">
                <div class="navbar-spacer"></div>
                <div class="navbar-spacer"></div>
                <li class="nav-item">
                  <a class="nav-link text-uppercase" data-toggle="none" href="./ContactUs.html">
                    📭聯繫我們
                  </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-uppercase" data-toggle="none" href="./ContactUs.html">
                    🌟
                  </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-uppercase" data-toggle="none" href="./MemberLogin.html">
                    💰point
                  </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-uppercase" data-toggle="none" href="./Waiting.html">
                    🛒
                  </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-uppercase active disabled" data-toggle="none"
                    style="color: #216a51 !important;" href="./AboutUS.html">
                    🗃️管理
                  </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-uppercase" data-toggle="none" href="home.html">
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


  <!-- main -->
  <div class="container-fluid">
    <div class="row">
      <nav id="sidebar" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
        <div class="p-4 pt-5">
          <ul class="list-unstyled components mb-5">
            <li class="my-4">
              <a href="#">
                <h2>Home</h2>
                
              </a>
            </li>
            <li class="my-4">
              <a href="#pageSubmenu1" data-toggle="collapse" aria-expanded="false" class="dropdown fs-md-6">
                <span>🔻</span> 優惠券
              </a>
              <ul class="list-unstyled collapse " id="pageSubmenu1">
                <li>
                  <hr><a href="Member_code1.html" class="nav-link">🔆有效優惠券</a>
                </li>
                <li><a href="Member_code2.html" class="nav-link">🔆歷史查詢</a>
                  <hr>
                </li>
              </ul>
            </li>
            <li class="my-4">
              <a href="#pageSubmenu2" data-toggle="collapse" aria-expanded="false" class="dropdown fs-md-6">
                <span>🔻</span> 訂單
              </a>
              <ul class="list-unstyled collapse" id="pageSubmenu2">
                <li>
                  <hr><a href="#" class="nav-link">🔆待出貨</a>
                </li>
                <li><a href="#" class="nav-link">🔆待評價</a></li>
                <li><a href="#" class="nav-link">🔆歷史查詢</a>
                  <hr>
                </li>
              </ul>
            </li>
            <li class="my-4">
              <a href="#pageSubmenu3" data-toggle="collapse" aria-expanded="false" class="dropdown fs-md-6">
                <span>🔻</span> 訂位
              </a>
              <ul class="collapse list-unstyled" id="pageSubmenu3">
                <li>
                  <hr><a href="#" class="nav-link">🔆已預約</a>
                </li>
                <li><a href="#" class="nav-link">🔆用餐評價</a></li>
                <li><a href="#" class="nav-link">🔆訂位紀錄</a>
                  <hr>
                </li>
              </ul>
            </li>
            <li class="my-4">
              <a href="#pageSubmenu4" data-toggle="collapse" aria-expanded="false" class="dropdown fs-md-6">
                <span>🔻</span> 設定
              </a>
              <ul class="collapse list-unstyled" id="pageSubmenu4">
                <li>
                  <hr><a href="#" class="nav-link">🔆基本資料</a>
                </li>
                <li><a href="#" class="nav-link">🔆收件地址</a></li>
                <li><a href="#" class="nav-link">🔆付款方式</a></li>
                <li><a href="#" class="nav-link">🔆變更密碼</a>
                  <hr>
                </li>
              </ul>
            </li>
          </ul>
        </div>
      </nav>
      <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4 "   >
        <div class=" container p-10" style="width: 800px; height:900px;">
          <section class="section-content  py-10 mt-10 mb-10 card shadow bg-yellow-10" id="contacts"
            style="border: 2px solid rgba(19, 6, 197, 0.089); border-radius: 30px;">
            <div class="col-12 col-lg-8 mb-14 mb-lg-0 container">
              <h1 class="text-center mt-5">🔆候位登記</h1>
              <form action="#" class="row mt-17">
                <div class="col-12 my-5">
                  <div class="form-group text-center">
                    <label for="CODE_TEXT" class="form-label fs-md-6 font-black font-weight-bold">目前候位組數</label>
                    <input id="CODE_TEXT" class="form-control col-md-3  mx-auto " disabled value="1">
                  </div>
                  <div class="col-12 col-sm-12 my-5">
                    <div class="form-group">
                      <label for="CODE_NUM" class="form-label fs-md-6  font-weight-bold ">姓名</label>
                      <input type="text" class="form-control" id="CODE_NUM" />
                    </div>
                  </div>
                  <div class="col-12 col-sm-12 my-5">
                    <div class="form-group">
                      <label for="CODE_OFF" class="form-label fs-md-6 font-black font-weight-bold">人數</label>
                      <input type="text" class="form-control" id="CODE_OFF" />
                    </div>
                  </div>
                  <div class="col-12 col-sm-12 my-5">
                    <div class="form-group">
                      <label for="CODE_OFF2" class="form-label fs-md-6 font-black font-weight-bold">電話</label>
                      <input type="text" class="form-control" id="CODE_OFF2" />
                    </div>
                  </div>
  
                  <div class="form-group mb-0">
                    <button class="btn btn-outline-info btn-lg fs-8 container" style="border-radius: 20px;"
                      onclick="addWaitAlert()">送出</button>
                  </div>
                </div>
              </form>
            </div>
          </section>
          
        </div>


        <canvas class="my-4 w-100" id="myChart" width="900" height="100"></canvas>
      </main>
    </div>
  </div>

  <!-- main -->

  <!-- footer start -->
  <section class="footer bg-warning" style=" width: 100%; position:relative; bottom:0; top:30%">
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
  <script>
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
    function addWaitAlert() {
      const swalWithBootstrapButtons = Swal.mixin({
        customClass: {
          confirmButton: 'btn btn-outline-primary m-5 fs-5',
        },
        buttonsStyling: false
      })

      swalWithBootstrapButtons.fire({
        position: 'middle',
        icon: 'success',
        title: '登記成功',
        showConfirmButton: false,
        timer: 1500
      })
    }
  </script>
</body>

</html>