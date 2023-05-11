# HDFS (Hadoop Distributed File System)

This project is about accessing Hadoop's file system using Java Interface i.e programmatically. 

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
