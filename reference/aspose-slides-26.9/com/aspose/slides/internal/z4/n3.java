package com.aspose.slides.internal.z4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n3 extends z1 {
   private final SortedList<String, x8> n5 = new com.aspose.slides.internal.n2d.m3<>();

   public n3(c8 var1) {
      super(var1);
   }

   public final x8 n5(String var1, String var2, byte[] var3) {
      String var4 = d1.n5(new String[]{var1, var2});
      x8 var5 = null;
      x8[] var6 = new x8[]{var5};
      boolean var7 = !this.l6.u3().n5().n5.tryGetValue(var4, var6);
      var5 = var6[0];
      if (var7) {
         var5 = new x8(this.l6, var1, var2, var3);
         this.l6.u3().n5().n5.set_Item(var4, var5);
      }

      this.n5.set_Item(var4, var5);
      return var5;
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.n5("/Names");
      var1.n5("[");

      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         var1.u3(this.n5.getKeys().get_Item(var2));
         var1.n5(this.n5.get_Item(this.n5.getKeys().get_Item(var2)).n5().t2());
      }

      var1.n5("]");
      var1.t2();
      var1.l6();
      IGenericEnumerator var7 = this.n5.getValues().iterator();

      try {
         while (var7.hasNext()) {
            x8 var3 = (x8)var7.next();
            var3.n5().n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }
   }
}
