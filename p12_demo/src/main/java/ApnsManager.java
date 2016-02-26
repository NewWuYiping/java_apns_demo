import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;

/**
 * Created by wuyiping on 16/2/26.
 */
public class ApnsManager {
    public static final String P12_PATH_DEVELOP = "";
    public static final String P12_PATH_PRODUCTION = "";
    public static final String PWD_DEVELOP = "";
    public static final String PWD_PRODUCTION = "";

    public void send4Develope(String __token) throws Exception {
        send(P12_PATH_DEVELOP, PWD_DEVELOP, __token);
    }

    public void send4Production(String __token) throws Exception {
        send(P12_PATH_PRODUCTION, PWD_PRODUCTION, __token);
    }

    private void send(String __path, String __pwd, String __token) throws Exception {
        try {
            ApnsService service = APNS.newService().withCert(__path,__pwd).withProductionDestination().build();
            String payload = APNS.newPayload().alertBody("hello,www.mbaike.net").badge(1).sound("default").build();
            service.push(__token, payload);
            System.out.println("推送信息已发送！");
        } catch (Exception e) {
            System.out.println("出错了："+e.getMessage());
            throw e;
        }
    }
}
