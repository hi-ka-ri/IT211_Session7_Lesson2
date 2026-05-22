Tại sao chỉ in log trong @Before Advice không thể ngăn chặn phương thức gốc thực thi?

    @Before Advice chỉ chạy trước khi phương thức mục tiêu được gọi, nhưng nó không thay đổi luồng thực thi.

    Việc gọi System.out.println chỉ in ra thông báo, không hề tác động đến quá trình gọi hàm gốc.

    Do không có ngoại lệ nào được ném ra, JVM vẫn tiếp tục thực thi phương thức gốc sau khi Advice hoàn tất.

    Kết quả: logic thêm sản phẩm (addProduct) vẫn chạy thành công, dù đã báo "TRUY CẬP BỊ TỪ CHỐI".

    Đây là lỗi logic: chỉ cảnh báo mà không chặn luồng chạy, vi phạm nguyên tắc kiểm soát truy cập (Access Control).