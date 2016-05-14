package foo.bar.kaptissue

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import butterknife.ButterKnife
import foo.LoginController


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = LayoutInflater.from(this).inflate(R.layout.main_layout, null)
        setContentView(view)
        val viewHolder = LoginController().ViewHolder(null)
        ButterKnife.bind(viewHolder, view)
        viewHolder.view.text = "hello KAPT"
    }
}