package com.aspose.slides.internal.e6q;

import com.aspose.slides.internal.o9b.w1;
import java.util.Arrays;

public class u9 {
   private int n5;
   private float[] l6;

   public static u9 n5(float var0, float var1) {
      return new u9(2, new float[]{var0, var1});
   }

   public static u9 l6(float var0, float var1) {
      return new u9(4, new float[]{var0, var1});
   }

   public static u9 n5(float var0, float var1, float var2, float var3) {
      return new u9(6, new float[]{var0, var1, var2, var3});
   }

   public static u9 n5(float var0, float var1, float var2, float var3, float var4, float var5) {
      return new u9(8, new float[]{var0, var1, var2, var3, var4, var5});
   }

   public u9(u9 var1) {
      this(var1.n5(), Arrays.copyOf(var1.l6, var1.l6.length));
   }

   private u9(int var1, float[] var2) {
      if (var1 != 2 && var1 != 4 && var1 != 6 && var1 != 8 && var1 != 10) {
         throw new IllegalArgumentException("Illegal type " + var1 + " for StrokeItem");
      }

      this.n5 = var1;
      this.l6 = var2;
   }

   public int n5() {
      return this.n5;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   public w1 l6() {
      switch (this.n5) {
         case 2:
            return new w1(this.l6[0], this.l6[1]);
         case 3:
         case 5:
         case 7:
         case 9:
         default:
            throw new IllegalArgumentException("Illegal type " + this.n5 + " for StrokeItem ");
         case 4:
            return new w1(this.l6[0], this.l6[1]);
         case 6:
            return new w1(this.l6[2], this.l6[3]);
         case 8:
            return new w1(this.l6[4], this.l6[5]);
         case 10:
            return null;
      }
   }

   public void n5(com.aspose.slides.internal.x1j.h0 var1) {
      switch (this.n5) {
         case 2:
            var1.n5(this.l6[0], this.l6[1]);
         case 3:
         case 5:
         case 7:
         case 9:
         default:
            break;
         case 4:
            var1.l6(this.l6[0], this.l6[1]);
            break;
         case 6:
            var1.n5(this.l6[0], this.l6[1], this.l6[2], this.l6[3]);
            break;
         case 8:
            var1.n5(this.l6[0], this.l6[1], this.l6[2], this.l6[3], this.l6[4], this.l6[5]);
            break;
         case 10:
            var1.n5();
      }
   }
}
