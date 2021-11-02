# anonymous

1. Khuôn, class hoàn chỉnh không chứa hàm abstract concrete cụ thể rời rạc

    - các hành động có đủ code

    - nếu có con, con không cần implement gì cả , cha đủ code

    - nếu con thích thì @Override

2. Khuôn, class không hoàn chỉnh (chứa hàm abstract)
    - hàm không code thì bản thân nó không
    hoàn chỉnh vì chỉ có tên hàm mà không có code, nó vẫn có quyền có hàm khác mà có code)

    - khi new abstract class thì khi chấm 

    - new cha abstract thì không có code để chạy !!!

    - new Shape(...), new Pet(...), .paint(), .getArea() éo có code lấy cái đéo gì mà chạy ?

    - không new class có hàm abstract vì k đủ code k hoàn thiện để chạy
trừ phi nếu vẫn ngoan cố new abstract class thì


    - Nếu nó có con, thì con có 2 phương án: + implement 

                                             + abstract (vô sinh luôn :>)
- giả sử ta tập trung và implement., cha nói con làm thì con vẫn cần @Override hết hàm của cha, con có quyền làm thêm dị biệt như bình thường
- vùng nhớ của con cho dù sẽ là thế nào ? (ko care con kế thừa cha cụ thể hay trừu tượng) 

- vùng new của cha super() không care cha cụ thể hay trừu tượng, ba sẽ là cánh chim extends mở rộng thêm

vùng nhớ con bao vùng nhớ cha để đc kế thừa
phần mở rộng extends / trong đây chứa phần dị biệt hoàn toàn của con gồm hàm và biến, đặc điểm riêng của con HCN có thêm 2 cạnh 
phần @Override con trùng tên hàm với cha không bắt buộc nếu cha cụ thể !!! thích thì làm vì đằng nào cũng có cha để xài, @Override là bắt buộc con trùng hàm với cha phần bắt buộc phải có nếu coi như cha là abstract cha k hoàn hảo thì con bắt buộc phải code 

phải viết code cho cha nếu cha trừu tượng,

tổng kết công thức: con chơi với cha trừu tượng
con = new cha() super cha + @Override cho tất cả các hàm của cho + dị hợm của con 

câu hỏi: làm sao để có được 1 object trong oop ?

- cần 1 cái khuôn, 1 cái class 
- gọi toán tử new + phễu để xin vùng ram, clone vùng ram từ khuôn, gọi phễu để đổ vật liệu vào
- đặt tên cho object new xong là có object có tọa độ object luôn biến object trỏ vào vùng new
nếu ta muốn có 1 hình chữ nhật 
1. ta cần khuôn hình chữ nhật
2. new rectangle() đưa các tham số vào, cần 1 cái biến
rectangle x = new rectangle("đủ hết code của khuôn thì mới hành xử được, mới chấm, chạy được")
 liên quan đến hình học: biết thừa có những object biết rõ nhóm con và nhóm cha vuông tròn chữ nhật
 tam giác thuộc nhóm cha shape
 có những hình chỉ biết là hình mà k biết tên gọi chi tiết nhóm con nhóm chi tiết  vì mày k là dạng hình quen, vì nếu 
 quen thuộc thì tao đã đặt đc tên nhóm con cho mày
 có xuất hiện những đối tượng lạc loài ko hình dannjg cu thể quen thuộc k biết xếp nhó nào
 ngoại trừ nhóm cha

theo quan điểm đối tượng object thì đã có object đc tạo ra vì có 1 hình mà k biết khuôn là gì  chỉ biêt nó 
là thuộc khuôn cha vì nó là hình học như vậy ta sẽ có cách tạo object vô định, k quen thuộc
k phaann nhóm con đc ta nhìn nó theo dạng đúnc từ khuôn cha vì lúc này ta gọi nó là hình học
vậy nó phải xuất phat từ hình học khuôn hình học tức là ta new hình học

ta dùng kĩ thuật mượn gió bẻ măng vì ta thiếu 1 cái khuôn cụ thể
vì nếu có khuôn cụ thể thì ta new ngay là ra hình
có hình nhưng k rõ tên khuôn nhưng sure nó là 1 dạng con của cha lấy cha mà new luôn cho rồi
bắt đầu 
con = new cha + extends @Override
hình cà chớn vừa rồi mày là object con vì mày là hình cho nên tao sẽ new cha + một phần @Override 
viết code cho đủ đảm bảo công thức của con 
new cha + code @Override đảm bảo công thức vùng ram con như xưa nay phải đủ code
tạo object mà éo cần class riêng, mượn cha mà làm class riêng mà éo cần làm ra là anonymous class
vẫn new đc object con của shape mà éo cần 1 class con cụ thể vậy thì vùng ram con này chính 
là đại diện cho 1 cái class làm biếng làm riêng, đặt tên class đặt ên   

nếu làm riêng 1 cái khuôn cho hình cụ thể khoog hình dạng thì nó sẽ k thỏa đc công thức riêng nhau
sau này ta nhân bản hình nào cung 50 vô lí 