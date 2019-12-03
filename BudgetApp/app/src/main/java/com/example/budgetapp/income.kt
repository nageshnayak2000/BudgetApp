package layout


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.budgetapp.R
import com.example.budgetapp.R.layout.activity_main
import com.example.budgetapp.R.layout.mainpg
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.mainpg.*
import kotlinx.android.synthetic.main.mainpg.income as income1

class Income : AppCompatActivity() {

    @SuppressLint("WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

    }
}
