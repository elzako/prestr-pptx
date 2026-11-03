package com.aspose.slides.internal.w2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n5 implements k5 {
   public List<s7> n5 = new List<>();

   @Override
   public final int e2() {
      return this.n5.size();
   }

   @Override
   public final String s7(int var1) {
      s7 var2 = this.n5.get_Item(var1).n5();
      return var2.n5;
   }

   @Override
   public final String t2(int var1) {
      s7 var2 = this.n5.get_Item(var1).n5();
      return var2.u3;
   }

   @Override
   public final String c8(int var1) {
      s7 var2 = this.n5.get_Item(var1).n5();
      return var2.l6;
   }

   @Override
   public final String x8(int var1) {
      s7 var2 = this.n5.get_Item(var1).n5();
      return var2.k5;
   }

   @Override
   public final String u3(String var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            s7 var3 = (s7)var2.next();
            if (d1.a6(var3.n5, var1)) {
               return var3.k5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final k5 n5() {
      this.n5.trimExcess();
      return this;
   }

   public final void n5(String var1, String var2, String var3, String var4, String var5) {
      s7 var6 = new s7();
      var6.l6 = var1;
      var6.u3 = var2;
      var6.n5 = var3;
      var6.k5 = var5;
      var6.a6 = var4;
      this.n5.addItem(var6.n5());
   }
}
