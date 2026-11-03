package com.aspose.slides.internal.y9w;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public class h0 extends SortedList<String, Object> {
   private o0 n5;

   public h0() {
      this(o0.n5.k5());
   }

   public h0(o0 var1) {
      super(new c8());
      this.n5 = o0.n5.k5();
      var1.k5(this.n5);
   }

   public final void n5(String var1, e2 var2) {
      super.addItem(var1, var2);
   }

   public final void n5(String var1, h0 var2) {
      super.addItem(var1, var2);
   }

   public final e2 n5(String var1) {
      Object var2 = null;
      Object[] var3 = new Object[]{var2};
      this.tryGetValue(var1, var3);
      var2 = var3[0];
      e2 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, e2.class);
      if (var4 != null) {
         var4.setPosition(0L);
      }

      return var4;
   }

   public final e2 l6(String var1) {
      e2 var2 = this.n5(var1);
      if (var2 == null) {
         throw new InvalidOperationException(d1.n5("Cannot find stream '{0}' in the storage.", new Object[]{var1}));
      } else {
         return var2;
      }
   }

   public final o0 n5() {
      return this.n5;
   }
}
