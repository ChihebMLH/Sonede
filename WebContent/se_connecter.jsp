<%@ include file="header.jsp" %>


                    <!--main-content*********************************************************Le Contenu CHI******-->
                    <div id="main-content">
                        <div id="main-col" class="col-b">

                        	  <!--main-content******************************************* Connexion CHI******-->

                                <div id="respond">                        
                                    <h3>Se Connecter</h3>  
                                    <div class="contact-form-header"></div><!--contact-form-header-->             
                                    <form class="clearfix" action="connexion" method="post">
                                        <span class="c-note">Veuillez saisir votre adresse e-mail et votre mot de passe</span>                                        
                                        <div class="contact-form-header"></div><!--contact-form-header-->   
                                        <div class="contact-left">

                                            <p style="color:red;  font-style: italic;"><i>${ message }</i><p>
                                            <p class="input-block">
                                                <label class="required" for="contact_email" style="color:#0088b2; font-weight: bold;">Email : <em>(*)</em></label>
                                                <input type="email" class="valid" name="email" id="contact_email"  style="height:35px; width: 200px; margin-left: 6.5%;" >
                                            </p>
                                            <p class="input-block">                                                
                                                <label class="required" for="mot_de_passe" style="color:#0088b2; font-weight: bold;">Mot de passe : <em>(*)</em></label>
                                                <input class="input_ch" type="password" name="mot_de_passe" id="mot_de_passe"   style="height:35px; width: 200px; margin-left: 1%;">                         
                                            </p>                                                                        
                                            <p class="comment-button">                    
                                        <!--  &raquo;-->        <input type="submit" id="connexion" value="Connexion" style="padding:6px 0 6px 0; font:Bold 13px Arial; background:#0088b2; color:#fff; width:90px; border-radius:2px; border:none;"> 
                                        <!--  &laquo; -->        <input type="reset" id="annuler" value="Annuler" style="padding:6px 0 6px 0; font:Bold 13px Arial; background:#0088b2; color:#fff; width:90px; border-radius:2px; border:none;">
                                            </p>
                                            <div>                   
                                                <a href="inscription" style="color:#0088b2";><u>Nouvelle Inscription &raquo;</u></a>
                                            </div>
                                        </div>
                                       
                                        <div class="clear"></div>                                                    
                                    </form>
                                    <div id="response"></div>
                                </div><!--respond-->      




                                <!--main-content************************************** Fin Connexion CHI******-->






                            
                            <div class="clear"></div>
                        </div><!--main-col-->

                        <!--main-content*********************************************************Le Contenu CHI******-->


<%@ include file="footer.jsp" %>