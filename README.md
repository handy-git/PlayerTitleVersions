# PlayerTitleApi

#### 使用方法

## 使用方法

#### 初始化jar
- 下载代码中repo文件夹的PlayerTitle-2.8.4.jar   
- 或者下载releases里的jar文件导入你的项目中
- 或者使用maven引入依赖

```
<repositories>
   <repository>
      <id>player-title</id>
      <url>https://raw.githubusercontent.com/handy-git/PlayerTitleVersions/master/repo</url>
   </repository>
</repositories>

<dependency>
  <groupId>com.handy.playertitle</groupId>
  <artifactId>PlayerTitle</artifactId>
  <version>2.8.4</version>
</dependency>
```

1. 在附属插件初始化时候新增关联的称号  
并把称号唯一id保存在附属插件的yml或者数据库中进行永久保存
2. 根据玩家名和这个称号的唯一id将称号给予玩家

具体查询: ApiTest类或者[javadoc](https://handy-git.github.io/PlayerTitleVersions/ "javadoc")
