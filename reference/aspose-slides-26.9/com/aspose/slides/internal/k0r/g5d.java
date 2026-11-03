package com.aspose.slides.internal.k0r;

public class g5d extends v4m {
   private String n5;

   public g5d() {
      this.n5(3);
   }

   public g5d(String var1) {
      this.n5(3);
      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      byte[] var3 = new byte[var1.length() * com.aspose.slides.internal.v6g.k5.n5(4) + 2];
      int var4 = 0;

      for (byte var5 = 0; var4 < var2.length; var5 += 2) {
         var3[var5] = (byte)var2[var4];
         var4++;
      }

      var3[var3.length - 2] = 0;
      var3[var3.length - 1] = 0;
      this.n5(var3);
      var2 = null;
   }

   public final String a6() {
      if (this.n5 == null) {
         this.u3();
      }

      return this.n5;
   }

   @Override
   protected void u3() {
      com.aspose.slides.internal.l7h.t1 var1 = new com.aspose.slides.internal.l7h.t1();
      char[] var2 = var1.n5(this.k5());
      if (var2 != null) {
         this.n5 = com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.n5(var2), '\u0000');
      }
   }
}
