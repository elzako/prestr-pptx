package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

final class f3v {
   private final j5u n5;
   private final b4o l6 = new b4o();
   private boolean k5;
   private boolean u3;
   private final boolean a6;
   private final boolean u9;

   public f3v(j5u var1, b4o var2, byte var3, boolean var4, boolean var5) {
      if (var1 == null) {
         throw new ArgumentNullException("textLayout");
      }

      this.n5 = var1;
      var2.n5(this.l6);
      this.k5 = var3 == 1 && (this.n5.u3() || this.n5.a6() == 1);
      if (this.l6.n5.length() == 1
         && !com.aspose.slides.ms.System.d1.n5(this.l6.k5)
         && (
            this.k5
               ? com.aspose.slides.internal.n2d.u9.z8(this.l6.n5.charAt(0)) && com.aspose.slides.internal.n2d.u9.u9(this.l6.n5.charAt(0))
               : com.aspose.slides.internal.n2d.u9.u9(this.l6.n5.charAt(0))
         )
         && !com.aspose.slides.internal.n2d.u9.z3(this.l6.k5.charAt(0))) {
         var5 = false;
      }

      this.u3 = (var3 == 1 && this.n5.u3() || this.n5.z1()) && var5;
      this.a6 = this.u3 && com.aspose.slides.internal.n2d.u9.z3(this.l6.k5.charAt(0));
      this.u9 = this.u3 || this.n5.u3() && var4;
   }

   public final boolean n5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean l6() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public final boolean k5() {
      return this.a6;
   }

   public final boolean u3() {
      return this.u9;
   }

   public final boolean a6() {
      return this.l6() && !this.k5();
   }

   public final boolean u9() {
      return this.n5.z1() && !this.k5();
   }
}
