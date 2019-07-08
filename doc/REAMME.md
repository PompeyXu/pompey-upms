####swagger注解说明
	@Api()用于类； 表示标识这个类是swagger的资源 
	@ApiOperation()用于方法； 表示一个http请求的操作 
	@ApiParam()用于方法，参数，字段说明； 表示对参数的添加元数据（说明或是否必填等） 
	@ApiModel()用于类 表示对类进行说明，用于参数用实体类接收 
	@ApiModelProperty()用于方法，字段  表示对model属性的说明或者数据操作更改 
	@ApiIgnore()用于类，方法，方法参数  表示这个方法或者类被忽略 
	@ApiImplicitParam() 用于方法  表示单独的请求参数 
	@ApiImplicitParams() 用于方法，包含多个 @ApiImplicitParam
	
	具体使用举例说明： 
	@Api() 用于类；表示标识这个类是swagger的资源 
	tags–表示说明 
	value–也是说明，可以使用tags替代  但是tags如果有多个值，会生成多个list

####lombok插件安装

	装该插件时最好关闭Eclipse，然后在官网中下载lombok.jar
	https://www.projectlombok.org/download
	将 lombok.jar 放在eclipse安装目录下，和 eclipse.ini 文件平级的。 
	在命令行输入：java -jar lombok.jar
	
	@Data注解：在JavaBean或类JavaBean中使用，这个注解包含范围最广，它包含getter、setter、NoArgsConstructor注解，即当使用当前注解时，会自动生成包含的所有方法；
	@getter注解：在JavaBean或类JavaBean中使用，使用此注解会生成对应的getter方法；
	@setter注解：在JavaBean或类JavaBean中使用，使用此注解会生成对应的setter方法；
	@NoArgsConstructor注解：在JavaBean或类JavaBean中使用，使用此注解会生成对应的无参构造方法；
	@AllArgsConstructor注解：在JavaBean或类JavaBean中使用，使用此注解会生成对应的有参构造方法；
	@ToString注解：在JavaBean或类JavaBean中使用，使用此注解会自动重写对应的toStirng方法；
	@EqualsAndHashCode注解：在JavaBean或类JavaBean中使用，使用此注解会自动重写对应的equals方法和hashCode方法；
	@Slf4j：在需要打印日志的类中使用，当项目中使用了slf4j打印日志框架时使用该注解，会简化日志的打印流程，只需调用info方法即可；
	@Log4j：在需要打印日志的类中使用，当项目中使用了log4j打印日志框架时使用该注解，会简化日志的打印流程，只需调用info方法即可；
	在使用以上注解需要处理参数时，处理方法如下（以@ToString注解为例，其他注解同@ToString注解）：
	@ToString(exclude="column")
	意义：排除column列所对应的元素，即在生成toString方法时不包含column参数；
	@ToString(exclude={"column1","column2"})
	意义：排除多个column列所对应的元素，其中间用英文状态下的逗号进行分割，即在生成toString方法时不包含多个column参数；
	@ToString(of="column")
	意义：只生成包含column列所对应的元素的参数的toString方法，即在生成toString方法时只包含column参数；；
	@ToString(of={"column1","column2"})
	意义：只生成包含多个column列所对应的元素的参数的toString方法，其中间用英文状态下的逗号进行分割，即在生成toString方法时只包含多个column参数；


####mybatis plus 使用 [具体使用说明](https://mp.baomidou.com/guide/)

	######条件参数说明
	查询方式	说明
	setSqlSelect	设置 SELECT 查询字段
	where	WHERE 语句，拼接 + WHERE 条件
	and	AND 语句，拼接 + AND 字段=值
	andNew	AND 语句，拼接 + AND (字段=值)
	or	OR 语句，拼接 + OR 字段=值
	orNew	OR 语句，拼接 + OR (字段=值)
	eq	等于=
	allEq	基于 map 内容等于=
	ne	不等于<>
	gt	大于>
	ge	大于等于>=
	lt	小于<
	le	小于等于<=
	like	模糊查询 LIKE
	notLike	模糊查询 NOT LIKE
	in	IN 查询
	notIn	NOT IN 查询
	isNull	NULL 值查询
	isNotNull	IS NOT NULL
	groupBy	分组 GROUP BY
	having	HAVING 关键词
	orderBy	排序 ORDER BY
	orderAsc	ASC 排序 ORDER BY
	orderDesc	DESC 排序 ORDER BY
	exists	EXISTS 条件语句
	notExists	NOT EXISTS 条件语句
	between	BETWEEN 条件语句
	notBetween	NOT BETWEEN 条件语句
	addFilter	自由拼接 SQL
	last	拼接在最后，例如：last("LIMIT 1")