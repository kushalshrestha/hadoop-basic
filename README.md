# HDFS (Hadoop Distributed File System)

This project is about accessing Hadoop's file system using Java Interface i.e programmatically. 


## Resources
* CSV DataSet : https://www.kaggle.com/datasets/mkechinov/ecommerce-behavior-data-from-multi-category-store
* JAR File Location: ./hdfs/target/hdfs-1.0-SNAPSHOT.jar

## Commands
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
