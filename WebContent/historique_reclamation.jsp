<%@ include file="header.jsp" %>


                    <!--main-content*********************************************************Le Contenu CHI******-->
                    <div id="main-content">
                        <div id="main-col" class="col-b">



                                <!--main-content******************************************* Historique de vos reclamations CHI******-->
                            <div class="element-box">

                            <h3>Historique de vos reclamations</h3>
                                <div class="contact-form-header"></div><!--contact-form-header--> 
                                <div class="kopa-one-two mb-20 last">
                                
                                <h5>${ message }</h5>
                                
                                    <ul id="toggle-view">
                                        <c:forEach items="${ reclas }" var="recla" > 
                                        <li class="clearfix">
                                            <span>+</span>
                                            <h3>Reclamation envoyée le ${ recla.date } </h3>
                                            <div class="clear"></div>                    
                                            <div class="panel clearfix">
                                            <div class="kp-alert-box">
                                                <p><label style="color:#0088b2; font-weight: bold;"> Demandeur : </label> <b> ${ recla.demandeur } </b>
                                                <br><label style="color:#0088b2; font-weight: bold;"> District : </label> <b>                                                		  
                                                		<c:forEach items="${ dists }" var="d" >
									            		<c:if test="${ recla.idDistrict == d.idDistrict}">${d.idDistrict} ${ d.libelleDis } </c:if>
									            		</c:forEach>
                                                		 </b>
                                                <br><label style="color:#0088b2; font-weight: bold;"> Service :  </label> <b> ${ recla.service } </b>
                                                </p>
                                                <p><label style="color:#0088b2; font-weight: bold;">Demande : </label>
                                                <br> <b> ${ recla.demande } </b>
                                                </p>                                                
                                            </div>
                                            </div>
                                        </li>
                                        </c:forEach>
                                    </ul><!--end:toggle-view-->
                                </div><!--kopa-one-two-->
                            </div>
                                <!--main-content************************************** Fin Historique de vos reclamations CHI******-->




                            
                            <div class="clear"></div>
                        </div><!--main-col-->

                        <!--main-content*********************************************************Le Contenu CHI******-->


<%@ include file="footer.jsp" %>