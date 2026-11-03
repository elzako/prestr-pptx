package com.aspose.slides.internal.e8b;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

class t2 {
   private int n5;
   private int l6;
   private Dictionary<Integer, Integer> k5;
   private int u3;

   public t2(int var1) {
      this.n5(new Dictionary<>());
      this.k5(var1);
      this.n5 = Integer.MAX_VALUE;
      this.l6 = Integer.MIN_VALUE;
   }

   public final Dictionary<Integer, Integer> n5() {
      return this.k5;
   }

   private void n5(Dictionary<Integer, Integer> var1) {
      this.k5 = var1;
   }

   public final int l6() {
      return this.u3;
   }

   private void k5(int var1) {
      this.u3 = var1;
   }

   public final int n5(double var1) {
      int var3 = this.k5(var1);
      if (this.n5().containsKey(var3)) {
         this.n5().set_Item(var3, this.n5().get_Item(var3) + 1);
      } else {
         this.n5().addItem(var3, 1);
      }

      if (this.l6 < var3) {
         this.l6 = var3;
      }

      if (this.n5 > var3) {
         this.n5 = var3;
      }

      return var3;
   }

   public final Dictionary<Integer, Integer> n5(int var1) {
      Dictionary var2 = new Dictionary();
      Dictionary$Enumerator var3 = this.n5().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            int var5 = (Integer)var4.getKey() / (var1 << 1);
            if (var2.containsKey(var5)) {
               var2.set_Item(var5, (Integer)var2.get_Item(var5) + (Integer)var4.getValue());
            } else {
               var2.addItem(var5, var4.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   public final List<Double> l6(double var1) {
      List var3 = new List();
      Dictionary$Enumerator var4 = this.n5().iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            var3.addItem(((Integer)var5.getKey()).intValue() / 2.0 + (((Integer)var5.getKey()).intValue() >= 0 ? var1 : -var1));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }

   public final int n5(int var1, int var2) {
      var1 = this.l6() == 0 && var1 > var2 ? var2 : var1;
      int var3 = q1.n5(this.l6);
      if (this.n5 < 0) {
         var3 -= this.n5;
      }

      if (var3 == 0) {
         var3++;
      }

      return var1 > var3 ? var3 : var1;
   }

   public final int l6(int var1) {
      return var1;
   }

   private int k5(double var1) {
      return com.aspose.slides.internal.v6g.k5.u3(var1 >= 0.0 ? 2.0 * var1 : -2.0 * -var1, 14);
   }
}
