package day_6_Tree;

import java.util.Stack;

public class StringHtml {
	   public static void main(String[] args) {
	        String str = "<html>Some text</html>"; // Replace with your actual string
	        Stack<String> tagStack = new Stack<>();
	        Stack<String> htmlContentStack = new Stack<>();
	        
	        int i = 0;
	        while (i < str.length()) {
	            if (str.charAt(i) == '<') {
	                int tagEnd = str.indexOf('>', i);
	                if (tagEnd == -1) break; // Malformed HTML
	                String tag = str.substring(i, tagEnd + 1);
	                tagStack.push(tag);
	                i = tagEnd + 1;
	            } else {
	                int textStart = i;
	                int nextTagStart = str.indexOf('<', i);
	                if (nextTagStart == -1) nextTagStart = str.length();
	                String text = str.substring(textStart, nextTagStart);
	                htmlContentStack.push(text);
	                i = nextTagStart;
	            }
	        }
	        
	        // Printing the contents of the stacks for verification
	        System.out.println("Tags:");
	        while (!tagStack.isEmpty()) {
	            System.out.println(tagStack.pop());
	        }
	        
	        System.out.println("HTML Content:");
	        while (!htmlContentStack.isEmpty()) {
	            System.out.println(htmlContentStack.pop());
	        }
	    }
	}


