### xxx产品文档

#### 一、产品定位

xxxxx


##### 1. xxx

_xxx策略：_

- 将采用 [Open-TEE](http://github.com/Open-TEE/opentee-android) 框架作为安全策略的基本组件。TEE（Trusted Execution Environment）是一个硬件级别隔离的运行环境。我们的基本策略是：TEE 接受任何输入，但仅输出公钥、地址、签名后的内容、备份数据包（keystore 或其它自定义结构）。即：我们将_**不允许**_ TEE 端的程序_**直接输出私钥**_。

> 自定义结构，可能是 keystore 的集合 zip 压缩包，待调研成熟方案。

  _**任何一次签名过程都需要用户确认，输入 keystore 密码（用户角度称为`支付密码`）。TEE 环境会显示 UI 以接收用户输入密码，或指纹确认。**_


- 备份数据包文件可以分享以便于多手机备份。分享方式包括：微信、蓝牙、Android Beam/NFC.
> 当然这样也