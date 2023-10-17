package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class auth_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Connexion</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Helvetica', sans-serif;\n");
      out.write("            background-color: #000000; /* Fond noir */\n");
      out.write("            color: #ffffff; /* Texte blanc */\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container {\n");
      out.write("            background-color: #1a1a1a; /* Gris foncé */\n");
      out.write("            border: 2px solid #333;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 30px;\n");
      out.write("            width: 400px;\n");
      out.write("            margin: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container h1 {\n");
      out.write("            color: #993366; /* Couleur du texte mauve */\n");
      out.write("            font-size: 28px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-form {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-form input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid #555; /* Bordure grise */\n");
      out.write("            border-radius: 4px;\n");
      out.write("            background-color: #333; /* Gris foncé */\n");
      out.write("            color: #ffffff; /* Texte blanc */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-form input[type=\"submit\"] {\n");
      out.write("            background-color: #993366; /* Nouvelle couleur du bouton mauve */\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            padding: 12px;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-form input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #cc6699; /* Couleur au survol du bouton */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .error-message {\n");
      out.write("            color: #ff0000;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            color: #993366; /* Couleur des liens mauve */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a:hover {\n");
      out.write("            color: #cc6699; /* Couleur au survol des liens */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h1>Connectez-Vous</h1>\n");
      out.write("        <form class=\"login-form\" action=\"auth\" method=\"POST\">\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder=\"Email\">\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("        </form>\n");
      out.write("        <div class=\"error-message\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("        <p>Voulez-vous créer un compte? <br> <a href=\"Inscription.jsp\">Inscription</a></p>\n");
      out.write("        <p>Avez-vous oublier votre Mdp ?<br> <a href=\"forgotPassword.jsp\">Mot de passe oublié ?</a></p>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
