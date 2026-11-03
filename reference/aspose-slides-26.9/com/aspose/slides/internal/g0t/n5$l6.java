package com.aspose.slides.internal.g0t;

public class n5$l6 {
   private static final n5$l6 n5 = new n5$l6(2.2);
   private static final n5$l6 l6 = new n5$l6(0.45454545454545453);
   private int[] k5;

   private n5$l6(double var1) {
      this.k5 = this.n5(var1);
   }

   private int[] n5(double var1) {
      short var3 = 256;
      double var4 = 255.0;
      int[] var6 = new int[256];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = (int)Math.round(255.0 * Math.pow(var7 / 255.0, var1));
      }

      return var6;
   }

   public int n5(int var1) {
      int var2 = var1 >> 24 & 0xFF;
      int var3 = this.k5[var1 >> 16 & 0xFF];
      int var4 = this.k5[var1 >> 8 & 0xFF];
      int var5 = this.k5[var1 >> 0 & 0xFF];
      return var2 << 24 | var3 << 16 | var4 << 8 | var5;
   }

   // $VF: synthetic method
   static n5$l6 n5() {
      return n5;
   }

   // $VF: synthetic method
   static n5$l6 l6() {
      return l6;
   }
}
