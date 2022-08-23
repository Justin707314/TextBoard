package Infra;

import Utils.UriParser;

import java.util.Map;

public class Request {

    private UriParser uriParser;

    Request(String uri){
        this.uriParser = new UriParser(uri);
    }

    public boolean isValidRequest(){
        return uriParser.isValid();
    }

    public String getControllerCode(){
        return uriParser.getControllerCode();
    }

    public String getTarget(){
        return uriParser.getTarget();
    }

    public Object getParameter(String key, Class cls){
        Map<String, Object> parameter = uriParser.getParameter();
        return cls.cast(parameter.get(key));
    }

    

}
