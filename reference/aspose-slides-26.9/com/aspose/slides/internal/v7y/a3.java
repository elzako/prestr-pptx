package com.aspose.slides.internal.v7y;

public class a3 extends c4 {
   private static int[] n5 = new int[]{0, 0, 0, 3, 4, 7, 8, 5, 6};
   private int l6;
   private c4 k5;
   private c4 u3;

   public static int n5(int var0) {
      return n5[var0];
   }

   public a3(int var1, c4 var2, c4 var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   @Override
   public int ad_() {
      return 1;
   }

   @Override
   public int l6() {
      if (this.l6 <= 8) {
         return 2;
      } else {
         return this.l6 <= 13 ? 0 : 3;
      }
   }

   public final int k5() {
      return this.l6;
   }

   public final c4 u3() {
      return this.k5;
   }

   public final c4 a6() {
      return this.u3;
   }
}
