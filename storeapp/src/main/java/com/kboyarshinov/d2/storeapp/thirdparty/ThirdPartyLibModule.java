package com.kboyarshinov.d2.storeapp.thirdparty;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;

@Module
public abstract class ThirdPartyLibModule {

    @Binds
    @IntoSet
    abstract ThirdPartyLib analyticsLib(AnalyticsLib analyticsLib);

    @Binds
    @IntoSet
    abstract ThirdPartyLib crashReportingLib(CrashReportingLib crashReportingLib);
}
