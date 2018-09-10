package jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;  

public class j_soup {
	public static void main(String args[]) throws IOException {
		int count=0;
		Document doc = Jsoup.connect("http://www.javatpoint.com").get();  
		Elements links = doc.select("a[href]");  
		for (Element link : links) {  
			count++;
		    System.out.println("\nlink : " + link.attr("href"));  
		    System.out.println("text : " + link.text());  
		}   
		System.out.println(count);
}
}