# Nhóm 12 - Đề 38: Quản lý người đang độ tuổi lao động 
Giới thiệu
Ứng dụng "Quản lý Người Lao Động" được thiết kế để quản lý thông tin người dùng đang trong độ tuổi lao động (từ 18 đến 60 tuổi). Hệ thống giúp lưu trữ, tìm kiếm và thống kê thông tin người lao động một cách hiệu quả, hỗ trợ các nhà quản lý dễ dàng theo dõi và đưa ra các báo cáo cần thiết.

Phân quyền người dùng
1. Quản lý (Manager):
Xem danh sách người lao động: Truy cập vào danh sách tất cả người lao động trong hệ thống.
Thêm, xóa và tìm kiếm thông tin người lao động: Quản lý có quyền thêm mới, xóa hoặc tìm kiếm người lao động theo các tiêu chí cụ thể.
Đổi mật khẩu: Quản lý có thể thay đổi mật khẩu của mình để bảo mật.
Xem thông tin cá nhân: Quản lý có thể xem thông tin cá nhân của mình (chức năng phát triển sau).
2. Người dùng (Users):
Xem danh sách người lao động: Chỉ được xem danh sách người lao động, không có quyền chỉnh sửa.
Tìm kiếm người lao động: Có thể tìm kiếm người lao động theo các tiêu chí như tên, nghề nghiệp, độ tuổi, v.v.
Hiển thị thống kê: Có thể xem các báo cáo thống kê người lao động.
Đổi mật khẩu: Người dùng có quyền thay đổi mật khẩu của mình để bảo mật.
Xem thông tin cá nhân: Người dùng có thể xem thông tin cá nhân của mình (chức năng phát triển sau).
Các chức năng
1. Tạo tài khoản
Đối tượng: Manager
Mô tả: Tạo tài khoản cho người dùng mới, bao gồm Manager và Users, với mật khẩu mặc định là 00000000 (sẽ được mã hóa MD5 khi lưu trữ).
2. Đổi mật khẩu
Đối tượng: Manager và Users
Mô tả: Người dùng cần nhập mật khẩu cũ, sau đó nhập mật khẩu mới. Hệ thống sẽ xác minh mật khẩu cũ trước khi cho phép lưu trữ mật khẩu mới (được mã hóa bằng MD5).
3. Danh sách người lao động
Đối tượng: Manager và Users (quyền hạn khác nhau)
Mô tả:
Xem: Cả Manager và Users đều có thể xem danh sách đầy đủ của người lao động.
Thêm, xóa: Chỉ có Manager có quyền thêm và xóa người lao động khỏi danh sách.
Tìm kiếm: Tìm kiếm người lao động dựa trên các thuộc tính như họ tên, giới tính, độ tuổi, nghề nghiệp, v.v.
4. Thống kê người lao động
Đối tượng: Manager và Users (chỉ xem)
Mô tả:
Hiển thị số liệu thống kê về người lao động, bao gồm:
Phân tích độ tuổi: Tỷ lệ người lao động ở các nhóm tuổi khác nhau.
Phân tích thu nhập: Phân loại người lao động theo mức thu nhập.
Tỷ lệ giới tính: Phân bố giới tính trong số người lao động.
Tình trạng hôn nhân: Tỷ lệ người lao động đã kết hôn và độc thân.
5. Quản lý thông tin người lao động
Đối tượng: Manager
Mô tả: Quản lý có thể cập nhật thông tin chi tiết của từng người lao động, bao gồm:
Họ tên
Giới tính
Ngày tháng năm sinh
Nơi ở và hộ khẩu thường trú
Nghề nghiệp
Tình trạng hôn nhân
Thu nhập
Hình ảnh (ảnh đại diện của người lao động)
6. Tìm kiếm người lao động
Đối tượng: Manager và Users
Mô tả: Tìm kiếm người lao động dựa trên các tiêu chí như họ tên, giới tính, nghề nghiệp, tình trạng hôn nhân, thu nhập, v.v.
Đối tượng Dữ liệu
1. Người lao động (Users)
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
Quyền hạn (Manager hoặc User)
