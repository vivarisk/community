package life.huangsl.community.exception;

/**
 * @author hsl
 * @create 2021-11-25 16:57
 */
public class CustomizeException extends RuntimeException{
    private Integer code;
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
