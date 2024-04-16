package br.com.app1.aula1504_recycleview_pt1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import br.com.app1.aula1504_recycleview_pt1.R;
import static br.com.app1.aula1504_recycleview_pt1.R.layout.adapter_lista;
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    //1-criar as instancias da classe ou atributos de armazenamento ou propriedades
    //2- retornar cada um dos itens da lista -xml - faz a reciclagem do layout
    //3 -  recuperar a view com os itens da lista


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      //3 -  recuperar a view com os itens da lista
        View itemlista = LayoutInflater.from(parent.getContext()).inflate(adapter_lista, parent, false);
        //cria o item e retora a view que sera recuperada
        return new MyViewHolder(itemlista);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //5- exibir a visualização com acesso ao item do adapter
        holder.titulo.setText("homem aranha");
        holder.genero.setText("ficção");
        holder.ano.setText("2022");
    }

    @Override
    public int getItemCount() {
        //6- quantidade de itens a ser retornado da lista
        return 155;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        //1-criar as instancias da classe ou atributos de armazenamento ou propriedades
        TextView titulo;
        TextView ano;
        TextView genero;


        //2- retornar cada um dos itens da lista -xml -
        // faz a reciclagem do layout
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);
        }
    }
}

