#include <jni.h>
#include <string>
#include <opencv2/core/types.hpp>
#include <opencv2/core.hpp>


extern "C" JNIEXPORT jstring JNICALL
Java_com_example_opencvdemo_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_opencvdemo_MainActivity_opencvTest(JNIEnv *env, jobject thiz, jlong mad_addr_gr,jlong mat_addr_rgba) {
    cv::Rect();
    cv::Mat();
    std::string hello2="hello from opencvtest";
    return env->NewStringUTF(hello2.c_str());
    // TODO: implement validate()
}
