# 基于SSM的房租管理系统
## 关键词：
- SSM框架（SpringMVC+Spring+Mybatis）
- Bootstrap前端框架（可以使用大量已实现的前端页面，本项目涉及功能较少，前端页面主要在组件上套用了样式，结构还是自己写的简单结构）
- H2数据库（轻量级数据库，导师说方便开发，其实对MySQL熟悉的话，实际开发时建议直接使用MySQL）
- Echarts工具（实现数据的图形化，引入包即可用，具体使用方法查看官方文档）
- Maven管理项目（需要的依赖直接在repository里找到依赖方式贴进项目的pom.xml就可以自己下载依赖包，很方便）
## 实现功能
- 用户（房东）登陆注册
- 房源管理（CRUD）
- 合同管理（CRUD）
- 入住率（饼图，使用Echarts工具）
- 用户租金收入的变化趋势（散点图，Echarts工具）
- 用户某房源所在小区、城市的租金变化趋势（散点图，Echarts工具）
## 技术总结
本项目难度不高，后端功能主要集中在用户信息、房源信息、合同信息的CRUD上，前端设计简陋，通过使用bootstrap框架和echarts工具稍稍地提高了项目的“技术含量”。
如果以后有时间，希望能添加更多功能，比如收租提醒、抄表等，项目的结构上也有不少提高空间，可以加入RESTful风格。
不过还有个更实用的项目在设计中，重制优先级有点低。
最后要感谢GitHub的前辈们，开发过程中一直看文档写demo，对项目的结构设计摇摆不定，浪费了大量时间，最后想起了GitHub，于是阅尽大佬们的作品，
参考了项目结构，与部分功能的实现，通宵两个多星期得以完成，参考的项目均已star，再次感谢。
## 图图图
### 登录
![登录](https://github.com/huzoyu/h2ssm/blob/master/%E7%99%BB%E5%BD%95.JPG)
### 主页
![主页](https://github.com/huzoyu/h2ssm/blob/master/%E4%B8%BB%E9%A1%B5.JPG)
### 待租列表
![待租列表](https://github.com/huzoyu/h2ssm/blob/master/%E5%BE%85%E7%A7%9F%E5%88%97%E8%A1%A8.JPG)
### 合同信息
![合同信息](https://github.com/huzoyu/h2ssm/blob/master/%E5%90%88%E5%90%8C%E4%BF%A1%E6%81%AF.JPG)
### 趋势图
![趋势图](https://github.com/huzoyu/h2ssm/blob/master/%E8%B6%8B%E5%8A%BF%E5%9B%BE.JPG)
