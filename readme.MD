## 全量查询
curl -X GET http://localhost:8080/user/
## id查询
curl -X GET http://localhost:8080/user/1
## 新增
curl -H "Content-Type:application/json;charset=UTF-8" -X POST http://localhost:8080/user -d '{"name": "asd"}'
## 修改
curl -H "Content-Type:application/json;charset=UTF-8" -X PUT http://localhost:8080/user/2 -d '{"name": "qwe"}'
## 删除
curl -X DELETE http://localhost:8080/user/2
