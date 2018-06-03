<%@ include file="header.jsp" %>


                    <!--main-content*********************************************************Le Contenu CHI******-->
                    <div id="main-content">
                        <div id="main-col" class="col-b">

                         <!--main-content******************************************* MODIFIER VOS INFORMATIONS CHI******-->

                                <div id="respond">                        
                                    <h3>MODIFIER VOS INFORMATIONS </h3>  
                                    <div class="contact-form-header"></div><!--contact-form-header-->             
                                    <form class="clearfix" action="modifier" method="post">
                                        <span class="c-note">Tous les champs avec un astérisque sont obligatoires <em style="color:#0088b2; font-weight: bold;">(*)</em></span>
                                        <div class="contact-left"> 
                                        <br>                                      
                                       		
                                                <input class="input_ch" type="hidden" name="idUtilisateur" id="idUtilisateur" value="${ user.idUtilisateur }">  
                                                                                          
                                            <p class="input-block">
                                                <label class="required" for="nom" style="color:#0088b2; font-weight: bold;">Nom :<em>(*)</em></label>
                                                <input class="input_ch" type="text" name="nom" id="nom" value="${user.nom}" required pattern="[a-zA-Z-\. ]{1,30}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="prenom" style="color:#0088b2; font-weight: bold;">Prénom :<em>(*)</em></label>
                                                <input class="input_ch" type="text" name="prenom" id="prenom" value="${user.prenom}" required pattern="[a-zA-Z-\. ]{1,30}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="adresse" style="color:#0088b2; font-weight: bold;">Adresse :</label>
                                                <input class="input_ch" type="text" name="adresse" id="adresse" value="${user.adresse}" required pattern="[0-9a-zA-Z- \.]{3,60}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="cin" style="color:#0088b2; font-weight: bold;">CIN :<em>(*)</em></label>
                                                <input class="input_ch" type="text" name="cin" id="cin" value="${user.cin}" required pattern="[0-9]{8}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="tel" style="color:#0088b2; font-weight: bold;">Tél :<em>(*)</em></label>
                                                <input class="input_ch" type="text" name="tel" id="tel" value="${user.tel}" required pattern="[0-9 ]{8}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="contact_email" style="color:#0088b2; font-weight: bold;">Email :<em>(*)</em></label>
                                                <input type="email" class="valid" name="email" id="contact_email" value="${user.email}" required>
                                            </p>
                                            <p class="input-block">                                                
                                                <label class="required" for="motdepasse" style="color:#0088b2; font-weight: bold;">Mot de passe :<em>(*)</em></label>
                                                <input class="input_ch" type="password" name="motdepasse" id="motdepasse"  value="${user.motdepasse}" required>                         
                                            </p>  
                                            <p class="input-block">                                                
                                                <label class="required" for="motdepasse2" style="color:#0088b2; font-weight: bold;">Confirmer votre noveau mot de passe :<em>(*)</em></label>
                                                <input class="input_ch" type="password" name="motdepasse2" id="motdepasse2"  value="${user.motdepasse}" required>                         
                                            </p>
                                            <p class="input-block">                                                
                                                <label class="required" for="idDistrict" style="color:#0088b2; font-weight: bold;">District : <em>(*)</em></label>
                                                <select class="input_ch"  name="idDistrict" id="idDistrict"   required="required"> 
                                                	<c:forEach items="${ dists }" var="d" >
												    	<option value="${d.idDistrict}" <c:if test="${ user.idDistrict == d.idDistrict }"> selected="selected"</c:if> >${d.idDistrict} ${d.libelleDis}</option>
												    </c:forEach>
                                                </select>                        
                                            </p>                                                                  
                                            <p class="comment-button">                    
                                                <input type="submit" id="modifier" value="Modifier &raquo;" style="padding:6px 0 6px 0; font:Bold 13px Arial; background:#0088b2; color:#fff; width:90px; border-radius:2px; border:none;">
                                                <input type="reset" id="annuler" value="&laquo; Annuler" style="padding:6px 0 6px 0; font:Bold 13px Arial; background:#0088b2; color:#fff; width:90px; border-radius:2px; border:none;"> 
                                            </p>
                                        </div>
                                       
                                        <div class="clear"></div>                                                    
                                    </form>
                                    <div id="response"></div>
                                </div><!--respond-->      



                                <!--main-content************************************** Fin MODIFIER VOS INFORMATIONS CHI******-->




                            
                            <div class="clear"></div>
                        </div><!--main-col-->

                        <!--main-content*********************************************************Le Contenu CHI******-->


<%@ include file="footer.jsp" %>