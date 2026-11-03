package com.aspose.slides.internal.n8e;

public class q1 {
   private final byte[] n5;
   private String l6;
   private String k5;
   private boolean u3;

   public q1(byte[] var1) {
      this.n5 = var1;
      String[] var2 = new String[]{this.l6};
      String[] var3 = new String[]{this.k5};
      boolean var4 = this.n5(var2, var3);
      this.l6 = var2[0];
      this.k5 = var3[0];
      if (var4) {
         this.u3 = true;
      } else {
         var2[0] = this.l6;
         var3[0] = this.k5;
         boolean var5 = this.l6(var2, var3);
         this.l6 = var2[0];
         this.k5 = var3[0];
         if (var5) {
            this.u3 = true;
         }
      }
   }

   private boolean n5(String[] var1, String[] var2) {
      var1[0] = null;
      var2[0] = null;
      w5 var3 = new w5(this.n5);
      if (var3.n5()) {
         var1[0] = var3.l6();
         var2[0] = var3.k5();
         return true;
      } else {
         return false;
      }
   }

   private boolean l6(String[] var1, String[] var2) {
      var1[0] = null;
      var2[0] = null;
      u8 var3 = new u8(this.n5);
      if (var3.n5()) {
         var1[0] = var3.l6();
         var2[0] = var3.k5();
         return true;
      } else {
         return false;
      }
   }

   public final boolean n5() {
      return this.u3;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }
}
