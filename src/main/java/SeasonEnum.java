import java.util.Arrays;
import java.util.function.Predicate;

/**
 * @author Wldz
 * @version 1.0.0
 * @description TODO
 * @date 23-6-16 20:49
 */
public enum SeasonEnum {

    //举值定义
    SPRING("spring","春天"),
    SUMMER("summer","夏天"),
    AUTUMN("autumn","秋天"),
    WINTER("winter","冬天");

    private String code;
    private String message;
    //枚举构造
    SeasonEnum(String code,String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    //遍历输出
    public static SeasonEnum getSeasonEnum(String code){
        SeasonEnum[] seasonEnums = SeasonEnum.values();
        for (SeasonEnum seasonEnum : seasonEnums) {
            if(seasonEnum.getCode().equalsIgnoreCase(code)){
                return seasonEnum;
            }
        }
        return null;
    }

    public static SeasonEnum getSeason(String code){
        return Arrays.stream(SeasonEnum.values()).filter(seasonEnum -> false).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        SeasonEnum seasonEnum = getSeasonEnum("spring");
        System.out.println(seasonEnum);
//        System.out.println(seasonEnum.code);
//        System.out.println(seasonEnum.message);
    }

}

