<%@ include file="../header.jsp" %>
                    <!--main-content*********************************************************Le Contenu CHI******-->
					<div id="main-col" class="col-b">
				           <div id="respond">                        
							<h3>Suivi de votre consommation</h3>  
								<div class="contact-form-header"></div><!--contact-form-header-->             
									<div>
								<!--main-content******************************************* Contenu page******-->
								
								<h5>${ message }</h5> <br>
								
								<canvas id="myChart"></canvas>
								
								
								<script>
									var ctx = document.getElementById('myChart').getContext('2d');
									var chart = new Chart(ctx, {
									    // The type of chart we want to create
									    type: 'line',
	
									    // The data for our dataset
									    data: {
									        labels: ["Dec. Janv. Fev", "Mars. Avril. Mai", "Juin. Juillet. Aout", "Sept. Oct. Nov"],
									        datasets: [{
									            label: "Votre Consommation d'eau (en m3)",
									            backgroundColor: 'rgb(0, 0, 102)',
									            borderColor: 'rgb(0, 195, 202)',
									            data: [	
									            	<c:forEach items="${ facts }" var="f" >
									            	<c:if test="${ (f.idtrimestre == 1) and (f.annee == annee_courante) }"> ${f.consommation} </c:if>
									            	</c:forEach>
									            	,
									            	
									            	<c:forEach items="${ facts }" var="f" >
									            	<c:if test="${ (f.idtrimestre == 2) and (f.annee == annee_courante) }"> ${f.consommation} </c:if>
									            	</c:forEach>
									            	,
									            	
									            	<c:forEach items="${ facts }" var="f" >
									            	<c:if test="${ (f.idtrimestre == 3) and (f.annee == annee_courante) }"> ${f.consommation} </c:if>
									            	</c:forEach>
									            	,
									            	
									            	<c:forEach items="${ facts }" var="f" >
									            	<c:if test="${ (f.idtrimestre == 4) and (f.annee == annee_courante) }"> ${f.consommation} </c:if>
									            	</c:forEach>
									            	
									            	
									            	 ],
									        }]
									    },
	
									    // Configuration options go here
									    options: {}
									});
								</script>
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								<!--main-content************************************** Contenu page *******-->

								</div>
								<div id="response"></div>
								</div><!--respond-->	
								<div class="clear"></div>
								</div>
								<!--main-col-->
                        <!--main-content*********************************************************Le Contenu CHI******-->
<%@ include file="../footer.jsp" %>