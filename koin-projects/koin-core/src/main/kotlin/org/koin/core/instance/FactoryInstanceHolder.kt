package org.koin.core.instance

import org.koin.core.parameter.ParameterDefinition
import org.koin.dsl.definition.BeanDefinition

class FactoryInstanceHolder<T>(override val bean: BeanDefinition<T>) : InstanceHolder<T> {
    override fun <T> get(parameters: ParameterDefinition): Instance<T> {
        return Instance(create(parameters), true)
    }

    override fun release() {}
}