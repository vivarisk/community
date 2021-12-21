package life.huangsl.community.enums;

/**
 * @author hsl
 * @create 2021-12-20 16:06
 */
public enum NotificationStatusEnum {
    UNREAD(0), READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
