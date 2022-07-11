public class Login {
    public boolean Logincheck (String EmailAddress,String password) {
        String loginemail = "thaiaz1121@gmail.com";
        String loginpassword = "thaiaz1121";
        // Nhập sai email đã đăng ký
        if ( EmailAddress != loginemail )
            return false;
        // Chưa nhập email
        if ( EmailAddress.indexOf(" ") > 0 )
            return false;
        //  Chưa nhập mật khẩu
        if ( password.indexOf(" ") > 0 )
            return false;
        // Nhập sai mật khẩu
        if ( password != loginpassword )
            return false;
        return true;
    }
}
