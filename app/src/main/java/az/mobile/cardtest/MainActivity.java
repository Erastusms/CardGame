package az.mobile.cardtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvStatus;
    private TextView tvSoal;
    private TextView tvScore;
    private String[] matpel = {"BI", "BING", "MAT", "IPA", "IPS"};
    //private String[] card = {"Pensil", "Kamus", "Penggaris", "RPAL", "RPUL"};
    private String[] nilai = {"10", "15", "10", "20", "25"};
    private Button btMulai;
    private int a,b,c, klik = 0, total;
    private ImageView ivCard1;
    private ImageView ivCard2;
    private ImageView ivCard3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvSoal = (TextView)findViewById(R.id.tvSoal);
        this.tvScore = (TextView)findViewById(R.id.tvScore);
        this.tvStatus = (TextView)findViewById(R.id.tvStatus);
        this.ivCard1 = (ImageView)findViewById(R.id.ivCard1);
        this.ivCard2 = (ImageView)findViewById(R.id.ivCard2);
        this.ivCard3 = (ImageView)findViewById(R.id.ivCard3);
        this.btMulai = (Button)findViewById(R.id.btMulai);

        this.ivCard1.setOnClickListener(this);
        this.ivCard2.setOnClickListener(this);
        this.ivCard3.setOnClickListener(this);
        this.btMulai.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int x;
        String tot;
        switch (view.getId()){
            case R.id.btMulai:
                shuffleSoal();
                btMulai.setVisibility(View.GONE);
                break;

            case R.id.ivCard1:
                scoreA(a);
                x = Integer.parseInt(this.tvScore.getText().toString());
                total += x;

                if(klik == 4){
                    tot = Integer.toString(total);
                    status(tot);
                }
                shuffleSoal();
                break;

            case R.id.ivCard2:
                scoreB(b);
                x = Integer.parseInt(this.tvScore.getText().toString());
                total += x;

                if(klik == 4){
                    tot = Integer.toString(total);
                    status(tot);
                }
                shuffleSoal();

                break;

            case R.id.ivCard3:
                scoreC(c);
                x = Integer.parseInt(this.tvScore.getText().toString());
                total += x;

                if(klik == 4){
                    tot = Integer.toString(total);
                    status(tot);
                }
                shuffleSoal();
                break;
        }
        klik++;
    }

    public void shuffleSoal(){

        Random randomNumbers = new Random();
        int x = randomNumbers.nextInt(4);

        if(x == 0){
            this.tvSoal.setText(matpel[x]);
        }else if(x == 1){
                this.tvSoal.setText(matpel[x]);
        }else if(x == 2){
                this.tvSoal.setText(matpel[x]);
        }else if(x == 3){
                this.tvSoal.setText(matpel[x]);
        }else if(x == 4){
                this.tvSoal.setText(matpel[x]);
        }
        shuffleCard();
    }

    public void shuffleCard(){

        Random randomNumbers = new Random();

        a = randomNumbers.nextInt(4);
        b = randomNumbers.nextInt(4);
        c = randomNumbers.nextInt(4);

        if(a == 0){
            this.ivCard1.setImageResource(R.drawable.card_pencil);
        }else if(a == 1){
            this.ivCard1.setImageResource(R.drawable.card_dictionary);
        }else if(a == 2){
            this.ivCard1.setImageResource(R.drawable.card_ruler);
        }else if(a == 3){
            this.ivCard1.setImageResource(R.drawable.card_science);
        }else if(a == 4){
            this.ivCard1.setImageResource(R.drawable.card_history);
        }

        if(b == 0){
            this.ivCard2.setImageResource(R.drawable.card_pencil);
        }else if(b == 1){
            this.ivCard2.setImageResource(R.drawable.card_dictionary);
        }else if(b == 2){
            this.ivCard2.setImageResource(R.drawable.card_ruler);
        }else if(b == 3){
            this.ivCard2.setImageResource(R.drawable.card_science);
        }else if(b == 4){
            this.ivCard2.setImageResource(R.drawable.card_history);
        }

        if(c == 0){
            this.ivCard3.setImageResource(R.drawable.card_pencil);
        }else if(c == 1){
            this.ivCard3.setImageResource(R.drawable.card_dictionary);
        }else if(c == 2){
            this.ivCard3.setImageResource(R.drawable.card_ruler);
        }else if(c == 3){
            this.ivCard3.setImageResource(R.drawable.card_science);
        }else if(c == 4){
            this.ivCard3.setImageResource(R.drawable.card_history);
        }
    }

    public void scoreA(int a){

        this.a = a;
        this.tvScore.setText(nilai[a]);

    }
    public void scoreB(int b){

        this.b = b;
        this.tvScore.setText(nilai[b]);

    }
    public void scoreC(int c){

        this.c = c;
        this.tvScore.setText(nilai[c]);
    }

    /*public void hitung(int klik, int total){

        this.klik = klik;
        this.total = total;

        int x;
        String tot;

        x = Integer.parseInt(this.tvScore.getText().toString());
        total += x;

        if(klik == 4){

            tot = Integer.toString(total);
            status(tot);
        }

    }*/
    public void status(String tot){
        this.tvStatus.setText(tot);
    }
}