package com.strongit.formlogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    pw.println("This is the Test Servlet");

    Enumeration headerNames = request.getHeaderNames();
    while (headerNames.hasMoreElements()) {
      String headerName = (String) headerNames.nextElement();
      pw.print("<br/>Header Name: <em>" + headerName);
      String headerValue = request.getHeader(headerName);
      pw.print("</em>, Header Value: <em>" + headerValue);
      pw.println("</em>");
    }
  }

}
