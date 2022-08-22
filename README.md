# Setup MySQL on Docker
```shell
docker run --rm \
--name=demo_dynamic_where-db \
-e MYSQL_DATABASE=demo_dynamic_where-db \
-e MYSQL_USER=yukbelajar \
-e MYSQL_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
-e MYSQL_ROOT_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
-e TZ=Asia/Jakarta \
-p 6603:3306 \
-v "$PWD/docker/demo_dynamic_where-db/conf.d":/etc/mysql/conf.d \
-v "$PWD/storage/docker/demo_dynamic_where-db-data":/var/lib/mysql \
mysql
```