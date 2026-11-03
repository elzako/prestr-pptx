package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class d4n {
   private e4z n5;
   private final boolean l6;
   private final boolean k5;
   private final boolean u3;
   private final boolean a6;
   private final byte u9;

   public d4n(e2n var1, y6e var2, e4z var3, boolean var4) {
      if (var3 == null) {
         throw new ArgumentNullException("fontWrapper");
      }

      this.n5 = var3;
      this.l6 = var4;
      this.a6 = e5a.l6(var2, var1);
      this.u9 = com.aspose.slides.internal.n2d.u9.a6(var2.h0());
      this.k5 = var2.n5().n5.getTextCapType() == 1;
      this.u3 = com.aspose.slides.ms.System.t9.e2(var2.u3());
   }

   public d4n(e2n var1, y6e var2, boolean var3) {
      this.l6 = var3;
      this.a6 = e5a.l6(var2, var1);
      this.u9 = com.aspose.slides.internal.n2d.u9.a6(var2.h0());
      this.k5 = var2.n5().n5.getTextCapType() == 1;
      this.u3 = com.aspose.slides.ms.System.t9.e2(var2.u3());
   }

   public final boolean n5() {
      return this.l6;
   }

   public final boolean l6() {
      return this.k5;
   }

   public final boolean k5() {
      return this.u3;
   }

   public final boolean u3() {
      return this.n5.l6().n5().a0();
   }

   public final boolean a6() {
      return this.n5.c8() == -78;
   }

   public final byte u9() {
      return this.u9;
   }

   public final boolean h0() {
      return this.a6;
   }
}
