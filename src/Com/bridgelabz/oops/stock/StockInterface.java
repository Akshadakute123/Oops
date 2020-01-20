package Com.bridgelabz.oops.stock;

import java.util.List;

public interface StockInterface
{
   List<Stockmgt>addStock(List<Stockmgt>list);
   List<Stockmgt>removeStock(List<Stockmgt>list);
   List<Stockmgt>update(List<Stockmgt>list);
   
}
