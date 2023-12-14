package pawprint.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后果
 *
 * @date 2023/11/04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success(String msg, Object data) {
        return new Result(1, msg, data);
    }

    public static Result error(String msg, Object data) {
        return new Result(0, msg, data);
    }
}
