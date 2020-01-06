package th.ac.su.ict.chidapa.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtV1 = findViewById<EditText>(R.id.edtV1)
        var edtV2 = findViewById<EditText>(R.id.edtV2)
        var btnCalculate = findViewById<Button>(R.id.btnCalculate)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        var rgOperator = findViewById<RadioGroup>(R.id.rgOperator)

        btnCalculate.setOnClickListener {
            var v1:Int = edtV1.text.toString().toInt()
            var v2:Int = edtV2.text.toString().toInt()
            var result = 0



            when(rgOperator.checkedRadioButtonId){
                R.id.rbAddition-> result = v1+v2
                R.id.rbSubstraction-> result = v1-v2
                R.id.rbMultiplication-> result = v1*v2
                R.id.rbDivision-> result = v1/v2

            }

            tvResult.setText(result.toString())
        }
    }
}
