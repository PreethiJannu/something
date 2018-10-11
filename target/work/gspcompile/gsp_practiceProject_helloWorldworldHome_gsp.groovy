import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_practiceProject_helloWorldworldHome_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/helloWorld/worldHome.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',73,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('textField','g',107,['name':("Enter First Name")],-1)
printHtmlPart(7)
invokeTag('textField','g',108,['name':("Enter Last Name")],-1)
printHtmlPart(8)
invokeTag('textField','g',109,['name':("Enter Password")],-1)
printHtmlPart(9)
invokeTag('textField','g',110,['name':("Confirm password")],-1)
printHtmlPart(10)
invokeTag('actionSubmit','g',111,['value':("signup")],-1)
printHtmlPart(11)
})
invokeTag('form','g',114,['float':("left")],2)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',117,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1538139283000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
