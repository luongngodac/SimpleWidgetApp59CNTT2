package vn.edu.ntu.ngodacluong.simplewidgetapp59cntt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtKQ;
    EditText edtSoA, edtSoB;
    RadioGroup rdgPhepTinh;
    Button btnTinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews(); //goi
        addEvents();
    }
    //khai bao cai dat, view phai goi truoc su kien
    private void addViews()
    {
        txtKQ = findViewById(R.id.txtKQ);
        edtSoA = findViewById(R.id.etdSoA);
        edtSoB = findViewById(R.id.etdSoB);
        rdgPhepTinh = findViewById(R.id.rdgPhepTinh);
        btnTinh = findViewById(R.id.btnTinh);
        // hai ten nay khong can giong nhau, nhung nen dat ten giong
        // nhau de nhu kieu da gan dung thanh phan roi

    }
    private  void addEvents()
    {
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhToan();
            }
        });

    }
    //dinh nghia ham tinh toan
    private void tinhToan()
    {
        float soA = Float.parseFloat(edtSoA.getText().toString());
        float soB = Float.parseFloat(edtSoB.getText().toString());
        float kq;
        switch (rdgPhepTinh.getCheckedRadioButtonId())
        {
            case R.id.rdbCong:
                kq = soA + soB;
                txtKQ.setText(new Float(kq).toString());
                break;
            case R.id.rdbTru:
                kq = soA - soB;
                txtKQ.setText(new Float(kq).toString());
                break;
            case R.id.rdbNhan:
                kq = soA * soB;
                txtKQ.setText(new Float(kq).toString());
                break;
            case R.id.rdbChia:
                try {// khi nao no co loi thi no se goi catch
                    kq = soA / soB;
                    txtKQ.setText(new Float(kq).toString());
                }catch (Exception ex)
                {
                    txtKQ.setText("Lỗi chia cho 0");
                }

        }
    // khong co gi

    }

}
