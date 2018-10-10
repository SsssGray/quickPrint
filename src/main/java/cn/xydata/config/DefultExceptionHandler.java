package cn.xydata.config;


import cn.xydata.common.domain.result.ExceptionMsg;
import cn.xydata.common.domain.result.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class DefultExceptionHandler {

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Response customExceptionHandler(HttpServletRequest request, Exception e){
        return new Response("000222",e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response exceptionHandler(HttpServletRequest request,Exception e){
        e.printStackTrace();
        return new Response(ExceptionMsg.FAILED);
    }
}
