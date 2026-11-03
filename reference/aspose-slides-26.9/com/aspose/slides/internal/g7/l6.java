package com.aspose.slides.internal.g7;

public class l6 extends z1 {
   private String a6;
   private com.aspose.slides.internal.l7h.a5 u9;

   public l6(u7 var1, z1 var2) {
      super(var1, var2);
      this.u3(true);
      super.l6 = new byte[0][];
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("\r\n"), com.aspose.slides.internal.l7h.j5.e2().u3("\r"), com.aspose.slides.internal.l7h.j5.e2().u3("\n")
      };
      this.u9 = new com.aspose.slides.internal.l7h.a5();
   }

   public final String n5() {
      return this.a6;
   }

   @Override
   public void k5() {
      this.a6 = null;
      this.u9 = new com.aspose.slides.internal.l7h.a5();
      super.k5();
   }

   @Override
   protected boolean n5(int var1, byte[][] var2, int[] var3) {
      var3[0] = var1;
      var2[0] = new byte[0];
      return true;
   }

   @Override
   protected void n5(int var1) {
      this.u9.n5(com.aspose.slides.internal.l7h.j5.e2().l6(new byte[]{this.u3[var1]}));
      super.n5(var1);
   }

   @Override
   protected void z_() {
      this.a6 = this.u9.toString();
      super.z_();
   }
}
