import cn.hutool.core.util.DesensitizedUtil;

/**
 * 脱敏测试
 */
public class DesensitizedTest {
    public static void main(String[] args) {
        String name = "张三";
        String phone = "13812345678";
        String idCard = "330103199001010000";
        String address = "浙江省杭州市西湖区";
        String email = "zhangsan@163.com";
        String bankCard = "6217000000000000000";
        String password = "123456";
        String carNumber = "浙A88888";
        String licensePlate = "浙A88888";
        String ip = "192.168.1.1";
        System.out.println("脱敏前：" + name + " " + phone + " " + idCard + " " + address + " " + email + " " + bankCard + " " + password + " " + carNumber + " " + licensePlate + " " + ip);
        System.out.println("脱敏后："
                + DesensitizedUtil.chineseName(name) + " "
                + DesensitizedUtil.mobilePhone(phone) + " "
                + DesensitizedUtil.idCardNum(idCard, 2, 2) + " "
                + DesensitizedUtil.address(address, 2) + " "
                + DesensitizedUtil.email(email) + " "
                + DesensitizedUtil.bankCard(bankCard) + " "
                + DesensitizedUtil.password(password) + " "
                + DesensitizedUtil.carLicense(carNumber) + " "
                + DesensitizedUtil.carLicense(licensePlate) + " "
                + DesensitizedUtil.ipv4(ip));

    }
}
