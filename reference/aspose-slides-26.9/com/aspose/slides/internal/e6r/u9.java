package com.aspose.slides.internal.e6r;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.IDisposable;

public class u9 extends a0 {
   private int n5;
   private Dictionary<Integer, u3> k5 = new Dictionary<>();

   public u9(com.aspose.slides.internal.z4.c8 var1) {
      super(var1);
      this.l6(0);
   }

   public final int n5() {
      return this.n5;
   }

   private void l6(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      k5 var1 = new k5(this.h0());
      this.k5.addItem(this.n5(), new u3(var1.t2(), var1));
      int var2 = this.n5();
      this.l6(var2 + 1);
      return var2;
   }

   public final int a6(String var1) {
      this.k5.addItem(this.n5(), new u3(var1, null));
      int var2 = this.n5();
      this.l6(var2 + 1);
      return var2;
   }

   public final int n5(int var1, String var2) {
      return this.k5.get_Item(var1).l6().a6(var2);
   }

   public final int n5(int var1) {
      return this.k5.get_Item(var1).l6().n5();
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.n5("/Nums");
      var1.n5("[");
      Dictionary$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.n5((float)((Integer)var3.getKey()).intValue());
            var1.u9();
            var1.n5(((u3)var3.getValue()).n5());
            var1.u9();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.n5("]");
      var1.t2();
      var1.l6();
      Dictionary$ValueCollection$Enumerator var12 = this.k5.getValues().iterator();

      try {
         while (var12.hasNext()) {
            u3 var4 = (u3)var12.next();
            if (var4.l6() != null) {
               var4.l6().n5(var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }
}
