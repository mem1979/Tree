/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.98
 * Generated at: 2025-03-17 13:14:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.annotations.Tree;
import org.openxava.view.View;
import org.openxava.view.meta.MetaView;
import org.openxava.view.meta.MetaCollectionView;
import org.openxava.model.MapFacade;
import org.openxava.web.Ids;
import org.openxava.controller.meta.MetaAction;
import org.openxava.controller.meta.MetaControllers;
import org.openxava.tab.impl.IXTableModel;
import org.openxava.web.editors.TreeView;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.text.DateFormat;
import org.openxava.util.Locales;
import org.openxava.util.Is;
import org.apache.commons.beanutils.PropertyUtils;

public final class treeViewListEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/Soporte/Documents/openxava-studio-7-r4/workspace/tree/target/tree/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1736546990000L));
    _jspx_dependants.put("jar:file:/C:/Users/Soporte/Documents/openxava-studio-7-r4/workspace/tree/target/tree/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1741869271407L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1736546988000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(27);
    _jspx_imports_classes.add("org.openxava.annotations.Tree");
    _jspx_imports_classes.add("org.apache.commons.beanutils.PropertyUtils");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("org.openxava.web.Ids");
    _jspx_imports_classes.add("org.openxava.util.Is");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaAction");
    _jspx_imports_classes.add("org.openxava.view.meta.MetaCollectionView");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.openxava.tab.impl.IXTableModel");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.openxava.view.View");
    _jspx_imports_classes.add("org.openxava.view.meta.MetaView");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaControllers");
    _jspx_imports_classes.add("org.openxava.web.editors.TreeView");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("org.openxava.util.Locales");
    _jspx_imports_classes.add("org.openxava.model.MapFacade");
    _jspx_imports_classes.add("java.text.DateFormat");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.openxava.web.editors.TreeViewParser treeParser = null;
      synchronized (session) {
        treeParser = (org.openxava.web.editors.TreeViewParser) _jspx_page_context.getAttribute("treeParser", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (treeParser == null){
          treeParser = new org.openxava.web.editors.TreeViewParser();
          _jspx_page_context.setAttribute("treeParser", treeParser, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");

String viewObject = request.getParameter("viewObject"); // Id to access to the view object of the collection
View collectionView = (View) context.get(request, viewObject); // We get the collection view by means of context
View rootView = collectionView.getRoot(); // In this case we use the root view
boolean isReferenced = collectionView.getModelName().equals(rootView.getModelName()) 
					|| (!collectionView.getModelName().contains(rootView.getModelName()) 
					&& !collectionView.getParent().getModelName().equals(rootView.getModelName())) ; // first condition is when tree use cascada remove, second when not
String collectionName = request.getParameter("collectionName");
Map key = rootView.getKeyValues();
String action = request.getParameter("rowAction");
String actionArgv = ",viewObject=" + viewObject;
String actionArg = "viewObject=" + viewObject;
String actionWithArgs;
String tabObject = org.openxava.tab.Tab.COLLECTION_PREFIX + collectionName.replace('.', '_');
String prefix = tabObject + "_";
org.openxava.tab.Tab tab = collectionView.getCollectionTab();
tab.setRequest(request);
Map[] keyValues;
String prefixIdRow = Ids.decorate(request, prefix);
String xavaId = Ids.decorate(request, "xava_selected");
tab.reset();
context.put(request, tabObject, tab);
context.put(request, org.openxava.web.editors.TreeViewParser.XAVA_TREE_VIEW_PARSER, treeParser);
treeParser.createMetaTreeView(tab, viewObject, collectionName, style, errors);
String indexList = treeParser.parse(tab.getModelName());
String module = request.getParameter("module");
String tableId = Ids.decorate(request.getParameter("application"), module, collectionName);
String contextPath = (String) request.getAttribute("xava.contextPath");
if (contextPath == null) contextPath = request.getContextPath();
String version = org.openxava.controller.ModuleManager.getVersion();
MetaView metaView = rootView.getMetaModel().getMetaView(rootView.getViewName());
MetaCollectionView metaCollectionView = isReferenced 
			? collectionView.getParent().getMetaView().getMetaCollectionView(collectionName)
			: metaView.getMetaCollectionView(collectionName);
String collectionViewParentName = isReferenced 
			? collectionView.getParent().getMemberName()
			: "";
Tree tree = metaCollectionView.getPath();

String idProperties = "";
boolean initialState = true;
List<String> keysList = new ArrayList<>(metaView.getMetaModel().getKeyPropertiesNames());
String kValue = "";
if (!key.isEmpty()){
	boolean containNull = key.values().stream().anyMatch(value -> value == null);
	if (!containNull) kValue = key.get(keysList.get(0)).toString();
}

if (tree != null) {
	initialState = tree.initialExpandedState();
}

if(!Is.empty(key)){

      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div id = \"openxavaInput_");
      out.print(collectionName);
      out.write("\" class=\"ox-tree-collection\">\r\n");
      out.write("		<table id = \"");
      out.print(tableId);
      out.write("\" name=\"treeTable_");
      out.print(collectionName);
      out.write("\">\r\n");
      out.write("			<tbody id = \"");
      out.print(tableId);
      out.write("_body\" >\r\n");
      out.write("			");

			int count = 0;
			String [] indexes = indexList.split(","); 
			for (int i=0; i<indexes.length; i++) { 
				String index = indexes[i]; 
				actionWithArgs = "row=" + index  + actionArgv;
				String indexId = prefixIdRow + index;
				String nodeId = xavaId + index;
				String nodeValue = prefix + "selected:" + index;
				
      out.write("\r\n");
      out.write("				<tr id=\"");
      out.print(indexId);
      out.write("\">\r\n");
      out.write("				  <td>\r\n");
      out.write("				    <input type=\"checkbox\" name=\"");
      out.print(xavaId);
      out.write("\" id=\"");
      out.print(nodeId);
      out.write("\"\r\n");
      out.write("				        value = \"");
      out.print(nodeValue);
      out.write("\"/>\r\n");
      out.write("				    ");
      out.write("\r\n");
      out.write("				    <a class=\"xava_action\" \r\n");
      out.write("				    	data-application='");
      out.print(request.getParameter("application"));
      out.write("' data-module='");
      out.print(request.getParameter("module"));
      out.write("' \r\n");
      out.write("				    	data-action='");
      out.print(action);
      out.write("' data-argv='");
      out.print(actionWithArgs);
      out.write("'>_</a>\r\n");
      out.write("				  </td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				count++;
			}
				
			
			
      out.write("\r\n");
      out.write("		\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>		\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"xava_tree\" \r\n");
      out.write("	data-collection-name=\"");
      out.print(collectionName);
      out.write("\"\r\n");
      out.write("	data-collection-view-parent-name=\"");
      out.print(collectionViewParentName);
      out.write("\"\r\n");
      out.write("	data-application=\"");
      out.print(request.getParameter("application"));
      out.write("\" \r\n");
      out.write("	data-module=\"");
      out.print(request.getParameter("module"));
      out.write("\" \r\n");
      out.write("	data-action-argv=\"");
      out.print(actionArgv);
      out.write("\"\r\n");
      out.write("	data-action-arg=\"");
      out.print(actionArg);
      out.write("\"\r\n");
      out.write("	data-action=\"");
      out.print(action);
      out.write("\"\r\n");
      out.write("	data-xava-id=\"");
      out.print(xavaId);
      out.write("\"\r\n");
      out.write("	data-table-id=\"");
      out.print(tableId);
      out.write("\"\r\n");
      out.write("	data-prefix=\"");
      out.print(prefix);
      out.write("\"\r\n");
      out.write("	data-initial-state=\"");
      out.print(initialState);
      out.write("\"\r\n");
      out.write("	data-k-value=\"");
      out.print(kValue);
      out.write("\"\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<script type='text/javascript' ");
      if (_jspx_meth_xava_005fnonce_005f0(_jspx_page_context))
        return;
      out.write(" src='");
      out.print(contextPath);
      out.write("/dwr/interface/Tree.js?ox=");
      out.print(version);
      out.write("'>\r\n");
      out.write("	</script>\r\n");
      out.write("	");

}

      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_xava_005fnonce_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:nonce
    org.openxava.web.taglib.NonceTag _jspx_th_xava_005fnonce_005f0 = (org.openxava.web.taglib.NonceTag) _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.get(org.openxava.web.taglib.NonceTag.class);
    _jspx_th_xava_005fnonce_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fnonce_005f0.setParent(null);
    int _jspx_eval_xava_005fnonce_005f0 = _jspx_th_xava_005fnonce_005f0.doStartTag();
    if (_jspx_th_xava_005fnonce_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.reuse(_jspx_th_xava_005fnonce_005f0);
    return false;
  }
}
