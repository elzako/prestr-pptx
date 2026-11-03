package com.aspose.slides.internal.n3;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.k5.k7;

public abstract class m1 {
   public abstract String n5();

   public abstract int l6();

   public abstract boolean k5();

   public abstract com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2);

   public abstract com.aspose.slides.internal.k5.u9 u3();

   public com.aspose.slides.internal.k5.u9 n5(
      k7 var1, com.aspose.slides.internal.h0.h0 var2, String var3, com.aspose.slides.internal.y4.z1 var4, com.aspose.slides.internal.k5.u9 var5, int var6
   ) {
      return var5 == null ? this.u3() : var5;
   }

   protected final com.aspose.slides.internal.z8.u3 n5(String var1) {
      return com.aspose.slides.internal.z8.u9.l6(var1);
   }

   protected final com.aspose.slides.internal.z8.u3 n5(short var1) {
      return com.aspose.slides.internal.z8.u9.n5(var1);
   }

   protected final com.aspose.slides.internal.z8.u3 n5(com.aspose.slides.internal.z8.y4 var1) {
      return com.aspose.slides.internal.z8.u9.k5(var1.toString());
   }

   protected final com.aspose.slides.internal.z8.u3 l6(String var1) {
      return com.aspose.slides.internal.z8.u9.k5(var1);
   }

   protected final com.aspose.slides.internal.z8.u3 k5(String var1) {
      return com.aspose.slides.internal.z8.u9.a6(var1);
   }

   protected final boolean n5(com.aspose.slides.internal.k5.u9 var1) {
      return var1.h0() != 1 ? false : ((com.aspose.slides.internal.k5.u3)var1).n5() == 21;
   }

   protected <T> IGenericList<T> n5(IGenericList<T> var1, Class<T> var2) {
      Object[] var3 = (Object[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(var2), 4));
      var1.copyToTArray((T[])var3, 0);
      switch (var1.size()) {
         case 1:
            Object var4 = var1.get_Item(0);
            var3[3] = var4;
            var3[2] = var4;
            var3[1] = var4;
            break;
         case 2:
            var3[2] = var1.get_Item(0);
            var3[3] = var1.get_Item(1);
            break;
         case 3:
            var3[3] = var1.get_Item(1);
      }

      return com.aspose.slides.ms.System.u3.n5((T[])var3);
   }
}
