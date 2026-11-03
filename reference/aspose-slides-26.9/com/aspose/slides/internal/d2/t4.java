package com.aspose.slides.internal.d2;

import com.aspose.slides.Collections.Generic.List;

public class t4 extends c8 {
   protected String x8;
   protected int[] n3;
   protected int[] y4;
   protected int[][] e2;
   protected boolean t9;

   public t4(int var1, int var2, String var3, int[] var4, int[] var5, int[][] var6, boolean var7) {
      super(var1, var2);
      int var8 = var3 != null ? var3.length() : 0;
      this.x8 = var3;
      this.n3 = n5(var4, var8);
      this.y4 = n5(var5, var2, var8);
      this.e2 = n5(var6, var8);
      this.t9 = var7;
   }

   public t4(int var1, int var2, String var3, int[] var4, int[] var5, int[][] var6) {
      this(var1, var2, var3, var4, var5, var6, false);
   }

   public final String m1() {
      return this.x8;
   }

   public final int[] k7() {
      return this.n3;
   }

   public final int[] m3() {
      return this.y4;
   }

   @Override
   public List<com.aspose.slides.internal.d5.a6> l6(List<com.aspose.slides.internal.d5.a6> var1) {
      com.aspose.slides.internal.d5.a6 var2;
      if (this.m3() != null) {
         var2 = new com.aspose.slides.internal.d5.a6(this, this.m3());
      } else {
         var2 = new com.aspose.slides.internal.d5.a6(this, -1, this.x8.length());
      }

      var1.addItem(var2);
      return var1;
   }

   public final void l6(boolean var1) {
      if (this.x8.length() > 0) {
         this.x8 = t4$n5.n5(this.x8);
         if (this.y4 != null) {
            n5(this.y4);
         }

         if (this.e2 != null) {
            n5(this.e2);
         }

         this.t9 = !this.t9;
         if (var1) {
            this.x8 = com.aspose.slides.internal.p8.n5.n5(this.x8);
         }
      }
   }

   public final void y1() {
      if (this.x8.length() > 0) {
         this.x8 = com.aspose.slides.internal.p8.n5.n5(this.x8);
      }
   }

   public final boolean a0() {
      return this.t9;
   }

   private static int[] n5(int[] var0, int var1) {
      if (var0 == null) {
         return var0;
      }

      if (var0.length == var1) {
         return var0;
      }

      int[] var2 = new int[var1];
      int var3 = 0;

      for (int var4 = var0.length; var3 < var4 && var3 < var1; var3++) {
         var2[var3] = var0[var3];
      }

      return var2;
   }

   private static int[][] n5(int[][] var0, int var1) {
      if (var0 == null) {
         return var0;
      }

      if (var0.length == var1) {
         return var0;
      }

      int[][] var2 = new int[var1][];
      int var3 = 0;

      for (int var4 = var0.length; var3 < var4 && var3 < var1; var3++) {
         var2[var3] = var0[var3];
      }

      return var2;
   }

   private static int[] n5(int[] var0, int var1, int var2) {
      if (var0 == null && var1 >= 0) {
         var0 = new int[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            var0[var3] = var1;
         }
      }

      return n5(var0, var2);
   }

   private static void n5(int[] var0) {
      int var1 = 0;
      int var2 = var0.length;

      for (int var3 = var2 / 2; var1 < var3; var1++) {
         int var4 = var2 - var1 - 1;
         int var5 = var0[var4];
         var0[var4] = var0[var1];
         var0[var1] = var5;
      }
   }

   private static void n5(int[][] var0) {
      int var1 = 0;
      int var2 = var0.length;

      for (int var3 = var2 / 2; var1 < var3; var1++) {
         int var4 = var2 - var1 - 1;
         int[] var5 = var0[var4];
         var0[var4] = var0[var1];
         var0[var1] = var5;
      }
   }
}
