package com.aspose.slides.internal.l2;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.b8.x8;
import com.aspose.slides.internal.n2d.m3;
import com.aspose.slides.ms.System.d1;

public class t2 implements IGenericEnumerable<c8> {
   private final String n5;
   private final m3<c8> l6;
   private final m3<c8> k5;
   private int u3 = 1;

   public t2(String var1) {
      this.n5 = var1;
      this.l6 = new m3<>(true);
      this.k5 = new m3<>(false);
   }

   public final String n5(String var1, String var2, boolean var3) {
      if (var3) {
         if (x8.n5(var2)) {
            var2 = d1.n5(new String[]{"file:///", var2});
            var2 = x8.a6(var2);
         }
      } else {
         var2 = com.aspose.slides.internal.l2.u3.n5(this.n5, var2);
      }

      c8 var4 = null;
      c8[] var5 = new c8[]{var4};
      boolean var6 = this.k5.tryGetValue(var2, var5);
      var4 = var5[0];
      if (var6) {
         return var4.n5();
      }

      String var7 = d1.n5("rId{0}", new Object[]{this.u3});
      this.u3++;
      this.n5(var7, var1, var2, var3);
      return var7;
   }

   public final void n5(String var1, String var2, String var3, boolean var4) {
      c8 var5 = new c8(var1, var2, var3, var4);
      this.l6.set_Item(var1, var5);
      this.k5.set_Item(var3, var5);
   }

   @Override
   public final IGenericEnumerator<c8> iterator() {
      return this.l6.getValues().iterator();
   }

   public final int n5() {
      return this.l6.size();
   }
}
