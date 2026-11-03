package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public abstract class n5 extends r4 implements e5 {
   private String n5;
   private String l6;
   private String k5;

   protected n5(String var1, String var2, String var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public String n5() {
      return this.n5;
   }

   public String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      return this.k5 == null ? var1.t2(this.l6) : d1.a6(var1.u3(this.l6), this.k5);
   }

   @Override
   public int u3() {
      return 10;
   }

   protected final String n5(com.aspose.slides.internal.j3.z3 var1) {
      if (this.n5 == null) {
         return var1.u3(this.l6());
      }

      if ("*".equals(this.n5())) {
         return var1.l6(this.n5, this.l6());
      }

      String var2 = this.u9().a_().a6().n5(this.n5());
      return var1.l6(var2, this.l6());
   }

   protected final boolean l6(com.aspose.slides.internal.j3.z3 var1) {
      if (this.n5 == null) {
         return var1.t2(this.l6());
      }

      if ("*".equals(this.n5())) {
         return var1.u9(this.n5, this.l6());
      }

      String var2 = this.u9().a_().a6().n5(this.n5());
      return var1.u9(var2, this.l6());
   }

   @Override
   public String a6() {
      return this.k5 == null ? d1.n5('[', this.l6, ']') : d1.n5('[', this.l6, "=\"", this.k5, "\"]");
   }
}
