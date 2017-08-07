
package es.example.incomingcall.jsonmodeldata.Sucess;


public class Sucess {

    private Boolean status;
    private Integer code;
    private String user_name;
    private Object caller_id;
    private String message;
    private Error error;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String userName) {
        this.user_name = userName;
    }

    public Object getCallerId() {
        return caller_id;
    }

    public void setCallerId(Object callerId) {
        this.caller_id = callerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

}