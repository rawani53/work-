package second.app.classbuilder

class ALLinONE : S3() , I1 , I2 {
    override fun i1() {
        println("from i1 is now enhanced")
    }

    override fun i2() {
        println("from i2 is now enhanced")
    }
}