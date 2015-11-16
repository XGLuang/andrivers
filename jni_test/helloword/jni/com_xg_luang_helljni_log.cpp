#define LOG_TAG "helloJniLog"

#include <android_runtime/AndroidRuntime.h>

#include "JNIHelp.h"
#include "jni.h"
#include <utils/Log.h>
#include <utils/misc.h>
#include <android/log.h>

#include <fcntl.h>
#include <stdio.h>
#include <string.h>
#include <sys/types.h>
#include <stdlib.h>
#include <errno.h>
#include <unistd.h>
#include <dirent.h>
#include <linux/ioctl.h>
#include <utils/Log.h>

namespace android {

static   void   com_xg_luang_helloword_HelloJni_log(void){
	__android_log_print(ANDROID_LOG_ERROR, LOG_TAG,"com_xg_luang_helloword_HelloJni_log called\n");

}
static JNINativeMethod gMethods[] = {
   
    {"log",       "()V",    (void *)com_xg_luang_helloword_HelloJni_log},
    
};

int register_com_xg_luang_helljni_log(JNIEnv* env){

	return AndroidRuntime::registerNativeMethods(env,  "com/xg/luang/helloword
/HelloJni", gMethods, NELEM(gMethods));

}

}//namespace android 
