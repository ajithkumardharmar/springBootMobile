
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet" href="assets/css/user.css">
<title>Mobile Info Page</title>
<script src="assets/javascript/addCart.js"></script>
</head>

<body>
	<jsp:include page="userHeader.jsp"></jsp:include>


	
		<div class="body_main">

			<a><img class="rounded" id="41" src="${selectedProduct.url}"
				alt=""></a>
			<div class="phoneInfo">
				<pre>${selectedProduct.description}
</pre>

				<div class="but_lo">
					<button type="button" class="btn btn-primary"
						onclick="addCartItem('${selectedProduct.productId}')">Add Cart</button>

					<a style="margin-left: 50px;" class="btn btn-success"
						href="MobileBuy?price=${selectedProduct.listPrice}&productId=${selectedProduct.productId}">Buy</a>
				</div>
			</div>
		</div>
	





</body>
</html>