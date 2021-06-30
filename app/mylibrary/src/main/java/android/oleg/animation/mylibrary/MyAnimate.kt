package android.oleg.animation.mylibrary

import android.view.View
import android.view.animation.*

// TEST
class MyAnimate(mView: View) {
    var anim: Animation? = null
    var up: ScaleAnimation? = null
    var down: ScaleAnimation? = null
    var myView: View? = mView

    fun upDown() {
        val sizeAnimation = 1.05f
        val sizeAnimationDown = 0.9f

        up = ScaleAnimation(
            1.0f,
            sizeAnimation,
            1.0f,
            sizeAnimation,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        up?.duration = 200
        up?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}

            override fun onAnimationEnd(animation: Animation) {
                myView?.startAnimation(down)
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })

        down = ScaleAnimation(
            sizeAnimation,
            1.0f,
            sizeAnimation,
            1.0f,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        down?.duration = 200

        myView?.startAnimation(up)
    }

    fun resizeSmallToBig() {
        val sizeAnimation = 1.0f
        val sizeAnimationDown = 0.5f

        up = ScaleAnimation(
            0.0f,
            sizeAnimation,
            0.0f,
            sizeAnimation,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        up?.duration = 200

        myView?.startAnimation(up)
    }

    fun upDownFast() {
        val sizeAnimation = 1.02f
        val sizeAnimationDown = 0.9f

        up = ScaleAnimation(
            1.0f,
            sizeAnimation,
            1.0f,
            sizeAnimation,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        up?.duration = 100
        up?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}

            override fun onAnimationEnd(animation: Animation) {
                myView?.startAnimation(down)
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })

        down = ScaleAnimation(
            sizeAnimation,
            1.0f,
            sizeAnimation,
            1.0f,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        down?.duration = 100

        myView?.startAnimation(up)
    }

    fun upDownAllTime() {
        val sizeAnimation = 1.05f
        val sizeAnimationDown = 0.8f


        val pause = 700
        val offsetX = -1500f
        val scale = ScaleAnimation(
            0.8f, 1.0f, 0.8f, 1.0f,
            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
        )
        scale.duration = pause.toLong()

        val translateAnimation = TranslateAnimation(offsetX, 0f, 0f, 0f)
        translateAnimation.duration = pause.toLong()

        val alphaAnimation = AlphaAnimation(0.8f, 1.0f)
        alphaAnimation.duration = pause.toLong()

        val animation = AnimationSet(true)
        animation.addAnimation(scale)
        animation.addAnimation(translateAnimation)
        animation.addAnimation(alphaAnimation)

        animation.interpolator = AnticipateOvershootInterpolator()
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {

            }

            override fun onAnimationEnd(animation: Animation) {
                myView?.startAnimation(up)
            }

            override fun onAnimationRepeat(animation: Animation) {

            }
        })

        up = ScaleAnimation(
            1.0f,
            sizeAnimation,
            1.0f,
            sizeAnimation,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        up?.duration = 500
        up?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}

            override fun onAnimationEnd(animation: Animation) {
                myView?.startAnimation(down)
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })

        down = ScaleAnimation(
            sizeAnimation,
            1.0f,
            sizeAnimation,
            1.0f,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        down?.duration = 500
        down?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}

            override fun onAnimationEnd(animation: Animation) {
                myView?.startAnimation(up)
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })

        myView?.startAnimation(animation)
    }

    fun upDownBig() {
        val sizeAnimation = 1.5f
        val sizeAnimationDown = 0.9f

        up = ScaleAnimation(
            1.0f,
            sizeAnimation,
            1.0f,
            sizeAnimation,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        up?.duration = 200
        up?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}

            override fun onAnimationEnd(animation: Animation) {
                myView?.startAnimation(down)
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })

        down = ScaleAnimation(
            sizeAnimation,
            1.0f,
            sizeAnimation,
            1.0f,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown,
            Animation.RELATIVE_TO_SELF,
            sizeAnimationDown
        )
        down?.duration = 200

        myView?.startAnimation(up)
    }

    fun animateSpeedWay() {
        val pause = 400
        val offsetX = 1500f
        val scale = ScaleAnimation(
            0.8f, 1.0f, 0.8f, 1.0f,
            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
        )
        scale.duration = pause.toLong()

        val translateAnimation = TranslateAnimation(offsetX, 0f, 0f, 0f)
        translateAnimation.duration = pause.toLong()

        val alphaAnimation = AlphaAnimation(0.8f, 1.0f)
        alphaAnimation.duration = pause.toLong()

        val animation = AnimationSet(true)
        animation.addAnimation(scale)
        animation.addAnimation(translateAnimation)
        animation.addAnimation(alphaAnimation)

        animation.interpolator = AnticipateOvershootInterpolator()
        myView?.startAnimation(animation)

    }

    fun animateSpeedWayLeft() {
        val pause = 300
        val offsetX = 20f
        val scale = ScaleAnimation(
            1.0f, 1.0f, 1.0f, 1.0f,
            Animation.RELATIVE_TO_SELF, 1.2f, Animation.RELATIVE_TO_SELF, 1.0f
        )
        scale.duration = pause.toLong()

        val translateAnimation = TranslateAnimation(offsetX, 0f, 0f, 0f)
        translateAnimation.duration = pause.toLong()

        myView?.startAnimation(translateAnimation)

    }

    fun animateSpeedWayRight() {
        val pause = 300
        val offsetX = -20f
        val scale = ScaleAnimation(
            1.0f, 1.0f, 1.0f, 1.0f,
            Animation.RELATIVE_TO_SELF, 1.2f, Animation.RELATIVE_TO_SELF, 1.0f
        )
        scale.duration = pause.toLong()

        val translateAnimation = TranslateAnimation(offsetX, 0f, 0f, 0f)
        translateAnimation.duration = pause.toLong()

        myView?.startAnimation(translateAnimation)

    }

    fun animateAlpha() {
        val animation1 = AlphaAnimation(0.2f, 1.0f)
        animation1.duration = 500
        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }
    }

    fun animateAlphaFast() {
        val animation1 = AlphaAnimation(0.2f, 1.0f)
        animation1.duration = 200
        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }
    }

    fun animateAlpha07to1() {
        val animation1 = AlphaAnimation(0.9f, 1.0f)
        animation1.duration = 1000
        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }
    }

    fun animateAlpha05to1() {
        val animation1 = AlphaAnimation(0.5f, 1.0f)
        animation1.duration = 600
        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }
    }

    fun animateAlpha0to1() {
        val animation1 = AlphaAnimation(0.0f, 1.0f)
        animation1.duration = 500
        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }
    }

    fun animateAlpha0to1Slow1000() {
        val animation1 = AlphaAnimation(0.0f, 1.0f)
        animation1.duration = 1000
        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }
    }

    fun animateAlpha1to0() {
        val animation1 = AlphaAnimation(1.0f, 0.0f)
        animation1.duration = 2000
        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }
    }

    fun animateAlpha1to0Fast() {
        val animation1 = AlphaAnimation(1.0f, 0.0f)
        animation1.duration = 500
        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }
    }

    fun animateAllAlpha() {
        val animation1 = AlphaAnimation(0.0f, 1.0f)
        animation1.duration = 600

        val animation2 = AlphaAnimation(1.0f, 0.0f)
        animation2.duration = 600

        animation1.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {

            }

            override fun onAnimationEnd(animation: Animation) {
                try {
                    myView?.startAnimation(animation2)
                } catch (e: Exception) {
                }

            }

            override fun onAnimationRepeat(animation: Animation) {

            }
        })

        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }

    }

    fun animateAllAlphaMinimum() {
        val animation1 = AlphaAnimation(1.0f, 0.6f)
        animation1.duration = 300

        val animation2 = AlphaAnimation(0.6f, 1.0f)
        animation2.duration = 300

        animation1.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {

            }

            override fun onAnimationEnd(animation: Animation) {
                try {
                    myView?.startAnimation(animation2)
                } catch (e: Exception) {
                }

            }

            override fun onAnimationRepeat(animation: Animation) {

            }
        })

        try {
            myView?.startAnimation(animation1)
        } catch (e: Exception) {
        }

    }

    fun animateLeftRight() {

        val duration = 200L

        val animation1 = TranslateAnimation(0f, -50f, 0f, 0f)
        animation1.duration = duration
        animation1.fillAfter = true

        val animation2 = TranslateAnimation(-50f, 50f, 0f, 0f)
        animation2.duration = duration
        animation2.fillAfter = true

        val animation3 = TranslateAnimation(50f, 0f, 0f, 0f)
        animation3.duration = duration
        animation3.fillAfter = true

        animation1.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
            }

            override fun onAnimationEnd(animation: Animation) {
                try {
                    myView?.startAnimation(animation2)
                } catch (e: Exception) {
                }
            }

            override fun onAnimationRepeat(animation: Animation) {
            }
        })

        animation2.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
            }

            override fun onAnimationEnd(animation: Animation) {
                try {
                    myView?.startAnimation(animation3)
                } catch (e: Exception) {
                }
            }

            override fun onAnimationRepeat(animation: Animation) {
            }
        })

        myView?.startAnimation(animation1)
    }
}