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
      /*@lineinfo:user-code*//*@lineinfo:17^24*/      out.print(session.getAttribute("error"));
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[1]);


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
    private static final char text[][]=new char[2][];
    static {
      try {
      text[0] = 
      "\n<html>\n<head>\n<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n<link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\">\n<script type=\"text/javascript\"  src=\"js/jquery-1.11.0.min.js\"></script>\n<script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script> \n<script type=\"text/javascript\" src=\"js/animated_bg.js\"></script>\n<script type=\"text/javascript\" src=\"js/jquery-3.4.1.min.js\"></script>\t\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n<title>\nError\n</title>\n</head>\n<body Class=\"animated_bg\">\n<center>\n<h1 class=\"ml2\">Error! ".toCharArray();
      text[1] = 
      "</h1>\n<h1 class=\"ml2\">Intentelo Mas Tarde..</h1>\n</center>\n<p></p>\n<center><img src=\"img/homero.gif\"></center>\n<script src=\"https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js\"></script>\n<script>\n// Wrap every letter in a span\n$('.ml2').each(function(){\n  $(this).html($(this).text().replace(/([^\\x00-\\x80]|\\w)/g, \"<span class='letter'>$&</span>\"));\n});\n\nanime.timeline({loop: true})\n  .add({\n    targets: '.ml2 .letter',\n    scale: [4,1],\n    opacity: [0,1],\n    translateZ: 0,\n    easing: \"easeOutExpo\",\n    duration: 950,\n    delay: function(el, i) {\n      return 70*i;\n    }\n  }).add({\n    targets: '.ml2',\n    opacity: 0,\n    duration: 1000,\n    easing: \"easeOutExpo\",\n    delay: 1000\n  });\n</script>\n<script>\n\tjQuery(document).ready(function(){\n\n\t\t$('.animated_bg2').animatedBG({\n\t\t\tcolorSet: ['#abebfe', '#aad667', '#57e6ee', '#ff7ebb'],\n\t\t\tspeed: 2000\n\t\t});\n\n\t\t$('.animated_bg3').animatedBG({\n\t\t\tcolorSet: ['#71a98b', '#b15c8e', '#dc6b68', '#6c5a94', '#b14c4e', '#736357'],\n\t\t\tspeed: 6000\n\t\t});\n\n\t});\n</script>\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
