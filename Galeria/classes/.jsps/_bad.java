  /*@lineinfo:filename=/bad.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _bad extends oracle.jsp.runtime.HttpJsp {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) {
      pageContext.setAttribute(OracleJspRuntime.JSP_PAGE_DONTNOTIFY, "true", PageContext.PAGE_SCOPE);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
      return;
}
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _bad page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      /*@lineinfo:user-code*//*@lineinfo:12^8*/      out.print(session.getAttribute("error"));
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:user-code*//*@lineinfo:16^1*/      out.print( new java.util.Date() );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[2]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,false);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final char text[][]=new char[3][];
    static {
      try {
      text[0] = 
      "\n<html>\n<head>\n<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n<title>\nError\n</title>\n</head>\n<body>\n<center><h2>\nError! ".toCharArray();
      text[1] = 
      "\n</h2>\n<h3>Intentelo Mas Tarde..</h3></center>\n<p>\n".toCharArray();
      text[2] = 
      "</p>\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
