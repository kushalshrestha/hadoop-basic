# HDFS (Hadoop Distributed File System)

CSV DataSet Considered : https://www.kaggle.com/datasets/mkechinov/ecommerce-behavior-data-from-multi-category-store


Build an image
```
docker build
```

Create and start namenode container
```
docker-compose up namenode -d
```


Create and start datanode container
```
docker-compose up datanode -d
```

Execute a command in a running container. Eg: namenode
```
docker exec -it namenode /bin/bash
```
