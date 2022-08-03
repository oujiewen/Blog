package com.owenblog.Exception;

import cn.dev33.satoken.exception.*;
import com.owenblog.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;


/**
 * 统一异常拦截处理
 * 可以针对异常自定义去处理去捕获，返回指定类型（json）到前端
 */
@Slf4j
@ControllerAdvice
public class GraceExceptionHanler  {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    @ResponseBody
    public R returnMaxFilesSizeLimit(MaxUploadSizeExceededException e){
        return R.eroor(ErrorMsg.file_max);
    }

    @ExceptionHandler(NotLoginException.class)
    @ResponseBody
    public R handlerNotLoginException(NotLoginException nle) {
        // 不同异常返回不同状态码
        String message = "";
        if (nle.getType().equals(NotLoginException.NOT_TOKEN)) {
            message = "未提供Token";
        } else if (nle.getType().equals(NotLoginException.INVALID_TOKEN)) {
            message = "未提供有效的Token";
        } else if (nle.getType().equals(NotLoginException.TOKEN_TIMEOUT)) {
            message = "登录信息已过期，请重新登录";
        } else if (nle.getType().equals(NotLoginException.BE_REPLACED)) {
            message = "您的账户已在另一台设备上登录，如非本人操作，请立即修改密码";
        } else if (nle.getType().equals(NotLoginException.KICK_OUT)) {
            message = "已被系统强制下线";
        } else {
            message = "当前会话未登录";
        }
        // 返回给前端
        return R.eroor(message);
    }

    @ExceptionHandler
    @ResponseBody
    public R handlerNotRoleException(NotRoleException e) {
        return R.eroor("无此角色：" + e.getRole());
    }

    @ExceptionHandler
    @ResponseBody
    public R handlerNotPermissionException(NotPermissionException e) {
        return R.eroor("无此权限：" + e.getCode());
    }

    @ExceptionHandler
    @ResponseBody
    public R handlerDisableLoginException(DisableLoginException e) {
        return R.eroor("账户被封禁：" + e.getDisableTime() + "秒后解封");
    }

    @ExceptionHandler
    @ResponseBody
    public R handlerNotSafeException(NotSafeException e) {
        return R.eroor("二级认证异常：" + e.getMessage());
    }




    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R exceptionHandler(Exception e){
        //处理后端验证失败产生的异常
        if(e instanceof MethodArgumentNotValidException){
            MethodArgumentNotValidException exception= (MethodArgumentNotValidException) e;
            return R.eroor(exception.getBindingResult().getFieldError().getDefaultMessage().toString());
        }
        //处理业务异常
        else if(e instanceof MyException){
            MyException exception= (MyException) e;
            log.info(e.getMessage());
            return R.eroor("系统异常");
        }
        //处理其余的异常
        else{
            return R.eroor("系统异常");
        }
    }

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public R returnMyException(MyException e){
        return  R.eroor(e.getMessage());
    }
}
