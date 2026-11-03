package com.aspose.slides.internal.b8c;

public class t3 {
   private w5 n5;
   private w5 l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;

   public final w5 n5() {
      return this.l6;
   }

   public final w5 l6() {
      return this.n5;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final boolean a6() {
      return this.a6;
   }

   public t3(w5 var1, boolean var2) {
      this.u3 = var2;
      this.k5 = com.aspose.slides.internal.b8c.k5.n5(var1);
      this.n5 = var1;
      this.l6 = var1;

      while (this.l6.k5() != null) {
         this.l6 = (w5)this.l6.k5();
      }

      this.a6 = com.aspose.slides.internal.b8c.k5.l6(this.n5);
   }
}
