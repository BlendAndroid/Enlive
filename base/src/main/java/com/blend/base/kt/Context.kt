package com.blend.base.kt

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.app.ActivityCompat

/** 获取默认启动配置 */
var getDefaultOptions: (Context) -> Bundle? = {
    null
}

/**
 * 将 [bundle] 中的数据添加到 [Intent]后，通过 [Context] 对象，打开类型为 [A] 的 [Activity] 界面，并传递 [options]
 * > [bundle] [Bundle] 对象，其中的数据会被添加到 [Intent] 中
 *
 * > [options] 启动配置相关，默认 `null`
 *
 * > [Context] 对象若不是 [Activity]，则会调用 [Intent.addFlags] ([Intent.FLAG_ACTIVITY_NEW_TASK])
 * 在新的栈中打开
 */
inline fun <reified A : Activity> Context.startTargetActivity(
    bundle: Bundle,
    options: Bundle? = getDefaultOptions.invoke(this),
) {
    val intent = Intent(this, A::class.java)
    if (this !is Activity) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }
    intent.putExtras(bundle)
    ActivityCompat.startActivity(this, intent, options)
}