package foo

import android.widget.TextView
import butterknife.BindView
import foo.bar.kaptissue.R


class LoginController {
    inner class ViewHolder(any: Any?) {

        @BindView(R.id.hello)
        lateinit var view: TextView


    }
}