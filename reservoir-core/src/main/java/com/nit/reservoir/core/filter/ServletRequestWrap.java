package com.nit.reservoir.core.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ServletRequestWrap extends HttpServletRequestWrapper {


    public ServletRequestWrap(HttpServletRequest request) {
        super(request);
    }

    /**
     * 过滤
     * @author charlie.deng
     * @param message
     * @return
     */
    protected static String filter(String message) {
        if (message == null)
            return (null);
        char content[] = new char[message.length()];
        message.getChars(0, message.length(), content, 0);
        StringBuilder result = new StringBuilder(content.length + 50);
        for (int i = 0; i < content.length; i++) {
            switch (content[i]) {
                case '<':
                    result.append("&lt;");
                    break;
                case '>':
                    result.append("&gt;");
                    break;
                case '"':
                    result.append("&quot;");
                    break;
                default:
                    result.append(content[i]);
            }
        }
        return (result.toString());
    }

    @Override
    public String getParameter(String name) {
        return filter(super.getParameter(name));
    }


    @Override
    public Map getParameterMap() {
        HashMap<String, String[]> paramMap = (HashMap<String, String[]>) super.getParameterMap();
        paramMap = (HashMap<String, String[]>) paramMap.clone();

        for (Iterator iterator = paramMap.entrySet().iterator(); iterator.hasNext(); )
        {
            Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) iterator.next();
            String[] values = entry.getValue();
            if (values != null)
            {
                for (int i = 0; i < values.length; i++)
                {
                    values[i] = filter(values[i]);
                }
            }
            entry.setValue(values);
        }
        return paramMap;
    }



    @Override
    public Object getAttribute(String name) {
        Object value = super.getAttribute(name);
        if (value instanceof String)
        {
            value = filter(String.valueOf(value));
        }
        return value;
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values = super.getParameterValues(name);
        if (values != null)
        {
            for (int i = 0; i < values.length; i++)
            {
                values[i] = filter(values[i]);
            }
        }
        return values;
    }
}
