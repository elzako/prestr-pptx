package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

@com.aspose.slides.ms.System.j3
public class c8 implements ICollection, IEnumerable {
   static c8$n5 n5 = new c8$n5();
   private List<h0> l6 = new List<>();

   IGenericList<h0> n5() {
      return this.l6;
   }

   @Override
   public int size() {
      return this.l6.size();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      com.aspose.slides.internal.v6g.k5.n5(this.l6, IList.class).copyTo(array, index);
   }

   @Override
   public IEnumerator iterator() {
      return this.l6.iterator();
   }

   public void n5(h0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("cookie");
      }

      int var2 = this.l6(var1);
      if (var2 == -1) {
         this.l6.addItem(var1);
      } else {
         this.l6.set_Item(var2, var1);
      }
   }

   void l6() {
      if (this.l6.size() > 0) {
         this.l6.sort(n5);
      }
   }

   private int l6(h0 var1) {
      String var2 = var1.t2();
      String var3 = var1.u3();
      String var4 = var1.s7();

      for (int var5 = this.l6.size() - 1; var5 >= 0; var5--) {
         h0 var6 = this.l6.get_Item(var5);
         if (var6.z1() == var1.z1()
            && 0 == com.aspose.slides.ms.System.d1.n5(var3, var6.u3(), true, com.aspose.slides.internal.x7n.l6.k5())
            && 0 == com.aspose.slides.ms.System.d1.n5(var2, var6.t2(), true, com.aspose.slides.internal.x7n.l6.k5())
            && 0 == com.aspose.slides.ms.System.d1.n5(var4, var6.s7(), true, com.aspose.slides.internal.x7n.l6.k5())) {
            return var5;
         }
      }

      return -1;
   }

   public h0 n5(int var1) {
      if (var1 >= 0 && var1 < this.l6.size()) {
         return this.l6.get_Item(var1);
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }
}
