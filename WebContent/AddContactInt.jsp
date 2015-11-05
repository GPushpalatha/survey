<jsp:useBean id="reg" class="plank.ContactBean" scope="request">
	<jsp:setProperty name="reg" property="*"/>
</jsp:useBean>
<jsp:forward page="addContact.do"></jsp:forward>ss