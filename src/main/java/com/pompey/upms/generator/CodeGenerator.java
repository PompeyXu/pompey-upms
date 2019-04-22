package com.pompey.upms.generator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 代码生成
 * 
 * @author PompeyXu
 * @date 2019-04-20 19:51
 *
 */
public class CodeGenerator {
	private static Scanner scanner;

	private static String PACKAGEPATH = "com.pompey.upms";
	private static String ALL = "all";

	/**
	 * 模块名称
	 */
	private static String moduleName = new String();

	/**
	 * 父entity公共字段配置
	 */
	private static String[] superEntityColumns = new String[] { "resource_id", "create_by", "create_date", "update_by",
			"update_date", "org_id", "org_name", "org_full_id", "status" };

	/**
	 * 项目路径
	 */
//	private static String projectPath = System.getProperty("user.dir");
	private static String projectPath = "E://";

	/**
	 * 读取控制台内容
	 */
	public static String scanner(String tip) {
		scanner = new Scanner(System.in);
		StringBuilder help = new StringBuilder();
		help.append("请输入" + tip + "：");
		System.out.println(help.toString());
		if (scanner.hasNext()) {
			String ipt = scanner.next();
			if (StringUtils.isNotEmpty(ipt)) {
				return ipt;
			}
		}
		throw new MybatisPlusException("请输入正确的" + tip + "！");
	}

	/**
	 * 
	 * 代码生成 自定义需要填充的字段 List<TableFill> tableFillList = new ArrayList<>();
	 * tableFillList.add(new TableFill("ASDD_SS", FieldFill.INSERT_UPDATE));
	 */
	public static void main(String[] args) {
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator().setGlobalConfig(buildGlobalConfig()).setDataSource(buildDataSource())
				.setPackageInfo(buildPackageInfo()).setStrategy(buildStrategy()).setCfg(buildCfg())
				.setTemplate(buildTemplate());
		mpg.execute();

		// 打印注入设置，这里演示模板里面怎么获取注入内容【可无】
		System.err.println(mpg.getCfg().getMap().get("abc"));
	}

	/**
	 * 全局配置 .setKotlin(true) 是否生成 kotlin 代码 .setMapperName("%sDao")
	 * .setXmlName("%sDao") .setServiceName("MP%sService")
	 * .setServiceImplName("%sServiceDiy") .setControllerName("%sAction")
	 */
	public static GlobalConfig buildGlobalConfig() {
		return new GlobalConfig()
				// 输出目录
				.setOutputDir(projectPath + "/src/main/java")
				// 是否覆盖文件
				.setFileOverride(true)
				// 开启 activeRecord 模式
				.setActiveRecord(true)
				// XML 二级缓存
				.setEnableCache(false)
				// XML ResultMap
				.setBaseResultMap(true)
				// XML columList
				.setBaseColumnList(true)
				// 启动swagger注释
				.setSwagger2(true)
				// 作者
				.setAuthor("PompeyXu")
				// 自定义文件命名，注意 %s 会自动填充表实体属性！
				.setEntityName("%sVo");
	}

	/**
	 * 数据源配置
	 */
	public static DataSourceConfig buildDataSource() {
		return new DataSourceConfig().setDbType(DbType.MYSQL).setDriverName("com.mysql.cj.jdbc.Driver")
				.setUsername("root").setPassword("password")
				.setUrl("jdbc:mysql://localhost:3306/pompey-upms?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8&allowMultiQueries=true&useSSL=false");
	}

	/**
	 * 建立包配置
	 */
	public static PackageConfig buildPackageInfo() {
		moduleName = scanner("模块名");
		return new PackageConfig().setModuleName(moduleName).setParent(PACKAGEPATH).setController("controller");
	}

	/**
	 * 策略配置 .setCapitalMode(true)// 全局大写命名 .setDbColumnUnderline(true)//全局下划线命名
	 * .setInclude(new String[] { "user" }) // 需要生成的表 .setExclude(new
	 * String[]{"test"}) // 排除生成的表 .setTableFillList(tableFillList) //自动填充字段
	 * .setSuperMapperClass("com.TestMapper") //自定义 mapper 父类
	 * .setSuperServiceClass("com.demo.TestService") //自定义 service 父类
	 * .setSuperServiceImplClass("com.demo.TestServiceImpl") //自定义 service 实现类父类
	 * .setSuperControllerClass("com.demo.TestController") //自定义 controller 父类
	 * .setEntityColumnConstant(true) //【实体】是否生成字段常量（默认 false）
	 * .setEntityBuilderModel(true) //【实体】是否为构建者模型（默认 false）
	 * .setEntityLombokModel(true) //【实体】是否为lombok模型（默认 false）
	 * .setEntityBooleanColumnRemoveIsPrefix(true) //Boolean类型字段是否移除is前缀处理
	 * .setRestControllerStyle(true) .setControllerMappingHyphenStyle(true)
	 */
	public static StrategyConfig buildStrategy() {
		String tables = scanner("表名(多个英文逗号分割,全部 all)");
		StrategyConfig strategyConfig = new StrategyConfig();
		// 此处可以修改为您的表前缀
		strategyConfig.setTablePrefix(new String[] { "sys_" })
				// 表名生成策略
				.setNaming(NamingStrategy.underline_to_camel)
				// 自定义实体父类
				.setSuperEntityClass("com.pompey.upms.common.base.BaseVo")
				// 自定义实体，公共字段
				.setSuperEntityColumns(superEntityColumns);

		if (!ALL.equalsIgnoreCase(tables)) {
			// 需要生成哪些表
			strategyConfig.setInclude(tables.split(","));
		}

		// 策略配置
		return strategyConfig;
	}

	/**
	 * 自定义配置及文件输出配置
	 */
	public static InjectionConfig buildCfg() {
		// 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
		return new InjectionConfig() {
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<>(2);
				map.put("abc", this.getConfig().getGlobalConfig().getAuthor());
				this.setMap(map);
			}
		}.setFileOutConfigList(Collections.<FileOutConfig>singletonList(new FileOutConfig("/templates/mapper.xml.vm") {
			// 自定义输出文件目录
			@Override
			public String outputFile(TableInfo tableInfo) {
				// 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
				String packagePath = PACKAGEPATH.replace(".", "/");
				StringBuffer xmlPath = new StringBuffer(projectPath).append("/src/main/java/").append(packagePath)
						.append("/").append(moduleName).append("/mapper/").append(tableInfo.getXmlName())
						.append(StringPool.DOT_XML);
				return xmlPath.toString();
			}
		}));
	}

	/**
	 * 模板配置 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy 至您项目
	 * src/main/resources/template 目录下，模板名称也可自定义如下配置： .setController("...")
	 * .setEntity("...") .setMapper("...") .setXml("...") .setService("...")
	 * .setServiceImpl("...")
	 */
	public static TemplateConfig buildTemplate() {
		// 关闭默认 xml 生成，调整生成 至 根目录
		return new TemplateConfig().setXml(null);
	}

}
