package Homeworks.HW_Lesson12_sp.HW1;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import java.util.Stack;

public class XMLHandler extends DefaultHandler {
    private Stack<String> elementStack = new Stack<>();
    private StringBuilder fileContent = new StringBuilder();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        fileContent.append("<").append(qName);
        if (attributes.getLength() > 0) {
            fileContent.append(" ").append(attributes.getQName(0)).append("=\"").append(attributes.getValue(0)).append("\"");
        }
        fileContent.append(">");
        elementStack.push(qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String value = new String(ch, start, length).trim();
        if (!value.isEmpty()) {
            fileContent.append(value);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        fileContent.append("</").append(qName).append(">");
        elementStack.pop();
    }

    public String getFileContent() {
        return fileContent.toString();
    }
}