package life.huangsl.community.exception;

/**
 * @author hsl
 * @create 2021-11-25 17:40
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND("你找到问题不在了，要不要换个试试？")
    ;

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
