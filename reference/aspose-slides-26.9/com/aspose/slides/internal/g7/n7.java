package com.aspose.slides.internal.g7;

public class n7 extends t9 {
   private String a6;
   private com.aspose.slides.internal.l7h.a5 u9;
   private int h0;

   public n7(t9 var1, byte[] var2) {
      super(var1, var2);
      this.k5(true);
      super.l6 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("[")};
      super.n5 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("]")};
      this.u9 = new com.aspose.slides.internal.l7h.a5();
   }

   public final String n5() {
      return this.a6;
   }

   @Override
   public void k5() {
      this.a6 = null;
      this.u9 = new com.aspose.slides.internal.l7h.a5();
      this.h0 = 0;
      super.k5();
   }

   @Override
   protected byte[] n5(int var1, int[] var2) {
      var2[0] = -1;
      byte[] var3 = com.aspose.slides.internal.l7h.j5.e2().u3("]");
      if (z8.n5(this.u3, var1, var3) && this.h0 == 0) {
         var2[0] = var1;
         return var3;
      } else {
         return null;
      }
   }

   @Override
   protected void n5(int var1) {
      if ((this.u3[var1] & 255) == 91) {
         this.h0++;
      } else if ((this.u3[var1] & 255) == 93) {
         this.h0--;
      }

      this.u9.n5(com.aspose.slides.internal.l7h.j5.e2().l6(new byte[]{this.u3[var1]}));
      super.n5(var1);
   }

   @Override
   protected void z_() {
      this.a6 = this.u9.toString();
      super.z_();
   }
}
