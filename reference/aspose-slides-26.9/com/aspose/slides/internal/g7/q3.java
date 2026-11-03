package com.aspose.slides.internal.g7;

public class q3 extends t9 {
   private String a6;
   private com.aspose.slides.internal.l7h.a5 u9;

   public q3(t9 var1, byte[] var2) {
      super(var1, var2);
      super.l6 = new byte[0][];
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3(" "),
         com.aspose.slides.internal.l7h.j5.e2().u3("{"),
         com.aspose.slides.internal.l7h.j5.e2().u3("["),
         com.aspose.slides.internal.l7h.j5.e2().u3("\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("\n")
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
   protected byte[] n5(int var1, int[] var2) {
      byte[] var3 = super.n5(var1, var2);
      if (var3 != null
         && (this.u3[var2[0]] & 255) != (com.aspose.slides.internal.l7h.j5.e2().u3(" ")[0] & 255)
         && (this.u3[var2[0]] & 255) != (com.aspose.slides.internal.l7h.j5.e2().u3("\r")[0] & 255)
         && (this.u3[var2[0]] & 255) != (com.aspose.slides.internal.l7h.j5.e2().u3("\n")[0] & 255)) {
         var2[0] = var1 - 1;
      }

      return var3;
   }

   @Override
   protected void n5(int var1) {
      if ((this.u3[var1] & 255) != 32) {
         this.u9.n5(com.aspose.slides.internal.l7h.j5.e2().l6(new byte[]{this.u3[var1]}));
      }

      super.n5(var1);
   }

   @Override
   protected void z_() {
      this.a6 = this.u9.toString();
      this.n5(false);
      super.z_();
   }
}
