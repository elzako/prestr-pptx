package com.aspose.slides.internal.x4;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public class t9 extends com.aspose.slides.internal.z0k.n5 {
   public t9(com.aspose.slides.internal.z0k.t4 var1) {
      super(var1);
   }

   public final int[] n5() {
      int var1 = super.m3();
      return this.n5(var1);
   }

   public final int[] n5(int var1) {
      int[] var2 = new int[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = super.m3();
      }

      return var2;
   }

   public final int[] l6(int var1) {
      int[] var2 = new int[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = super.k7();
      }

      return var2;
   }

   public final String k5(int var1) {
      int var2 = var1 * 2;
      byte[] var3 = super.c8(var2);
      byte var4 = 0;

      while (var4 < var2 && ((var3[var4] & 255) != 0 || (var3[var4 + 1] & 255) != 0)) {
         var4 += 2;
      }

      return j5.z1().l6(var3, 0, var4);
   }

   public final w1 l6() {
      int var1 = super.m3();
      int var2 = super.m3();
      return new w1(var1, var2);
   }

   public final f2 k5() {
      int var1 = super.m3();
      int var2 = super.m3();
      return new f2(var1, var2);
   }

   public final y1 u3() {
      int var1 = this.m3();
      int var2 = this.m3();
      int var3 = this.m3();
      int var4 = this.m3();
      return y1.n5(var1, var2, var3, var4);
   }

   public final com.aspose.slides.internal.p1s.n5 a6() {
      int var1 = super.z1() & 255;
      int var2 = super.z1() & 255;
      int var3 = super.z1() & 255;
      super.z1();
      return new com.aspose.slides.internal.p1s.n5(var1, var2, var3);
   }

   public final w1[] u9() {
      int var1 = super.m3();
      return this.u3(var1);
   }

   public final w1[] u3(int var1) {
      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), var1));

      for (int var3 = 0; var3 < var1; var3++) {
         int var4 = super.m3();
         int var5 = super.m3();
         var2[var3] = new w1(var4, var5);
      }

      return var2;
   }

   public final w1[] h0() {
      int var1 = super.m3();
      return this.a6(var1);
   }

   public final w1[] a6(int var1) {
      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), var1));

      for (int var3 = 0; var3 < var1; var3++) {
         short var4 = super.k7();
         short var5 = super.k7();
         var2[var3] = new w1(var4, var5);
      }

      return var2;
   }

   public final w1[][] c8() {
      int var1 = super.m3();
      super.m3();
      w1[][] var2 = new w1[var1][];
      int[] var3 = this.n5(var1);

      for (int var4 = 0; var4 < var1; var4++) {
         var2[var4] = this.u3(var3[var4]);
      }

      return var2;
   }

   public final w1[][] t2() {
      int var1 = super.m3();
      super.m3();
      w1[][] var2 = new w1[var1][];
      int[] var3 = this.n5(var1);

      for (int var4 = 0; var4 < var1; var4++) {
         var2[var4] = this.a6(var3[var4]);
      }

      return var2;
   }

   public final com.aspose.slides.internal.w0.c8 s7() {
      float var1 = this.w1();
      float var2 = this.w1();
      float var3 = this.w1();
      float var4 = this.w1();
      float var5 = this.w1();
      float var6 = this.w1();
      return new com.aspose.slides.internal.w0.c8(var1, var2, var3, var4, var5, var6);
   }

   public final int[] u9(int var1) {
      int[] var2 = new int[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = super.z1() & 255;
      }

      return var2;
   }
}
