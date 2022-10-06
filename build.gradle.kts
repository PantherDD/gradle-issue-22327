class MyConfiguration(private val configuration: Configuration) : Configuration by configuration {
    override fun toString(): String {
        return "my-" + super.toString()
    }
}

val baseConfig by configurations.registering
val extendedConfig by configurations.registering {
    extendsFrom(MyConfiguration(baseConfig.get()))
}
