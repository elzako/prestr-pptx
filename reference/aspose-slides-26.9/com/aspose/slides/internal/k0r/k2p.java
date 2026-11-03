package com.aspose.slides.internal.k0r;

public class k2p extends m4d {
   protected byte[] n5 = new byte[0];

   public k2p(r5w var1) {
      super(var1);
      this.w1().n5(4008);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c8(this.w1().a6());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
   }

   @Override
   public int n5() {
      return this.n5.length;
   }

   public String l6() {
      if (this.n5.length <= 0) {
         return "";
      }

      char[] var1 = new char[this.n5.length];

      for (int var2 = 0; var2 < this.w1().a6(); var2++) {
         var1[var2] = (char)(this.n5[var2] & 0xFF);
      }

      return com.aspose.slides.ms.System.d1.n5(var1);
   }

   public void n5(String var1) {
      if (var1 != null) {
         this.n5 = new byte[var1.length()];

         for (int var2 = 0; var2 < this.n5.length; var2++) {
            this.n5[var2] = (byte)(var1.charAt(var2) & 0xFF);
         }
      }
   }
}
