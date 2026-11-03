package com.aspose.slides.internal.t9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.m3.c4;
import com.aspose.slides.ms.System.d1;

public class k5 implements c8 {
   private Dictionary<String, n5> n5 = new Dictionary<>();
   private l6 l6;

   public k5(l6 var1) {
      this.l6 = var1;
   }

   @Override
   public final n5 n5(String var1) {
      if (d1.n5(var1)) {
         var1 = "decimal";
      }

      var1 = d1.u9(var1);
      if (this.n5.containsKey(var1)) {
         return this.n5.get_Item(var1);
      }

      n5 var2 = this.l6.n5(var1);
      if (this.n5.containsKey(var2.n5())) {
         return this.n5.get_Item(var2.n5());
      }

      var2.n5(this);
      this.n5.addItem(var2.n5(), var2);
      return var2;
   }

   public final void n5(com.aspose.slides.internal.h0.u9 var1) {
      String var2 = d1.u9(var1.u9());
      if (this.n5.containsKey(var2)) {
         n5 var3 = this.n5.get_Item(var2);
         var3.n5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(c4.class), var1.h0()));
         var3.l6(var1.t2());
         var3.n5(var1.s7());
         var3.k5(var1.x8());
         var3.u3().clear();
         var3.u3().addRange(var1.n3());
      } else {
         n5 var4 = new n5(var1.u9());
         var4.n5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(c4.class), var1.h0()));
         var4.l6(var1.t2());
         var4.n5(var1.s7());
         var4.k5(var1.x8());
         var4.u3().addRange(var1.n3());
         var4.n5(this);
         this.n5.addItem(var2, var4);
      }
   }
}
