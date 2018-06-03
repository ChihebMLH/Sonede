<%@ include file="header.jsp" %>


                    <!--main-content*********************************************************Le Contenu CHI******-->
                    <div id="main-content">
                        <div id="main-col" class="col-b">


                                <!--main-content******************************************* Historique de vos factures CHI******-->
                            <div class="element-box">

                            <h3>Historique de vos factures</h3>
                                <div class="contact-form-header"></div><!--contact-form-header--> 
                                <div class="kopa-one-two mb-20 last">
                                    <ul id="toggle-view">  
                                      
                                    <h5>${ message }</h5>
                                                                       
                                        <c:forEach items="${ facts }" var="f" > 
                                         <li class="clearfix">
                                            <span>+</span>
                                            <h3>Facture d'eau du ${ f.datelimite }</h3>
                                            <div class="clear"></div>                    
                                            <div class="panel clearfix">
                                            <div class="kp-alert-box">
                                            	
                                                <style type="text/css">
												.tftable {font-size:9px;color:#333333;width:100%;border-width: 1px;border-color: #729ea5;border-collapse: collapse;}
												.tftable th {font-size:9px;background-color:#ffffff;border-width: 1px;padding: 3px;border-style: solid;border-color: #729ea5;text-align:left;}
												.tftable tr {background-color:#ffffff;}
												.tftable td {font-size:9px;border-width: 1px;padding: 8px;border-style: solid;border-color: #729ea5;}
												.tftable tr:hover {background-color:#ffffff;}
												.titre {font-size:7px; color:#0088b2;}
												</style>
												
												<br>
												
												<c:choose>
													  <c:when test="${ f.impaye }">
													    <h5><i><b style="color:#b20000;">&nbsp;&nbsp;&nbsp;Impayée</b></i></h5>
													  </c:when>
													  <c:otherwise>
													    <h5><i><b style="color:#178c00;">&nbsp;&nbsp;&nbsp;Payée</b></i></h5>
													  </c:otherwise>
												</c:choose>
												
												
												<br>
													<table class="tftable" border="1">
													<tr><th colspan="17"><b class="titre" style="font-size:11px;"><i>Société Nationale d'Exploitation et de Distribution des Eaux</i></b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													 <b class="titre" style="font-size:10px;"> District: </b><b>
													 		<c:forEach items="${ dists }" var="d" >
										            		<c:if test="${ f.idDistrict == d.idDistrict}"> ${ d.libelleDis } </c:if>
										            		</c:forEach>
													 </b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													 <b class="titre" style="font-size:10px;"> Telephone: </b><b>
													 		<c:forEach items="${ dists }" var="d" >
										            		<c:if test="${ f.idDistrict == d.idDistrict}"> ${ d.telDis } </c:if>
										            		</c:forEach>
													 </b></th></tr>
													<tr><td  colspan="17">&nbsp;&nbsp;&nbsp;&nbsp; <b>${ abonne.prenom } ${ abonne.nom }</b><br><br>&nbsp;&nbsp;&nbsp;&nbsp; <b>${ abonne.adresse }</b></td></tr>
													<tr><td><b class="titre">District: </b><br><b>${ f.idDistrict }</b></td><td colspan="2"><b class="titre">Code Branchement: </b><br><b>${ f.codeBranchement }</b></td><td><b class="titre">Tournée: </b><br><b>${ f.tournee }</b></td><td><b class="titre">Ordre: </b><br><b>${ f.ordre }</b></td><td colspan="2"><b class="titre">Nouv. Index: </b><br><b>${ f.nouv_index }</b></td><td colspan="2"><b class="titre">Anc. Index (-) :</b><br><b>${ f.anc_index }</b></td><td></td><td colspan="2"><b class="titre">Consom. (=) : </b><br><b>${ f.consommation }</b></td><td><b class="titre">Nbre de Chambre :</b></td><td colspan="4"><b class="titre">Periode Consommation : </b><br><b>
															<c:forEach items="${ trims }" var="t" >
										            			<c:if test="${ f.idtrimestre == t.idtrimestre}"> ${ t.moisTrim }-${ f.annee } </c:if>
										            		</c:forEach>
													</b></td></tr>													
													<tr><td colspan="2" rowspan="2"><b class="titre">Qte Conso : (Eau) </b><br><b>${ f.consommation }</b></td><td rowspan="2"><b class="titre">Tarif : </b><br><b>${ f.fraisConso }</b></td><td colspan="3" rowspan="2"><b class="titre">Somme : </b><br><b>${ f.totConso1 }</b></td><td colspan="3" rowspan="2"><b class="titre">Frais additionnels : </b><br><br><b class="titre">Frais d'avertissement avant paiement : </b><br><b class="titre">Frais coupure d'eau : </b><br><b class="titre">Frais sur la reléve du compteur : </b><br><b class="titre">Somme avant l'add. : </b><br><b class="titre">Taxes : </b><br><b class="titre">Dû (ancien): </b></td><td colspan="2" rowspan="2"><b class="titre">Somme :  </b><br><br><br><br><b style="font-size:7px;">${ f.fraisFixesConso + f.totConso1 }</b><br><b style="font-size:7px;">${ f.addTotConso }</b><br><b style="font-size:7px;">${ f.anterieurFrais }</b></td><td colspan="2"><b class="titre">Qte Conso : (Assain.)  </b><br><b>${ f.consoAssainissement1 }</b><br><b>${ f.consoAssainissement2 }</b></td><td><b class="titre">Tarif :   </b><br><b>${ f.fraisAssainissement1 }</b><br><b>${ f.fraisAssainissement2 }</b><br><br></td><td colspan="3"><b class="titre">Somme :</b><br><b>${ f.totAssai1 }</b><br><b>${ f.totAssai2 }<br><br></b></td></tr>
													<tr><td colspan="3"><b class="titre">Taxes fixes (facilitateur de paiement)</b></td><td colspan="3"><b>${ f.fraisFixesAssai }</b></td></tr>
													<tr><td colspan="3"><b class="titre">Frais Fixes: </b></td><td colspan="3"><b>${ f.fraisFixesConso }</b></td><td colspan="3"><b class="titre" style="font-size:11px;">Total des Frais D'Eau: </b></td><td colspan="2"><b>${ f.total_Conso }</b></td><td colspan="3"><b class="titre" style="font-size:11px;">Total des Frais D'Assainissement: </b></td><td colspan="3"><b>${ f.total_Assai }</b></td></tr>
													<tr><td colspan="6"><b class="titre" style="font-size:11px;">Total des Frais D'eau et D'Assainissement: </b><b>${ f.montant_total }</b></td><td colspan="3"><b class="titre">Frais Anterieur: </b></td><td colspan="4"><b class="titre" style="font-size:11px; color:#6600cc;"><u>Total des Frais a payer</u> :</b>&nbsp;&nbsp;<b style="font-size:11px;">${ f.montant_total }</b></td><td colspan="4"><b class="titre" style="font-size:11px;">Date limite de paiement: </b><br><b>${ f.datelimite }</b></td></tr>
													</table>
												
												<c:choose>
													  <c:when test="${ f.impaye }">
													  <br>
                                                	  <br>
													<center>
													<form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
													<input name="cmd" type="hidden" value="_xclick" />
													<input name="business" type="hidden" value="sonede_buyer@sonede.com" />
													<input name="item_name" type="hidden" value="Facture de ${ abonne.prenom } ${ abonne.nom }" />
													<input name="amount" type="hidden" value="${ f.montant_total }" />
													<input name="shipping" type="hidden" value="0.00" />
													<input name="no_shipping" type="hidden" value="0" />
													<input name="custom" type="hidden" value="${ f.idFacture }" />
													<input name="return" type="hidden" value="http://localhost:8080/Sonede/hfacture" />
													<input name="cancel_return" type="hidden" value="http://localhost:8080/Sonede/facture" />
													<input name="notify_url" type="hidden" value="http://localhost:8080/Sonede/succes_paiement" />
													<input name="no_note" type="hidden" value="1" />
													<input name="currency_code" type="hidden" value="EUR" />
													<input name="tax" type="hidden" value="0.00" />
													<input name="lc" type="hidden" value="FR" />
													<input name="bn" type="hidden" value="PP-BuyNowBF" />
													<input alt="Effectuez vos paiements via PayPal : une solution rapide, gratuite et sécurisée" name="submit" src="https://www.paypalobjects.com/fr_FR/FR/i/btn/btn_paynowCC_LG.gif" type="image" /><img src="https://www.paypalobjects.com/fr_FR/i/scr/pixel.gif" border="0" alt="" width="1" height="1" />
													</form>
													</center>
													  </c:when>
													  <c:otherwise>
													    
													  </c:otherwise>
												</c:choose>
												
                                            </div>
                                            </div>
                                        </li>
                                        </c:forEach>
                                        
                                        
                                    </ul><!--end:toggle-view-->
                                </div><!--kopa-one-two-->
                            </div>

                                <!--main-content************************************** Fin Historique de vos factures CHI******-->






                            
                            <div class="clear"></div>
                        </div><!--main-col-->

                        <!--main-content*********************************************************Le Contenu CHI******-->


<%@ include file="footer.jsp" %>