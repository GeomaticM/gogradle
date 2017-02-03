package com.github.blindpirate.gogradle.support

import org.junit.runners.model.FrameworkMethod

class AccessWebProcessor extends GogradleRunnerProcessor {

    @Override
    boolean shouldIgnore(FrameworkMethod method) {
        return System.getProperty('TEST_ARE_OFFLINE') != null
    }
}
