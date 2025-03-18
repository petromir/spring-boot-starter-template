# spring-boot-starter-template

A simplified way to bootstrap and configure your Spring Boot starter project.

Click on the green `Use This Template` button and start building your awesome Spring Boot starter.

## 🤩 Highlights
_Add what this starter is about along with other important details_
- The project uses Java 21 and Spring Boot 3.4.X
- `SNAPSHOT` versions are not allowed during release builds (i.e., the ones with non-SNAPSHOT version, e.g. `1.0.0`)
- [Dependabot](https://github.com/dependabot) is configured to update Maven dependencies
- Configuration metadata is provided

## 📋 Prerequisites
1. [Install SDKMAN](https://sdkman.io/install)
2. Initialize SDKMAN environment
```shell
sdk env install
```

## 💡Usage
### Configuration
#### Properties
_Use a prefix to distinguish your properties from the default ones or the ones provided by other libraries._

| Name                        | Description                                           | Default Value | Constraints    |
|-----------------------------|-------------------------------------------------------|---------------|----------------|
| libraries.template.property | This property is supposed to control starter behavior | 1             | Positive value |

Each property could be provided as an environment variable relying on the [Spring environment variable management](https://docs.spring.io/spring-boot/how-to/properties-and-configuration.html).</br> 
For example, providing 
`LIBRARIES_TEMPLATE_PROPERTY` has the same effect as specifying `libraries.template.property` in the `application.yaml` file

You can configure the starter by providing the above properties inside `application.yaml` file:
```yaml
libraries:
  template:
    property: 42
```

### Code
_Explain how to use the exposed beans_

### Dependency management
#### With BOM
If you have (and you should) an internal bom then add it to your project `pom.xml` file first by: 
```xml
<dependenciyManagement>
    <dependencies>
        <dependency>
            <groupId>com.petromirdzhunev</groupId>
            <artifactId>template-spring-boot-starter</artifactId>
            <version>${internal-bom.version}</version>
            <type>bom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependenciyManagement>
```
Then add this starter without a version
```xml
<dependencies>
    <dependency>
        <groupId>com.petromirdzhunev</groupId>
        <artifactId>template-spring-boot-starter</artifactId>
    </dependency>
</dependencies>
```

#### Without BOM
```xml
<dependencies>
    <dependency>
        <groupId>com.petromirdzhunev</groupId>
        <artifactId>template-spring-boot-starter</artifactId>
        <version>${template-spring-boot-starter.version}</version>
    </dependency>
</dependencies>
```

## 🛠 Development

### Build and install `SNAPSHOT` versions to the local repository
#### Switch to `SNAPSHOT` version
```shell
mvnd versions:set -DnewVersion=$(mvnd -B help:evaluate -Dexpression=project.version -DforceStdout | grep -E "^[0-9]+\.[0-9]+\.[0-9]+")-SNAPSHOT
```

#### Install `SNAPSHOT` version to the local repository
```shell
mvnd -B clean install
```

### Point to the `SNAPSHOT` version
Adjust the version in the project where this starter is used.
```xml
<dependencies>
    <dependency>
        <groupId>com.petromirdzhunev.libraries</groupId>
        <artifactId>json-spring-boot-starter</artifactId>
        <version>${template-spring-boot-starter.version}-SNAPSHOT</version>
    </dependency>
</dependencies>
```

### Revert to a non-`SNAPSHOT` version
After the development is finished, you can revert to non-`SNAPSHOT` version by:
```shell
mvnd versions:revert -Dincludes=com.petromirdzhunev:template-spring-boot-starter
```

## 🗓️ Changelog
[CHANGELOG.md](CHANGELOG.md) follows a [Keep A Changelog format](https://keepachangelog.com/en/1.1.0/). Anything that leads to 
breaking changes should be prefixed with `[BREAKING CHANGE]`

## 🙌 Contributing
See [CONTRIBUTING.md](CONTRIBUTING.md)

## ✔️ TODO:
- [ ] Define CONTRIBUTING.md
- [ ] Provide a real example of a bean exposed by the autoconfiguration along with tests. 
- [ ] Add publishing to Maven central repository
  - [ ] Documentation
  - [ ] Add GitHub action