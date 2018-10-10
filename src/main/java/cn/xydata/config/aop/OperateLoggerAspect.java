package cn.xydata.config.aop;



import cn.xydata.annotation.OPLoggerBean;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Map;



@Aspect
@Component
public class OperateLoggerAspect {

    private static final Logger logger = LoggerFactory.getLogger(OperateLoggerAspect.class);

//    @Autowired
//    private SysLogMapper sysLogMapper;

    // 定义切点Pointcut
    @Pointcut("@annotation(cn.xydata.annotation.OPLoggerBean)")
    public void opLoggerAspect() {

    }

    @After("opLoggerAspect()")
    public void doAfter(JoinPoint jp) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();

//        UserDto user = (UserDto)SecurityUtils.getSubject().getSession().getAttribute("user");

        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        //String ip=request.getHeader("host");
/*        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            System.out.println(name + ":" + request.getHeader("host"));
        }*/
        String ip = request.getRemoteHost();
        Map<String, String[]> queryString = request.getParameterMap();
        String description = getMethodDescription(jp);
        logger.info("请求结束, 各个参数, url: {}, method: {}, uri: {}, params: {},description:{}", url, method, uri, queryString, description);


//        SysLog sysLog = new SysLog();
//        sysLog.setDescription(description);
//        sysLog.setUri(uri);
//        sysLog.setLogCode("OP"); //操作日志
//        sysLog.setLogData(JSON.toJSONString(queryString));
//        sysLog.setMethod(method);
//        sysLog.setGmtCreate(new Date());
//        sysLog.setUserIp(ip);
//        if(user != null){
//            sysLog.setNameCreate(user.getRealName());
//        }
//        sysLogMapper.insert(sysLog);


    }


    /**
     * 获取注解中对方法的描述信息
     *
     * @param joinPoint 切点
     * @return 方法描述
     * @throws Exception
     */
    public static String getMethodDescription(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getDeclaredMethods();
        String description = "";
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    description = method.getAnnotation(OPLoggerBean.class).description();
                    break;
                }
            }
        }
        return description;
    }


}
