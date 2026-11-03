package com.aspose.slides.internal.f7v;

public class v0 extends v4 {
   private String t2;
   private int s7;
   private int[] x8;

   public v0(com.aspose.slides.internal.c5e.l6 var1) {
      super("sPLT", var1);
   }

   @Override
   public void n5(a6 var1) {
      int var2 = -1;

      for (int var3 = 0; var3 < var1.k5.length; var3++) {
         if (var1.k5[var3] == 0) {
            var2 = var3;
            break;
         }
      }

      if (var2 > 0 && var2 <= var1.k5.length - 2) {
         this.t2 = com.aspose.slides.internal.c5e.h0.n5.l6(var1.k5, 0, var2);
         this.s7 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, var2 + 1);
         var2 += 2;
         int var19 = (var1.k5.length - var2) / (this.s7 == 8 ? 6 : 10);
         this.x8 = new int[var19 * 5];
         int var4 = 0;

         for (int var5 = 0; var5 < var19; var5++) {
            int var6;
            int var7;
            int var8;
            int var9;
            if (this.s7 == 8) {
               var6 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, var2++);
               var7 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, var2++);
               var8 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, var2++);
               var9 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, var2++);
            } else {
               var6 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, var2);
               var2 += 2;
               var7 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, var2);
               var2 += 2;
               var8 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, var2);
               var2 += 2;
               var9 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, var2);
               var2 += 2;
            }

            int var10 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, var2);
            var2 += 2;
            this.x8[var4++] = var6;
            this.x8[var4++] = var7;
            this.x8[var4++] = var8;
            this.x8[var4++] = var9;
            this.x8[var4++] = var10;
         }
      } else {
         throw new com.aspose.slides.internal.c5e.e2("bad sPLT chunk: no separator found");
      }
   }

   public int l6() {
      return this.x8.length / 5;
   }

   public String k5() {
      return this.t2;
   }

   public int u3() {
      return this.s7;
   }

   public int[] a6() {
      return this.x8;
   }
}
