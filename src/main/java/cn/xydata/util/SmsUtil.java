package cn.xydata.util;//package cn.xydata.util;
//
//import com.chinamobile.openmas.client.Sms;
//
///**
// * @author gyy
// * @date 2018/10/10 11:10
// */
//public class SmsUtil {
//    public static void main(String[] args) {
//        try {
//            // 短信
//            Sms sms = new Sms("http://nb069.openmas.net:9080/OpenMasService");//短信接口地址
//            String[] destinationAddresses = new String[]{"17855833172"};//发送对象：11数字手机号码
//            String message = "短信测试";//短信内容
//            String extendCode = "3"; //自定义扩展码（模块），可以为空，将显示在手机终端来信号码末位，注：来信号码总长度不能超过20位
//            String ApplicationID = "8023001";//应用账号
//            String Password = "RJNcGxp6TCEd";//应用密码
//
//            // 发送短信 方法三
//            String GateWayid = "";
//            GateWayid = sms.SendMessage(destinationAddresses, message,
//                    extendCode, ApplicationID, Password);
//            System.out.println(GateWayid);
//        } catch (Exception ex) {
//            System.err.println(ex);
//        }
//    }
//}
