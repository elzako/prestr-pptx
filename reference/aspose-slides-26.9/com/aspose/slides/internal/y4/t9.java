package com.aspose.slides.internal.y4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;

public final class t9 extends n5 {
   private final String n5;

   public t9(String var1) {
      this(var1, (short)19);
   }

   public t9(String var1, short var2) {
      super(var2);
      this.n5 = var1;
   }

   public static t9 l6(String var0) {
      return new t9(var0);
   }

   public static t9 k5(String var0) {
      return new t9(var0, (short)21);
   }

   @Override
   public String u9() {
      return this.n5;
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)15);
   }

   @Override
   public String l6() {
      return this.n5;
   }

   @Override
   protected boolean n5(com.aspose.slides.internal.k5.u9 var1) {
      t9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, t9.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : f0.l6(this.h0(), var2.h0()) && d1.a6(this.n5, var2.n5);
      }
   }
}
