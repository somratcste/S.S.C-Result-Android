package com.examplesscresult.sscresult;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.preference.DialogPreference;

public class MainActivity extends Activity {
	Button wout,win;
	TextView showresult,s1,s2,s3,s4,s5,s6,s7,s8,s9;
	EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
	int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
	double a1=0.0,b1=0.0,c1=0.0,d1=0.0,e11=0.0,f1=0.0,g1=0.0,h1=0.0,i1=0.0,z =0.0;
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 initControls();
		}


	private void initControls() {
		// TODO Auto-generated method stub
		wout=(Button) findViewById(R.id.button1);
		win=(Button) findViewById(R.id.button2);
		e1=(EditText) findViewById(R.id.editText1);
		e2=(EditText) findViewById(R.id.editText2);
		e3=(EditText) findViewById(R.id.editText3);
		e4=(EditText) findViewById(R.id.editText4);
		e5=(EditText) findViewById(R.id.editText5);
		e6=(EditText) findViewById(R.id.editText6);
		e7=(EditText) findViewById(R.id.editText7);
		e8=(EditText) findViewById(R.id.editText8);
		e9=(EditText) findViewById(R.id.editText9);
		showresult=(TextView) findViewById(R.id.textView10);
		s1=(TextView) findViewById(R.id.textView1);
		s2=(TextView) findViewById(R.id.textView2);
		s3=(TextView) findViewById(R.id.textView3);
		s4=(TextView) findViewById(R.id.textView4);
		s5=(TextView) findViewById(R.id.textView5);
		s6=(TextView) findViewById(R.id.textView6);
		s7=(TextView) findViewById(R.id.textView7);
		s8=(TextView) findViewById(R.id.textView8);
		s9=(TextView) findViewById(R.id.textView9);
		
		
		 wout.setOnClickListener(new Button.OnClickListener()
	      { public void onClick
	      (View  v) { calculate();}
	      
	    
	      

		private void calculate() {
			// TODO Auto-generated method 
			
			
			
			 a=Integer.parseInt(e1.getText().toString());
			 if(a <=100 && a>=33)
			 {
			 switch(a/10)
			 {
			 case 10:
			 case 9:
			 case 8:
				 s1.setText("Bangla Grade : A+");
				 a1=5.00;
				 break;
				 
			 case 7:
				 s1.setText("Bangla Grade : A");
				 a1= 4.00;
				 break;
				 
			 case 6:
				 s1.setText("Bangla Grade : A-");
				 a1= 3.5;
				 break;
				 
			 case 5:
				 s1.setText("Bangla Grade : B");
				 a1=3.00;
				 break;
				 
			 case 4:
				 s1.setText("Bangla Grade : C");
				 a1=2.00 ;
				 break;
				 
				default : 
					s1.setText("Bangla Grade : D");
					a1= 1.00;
					break;
				 
			 }
			 }
			 else if(a<33){
				 s1.setText("Bangla Grade : F");
			       a1= 0.0;
			 }
			 else
				 s1.setText("Bangla check value");
			 
			 
		      b=Integer.parseInt(e2.getText().toString());
		      
		      if(b <=100 && b>=33)
				 {
				 switch(b/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s2.setText("English Grade : A+");
					 b1= 5.00;
					 break;
					 
				 case 7:
					 s2.setText("English Grade : A");
					 b1= 4.00;
					 break;
					 
				 case 6:
					 s2.setText("English Grade : A-");
					 b1= 3.5;
					 break;
					 
				 case 5:
					 s2.setText("English Grade : B");
					 b1= 3.00;
					 break;
					 
				 case 4:
					 s2.setText("English Grade : C");
					 b1= 2.00;
					 break;
					 
					default : 
						s2.setText("English Grade : D");
						b1= 1.00;
						break;
					 
				 }
				 }
				 else if(b<33){
					 s2.setText("English Grade : F");
					 b1= 0.0;
				 }
				 else
					 s2.setText("English check value");
		      
		      c=Integer.parseInt(e3.getText().toString());
		      
		      if(c <=100 && c>=33)
				 {
				 switch(c/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s3.setText("G.Math Grade : A+");
					 c1=5.00 ;
					 break;
					 
				 case 7:
					 s3.setText("G.Math Grade : A");
					 c1=4.00 ;
					 break;
					 
				 case 6:
					 s3.setText("G.Math Grade : A-");
					 c1= 3.5;
					 break;
					 
				 case 5:
					 s3.setText("G.Math Grade : B");
					 c1= 3.00;
					 break;
					 
				 case 4:
					 s3.setText("G.Math Grade : C");
					 c1= 2.00;
					 break;
					 
					default : 
						s3.setText("G.Math Grade : D");
						c1= 1.00;
						break;
					 
				 }
				 }
				 else if(c<33){
					 s3.setText("G.Math Grade : F");
					 c1= 0.0;
				 }
				 else
					 s3.setText("G.Math check value");
		      
		      d=Integer.parseInt(e4.getText().toString());
		      
		      if(d <=100 && d>=33)
				 {
				 switch(d/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s4.setText("S.Sci Grade : A+");
					 d1= 5.00;
					 break;
					 
				 case 7:
					 s4.setText("S.Sci Grade : A");
					 d1= 4.00;
					 break;
					 
				 case 6:
					 s4.setText("S.Sci Grade : A-");
					 d1= 3.5;
					 break;
					 
				 case 5:
					 s4.setText("S.Sci Grade : B");
					 d1= 3.00;
					 break;
					 
				 case 4:
					 s4.setText("S.Sci Grade : C");
					 d1= 2.00;
					 break;
					 
					default : 
						s4.setText("S.Sci Grade : D");
						d1= 1.00;
						break;
					 
				 }
				 }
				 else if(d<33){
					 s4.setText("S.Sci Grade : F");
					 d1= 0.0;
				 }
				 else
					 s4.setText("S.Sci Check value");
		      
		      e=Integer.parseInt(e5.getText().toString());
		      
		      if(e <=100 && e>=33)
				 {
				 switch(e/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s5.setText("Physics Grade : A+");
					 e11=5.00 ;
					 break;
					 
				 case 7:
					 s5.setText("Physics Grade : A");
					 e11= 4.00;
					 break;
					 
				 case 6:
					 s5.setText("Physics Grade : A-");
					 e11= 3.5;
					 break;
					 
				 case 5:
					 s5.setText("Physics Grade : B");
					 e11= 3.00;
					 break;
					 
				 case 4:
					 s5.setText("Physics Grade : C");
					 e11= 2.00;
					 break;
					 
					default : 
						s5.setText("Physics Grade : D");
						e11= 1.00;
						break;
					 
				 }
				 }
				 else if(e<33){
					 s5.setText("Physics Grade : F");
					 e11= 0.0;
				 }
				 else
					 s5.setText("Physics check value");
		      
		      f=Integer.parseInt(e6.getText().toString());
		      
		      if(f <=100 && f>=33)
				 {
				 switch(f/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s6.setText("Chemistry Grade : A+");
					 f1= 5.00;
					 break;
					 
				 case 7:
					 s6.setText("Chemistry Grade : A");
					 f1= 4.00;
					 break;
					 
				 case 6:
					 s6.setText("Chemistry Grade : A-");
					 f1= 3.5;
					 break;
					 
				 case 5:
					 s6.setText("Chemistry Grade : B");
					 f1= 3.00;
					 break;
					 
				 case 4:
					 s6.setText("Chemistry Grade : C");
					 f1= 2.00;
					 break;
					 
					default : 
						s6.setText("Chemistry Grade : D");
						f1= 1.00;
						break;
					 
				 }
				 }
				 else if(f<33){
					 s6.setText("Chemistry Grade : F");
					 f1= 0.0;
				 }
				 else
					 s6.setText("Chemistry check value");
		      
		      g=Integer.parseInt(e7.getText().toString());
		      
		      if(g <=100 && g>=33)
				 {
				 switch(g/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s7.setText("Biology Grade : A+");
					 g1= 5.00;
					 break;
					 
				 case 7:
					 s7.setText("Biology Grade : A");
					 g1= 4.00;
					 break;
					 
				 case 6:
					 s7.setText("Biology Grade : A-");
					 g1= 3.5;
					 break;
					 
				 case 5:
					 s7.setText("Biology Grade : B");
					 g1= 3.00;
					 break;
					 
				 case 4:
					 s7.setText("Biology Grade : C");
					 g1= 2.00;
					 break;
					 
					default : 
						s7.setText("Biology Grade : D");
						g1= 1.00;
						break;
					 
				 }
				 }
				 else if(g<33){
					 s7.setText("Biology Grade : F");
					 g1= 0.0;
				 }
				 else
					 s7.setText("Biology check value");
		      
		      h=Integer.parseInt(e8.getText().toString());
		      
		      if(h <=100 && h>=33)
				 {
				 switch(h/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s8.setText("Religious Grade : A+");
					 h1=5.0 ;
					 break;
					 
				 case 7:
					 s8.setText("Religious Grade : A");
					 h1= 4.00;
					 break;
					 
				 case 6:
					 s8.setText("Religious Grade : A-");
					 h1= 3.5;
					 break;
					 
				 case 5:
					 s8.setText("Religious Grade : B");
					 h1= 3.00;
					 break;
					 
				 case 4:
					 s8.setText("Religious Grade : C");
					 h1= 2.00;
					 break;
					 
					default : 
						s8.setText("Religious Grade : D");
						h1= 1.00;
						break;
					 
				 }
				 }
				 else if(h<33){
					 s8.setText("Religious Grade : F");
					 h1= 0.0;
				 }
				 else
					 s8.setText("Religious check value");
		      
		      i=Integer.parseInt(e9.getText().toString());
		      if(i >=80 && i<= 100){
		    	  s9.setText("Optional A+ Point add : 3.00");
		    	  i1= 3.00;
		      }
		      else if(i>=70 && i <80){
		    	  s9.setText("Optional A Point add : 2.00");
		         i1=2.00 ;
	      }
		      else if(i >=60 && i < 70 ){
		    	  s9.setText("Optional A- Point add : 1.00");
		    	  i1=1.00 ;
		      }
		      else {
		    	  s9.setText("Optional Value add : 0.00");
		    	  i1=0.0;
		      }
		      
		      if(a1==0 || b1==0 || c1==0 || d1==0 || e11==0 || f1==0 || g1==0 || h1==0)
		    	  showresult.setText("Result is : F ");
		      else
		      {
		      z=a1+b1+c1+d1+e11+f1+g1+h1;  
			   z=z/8;
			   if(z==5.00)
			showresult.setText("Result A+ Grade : " + z );
			   else if(z>=4.00 && z<5.00)
		    showresult.setText("Result A Grade : " + z );
			   else if(z >=3.50 && z<4.00)
				   showresult.setText("Result A- Grade : " + z );
			   else if (z>=3.00 && z<3.50)
				   showresult.setText("Result B Grade : " + z );
			   else if( z>=2.00 && z<3.00)
				   showresult.setText("Result C Grade : " + z );
			   else if (z >=1.00 && z<2.00)
				   showresult.setText("Result D Grade : " + z );
			   else 
				   showresult.setText("Result F Grade : " + 0.0  );
				   
		      }
		    	  
		      
		  
		
		}});
		 
		 
		 
		 win.setOnClickListener(new Button.OnClickListener()
	      { public void onClick
	      (View  v) { calculate();}
	      
	    
	      

		private void calculate() {
			// TODO Auto-generated method 
			
			
			
			 a=Integer.parseInt(e1.getText().toString());
			 if(a <=100 && a>=33)
			 {
			 switch(a/10)
			 {
			 case 10:
			 case 9:
			 case 8:
				 s1.setText("Bangla Grade : A+");
				 a1=5.00;
				 break;
				 
			 case 7:
				 s1.setText("Bangla Grade : A");
				 a1= 4.00;
				 break;
				 
			 case 6:
				 s1.setText("Bangla Grade : A-");
				 a1= 3.5;
				 break;
				 
			 case 5:
				 s1.setText("Bangla Grade : B");
				 a1=3.00;
				 break;
				 
			 case 4:
				 s1.setText("Bangla Grade : C");
				 a1=2.00 ;
				 break;
				 
				default : 
					s1.setText("Bangla Grade : D");
					a1= 1.00;
					break;
				 
			 }
			 }
			 else if(a<33){
				 s1.setText("Bangla Grade : F");
			       a1= 0.0;
			 }
			 else
				 s1.setText("Bangla check value");
			 
			 
		      b=Integer.parseInt(e2.getText().toString());
		      
		      if(b <=100 && b>=33)
				 {
				 switch(b/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s2.setText("English Grade : A+");
					 b1= 5.00;
					 break;
					 
				 case 7:
					 s2.setText("English Grade : A");
					 b1= 4.00;
					 break;
					 
				 case 6:
					 s2.setText("English Grade : A-");
					 b1= 3.5;
					 break;
					 
				 case 5:
					 s2.setText("English Grade : B");
					 b1= 3.00;
					 break;
					 
				 case 4:
					 s2.setText("English Grade : C");
					 b1= 2.00;
					 break;
					 
					default : 
						s2.setText("English Grade : D");
						b1= 1.00;
						break;
					 
				 }
				 }
				 else if(b<33){
					 s2.setText("English Grade : F");
					 b1= 0.0;
				 }
				 else
					 s2.setText("English check value");
		      
		      c=Integer.parseInt(e3.getText().toString());
		      
		      if(c <=100 && c>=33)
				 {
				 switch(c/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s3.setText("G.Math Grade : A+");
					 c1=5.00 ;
					 break;
					 
				 case 7:
					 s3.setText("G.Math Grade : A");
					 c1=4.00 ;
					 break;
					 
				 case 6:
					 s3.setText("G.Math Grade : A-");
					 c1= 3.5;
					 break;
					 
				 case 5:
					 s3.setText("G.Math Grade : B");
					 c1= 3.00;
					 break;
					 
				 case 4:
					 s3.setText("G.Math Grade : C");
					 c1= 2.00;
					 break;
					 
					default : 
						s3.setText("G.Math Grade : D");
						c1= 1.00;
						break;
					 
				 }
				 }
				 else if(c<33){
					 s3.setText("G.Math Grade : F");
					 c1= 0.0;
				 }
				 else
					 s3.setText("G.Math check value");
		      
		      d=Integer.parseInt(e4.getText().toString());
		      
		      if(d <=100 && d>=33)
				 {
				 switch(d/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s4.setText("S.Sci Grade : A+");
					 d1= 5.00;
					 break;
					 
				 case 7:
					 s4.setText("S.Sci Grade : A");
					 d1= 4.00;
					 break;
					 
				 case 6:
					 s4.setText("S.Sci Grade : A-");
					 d1= 3.5;
					 break;
					 
				 case 5:
					 s4.setText("S.Sci Grade : B");
					 d1= 3.00;
					 break;
					 
				 case 4:
					 s4.setText("S.Sci Grade : C");
					 d1= 2.00;
					 break;
					 
					default : 
						s4.setText("S.Sci Grade : D");
						d1= 1.00;
						break;
					 
				 }
				 }
				 else if(d<33){
					 s4.setText("S.Sci Grade : F");
					 d1= 0.0;
				 }
				 else
					 s4.setText("S.Sci Check value");
		      
		      e=Integer.parseInt(e5.getText().toString());
		      
		      if(e <=100 && e>=33)
				 {
				 switch(e/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s5.setText("Physics Grade : A+");
					 e11=5.00 ;
					 break;
					 
				 case 7:
					 s5.setText("Physics Grade : A");
					 e11= 4.00;
					 break;
					 
				 case 6:
					 s5.setText("Physics Grade : A-");
					 e11= 3.5;
					 break;
					 
				 case 5:
					 s5.setText("Physics Grade : B");
					 e11= 3.00;
					 break;
					 
				 case 4:
					 s5.setText("Physics Grade : C");
					 e11= 2.00;
					 break;
					 
					default : 
						s5.setText("Physics Grade : D");
						e11= 1.00;
						break;
					 
				 }
				 }
				 else if(e<33){
					 s5.setText("Physics Grade : F");
					 e11= 0.0;
				 }
				 else
					 s5.setText("Physics check value");
		      
		      f=Integer.parseInt(e6.getText().toString());
		      
		      if(f <=100 && f>=33)
				 {
				 switch(f/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s6.setText("Chemistry Grade : A+");
					 f1= 5.00;
					 break;
					 
				 case 7:
					 s6.setText("Chemistry Grade : A");
					 f1= 4.00;
					 break;
					 
				 case 6:
					 s6.setText("Chemistry Grade : A-");
					 f1= 3.5;
					 break;
					 
				 case 5:
					 s6.setText("Chemistry Grade : B");
					 f1= 3.00;
					 break;
					 
				 case 4:
					 s6.setText("Chemistry Grade : C");
					 f1= 2.00;
					 break;
					 
					default : 
						s6.setText("Chemistry Grade : D");
						f1= 1.00;
						break;
					 
				 }
				 }
				 else if(f<33){
					 s6.setText("Chemistry Grade : F");
					 f1= 0.0;
				 }
				 else
					 s6.setText("Chemistry check value");
		      
		      g=Integer.parseInt(e7.getText().toString());
		      
		      if(g <=100 && g>=33)
				 {
				 switch(g/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s7.setText("Biology Grade : A+");
					 g1= 5.00;
					 break;
					 
				 case 7:
					 s7.setText("Biology Grade : A");
					 g1= 4.00;
					 break;
					 
				 case 6:
					 s7.setText("Biology Grade : A-");
					 g1= 3.5;
					 break;
					 
				 case 5:
					 s7.setText("Biology Grade : B");
					 g1= 3.00;
					 break;
					 
				 case 4:
					 s7.setText("Biology Grade : C");
					 g1= 2.00;
					 break;
					 
					default : 
						s7.setText("Biology Grade : D");
						g1= 1.00;
						break;
					 
				 }
				 }
				 else if(g<33){
					 s7.setText("Biology Grade : F");
					 g1= 0.0;
				 }
				 else
					 s7.setText("Biology check value");
		      
		      h=Integer.parseInt(e8.getText().toString());
		      
		      if(h <=100 && h>=33)
				 {
				 switch(h/10)
				 {
				 case 10:
				 case 9:
				 case 8:
					 s8.setText("Religious Grade : A+");
					 h1=5.0 ;
					 break;
					 
				 case 7:
					 s8.setText("Religious Grade : A");
					 h1= 4.00;
					 break;
					 
				 case 6:
					 s8.setText("Religious Grade : A-");
					 h1= 3.5;
					 break;
					 
				 case 5:
					 s8.setText("Religious Grade : B");
					 h1= 3.00;
					 break;
					 
				 case 4:
					 s8.setText("Religious Grade : C");
					 h1= 2.00;
					 break;
					 
					default : 
						s8.setText("Religious Grade : D");
						h1= 1.00;
						break;
					 
				 }
				 }
				 else if(h<33){
					 s8.setText("Religious Grade : F");
					 h1= 0.0;
				 }
				 else
					 s8.setText("Religious check value");
		      
		      i=Integer.parseInt(e9.getText().toString());
		      if(i >=80 && i<= 100){
		    	  s9.setText("Optional A+ Point add : 3.00");
		    	  i1= 3.00;
		      }
		      else if(i>=70 && i <80){
		    	  s9.setText("Optional A Point add : 2.00");
		         i1=2.00 ;
	      }
		      else if(i >=60 && i < 70 ){
		    	  s9.setText("Optional A- Point add : 1.00");
		    	  i1=1.00 ;
		      }
		      else {
		    	  s9.setText("Optional Value add : 0.00");
		    	  i1=0.0;
		      }
		      
		      
		      
		      if(a1==0 || b1==0 || c1==0 || d1==0 || e11==0 || f1==0 || g1==0 || h1==0)
		    	  showresult.setText("Result is : F ");
		      else
		      {
		      
		      z=a1+b1+c1+d1+e11+f1+g1+h1+i1;  
			   z=z/8;
			   
			   if(z<=5){
			   if(z==5.00)
					showresult.setText("Result A+ Grade : " + z );
					   else if(z>=4.00 && z<5.00)
				    showresult.setText("Result A Grade : " + z );
					   else if(z >=3.50 && z<4.00)
						   showresult.setText("Result A- Grade : " + z );
					   else if (z>=3.00 && z<3.50)
						   showresult.setText("Result B Grade : " + z );
					   else if( z>=2.00 && z<3.00)
						   showresult.setText("Result C Grade : " + z );
					   else if (z >=1.00 && z<2.00)
						   showresult.setText("Result D Grade : " + z );
					   else 
						   showresult.setText("Result F Grade : " + 0.0  );
			   }
			 
			   else 
				   showresult.setText("Result A+ Grade : " + 5.00 );
					   
		      }
				     
		
		}});
		 
		
	}
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
		builder.setTitle("Exit");
		builder.setMessage("Are you sure you want to exit");
		builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		
     builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				arg0.cancel();
				
			}
		});
     builder.setCancelable(false);
    AlertDialog alert=builder.create();
    alert.show();

	}
	
	
	}