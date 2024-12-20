# Nhóm 12 - Đề 38: Quản lý người đang độ tuổi lao động 
Giới thiệu
Ứng dụng "Quản lý Người Lao Động" được thiết kế để quản lý thông tin người lao động đang trong độ tuổi lao động (từ 18 đến 60 tuổi). Hệ thống giúp lưu trữ, tìm kiếm và thống kê thông tin người lao động một cách hiệu quả, hỗ trợ các nhà quản lý dễ dàng theo dõi và đưa ra các báo cáo cần thiết.

Phân quyền người dùng
1. Người dùng (Users):
Xem danh sách người lao động: Truy cập vào danh sách tất cả người lao động trong hệ thống.
Thêm, xóa và tìm kiếm thông tin người lao động: Người dùng có quyền thêm mới, xóa hoặc tìm kiếm người lao động theo các tiêu chí cụ thể.
Đổi mật khẩu: Người dùng có thể thay đổi mật khẩu của mình để bảo mật.
Xem thông tin cá nhân: Người dùng có thể xem thông tin cá nhân của mình (chức năng phát triển sau).
Các chức năng
1. Tạo tài khoản
Đối tượng: Người dùng (Users)
Mô tả: Tạo tài khoản cho người lao động mới với mật khẩu mặc định là 00000000 (sẽ được mã hóa MD5 khi lưu trữ).
2. Đổi mật khẩu
Đối tượng: Người dùng
Mô tả: Người dùng cần nhập mật khẩu cũ, sau đó nhập mật khẩu mới. Hệ thống sẽ xác minh mật khẩu cũ trước khi cho phép lưu trữ mật khẩu mới (được mã hóa bằng MD5).
3. Danh sách người lao động
Đối tượng: Người dùng
Mô tả:
Xem: Người dùng có thể xem danh sách đầy đủ của người lao động.
Thêm, xóa: Người dùng có quyền thêm và xóa người lao động khỏi danh sách.
Tìm kiếm: Tìm kiếm người lao động dựa trên các thuộc tính như họ tên, giới tính, độ tuổi, nghề nghiệp, v.v.
4. Thống kê người lao động
Đối tượng: Người dùng (chỉ xem)
Mô tả:
Hiển thị số liệu thống kê về người lao động, bao gồm:
Phân tích độ tuổi: Tỷ lệ người lao động ở các nhóm tuổi khác nhau.
Phân tích thu nhập: Phân loại người lao động theo mức thu nhập.
Tỷ lệ giới tính: Phân bố giới tính trong số người lao động.
Tình trạng hôn nhân: Tỷ lệ người lao động đã kết hôn và độc thân.
5. Quản lý thông tin người lao động
Đối tượng: Người dùng
Mô tả: Người dùng có thể cập nhật thông tin chi tiết của từng người lao động, bao gồm:
Họ tên
Giới tính
Ngày tháng năm sinh
Nơi ở và hộ khẩu thường trú
Nghề nghiệp
Tình trạng hôn nhân
Thu nhập
Hình ảnh (ảnh đại diện của người lao động)
6. Tìm kiếm người lao động
Đối tượng: Người dùng
Mô tả: Tìm kiếm người lao động dựa trên các tiêu chí như họ tên, giới tính, nghề nghiệp, tình trạng hôn nhân, thu nhập, v.v.
Đối tượng Dữ liệu
1. Người lao động
Các thuộc tính:
Họ tên
Giới tính
Ngày tháng năm sinh
Nơi ở
Hộ khẩu thường trú
Nghề nghiệp
Tình trạng hôn nhân
Thu nhập
Hình ảnh
Quyền hạn: Được định nghĩa là người lao động đang được quản lý trong hệ thống
