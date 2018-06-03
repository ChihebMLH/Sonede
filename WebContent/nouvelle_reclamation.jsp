<%@ include file="header.jsp" %>



<script type="text/javascript">
 function MaxLengthTextarea(objettextarea,maxlength){
  if (objettextarea.value.length > maxlength) {
    objettextarea.value = objettextarea.value.substring(0, maxlength);
    alert('Votre texte ne doit pas dépasser '+maxlength+' caractères!');
   }
}
</script>

                    <!--main-content*********************************************************Le Contenu CHI******-->
                    <div id="main-content">
                        <div id="main-col" class="col-b">

                                <!--main-content*********************************************** Nouvelle Reclamation CHI******-->

                    <div id="respond">                        
                        <h3>Nouvelle réclamation</h3>  
                        <div class="contact-form-header">
                            <p><b>La SONEDE vous offre la possibilité d'envoyer vos réclamations en ligne en remplissant le formulaire ci-dessous.</b></p>
                            <p><b>La réponse vous sera communiquée par mail.</b></p>
                        </div><!--contact-form-header-->             
                        <form  class="clearfix" action="reclamation" method="post">
                            <span class="c-note">Tous les champs avec un astérisque sont obligatoires <em style="color:#0088b2; font-weight: bold;">(*)</em></span>
                            <div class="contact-left">
                            <br>
									<input type="hidden" value="${ user.idUtilisateur }">
                                <p class="input-block">                                                
                                     <label class="required" for="district" style="color:#0088b2; font-weight: bold;">District : <em>(*)</em></label>
                                     <select class="input_ch" type="password" name="district" id="district"  value="" required="required"> 
                                        
                                    	<c:forEach items="${ dists }" var="d" >
									    	<option value="${d.idDistrict}">${d.idDistrict} ${d.libelleDis}</option>
									    </c:forEach>
                                    </select>                        
                                </p>
                                <p class="input-block">
                                    <label class="required" for="police" style="color:#0088b2; font-weight: bold;">Police :<em>(*)</em></label>
                                    <input class="input_ch" type="text" name="police" id="police" value="" required pattern="[0-9]{0,12}">
                                </p>
                                <p class="input-block">
                                    <label class="required" for="tournee" style="color:#0088b2; font-weight: bold;">Tournée :<em>(*)</em></label>
                                    <input class="input_ch" type="text" name="tournee" id="tournee" value="" required pattern="[0-9]{0,12}">
                                </p>
                                <p class="input-block">
                                    <label class="required" for="ordre" style="color:#0088b2; font-weight: bold;">Ordre :<em>(*)</em></label>
                                    <input class="input_ch" type="text" name="ordre" id="ordre" value="" required pattern="[0-9]{0,12}">
                                </p>
                                <p class="input-block">
                                    <label class="required" for="demandeur" style="color:#0088b2; font-weight: bold;">Demandeur :<em>(*)</em></label>
                                    <input class="input_ch" type="text" name="demandeur" id="demandeur" value="" required pattern="[a-zA-Z-\. ]{2,12}">
                                </p>
                                <p class="input-block">
                                    <label class="required" for="contact_email" style="color:#0088b2; font-weight: bold;">Email :<em>(*)</em></label>
                                    <input type="email" class="valid" name="email" id="contact_email" value="" required>
                                </p>
                                <p class="input-block">                                                
                                    <label class="required" for="adresse" style="color:#0088b2; font-weight: bold;">Adresse :<em>(*)</em></label>
                                    <input class="input_ch" type="text" name="adresse" id="adresse"  value="" required pattern="[0-9a-zA-Z-\. ]{2,12}">                         
                                </p>
                                <p class="input-block">
                                    <label class="required" for="telephone" style="color:#0088b2; font-weight: bold;" required pattern="[0-9]{8}">Téléphone :</label>
                                    <input class="input_ch" type="text" name="tel" id="tel" value="">
                                </p>                             
                            </div>

                            <div class="contact-right">
                                <p class="input-block">                                                
                                    <label class="required" for="service" style="color:#0088b2; font-weight: bold;">Service :<em>(*)</em></label>
                                    <input type="text" id="service" value="" class="input_ch" name="service" required pattern="[0-9a-zA-Z-\. ]{2,12}">                                                
                                </p>
                                <p class="textarea-block">                        
                                    <label class="required" for="contact_message" style="color:#0088b2; font-weight: bold;">Demande :<em>(*)</em></label>
                                    <textarea rows="6" cols="88" id="contact_message" name="message" required  placeholder="Votre demande ne doit pas depasser les 5000 caractères." onkeyup="javascript:MaxLengthTextarea(this, 5000);"></textarea>
                                </p>
                                <p class="comment-button">                    
                                    <input type="submit" id="envoyer" value="Envoyer &raquo;" style="padding:6px 0 6px 0; font:Bold 13px Arial; background:#0088b2; color:#fff; width:90px; border-radius:2px; border:none;">
                                    <input type="reset" id="annuler" value="&laquo; Annuler" style="padding:6px 0 6px 0; font:Bold 13px Arial; background:#0088b2; color:#fff; width:90px; border-radius:2px; border:none;">
                                </p>
                            </div>
                            <div class="clear"></div>                                                    
                        </form>
                        <div id="response"></div>
                    </div><!--respond-->      
                                <!--main-content*********************************************** Fin Nouvelle Reclamation CHI******-->


                            
                            <div class="clear"></div>
                        </div><!--main-col-->

                        <!--main-content*********************************************************Le Contenu CHI******-->


<%@ include file="footer.jsp" %>                   