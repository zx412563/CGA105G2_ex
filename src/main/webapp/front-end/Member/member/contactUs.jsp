<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


	<!DOCTYPE html>
	<html class="no-js" lang="en">

	<head>
		<meta charset="utf-8" />
		<meta http-equiv="x-ua-compatible" content="ie=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

		<title>🗃️管理</title>
		<!-- Bootstrap css -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
			integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
			crossorigin="anonymous" />
		<!-- jquery 3.4.1  css -->
		<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
		<link rel="stylesheet" href="/resources/demos/style.css">

		<link rel="stylesheet" href="/CGA105G2/assets/css/vendor.css" />
		<link rel="stylesheet" href="/CGA105G2/assets/css/style.css" />
		<link rel="stylesheet" href="/CGA105G2/assets/custom.css">
		<link rel="stylesheet" href="/CGA105G2/assets/fonts/font-awesome/css/font-awesome.css" />
		<!-- <link rel="stylesheet" href="/CGA105G2/assets/css/carousel.css" /> -->



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

			@media (min-width : 768px) {
				.bd-placeholder-img-lg {
					font-size: 3.5rem;
				}
			}

			a {
				color: black;
			}
		</style>
	</head>

	<body class="bg-cyan-10">
		<div id="page-start-anchor"></div>

		<!-- header start -->
		<section class="header header-fixed-xl">
			<div class="header-main bg-warning">
				<div class="container" style="max-width: 1400px">
					<div class="row" style="max-width: 1400px">
						<nav class="navbar navbar-expand-lg navbar-light fs-md-6" id="header-navbar">
							<!-- @*Navbar(白色)*@ -->
							<div>
								<a class="navbar-brand font-weight-bold" href="/CGA105G2/"> <img
										src="/CGA105G2/assets/images/Logo.PNG" style="width: 100px; height: 100px"
										alt="" /></a>
							</div>
							<form class="form-inline my-2 my-md-0 bg-white p-1 " style="border-radius: 30px;">
								<div class="single-icon" data-toggle="tooltip" title="" data-original-title="search"
									style="border: 0;">
									<i class="material-icons">search</i>
								</div>

								<input class="form-control " type="text" placeholder="Search"
									style="border: 0; border-radius: 30px;">
							</form>

							<!--            ps-->
							<button class="navbar-toggler" type="button" data-toggle="collapse"
								data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
								aria-expanded="false" aria-label="Toggle navigation">
								<span class="navbar-toggler-icon"></span>
							</button>
							<div class="collapse navbar-collapse" id="navbarSupportedContent">
								<ul class="navbar-nav ml-auto">
									<div class="navbar-spacer"></div>
									<div class="navbar-spacer"></div>
									<li class="nav-item"><a class="nav-link text-uppercase active"
											style="color: #216a51;" data-toggle="none"
											href="/CGA105G2/front-end/member/member/contactUs.html">
											📭聯繫我們 </a></li>
									<li class="nav-item"><a class="nav-link text-uppercase" data-toggle="none"
											href="/CGA105G2/front-end/member/saveArt/selectSaveArtByArticle.html">
											🌟 </a></li>
									<li class="nav-item"><a class="nav-link text-uppercase" data-toggle="none"
											href="/CGA105G2/front-end/member/point/listPoint.html">
											💰point </a></li>
									<li class="nav-item"><a class="nav-link text-uppercase" data-toggle="none"
											href="/CGA105G2/front-end/member/goods/goodsCart.html"> 🛒
										</a></li>
									<li class="nav-item"><a class="nav-link text-uppercase " data-toggle="none"
											href="/CGA105G2/front-end/member/code/listAllCode.html">
											🗃️管理 </a></li>
									<li class="nav-item"><a class="nav-link text-uppercase" data-toggle="none"
											href="/CGA105G2/"> 🚪Sing out </a></li>
								</ul>
							</div>
						</nav>
					</div>
				</div>
			</div>
		</section>
		<!-- header end -->

		<!-- main -->


		<!-- "contacts" section start -->
		<div class="container col-6 mx-auto card shadow my-5 bg-secondary" style="border-radius: 20px;">
			<section class=" container p-4" id="contacts">
				<div class="container p-4">
					<div class="">
						<div class="col-12  mb-14 mb-lg-0">
						
							<h1 class="text-center">聯繫我們</h1>
							<form action="#" class="row mt-17">
								<div class="col-12 ">
									<div class="form-group">
										<label for="name" class="form-label font-weight-bold">Name</label> <input type="text"
											class="form-control" id="name" />
									</div>
								</div>

								<div class="col-12 col-sm-6">
									<div class="form-group">
										<label for="phone" class="form-label  font-weight-bold">Phone</label> <input type="text"
											class="form-control" id="phone" />
									</div>
								</div>
								<div class="col-12 col-sm-6">
									<div class="form-group">
										<label for="email" class="form-label font-weight-bold">Email</label> <input type="text"
											class="form-control" id="email" />
									</div>
								</div>
								<div class="col-12">
									<div class="form-group">
										<label for="message" class="form-label font-weight-bold">Message</label>
										<textarea id="message" class="form-control" rows="3"></textarea>
									</div>

									<div class="form-group mb-0 text-center">
										<button class="btn btn-primary btn-lg  text-center">Send message</button>
									</div>
								</div>
							</form>
						</div>

					</div>
				</div>
			</section>
		</div>

		<!-- "contacts" section end -->


		<!-- main -->

		<!-- footer start -->
		<section class="footer bg-warning" style="width: 100%; position: relative; bottom: 0; top: 30%">
			<div class="container">
				<!-- 三張小圖 -->
				<div class="d-flex align-items-stretch justify-content-md-center py-10">
					<!-- 地址 -->
					<div class="card border-0 bg-secondary mb-4 ml-lg-9 w-25">
						<div class="card-body py-17 px-10 text-center">
							<div class="card-icon mb-6">
								<i class="material-icons">map</i>
							</div>
							<div
								class="fs-1 lh-1 my-5 font-family-secondary text-uppercase font-weight-bold letter-spacing-caption text-muted">
								Our address</div>
							<p class="mb-0 text-body">
								桃園市中壢區復興路46號9樓<br />Hollow Lane. NY 11706.
							</p>
						</div>
					</div>
					<!-- 電話 -->
					<div class="card border-0 bg-secondary mb-4 ml-lg-9 w-25">
						<div class="card-body py-17 px-10 text-center">
							<div class="card-icon mb-6">
								<i class="material-icons">phone</i>
							</div>
							<div
								class="fs-1 lh-1 my-5 font-family-secondary text-uppercase font-weight-bold letter-spacing-caption text-muted">
								連絡電話</div>
							<p class="mb-0 text-body">0800-087-087</p>
						</div>
					</div>
					<!-- 營業時間 -->
					<div class="card border-0 bg-secondary mb-4 ml-lg-9 w-25">
						<div class="card-body py-17 px-10 text-center">
							<div class="card-icon mb-6">
								<i class="material-icons">access_time</i>
							</div>
							<div
								class="fs-1 lh-1 my-5 font-family-secondary text-uppercase font-weight-bold letter-spacing-caption text-muted">
								營業時間</div>
							<p class="mb-0 text-body">11:00 AM - 9:00 PM</p>
						</div>
					</div>
				</div>
				<!-- 跳轉到社群連結 -->
				<div class="d-flex align-items-center justify-content-center">
					<a href="home.html" class="footer-brand">FoodMap</a>
					<div class="brand-icons-list ml-10 ml-sm-20">
						<!-- FB圖案 -->
						<a href="#" class="brand-icon brand-icon-circle brand-icon-facebook"> <i
								class="fa fa-facebook-f"></i>
						</a>
						<!-- twitter圖案 -->
						<a href="#" class="brand-icon brand-icon-circle brand-icon-twitter">
							<i class="fa fa-twitter "></i>
						</a>
						<!-- ig圖案-->
						<a href="#" class="brand-icon brand-icon-circle brand-icon-instagram"> <i
								class="fa fa-pinterest-p"></i>
						</a>
					</div>
				</div>
				<!-- 頁底文字 -->
				<small class="d-flex align-items-center justify-content-center" style="margin: 0px -10px 0px -10px;">
					TibaMe CGA105_2
					MapFood <a href="#" data-toggle="smooth-scroll" data-target="#page-start-anchor"> <i
							class="material-icons text-black">arrow_upward</i>
					</a>
				</small>
			</div>
		</section>
		<!-- footer end -->

		<script src="/CGA105G2/assets/js/vendor.js"></script>
		<script src="/CGA105G2/assets/js/polyfills.js"></script>
		<script src="/CGA105G2/assets/js/app.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/clipboard.js/2.0.0/clipboard.min.js"></script>

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
	</body>

	</html>