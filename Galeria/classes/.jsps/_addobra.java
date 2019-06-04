  /*@lineinfo:filename=/addobra.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _addobra extends oracle.jsp.runtime.HttpJsp {

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
    _addobra page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:14^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/addobra");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:15^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_2=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setKey("titulo.promp");
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
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:16^3*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_3=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("titulo");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:17^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_4=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setKey("descripcion.promp");
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
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:18^3*/            {
              org.apache.struts.taglib.html.TextareaTag __jsp_taghandler_5=(org.apache.struts.taglib.html.TextareaTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextareaTag.class,"org.apache.struts.taglib.html.TextareaTag property style");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setProperty("descripcion");
              __jsp_taghandler_5.setStyle("width:400px");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:19^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setKey("precio.promp");
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
            out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:20^3*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setProperty("precio");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:21^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_8.setParent(__jsp_taghandler_1);
              __jsp_taghandler_8.setKey("fecha.promp");
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
            out.write(__jsp_StaticText.text[10]);
            /*@lineinfo:translated-code*//*@lineinfo:22^3*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property");
              __jsp_taghandler_9.setParent(__jsp_taghandler_1);
              __jsp_taghandler_9.setProperty("fecha");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[11]);
            /*@lineinfo:translated-code*//*@lineinfo:24^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_10=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_10.setParent(__jsp_taghandler_1);
              __jsp_taghandler_10.setKey("exposicion.promp");
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
            out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:25^3*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_11.setParent(__jsp_taghandler_1);
              __jsp_taghandler_11.setProperty("exposicion");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[13]);
                  /*@lineinfo:translated-code*//*@lineinfo:26^13*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_12=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                    __jsp_taghandler_12.setCollection("ayuda");
                    __jsp_taghandler_12.setLabelProperty("descr");
                    __jsp_taghandler_12.setProperty("codigo");
                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[14]);
                /*@lineinfo:translated-code*//*@lineinfo:26^88*/                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[15]);
            /*@lineinfo:translated-code*//*@lineinfo:28^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_13=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_13.setParent(__jsp_taghandler_1);
              __jsp_taghandler_13.setKey("estilo.promp");
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[16]);
            /*@lineinfo:translated-code*//*@lineinfo:29^3*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_14=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_14.setParent(__jsp_taghandler_1);
              __jsp_taghandler_14.setProperty("estilo");
              __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[17]);
                  /*@lineinfo:translated-code*//*@lineinfo:30^13*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_15=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                    __jsp_taghandler_15.setCollection("ayuda2");
                    __jsp_taghandler_15.setLabelProperty("descr");
                    __jsp_taghandler_15.setProperty("codigo");
                    __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[18]);
                /*@lineinfo:translated-code*//*@lineinfo:30^89*/                } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[19]);
            /*@lineinfo:translated-code*//*@lineinfo:32^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_16=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_16.setParent(__jsp_taghandler_1);
              __jsp_taghandler_16.setKey("tipo.promp");
              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[20]);
            /*@lineinfo:translated-code*//*@lineinfo:33^3*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_17=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_17.setParent(__jsp_taghandler_1);
              __jsp_taghandler_17.setProperty("tipo");
              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[21]);
                  /*@lineinfo:translated-code*//*@lineinfo:34^13*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_18=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                    __jsp_taghandler_18.setCollection("ayuda3");
                    __jsp_taghandler_18.setLabelProperty("descr");
                    __jsp_taghandler_18.setProperty("codigo");
                    __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[22]);
                /*@lineinfo:translated-code*//*@lineinfo:34^89*/                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[23]);
            /*@lineinfo:translated-code*//*@lineinfo:36^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_19=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_19.setParent(__jsp_taghandler_1);
              __jsp_taghandler_19.setKey("artista.promp");
              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[24]);
            /*@lineinfo:translated-code*//*@lineinfo:37^3*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_20=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_20.setParent(__jsp_taghandler_1);
              __jsp_taghandler_20.setProperty("artista");
              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_20,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[25]);
                  /*@lineinfo:translated-code*//*@lineinfo:38^13*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_21=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                    __jsp_taghandler_21.setCollection("ayuda4");
                    __jsp_taghandler_21.setLabelProperty("descr");
                    __jsp_taghandler_21.setProperty("codigo");
                    __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[26]);
                /*@lineinfo:translated-code*//*@lineinfo:38^89*/                } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[27]);
            /*@lineinfo:translated-code*//*@lineinfo:40^3*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_22=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_22.setParent(__jsp_taghandler_1);
              __jsp_taghandler_22.setKey("salon.promp");
              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[28]);
            /*@lineinfo:translated-code*//*@lineinfo:41^3*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_23=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_23.setParent(__jsp_taghandler_1);
              __jsp_taghandler_23.setProperty("salon");
              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_23,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[29]);
                  /*@lineinfo:translated-code*//*@lineinfo:42^13*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_24=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                    __jsp_taghandler_24.setCollection("ayuda5");
                    __jsp_taghandler_24.setLabelProperty("descr");
                    __jsp_taghandler_24.setProperty("codigo");
                    __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[30]);
                /*@lineinfo:translated-code*//*@lineinfo:42^89*/                } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[31]);
            /*@lineinfo:translated-code*//*@lineinfo:45^21*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_25=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
              __jsp_taghandler_25.setParent(__jsp_taghandler_1);
              __jsp_taghandler_25.setStyleClass("btn btn-success");
              __jsp_taghandler_25.setValue("Add");
              __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_25,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[32]);
          /*@lineinfo:translated-code*//*@lineinfo:45^77*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[33]);
      /*@lineinfo:user-code*//*@lineinfo:48^1*/      out.print( new java.util.Date() );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[34]);


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
    private static final char text[][]=new char[35][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n<html>\n<head>\n<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n<title>\nHello World\n</title>\n</head>\n<body>\n<h2>Ingresar una Nueva Obra</h2>\n".toCharArray();
      text[3] = 
      "\n  ".toCharArray();
      text[4] = 
      "\n  ".toCharArray();
      text[5] = 
      "\n  ".toCharArray();
      text[6] = 
      "\n  ".toCharArray();
      text[7] = 
      "\n  ".toCharArray();
      text[8] = 
      "\n  ".toCharArray();
      text[9] = 
      "\n  ".toCharArray();
      text[10] = 
      "\n  ".toCharArray();
      text[11] = 
      "\n  <p></p>\n  ".toCharArray();
      text[12] = 
      "\n  ".toCharArray();
      text[13] = 
      "\n            ".toCharArray();
      text[14] = 
      "\n  ".toCharArray();
      text[15] = 
      "\n  ".toCharArray();
      text[16] = 
      "\n  ".toCharArray();
      text[17] = 
      "\n            ".toCharArray();
      text[18] = 
      "\n  ".toCharArray();
      text[19] = 
      "\n  ".toCharArray();
      text[20] = 
      "\n  ".toCharArray();
      text[21] = 
      "\n            ".toCharArray();
      text[22] = 
      "\n  ".toCharArray();
      text[23] = 
      "\n  ".toCharArray();
      text[24] = 
      "\n  ".toCharArray();
      text[25] = 
      "\n            ".toCharArray();
      text[26] = 
      "\n  ".toCharArray();
      text[27] = 
      "\n  ".toCharArray();
      text[28] = 
      "\n  ".toCharArray();
      text[29] = 
      "\n            ".toCharArray();
      text[30] = 
      "\n  ".toCharArray();
      text[31] = 
      "\n  <p></p>\n  &nbsp;&nbsp;&nbsp;".toCharArray();
      text[32] = 
      "\n".toCharArray();
      text[33] = 
      "\n<p>\n".toCharArray();
      text[34] = 
      "</p>\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
