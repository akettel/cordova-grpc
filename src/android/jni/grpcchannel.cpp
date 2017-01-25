#include <jni.h>
#include <initializer_list>
#include <string>
#include "../../../../../../../android_research/android-ndk-r13b/platforms/android-19/arch-arm/usr/include/jni.h"


extern "C" {

JNIEXPORT jint JNICALL
Java_com_vernier_android_grpcchannel_GrpcChannel_startServer(JNIEnv *env, jobject instance) {
    printf("starting server\n");
    return 1;

}

}
