package br.java.android.laboratorio10;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class PrincipalActivity extends ListActivity {

	private List<Moto> motos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);

		motos = new ArrayList<Moto>();

		Moto moto = null;

		moto = new Moto();
		moto.setModelo("BMW R");
		moto.setAnoFabricacao(2014);
		moto.setAutonomia(48.5f);
		moto.setBairro("Olaria");
		moto.setEndereco("Rua Joel Nunes");
		moto.setCapacidadeTanque(6.2f);
		moto.setCilindradas(400);
		moto.setQuilometragem(5000);
		moto.setUf("RJ");
		moto.setCidade("Rio de Janeiro");

		motos.add(moto);

		moto = new Moto();
		moto.setModelo("Honda CG");
		moto.setAnoFabricacao(2013);
		moto.setAutonomia(35.5f);
		moto.setBairro("Urca");
		moto.setEndereco("Rua da Urca");
		moto.setCapacidadeTanque(9.2f);
		moto.setCilindradas(150);
		moto.setQuilometragem(3000);
		moto.setUf("RJ");
		moto.setCidade("Rio de Janeiro");

		motos.add(moto);

		moto = new Moto();
		moto.setModelo("Suzuki 3000");
		moto.setAnoFabricacao(2007);
		moto.setAutonomia(15.5f);
		moto.setBairro("Madureira");
		moto.setEndereco("Rua Edgard Romero");
		moto.setCapacidadeTanque(17.2f);
		moto.setCilindradas(200);
		moto.setQuilometragem(34000);
		moto.setUf("RJ");
		moto.setCidade("Rio de Janeiro");

		motos.add(moto);

		moto = new Moto();
		moto.setModelo("Yamaha 4000");
		moto.setAnoFabricacao(2007);
		moto.setAutonomia(30.5f);
		moto.setBairro("Atuba");
		moto.setEndereco("Rua Arnaldo Francisco Scremin");
		moto.setCapacidadeTanque(3.2f);
		moto.setCilindradas(255);
		moto.setQuilometragem(23000);
		moto.setUf("CTB");
		moto.setCidade("Curitiba");

		motos.add(moto);

		moto = new Moto();
		moto.setModelo("Harley Davidson");
		moto.setAnoFabricacao(1960);
		moto.setAutonomia(15.5f);
		moto.setBairro("Sao Cristovao");
		moto.setEndereco("Rua Sao Cristovao");
		moto.setCapacidadeTanque(71.2f);
		moto.setCilindradas(1800);
		moto.setQuilometragem(54000);
		moto.setUf("RJ");
		moto.setCidade("Rio de Janeiro");

		motos.add(moto);

		moto = new Moto();
		moto.setModelo("Honda Biz");
		moto.setAnoFabricacao(2011);
		moto.setAutonomia(42.5f);
		moto.setBairro("Copacabana");
		moto.setEndereco("Avenida Paulosta");
		moto.setCapacidadeTanque(5.8f);
		moto.setCilindradas(150);
		moto.setQuilometragem(3000);
		moto.setUf("SP");
		moto.setCidade("Sao Paulo");

		motos.add(moto);

		moto = new Moto();
		moto.setModelo("Honda Biz");
		moto.setAnoFabricacao(2011);
		moto.setAutonomia(42.5f);
		moto.setBairro("Copacabana");
		moto.setEndereco("Avenida Paulosta");
		moto.setCapacidadeTanque(5.8f);
		moto.setCilindradas(150);
		moto.setQuilometragem(3000);
		moto.setUf("SP");
		moto.setCidade("Sao Paulo");

        motos.add(moto);

		moto = new Moto();
		moto.setModelo("Honda CG");
		moto.setAnoFabricacao(2001);
		moto.setAutonomia(24.5f);
		moto.setBairro("Sao Paulo");
		moto.setEndereco("Avenida Paulosta");
		moto.setCapacidadeTanque(8.2f);
		moto.setCilindradas(550);
		moto.setQuilometragem(4000);
		moto.setUf("SP");
		moto.setCidade("Sao Paulo");

        motos.add(moto);

		moto = new Moto();
		moto.setModelo("Honda Biz");
		moto.setAnoFabricacao(2011);
		moto.setAutonomia(42.5f);
		moto.setBairro("Copacabana");
		moto.setEndereco("Avenida Paulosta");
		moto.setCapacidadeTanque(5.8f);
		moto.setCilindradas(150);
		moto.setQuilometragem(3000);
		moto.setUf("SP");
		moto.setCidade("Sao Paulo");

        motos.add(moto);

		moto = new Moto();
		moto.setModelo("Yamaha 2000");
		moto.setAnoFabricacao(2008);
		moto.setAutonomia(42.5f);
		moto.setBairro("Ipanema");
		moto.setEndereco("Rua cinco");
		moto.setCapacidadeTanque(7.3f);
		moto.setCilindradas(160);
		moto.setQuilometragem(5000);
		moto.setUf("RJ");
		moto.setCidade("Rio de Janeiro");




		setListAdapter(new ArrayAdapter<Moto>(this,
		   android.R.layout.simple_list_item_1, android.R.id.text1, motos));

		 getListView().setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, 
						View view, int position,long id) {
					Moto moto = motos.get(position);
					// Agora podemos chamar a Activity com os Detalhes da moto
					Intent intent = new Intent(
							PrincipalActivity.this, // Contexto origem
							DetalheMotoActivity.class); // Destino 
					intent.putExtra("moto", moto);
					startActivity(intent);
				}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
