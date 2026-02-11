<%@ attribute name="items" required="true"%>
<%@ attribute name="layout" required="true"%>

<link rel="stylesheet" href="css/menu.css" />

<ul class="menu ${layout }">
	<%
	String menus[] = items.split(",");
	for (String menu : menus) {
	%>
	<li><%=menu.trim()%></li>
	<%
	}
	%>
</ul>