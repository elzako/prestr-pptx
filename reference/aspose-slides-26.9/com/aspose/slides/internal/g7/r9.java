package com.aspose.slides.internal.g7;

public abstract class r9 {
   @Override
   public abstract String toString();

   @Override
   public abstract int hashCode();

   public static boolean n5(r9 var0, Object var1) {
      return var0 != null ? !var0.equals(var1) : var1 != null;
   }

   @Override
   public boolean equals(Object obj) {
      k2 var2 = com.aspose.slides.internal.v6g.k5.n5(this, k2.class);
      k2 var3 = com.aspose.slides.internal.v6g.k5.n5(obj, k2.class);
      if (var3 != null && var2 != null) {
         return var2.n5() == var3.n5();
      }

      k3 var4 = com.aspose.slides.internal.v6g.k5.n5(this, k3.class);
      k3 var5 = com.aspose.slides.internal.v6g.k5.n5(obj, k3.class);
      return var4 != null && var5 != null ? com.aspose.slides.ms.System.d1.a6(var4.n5(), var5.n5()) : false;
   }
}
