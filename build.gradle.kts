class MyConfiguration(private val configuration: Configuration) : Configuration by configuration {
    override fun toString(): String {
        return super.toString() + "(" + configuration.toString() + ")"
    }
}

val baseConfig by configurations.creating
val extendedConfig by configurations.creating {
    extendsFrom(MyConfiguration(baseConfig))
}
