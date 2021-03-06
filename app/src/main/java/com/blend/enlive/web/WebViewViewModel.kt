package com.blend.enlive.web

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.blend.base.common.BaseViewModel
import com.blend.base.event.SingleLiveEvent


class WebViewViewModel : BaseViewModel() {


    /** 网页相关数据 */
    val webData = SingleLiveEvent<WebViewActivity.ActionModel>()

    /** 标题文本 */
    val title: LiveData<String?> = webData.map { input ->
        input.title
    }

    /** 返回点击 */
    val onNavigationClick: () -> Unit = {
        // 返回
        defClose.value = true
    }

}