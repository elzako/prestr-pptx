package com.aspose.slides.internal.x4;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public class z1 extends com.aspose.slides.internal.z0k.n5 {
   public z1(com.aspose.slides.internal.z0k.t4 var1) {
      super(var1);
   }

   public final int[] n5(int var1) {
      int[] var2 = new int[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = super.k7();
      }

      return var2;
   }

   public final String n5(int var1, j5 var2) {
      byte[] var3 = super.c8(var1);
      int var4 = 0;

      while (var4 < var1 && (var3[var4] & 255) != 0) {
         var4++;
      }

      return var2.l6(var3, 0, var4);
   }

   public final w1 n5() {
      short var1 = super.k7();
      short var2 = super.k7();
      return new w1(var2, var1);
   }

   public final f2 l6() {
      short var1 = super.k7();
      short var2 = super.k7();
      return new f2(var2, var1);
   }

   public final y1 k5() {
      int[] var1 = this.n5(4);
      return y1.n5(var1[0], var1[1], var1[2], var1[3]);
   }

   public final y1 u3() {
      int[] var1 = this.n5(4);
      return y1.n5(var1[3], var1[2], var1[1], var1[0]);
   }

   public final y1 a6() {
      int[] var1 = this.n5(4);
      return new y1(var1[3], var1[2], var1[1], var1[0]);
   }

   public final com.aspose.slides.internal.p1s.n5 u9() {
      int var1 = super.z1() & 255;
      int var2 = super.z1() & 255;
      int var3 = super.z1() & 255;
      super.z1();
      return new com.aspose.slides.internal.p1s.n5(var1, var2, var3);
   }

   public final w1[] h0() {
      int var1 = super.r4();
      return this.l6(var1 & 65535);
   }

   public final w1[] l6(int var1) {
      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), var1));

      for (int var3 = 0; var3 < var1; var3++) {
         short var4 = super.k7();
         short var5 = super.k7();
         var2[var3] = new w1(var4, var5);
      }

      return var2;
   }

   public final w1[][] c8() {
      int var1 = super.r4();
      w1[][] var2 = new w1[var1 & 65535][];
      int[] var3 = this.n5(var1 & 65535);

      for (int var4 = 0; var4 < (var1 & 65535); var4++) {
         var2[var4] = this.l6(var3[var4]);
      }

      return var2;
   }
}
