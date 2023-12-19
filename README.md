<p align="center">
    <img src=https://img.qimuu.icu/typory/logo.gif width=188/>
</p>

<h1 align="center">Ly-API-SDK</h1>
<p align="center"><strong>Ly-API 接口开放平台开发者工具包</strong></p>

<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
   <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.7+-green.svg"/>
  <a href="https://github.com/qimu666/qi-api-sdk" target="_blank"><img src='https://img.shields.io/github/forks/qimu666/qi-api-sdk' alt='GitHub forks' class="no-zoom"></a>
  <a href="https://github.com/qimu666/qi-api-sdk" target="_blank"><img src='https://img.shields.io/github/stars/qimu666/qi-api-sdk' alt='GitHub stars' class="no-zoom"></a>
</div>
### 目录结构 📝

```text
qiapisdk
    ├─client
    ├─config
    ├─exception
    ├─model
    │  ├─enums
    │  ├─params
    │  ├─request
    │  └─response
    ├─service
    │  └─impi
    └─utils
```

### 导航 🧭

- **[Ly-API 接口开放平台 🔗](https://api.qimuu.icu/)**
- **[Ly-API-DOC 开发者文档 📖](https://doc.qimuu.icu/)**
- **[Ly-API-SDK-demo ✔️](https://github.com/qimu666/qi-api-sdk-demo/blob/master/src/main/java/icu/qimuu/qiapisdkdemo/controller/InvokeController.java)**

###  快速开始 🚀

**要开始使用 Ly-API-SDK，您需要按照以下简单进行操作:**

#### 1. 引入依赖坐标

```xml
<dependency>
   <groupId>icu.qimuu</groupId>
   <artifactId>qi-api-sdk</artifactId>
   <version>0.0.4</version>
</dependency>   
```

**可以搭配[EasyWeb](https://github.com/qimu666/EasyWeb)依赖快速启动Web项目**

```xml
  <dependency>
     <groupId>icu.qimuu</groupId>
     <artifactId>EasyWeb</artifactId>
     <version>0.0.6</version>
  </dependency>
```

#### 2. 前往[Ly-API 接口开放平台](https://api.qimuu.icu/) 获取开发者密钥对

#### 3. 初始化客户端QiApiClient对象

- 方法 1 ：主动实例化客户端

  ```java
  String accessKey = "你的 accessKey";
  String secretKey = "你的 secretKey";
  QiApiClient client = new QiApiClient(accessKey, secretKey);
  ```

- 方法 2 ：通过配置文件注入对象

  - yml

    ```yml
    # Ly-API 配置
    qi:
      api:
        client:
          access-key: 你的 accessKey
          secret-key: 你的 secretKey
          # 本地网关地址，可修改为自己的网关，用于本地测试，线上网关地址等，不配置默认平台的网关
         # host: http://localhost:8090/api
    ```
    
  - properties
  
    ```properties
    qi.api.client.access-key=你的 accessKey
    qi.api.client.secret-key=你的 secretKey
    ```

#### 4. 使用API服务

   ```java
    @Resource
    private ApiService apiService;
   ```

#### 5. 发起请求示例

示例：随机毒鸡汤

- 示例一 ：**通过配置文件 推荐👍**

```java
try {
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup();
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
  log.error(e.getMessage());
}
```

- 示例二 ：主动注入
```java
try {
    QiApiClient lyApiClient = new QiApiClient("你的 accessKey", "你的 secretKey");
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup(lyApiClient);
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
    log.error(e.getMessage());
}
```

响应：

```json
{
  "text": "不知道你混什么圈，反正我的是混黑眼圈。"
}
```

**搭配[EasyWeb](https://github.com/qimu666/EasyWeb)示例：推荐👍**

```java
@GetMapping("/getPoisonousChickenSoup")
public BaseResponse<PoisonousChickenSoupResponse> getPoisonousChickenSoup() {
        PoisonousChickenSoupResponse poisonousChickenSoup = null;
        try {
        poisonousChickenSoup = apiService.getPoisonousChickenSoup();
        } catch (ApiException e) {
        throw new ApiException(e.getCode(), e.getMessage());
        }
        return ResultUtils.success(poisonousChickenSoup);
        }
```

响应示例：

```json
{
  "code": 0,
  "data": {
    "text": "人类三大错觉—手机响了，有人敲门，他（她）喜欢我。"
  },
  "message": "ok"
}
```
- **更多示例详见：[Ly-API-SDK-Demo 示例项目](https://github.com/qimu666/qi-api-sdk-demo/blob/master/src/main/java/icu/qimuu/qiapisdkdemo/controller/InvokeController.java)**
- **更多接口详见：[Ly-API-DOC 开发者文档](https://doc.qimuu.icu/)**

### 贡献 🤝

如果您想为 **[Ly-API 接口开放平台](https://api.qimuu.icu/)**  做出贡献，请随时提交拉取请求。我们始终在寻找方法来改进项目，使其对像您这样的开发者更有用。

### 联系我们 📩

如果您对 **[Ly-API 接口开放平台](https://api.qimuu.icu/)**  平台有任何问题或建议，请随时联系我们:📩邮箱：2483482026@qq.com。

感谢您使用 **[Ly-API 接口开放平台](https://api.qimuu.icu/)**  ！ 😊
