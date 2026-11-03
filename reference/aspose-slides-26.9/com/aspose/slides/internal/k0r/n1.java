package com.aspose.slides.internal.k0r;

import com.aspose.slides.PptReadException;
import com.aspose.slides.exceptions.ArgumentException;

public class n1 {
   private int n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private int a6;
   private int u9;
   private int h0;

   public n1(byte[] var1) {
      int[] var2 = new int[]{this.n5};
      boolean[] var3 = new boolean[]{this.l6};
      boolean[] var4 = new boolean[]{this.k5};
      boolean[] var5 = new boolean[]{this.u3};
      int[] var6 = new int[]{this.a6};
      int[] var7 = new int[]{this.u9};
      int[] var8 = new int[]{this.h0};
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8);
      this.n5 = var2[0];
      this.l6 = var3[0];
      this.k5 = var4[0];
      this.u3 = var5[0];
      this.a6 = var6[0];
      this.u9 = var7[0];
      this.h0 = var8[0];
   }

   public int n5() {
      return this.n5;
   }

   public boolean l6() {
      return this.l6;
   }

   public boolean k5() {
      return this.k5;
   }

   public boolean u3() {
      return this.u3;
   }

   public int a6() {
      return this.a6;
   }

   public int u9() {
      return this.u9;
   }

   public int h0() {
      return this.h0;
   }

   private void n5(byte[] var1, int[] var2, boolean[] var3, boolean[] var4, boolean[] var5, int[] var6, int[] var7, int[] var8) {
      if (var1 != null && var1.length == 8) {
         int var9 = 0;
         int var10 = com.aspose.slides.internal.n8e.y2.l6(var1, var9);
         var9 += 2;
         var3[0] = (var10 & 65535 & 8192) != 0;
         var4[0] = (var10 & 65535 & 16384) != 0;
         var5[0] = (var10 & 65535 & 32768) != 0;
         int var11 = var10 & 65535 & 0xFF;
         if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(j3.class), var11)) {
            throw new PptReadException("Wrong sgf value in [ms-odraw] 2.2.58 SG structure.");
         }

         var2[0] = var11;
         var6[0] = com.aspose.slides.internal.n8e.y2.l6(var1, var9);
         var9 += 2;
         var7[0] = com.aspose.slides.internal.n8e.y2.l6(var1, var9);
         var9 += 2;
         var8[0] = com.aspose.slides.internal.n8e.y2.l6(var1, var9);
      } else {
         throw new ArgumentException("The 'data' parameter should be byte[8] array.", "data");
      }
   }
}
