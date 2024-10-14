package ___PACKAGE___

import android.location.Location
import android.os.Looper
import android.view.View
import androidx.fragment.app.FragmentActivity
import com.qmobile.qmobiledatasync.utils.BaseKotlinInputControl
import com.qmobile.qmobiledatasync.utils.KotlinInputControl


@KotlinInputControl
class LockedField(private val view: View) : BaseKotlinInputControl {

    override val autocomplete: Boolean = false

    override fun getIconName(): String {
        return "lock.xml"
    }

    override fun process(inputValue: Any?, outputCallback: (output: Any) -> Unit) {
    }

}