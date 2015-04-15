package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest10479")
public class BenchmarkTest10479 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		java.util.Map<String,String[]> map = request.getParameterMap();
		String param = "";
		if (!map.isEmpty()) {
			param = map.get("foo")[0];
		}
		

		String bar = new Test().doSomething(param);
		
		java.lang.Math.random();
		
		response.getWriter().println("Weak Randomness Test java.lang.Math.random() executed");
	}  // end doPost

    private class Test {

        public String doSomething(String param) throws ServletException, IOException {

		// Chain a bunch of propagators in sequence
		String a35973 = param; //assign
		StringBuilder b35973 = new StringBuilder(a35973);  // stick in stringbuilder
		b35973.append(" SafeStuff"); // append some safe content
		b35973.replace(b35973.length()-"Chars".length(),b35973.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map35973 = new java.util.HashMap<String,Object>();
		map35973.put("key35973", b35973.toString()); // put in a collection
		String c35973 = (String)map35973.get("key35973"); // get it back out
		String d35973 = c35973.substring(0,c35973.length()-1); // extract most of it
		String e35973 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d35973.getBytes() ) )); // B64 encode and decode it
		String f35973 = e35973.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String bar = thing.doSomething(f35973); // reflection

            return bar;
        }
    } // end innerclass Test

} // end DataflowThruInnerClass