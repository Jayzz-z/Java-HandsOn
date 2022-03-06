package com.tag.handler;


import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class CountMatches extends TagSupport {
  private String inputstring;
  private String lookupstring;
	     
  public String getInputstring() {
    return inputstring;
  }

  public void setInputstring(String inputstring) {
    this.inputstring = inputstring;
  }

  public String getLookupstring() {
    return lookupstring;
  }

  public void setLookupstring(String lookupstring) {
    this.lookupstring = lookupstring;
  }

  @Override
  public int doStartTag() throws JspException {
    try {
      JspWriter out = pageContext.getOut();
      Object StringUtils;
	out.println(StringUtils.countMatches(inputstring,lookupstring));
    } 
    catch (IOException e) {
      e.printStackTrace();
    }
    return SKIP_BODY;
  }
}
