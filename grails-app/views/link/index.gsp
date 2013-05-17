<h1>Link Like</h1>

<g:form name="linkCreateForm" url="[action:'create']">
  Title: <g:textField name="title"/><br/>
  URL: <g:textField name="url"/><br/>
  <input type="submit" value="Add new link"/>
</g:form>

<hr>

<ul>
  <% if(links.size() == 0) { %>
    <li>No links</li>
  <% } else { %>
    <% for(link in links) { %>
      <li>
	  <g:form name="linkCreateForm" url="[action:'vote']">
	  	<a href="http://<%= link.url %>"><%= link.title%></a>[<%= link.vote %> vote(s) fot this link]
		  <g:hiddenField name="id" value="${link.id}" />
		  <input type="submit" value="Vote"/>
	  </g:form>
	  </li>
    <% } %> 
  <% } %>
</ul>
