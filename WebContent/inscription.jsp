<%@ include file="header.jsp" %>


                    <!--main-content*********************************************************Le Contenu CHI******-->
                    <div id="main-content">
                        <div id="main-col" class="col-b">

                                <!--main-content******************************************* Inscritpion CHI******-->

                                <div id="respond">                        
                                    <h3>Nouvelle Inscription</h3>  
                                    <div class="contact-form-header"></div><!--contact-form-header-->             
                                    <form class="clearfix" action="inscription" method="post">
                                        <span class="c-note">Tous les champs avec un astérisque sont obligatoires *</span>
                                        <div class="contact-form-header"></div><!--contact-form-header--> 
                                        <div class="contact-left">
                                        
                                            <p class="input-block">
                                                <label class="required" for="nom" style="color:#0088b2; font-weight: bold;">Nom : <em>(*)</em></label>
                                                <input class="input_ch" type="text" name="nom" id="nom" value="" required="required" pattern="[a-zA-Z-\. ]{1,30}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="prenom" style="color:#0088b2; font-weight: bold;">Prnéom : <em>(*)</em></label>
                                                <input class="input_ch" type="text" name="prenom" id="prenom" value="" required="required" pattern="[a-zA-Z-\. ]{1,30}">
                                            </p>                                            
                                            <p class="input-block">                                                
                                                <label class="required" for="idDistrict" style="color:#0088b2; font-weight: bold;">District : <em>(*)</em></label>
                                                <select class="input_ch" type="password" name="idDistrict" id="idDistrict"  value="" required="required"> 
                                                	<c:forEach items="${ dists }" var="d" >
												    	<option value="${d.idDistrict}">${d.idDistrict} ${d.libelleDis}</option>
												    </c:forEach>
                                                </select>                        
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="adresse " style="color:#0088b2; font-weight: bold;">Adresse : <em>(*)</em></label>
                                                <input class="input_ch" type="text" name="adresse" id="adresse" value="" required="required" pattern="[0-9a-zA-Z- \.]{1,30}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="cin" style="color:#0088b2; font-weight: bold;">CIN : <em>(*)</em> </label>&nbsp;&nbsp;&nbsp;&nbsp;<i class="c-note" style="color:#ff1414">${ messageCin }</i>
                                                <input class="input_ch" type="text" name="cin" id="cin" value="" required="required" pattern="[0-9]{8}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="tel" style="color:#0088b2; font-weight: bold;">Tél : <em>(*)</em></label>
                                                <input class="input_ch" type="text" name="tel" id="tel" value="" required="required" pattern="[0-9]{8}">
                                            </p>
                                            <p class="input-block">
                                                <label class="required" for="contact_email" style="color:#0088b2; font-weight: bold;">Email : <em>(*)</em></label>&nbsp;&nbsp;&nbsp;&nbsp;<i class="c-note" style="color:#ff1414">${ messageEmail }</i>
                                                <input type="email" class="valid" name="email" id="contact_email" value="" required="required">
                                            </p>
                                            <p class="input-block">                                                
                                                <label class="required" for="mot_de_passe" style="color:#0088b2; font-weight: bold;">Mot de passe : <em>(*)</em></label>
                                                <input class="input_ch" type="password" name="mot_de_passe" id="mot_de_passe"  value="" required="required">                         
                                            </p>
                                           <!--  <p class="input-block">
                                                <label class="required" for="c_mot_de_passe">Confirmer le mot de passe:<em>(*)</em></label>
                                                <input class="input_ch" type="password" name="c_mot_de_passe" id="c_mot_de_passe" value="">
                                            </p>      -->                         
                                            <p class="comment-button">                    
                                                <input type="submit" id="valider" value="Valider &raquo;" style="padding:6px 0 6px 0; font:Bold 13px Arial; background:#0088b2; color:#fff; width:90px; border-radius:2px; border:none;"> 
                                                <input type="reset" id="annuler" value="Annuler" style="padding:6px 0 6px 0; font:Bold 13px Arial; background:#0088b2; color:#fff; width:90px; border-radius:2px; border:none;">
                                            </p>
                                            
                                        </div>
                                       
                                        <div class="clear"></div>                                                    
                                    </form>
                                    <div id="response"></div>
                                </div><!--respond-->      





                                <!--main-content************************************** Fin Inscritpion CHI******-->






                            
                            <div class="clear"></div>
                        </div><!--main-col-->

                        <!--main-content*********************************************************Le Contenu CHI******-->


<%@ include file="footer.jsp" %>