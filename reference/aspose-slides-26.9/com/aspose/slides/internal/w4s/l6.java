package com.aspose.slides.internal.w4s;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;

public class l6 {
   private List<KeyValuePair<Integer, y2>> n5;
   private int l6;
   private double k5;

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final double l6() {
      return this.k5;
   }

   public final void n5(double var1) {
      this.k5 = var1;
   }

   public l6(int var1, double var2) {
      this.n5(var1);
      this.n5(var2);
   }

   public final l6 n5(int var1, int var2, int var3, int var4) {
      return this.n5(new y2(var1, var2, var3, var4));
   }

   public final l6 n5(y2... var1) {
      this.u3();

      for (y2 var5 : var1) {
         this.n5.addItem(new KeyValuePair<>(1, var5.n3()));
      }

      return this;
   }

   public final l6 l6(int var1, int var2, int var3, int var4) {
      return this.l6(new y2(var1, var2, var3, var4));
   }

   public final l6 l6(y2... var1) {
      this.u3();

      for (y2 var5 : var1) {
         this.n5.addItem(new KeyValuePair<>(0, var5.n3()));
      }

      return this;
   }

   private void u3() {
      if (this.n5 == null) {
         this.n5 = new List<>();
      }
   }

   public final boolean n5(int var1, int var2) {
      if (this.n5 != null && this.n5.size() != 0) {
         boolean var3 = this.n5.get_Item(0).getKey() == 1;
         List$Enumerator var4 = this.n5.iterator();

         try {
            while (var4.hasNext()) {
               KeyValuePair var5 = (KeyValuePair)var4.next();
               int var6 = (Integer)var5.getKey();
               y2 var7 = ((y2)var5.getValue()).n3();
               if (var6 == 1 && var3 && var7.l6(var1, var2)) {
                  var3 = false;
               }

               if (var6 == 0 && !var3 && var7.l6(var1, var2)) {
                  var3 = true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         return var3;
      } else {
         return true;
      }
   }

   public final String k5() {
      a5 var1 = new a5();
      var1.n5(a3.n5(this.n5(), "X"));
      var1.n5(a3.n5(com.aspose.slides.internal.v6g.k5.u3(this.l6() * 1000.0, 14), "X"));
      if (this.n5 != null) {
         List$Enumerator var2 = this.n5.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               var1.n5(a3.n5((Integer)var3.getKey(), "X"));
               var1.n5(a3.n5(((y2)var3.getValue()).s7(), "X"));
               var1.n5(a3.n5(((y2)var3.getValue()).x8(), "X"));
               var1.n5(a3.n5(((y2)var3.getValue()).t2(), "X"));
               var1.n5(a3.n5(((y2)var3.getValue()).l6(), "X"));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      return var1.toString();
   }
}
