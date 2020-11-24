#!/bin/bash

#set -eo pipefail

echo "process start ... "

# 版本号
m_version=1.0.0

if [ $1 ]; then
  m_version=$1
else
  echo "镜像版本号必填，第一个参数是项目版本号"
  exit 5
fi

echo "step 1/3: pull code"
# step 1/3:
# 获取代码
if [ -e ./pom.xml ]; then
  echo "code already exists, then git pull"
  git pull
else
  git clone https://github.com/jayuc/dubbo-demo.git
fi

# setp 2/3:
# 编译项目
echo "setp 2/3: mvn clean package"
mvn clean package -Dmaven.test.skip=true

# setp 3/3:
# 构建docker镜像
# 注意：DockerFile 中的版本号要配置和项目版本号一致
echo "setp 3/3: docker build"
cp ./Dockerfile ./target/
cd ./target/
docker build -t "dubbo/userServer:${m_version}" .

echo "finshed."
