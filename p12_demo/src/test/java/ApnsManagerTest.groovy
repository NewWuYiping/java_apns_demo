/**
 * Created by wuyiping on 16/2/26.
 */
class ApnsManagerTest {

    public static final String TOKEN = "f17095e579307e7b3cd2c2cc9c87b7e969757ef78c34060a0abc9aec62ad693f";

    void testSend4Develope() {
        new ApnsManager().send4Develope(TOKEN);
    }

    void testSend4Production() {
        new ApnsManager().send4Production(TOKEN)
    }
}
