<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="aggiungi" method="post">
 <p class="text-xl-center">Inserisci Nome</p>
    <input type="text" class="form-control" id="nome" name="nome" style="width:250px; height:50px;margin:auto" required="required" placeholder="Nome">
      <p class="text-xl-center">Inserisci Cognome</p>
    <input type="text" class="form-control " id="cognome" name="cognome" style="width:250px; height:50px;margin:auto" required="required" placeholder="Cognome">
     <p class="text-xl-center">Inserisci Numero</p>
    <input type="number" class="form-control " id="numero" name="numero" style="width:250px; height:50px;margin:auto" required="required" placeholder="Numero">
    
      <br><input type="submit" class ="btn btn-primary btn-md"  value="Aggiungi">
  <br><br>
  <div class="container">
		<div class="row">
			<div class="col-xl align-self-center ">
				<table class="table table-striped">

					<tr>
						<th><h5>
								<p class="text-md text-danger">Nome</p>
							</h5></th>
						<th><h5>
								<p class="text-md text-danger">Cognome</p>
							</h5></th>
						<th><h5>
								<p class="text-md text-danger">Numero</p>
							</h5></th>
					</tr>

					<c:forEach items="${listaUtenti}" var="app">

						<tr>
							<td><h5>
									<p class="text-md text-black">
										<c:out value="${app.getNome()}" />
									</p>
								</h5></td>
							<td><h5>
									<p class="text-md text-black">
										<c:out value="${app.getCognome()}" />
									</p>
								</h5></td>
							<td><h5>
									<p class="text-md text-black">
										<c:out value="${app.getNumero()}" />
									</p>
								</h5></td>

							<td>
							</c:forEach>
							</table>
							</div>
							</div>
							</div>
</body>

</html>