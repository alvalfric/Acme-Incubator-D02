<%@page language="java"%>
<%@taglib prefix="jstl" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir ="/WEB-INF/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<acme:form readonly="true">
	<acme:form-textarea code="administrator.customization-parameter.form.label.spamWordsEnglish" path="spamWordsEnglish" />
	<acme:form-textarea code="administrator.customization-parameter.form.label.spamWordsSpanish" path="spamWordsSpanish" />
	<acme:form-textbox code="administrator.customization-parameter.form.label.spamThreshold" path="spamThreshold" />
	<acme:form-textarea code="administrator.customization-parameter.form.label.activitySectors" path="activitySectors"/>

	<acme:form-return code="administrator.customization-parameter.form.button.return"/>
</acme:form>