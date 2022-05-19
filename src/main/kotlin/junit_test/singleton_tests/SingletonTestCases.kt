package junit_test.singleton_tests
import design_patterns.creational.singleton.SingleObject

fun booleanMessage(string: String): Boolean {
    var singleObject: SingleObject = SingleObject
    return singleObject.returnHello().equals(string)
}

fun objectExists(): SingleObject{
    var singleObject: SingleObject = SingleObject
    return singleObject
}

fun sameObject(): Boolean{
    var singleObject: SingleObject = SingleObject
    var singleObject2: SingleObject = SingleObject
    return singleObject.equals(singleObject2)
}