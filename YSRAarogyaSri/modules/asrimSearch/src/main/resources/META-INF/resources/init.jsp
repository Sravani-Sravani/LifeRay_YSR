<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<style>
.alert-notifications, .alert-notifications-fixed{
display:none;
}
.active_button_blueshade {
    color: #fff !important;
    background-color: #7BBF4B;     border-radius: 8px;
    color: #FFFFFF;
    font-size: 17px;
    font-weight: 500;
    padding: 10PX !important;
    text-align: center;
    text-shadow: rgb(0 0 0 / 25%) 0 3px 8px;
    transition: all .5s;
    display: inline-block;
    text-align: center;
    text-decoration: none;
}
</style>