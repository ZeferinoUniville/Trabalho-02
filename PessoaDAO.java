import java.util.*;

public class PessoaDAO {

    HashMap<Integer,String> hash = new HashMap<>();

    public void getById(Integer id){
        System.out.println(hash.getOrDefault(id," Registro nao encontrado "));
    }

    public void getAll(){
        System.out.println(" Lista de Registos: ");
        System.out.println("---------------------------------------");
        for(Map.Entry<Integer, String> entry : hash.entrySet()){
            System.out.println("Id: "+entry.getKey()+", Nome: "+entry.getValue());
        }
    }

    public void add(Integer id, String nome){
        hash.put(id,nome);
        System.out.println("Adicionado Registro com Id: "+id+" e Nome: "+nome);
    }

    public void delete(Integer id){
        Integer key = 0;
        for(Map.Entry<Integer, String> entry : hash.entrySet()){
            key = entry.getKey();
            if (key == id){
                hash.remove(id);
                System.out.println("Removido Registro com Id: "+id);
            }
        }
    }
}
