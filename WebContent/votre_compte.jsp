<%@ include file="header.jsp" %>


                    <!--main-content*********************************************************Le Contenu CHI******-->
                    
                        <div id="main-col" class="col-b">

                                <!--main-content******************************************* VOTRE COMPTE CHI******-->

                                <div id="respond">                        
                                    <h3>VOTRE COMPTE </h3>  
                                    <div class="contact-form-header"></div><!--contact-form-header-->             
                                    	<div>		<br>		
											<table style="margin-left: 30px;" >											
												<tr>
												<th style="color:#0088b2; font-size:16px; font-weight: bold; height:50px; width: 240px;" >Prénom :</th><td style="color:#666; font-size:16px; font-weight: bold;">${user.prenom}</td>
												</tr><tr>
												<th style="color:#0088b2; font-size:16px; font-weight: bold; height:50px;">Nom :</th><td style="color:#666; font-size:16px; font-weight: bold;">${user.nom}</td>
												</tr><tr>
												<th style="color:#0088b2; font-size:16px; font-weight: bold; height:50px;">Adresse :</th><td style="color:#666; font-size:16px; font-weight: bold;">${user.adresse}</td>
												</tr><tr>
												<th style="color:#0088b2; font-size:16px; font-weight: bold; height:50px;">CIN :</th><td style="color:#666; font-size:16px; font-weight: bold;">${user.cin}</td>
												</tr><tr>
												<th style="color:#0088b2; font-size:16px; font-weight: bold; height:50px;">Tél :</th><td style="color:#666; font-size:16px; font-weight: bold;">${user.tel}</td>
												</tr><tr>
												<th style="color:#0088b2; font-size:16px; font-weight: bold; height:50px;">Email :</th><td style="color:#666; font-size:16px; font-weight: bold;">${user.email}</td>
												</tr><tr>
												<th style="color:#0088b2; font-size:16px; font-weight: bold; height:50px;">Mot de passe :</th><td style="color:#666; font-size:16px; font-weight: bold;">${user.motdepasse}</td>
												</tr><tr>
												<th style="color:#0088b2; font-size:16px; font-weight: bold; height:50px;">District :</th><td style="color:#666; font-size:16px; font-weight: bold;">												
													<c:forEach items="${ dists }" var="d" >
									            	<c:if test="${ user.idDistrict == d.idDistrict}"> ${d.idDistrict} ${ d.libelleDis } </c:if>
									            	</c:forEach>
												</td>
												</tr>													
											</table>
										</div>
                                    <div id="response"></div>
                                </div><!--respond--> 


                                <!--main-content************************************** Fin VOTRE COMPTE CHI******-->






                            
                            <div class="clear"></div>
                        </div><!--main-col-->

                        <!--main-content*********************************************************Le Contenu CHI******-->


<%@ include file="footer.jsp" %>