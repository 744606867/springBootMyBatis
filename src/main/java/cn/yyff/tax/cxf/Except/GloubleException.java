package cn.yyff.tax.cxf.Except;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@ControllerAdvice(basePackages = "cn.yyff.tax.cxf.controller")
public class GloubleException extends Exception {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public HashMap<String, String> errMess(Model model) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("errCode", "500");
        stringStringHashMap.put("errMessage", "页面错误");
        return stringStringHashMap;

    }
}
