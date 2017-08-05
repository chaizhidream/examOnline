# dao层（数据库访问） 命名规范

### 接口类：采用JavaBean+Interface+Dao的形式来定义
   如 ：  
   学生对象接口类： StudentInterfaceDao
   
### 实现类： 采用JavaBean+Interface+Impl+Dao的形式来定义
   如：
   学生对象实现类 StudentInterfaceImplDao
   
## 方法命名
    只能以(insert)插入，(update)更新，(select)查找，(delete)删除，(count)统开头
  其它层避免以这五个单词开头的方法，以免造成误解。