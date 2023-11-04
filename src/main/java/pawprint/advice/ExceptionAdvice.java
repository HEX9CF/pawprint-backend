package pawprint.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pawprint.pojo.Result;

/**
 * 异常处理器
 *
 * @author HEX9CF
 * @date 2023/11/04
 */
@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        e.printStackTrace();
        return Result.error("服务器故障，请稍后重试(=XェX=)", null);
    }
}
