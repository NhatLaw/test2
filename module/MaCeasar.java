package maceasar;

public class MaCeasar {

        //thuật toán mã hóa Ceasar
    private String encrypt(String plainText, int key) {
        StringBuilder result = new StringBuilder();

        // Duyệt qua từng ký tự trong chuỗi đầu vào
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);

            // Nếu là chữ in hoa (A-Z)
            if (c >= 'A' && c <= 'Z') {
                // có 'A' ở đây vì cho nó về kiểu số sau khi thực hiện xong ép về kiểu char
                c = (char) ((c - 'A' + key) % 26 + 'A');
            }
            // Nếu là chữ thường (a-z)
            else if (c >= 'a' && c <= 'z') {
                // có 'a' ở đây vì cho nó về kiểu số sau khi thực hiện xong ép về kiểu char
                c = (char) ((c - 'a' + key) % 26 + 'a');
            }
            // append ở đây là mình thêm kí vừa được mã hóa vào result
            // nếu không phải kí tự thì mình cx thêm zo như thường
            result.append(c);
            //sau khi kết thúc vòng lặp thì nó sẽ tự giải phóng biến c
        }
        // Trả về dạng chuỗi String của đối tượng result, tại về kiểu dữ liệu method là String
        return result.toString();
    }
 
    //thuật toán giải mã Ceasar
    private String decrypt(String cipherText, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            char c = cipherText.charAt(i);

            // Nếu là chữ in hoa (A-Z)
            if (c >= 'A' && c <= 'Z') {
                // có 'A' ở đây vì cho nó về kiểu số sau khi thực hiện xong ép về kiểu char
                c = (char) ((c - 'A' - key + 26) % 26 + 'A');
            }
            // Nếu là chữ thường (a-z)
            else if (c >= 'a' && c <= 'z') {
                // có 'a' ở đây vì cho nó về kiểu số sau khi thực hiện xong ép về kiểu char
                c = (char) ((c - 'a' - key + 26) % 26 + 'a');
            }
            // append ở đây là mình thêm kí vừa được mã hóa vào result
            // nếu không phải kí tự thì mình cx thêm zo như thường
            result.append(c);
            //sau khi kết thúc vòng lặp thì nó sẽ tự giải phóng biến c
        }
        // Trả về dạng chuỗi String của đối tượng result, tại về kiểu dữ liệu method là String
        return result.toString();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Ceasar ce=new Ceasar();
        ce.setVisible(true);
    }
}
