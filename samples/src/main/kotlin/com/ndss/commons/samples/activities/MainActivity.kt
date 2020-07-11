package com.ndss.commons.samples.activities

import android.os.Bundle
import com.ndss.commons.activities.BaseSimpleActivity
import com.ndss.commons.extensions.appLaunched
import com.ndss.commons.samples.BuildConfig
import com.ndss.commons.samples.R
import java.util.*

class MainActivity : BaseSimpleActivity() {
    override fun getAppLauncherName() = getString(R.string.smtco_app_name)

    override fun getAppIconIDs(): ArrayList<Int> {
        val ids = ArrayList<Int>()
        ids.add(R.mipmap.commons_launcher)
        return ids
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appLaunched(BuildConfig.APPLICATION_ID)
    }
}
