# Docker-compose YML

This docker-compose.yml file defines four services: namenode, datanode, resourcemanager, and nodemanager.

The namenode service runs the HDFS NameNode daemon, which manages the HDFS file system metadata. It maps the namenode container's /hadoop/dfs/name directory to a Docker volume called hadoop_namenode. The ports section publishes the NameNode's web interface on port 9870.

The datanode service runs the HDFS DataNode daemon, which stores HDFS block data. It maps the datanode container's /hadoop/dfs/data directory to a Docker volume called hadoop_datanode. The environment section sets the CORE_CONF_fs_defaultFS environment variable to point to the NameNode service, and the ports section publishes the DataNode's web interface on port 9870.

