  /*@lineinfo:filename=/expas.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _expas extends com.orionserver.http.OrionHttpJspPage {

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
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _expas page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__jsp_StaticText.text[0]);
      __ojsp_s_out.write(__jsp_StaticText.text[1]);
      __ojsp_s_out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:47^3*/      {
        org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_1=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id indexId name property");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("tabla");
        __jsp_taghandler_1.setIndexId("index");
        __jsp_taghandler_1.setName("nn");
        __jsp_taghandler_1.setProperty("tabla");
        java.lang.Object tabla = null;
        java.lang.Integer index = null;
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
          do {
            tabla = (java.lang.Object) pageContext.findAttribute("tabla");
            index = (java.lang.Integer) pageContext.findAttribute("index");
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:49^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_2=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setName("tabla");
              __jsp_taghandler_2.setProperty("fecha");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:50^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_3=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setName("tabla");
              __jsp_taghandler_3.setProperty("apecli");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:51^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_4=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("tabla");
              __jsp_taghandler_4.setProperty("nomobr");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:52^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_5=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setName("tabla");
              __jsp_taghandler_5.setProperty("descr");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:53^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setName("tabla");
              __jsp_taghandler_6.setProperty("total");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:54^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_7=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setName("tabla");
              __jsp_taghandler_7.setProperty("codigo");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:55^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_8.setParent(__jsp_taghandler_1);
              __jsp_taghandler_8.setName("tabla");
              __jsp_taghandler_8.setProperty("apeemp");
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[10]);
            /*@lineinfo:translated-code*//*@lineinfo:56^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_9=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_9.setParent(__jsp_taghandler_1);
              __jsp_taghandler_9.setName("tabla");
              __jsp_taghandler_9.setProperty("nomemp");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[11]);
            /*@lineinfo:translated-code*//*@lineinfo:57^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_10=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_10.setParent(__jsp_taghandler_1);
              __jsp_taghandler_10.setName("tabla");
              __jsp_taghandler_10.setProperty("nomcli");
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:58^19*/            {
              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_11=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
              __jsp_taghandler_11.setParent(__jsp_taghandler_1);
              __jsp_taghandler_11.setName("tabla");
              __jsp_taghandler_11.setProperty("idcompra");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[13]);
          /*@lineinfo:translated-code*//*@lineinfo:58^65*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[14]);
      /*@lineinfo:user-code*//*@lineinfo:65^1*/      out.print( new java.util.Date() );
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[15]);


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
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final byte text[][]=new byte[16][];
    static {
      try {
      text[0] = 
      "\r\n".getBytes("Cp1252");
      text[1] = 
      "\r\n".getBytes("Cp1252");
      text[2] = 
      "\r\n<html>\r\n<head>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n<script type=\"text/javascript\" src=\"js/jquery-3.4.1.min.js\"></script>\t\r\n<script>\r\n$(document).ready(function(){\r\n  $(\"#myInput\").on(\"keyup\", function() {\r\n    var value = $(this).val().toLowerCase();\r\n    $(\"#myTable tr\").filter(function() {\r\n      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\r\n    });\r\n  });\r\n});\r\n</script>\r\n<title>\r\nHello World\r\n</title>\r\n</head>\r\n<body>\r\n<h2>\r\nExposiciones Pasadas:\r\n</h2>\r\n  <h4>Filtre los Resultados Aqui!</h4>\r\n  <input id=\"myInput\" type=\"text\" class=\"form-control\" placeholder=\"Busque..\">\r\n<table class=\"table table-striped\">\r\n<thead>\r\n    <tr>\r\n      <th scope=\"col\">Exposicion</th>\r\n      <th scope=\"col\">Fecha de Cierre</th>\r\n      <th scope=\"col\">Obra</th>\r\n      <th scope=\"col\">Descripcion</th>\r\n      <th scope=\"col\">Precio</th>\r\n      <th scope=\"col\">Estilo</th>\r\n      <th scope=\"col\">Tipo de Obra</th>\r\n      <th scope=\"col\">Salon</th>\r\n      <th scope=\"col\">Artista</th>\r\n      <th scope=\"col\">Propietario Actual</th>\r\n    </tr>\r\n  </thead>\r\n\r\n    <tbody id=\"myTable\">\r\n\r\n  ".getBytes("Cp1252");
      text[3] = 
      "\r\n            <tr>\r\n              <td>".getBytes("Cp1252");
      text[4] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[5] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[6] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[7] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[8] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[9] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[10] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[11] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[12] = 
      "</td>\r\n              <td>".getBytes("Cp1252");
      text[13] = 
      "</td>\r\n            </tr>\r\n  ".getBytes("Cp1252");
      text[14] = 
      "\r\n  </tbody>\r\n  </table>\r\n\r\n<p>\r\n".getBytes("Cp1252");
      text[15] = 
      "</p>\r\n</body>\r\n</html>\r\n".getBytes("Cp1252");
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
