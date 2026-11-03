package com.aspose.slides.internal.c4t;

import java.awt.Point;
import java.awt.Rectangle;

public abstract class n3 {
   Point n5;
   String l6 = null;
   byte[] k5 = null;
   int u3;
   Rectangle a6;
   int[] u9;

   public static byte[] n5(byte[] var0, int var1, int var2) throws com.aspose.slides.internal.p7x.l6 {
      byte[] var3 = new byte[var2];
      int var4 = 0;

      while (var4 < var2) {
         var3[var4] = var0[var1];
         var4++;
         var1++;
      }

      return var3;
   }

   public void n5(Point var1) {
      this.n5 = var1;
   }

   public Point n5() {
      return this.n5;
   }

   public String l6() {
      return this.l6;
   }

   public Rectangle k5() {
      return this.a6;
   }

   public void n5(byte[] var1) {
      this.k5 = var1;
   }

   public byte[] u3() {
      return this.k5;
   }

   public int a6() {
      return this.u3;
   }

   public int[] u9() {
      return this.u9;
   }
}
