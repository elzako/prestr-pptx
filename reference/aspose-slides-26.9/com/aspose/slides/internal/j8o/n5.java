package com.aspose.slides.internal.j8o;

import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.v0;
import com.aspose.slides.internal.b7s.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class n5 extends k5 {
   private final int[] u9 = new int[10];
   private final long[][] h0 = new long[4][];
   private final com.aspose.slides.internal.b7s.u3[] c8 = new com.aspose.slides.internal.b7s.u3[4];
   private final long[][] t2 = new long[4][];
   private final com.aspose.slides.internal.b7s.u3[] s7 = new com.aspose.slides.internal.b7s.u3[4];
   private int x8;
   private int n3;
   private int y4;
   private int e2;

   public n5(z1 var1, v0 var2) {
      super(var1, var2);
      int var3 = 8;
      if (var1.u9() != null) {
         var3 = var1.u9().t4() & 255;
      }

      if (var3 == 8) {
         this.y4 = n5;
         this.e2 = l6;
      } else {
         if (var3 != 12) {
            throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
         }

         this.y4 = k5;
         this.e2 = u3;
      }
   }

   @Override
   public com.aspose.slides.internal.b7s.u3[] n5() {
      List var1 = new List();
      boolean[] var2 = new boolean[4];
      boolean[] var3 = new boolean[4];
      p3 var4 = this.u9().l6();

      for (int var5 = 0; var5 < var4.l6.length; var5++) {
         byte var6 = this.u9().a6().l6()[var4.l6[var5]].l6();
         byte var7 = this.u9().a6().l6()[var4.l6[var5]].n5();
         if (!var2[var6 & 0xFF]) {
            com.aspose.slides.internal.b7s.u3 var8 = com.aspose.slides.internal.j8o.k5.n5(this.t2[var6 & 0xFF]);
            var8.l6((byte)0);
            var8.n5(var6);
            var1.addItem(var8);
            var2[var6 & 0xFF] = true;
         }

         if (!var3[var7 & 0xFF]) {
            com.aspose.slides.internal.b7s.u3 var9 = com.aspose.slides.internal.j8o.k5.n5(this.h0[var7 & 0xFF]);
            var9.n5(var7);
            var9.l6((byte)1);
            var1.addItem(var9);
            var3[var7 & 0xFF] = true;
         }
      }

      return (com.aspose.slides.internal.b7s.u3[])var1.toArray(new com.aspose.slides.internal.b7s.u3[0]);
   }

   @Override
   public void n5(short[][] var1) {
      z1 var2 = this.u9();
      int var3 = var2.n5();
      int[] var4 = var2.l6().k5();
      n3[] var5 = var2.a6().l6();
      if (var2.t2() != 0 && this.n3 == 0) {
         this.n5(this.x8);
      }

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var4[var6];
         n3 var8 = var5[var7];
         this.n5(var1[var6], this.u9[var8.u9() & 0xFF], this.s7[var8.l6() & 0xFF], this.c8[var8.n5() & 0xFF]);
         this.u9[var8.u9() & 0xFF] = var1[var6][0];
      }

      if (var2.t2() != 0 && this.n3 == 0) {
         this.n3 = var2.t2();
         this.x8++;
         this.x8 &= 7;
      }
   }

   @Override
   public void l6() {
      this.a6.l6();
   }

   @Override
   public void l6(short[][] var1) {
      z1 var2 = this.u9();
      int var3 = var2.n5();
      int[] var4 = var2.l6().k5();
      n3[] var5 = var2.a6().l6();

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var4[var6];
         this.n5(var1[var6], this.u9[var7], this.t2[var5[var7].l6() & 0xFF], this.h0[var5[var7].n5() & 0xFF]);
         this.u9[var7] = var1[var6][0];
      }
   }

   @Override
   public void k5() {
      for (int var1 = 0; var1 < this.u9().n5(); var1++) {
         int var2 = this.u9().l6().k5()[var1];
         n3 var3 = this.u9().a6().l6()[var2];
         Dictionary$ValueCollection$Enumerator var4 = this.u9().k5().getValues().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.b7s.u3 var5 = (com.aspose.slides.internal.b7s.u3)var4.next();
               if ((var5.s7() & 255) == 1) {
                  if (var5.n5() == var3.n5()) {
                     this.c8[var3.n5() & 0xFF] = var5;
                  }
               } else if (var5.n5() == var3.l6()) {
                  this.s7[var3.l6() & 0xFF] = var5;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      com.aspose.slides.ms.System.u3.n5(this.u9, 0, this.u9.length);
      if (this.u9().t2() > 0) {
         this.n3 = this.u9().t2();
      }
   }

   @Override
   public void u3() {
      p3 var1 = this.u9().l6();

      for (int var2 = 0; var2 < var1.l6.length; var2++) {
         if (this.t2[this.u9().a6().l6()[var1.l6[var2]].l6() & 0xFF] == null) {
            this.t2[this.u9().a6().l6()[var1.l6[var2]].l6() & 0xFF] = new long[257];
         }

         if (this.h0[this.u9().a6().l6()[var1.l6[var2]].n5() & 0xFF] == null) {
            this.h0[this.u9().a6().l6()[var1.l6[var2]].n5() & 0xFF] = new long[257];
         }

         this.u9[var1.l6[var2]] = 0;
      }

      this.n5(true);
   }

   public final void n5(short[] var1, int var2, long[] var3, long[] var4) {
      int var5 = var1[0] - var2;
      if (var5 < 0) {
         var5 = -var5;
      }

      int var6 = 0;

      while (var5 != 0) {
         var6++;
         var5 >>= 1;
      }

      if (var6 > this.y4) {
         throw new com.aspose.slides.internal.h6t.n5(
            d1.n5(new String[]{"The DC coefficient is not valid. The maximum number of bits for DC coefficient is ", a3.l6(this.y4)})
         );
      }

      var3[var6]++;
      int var7 = 0;

      for (int var8 = 1; var8 < 64; var8++) {
         var5 = var1[com.aspose.slides.internal.n5p.u9.n5()[var8]];
         if (var5 == 0) {
            var7++;
         } else {
            while (var7 > 15) {
               var4[240]++;
               var7 -= 16;
            }

            if (var5 < 0) {
               var5 = -var5;
            }

            var6 = 1;

            while ((var5 >>= 1) != 0) {
               var6++;
            }

            if (var6 > this.e2) {
               throw new com.aspose.slides.internal.h6t.n5(
                  d1.n5(new String[]{"The AC coefficient is not valid. The maximum number of bits for AC coefficient is ", a3.l6(this.e2)})
               );
            }

            var4[(var7 << 4) + var6]++;
            var7 = 0;
         }
      }

      if (var7 > 0) {
         var4[0]++;
      }
   }

   private void n5(int var1) {
      this.a6.l6();
      this.a6.n5((byte)(208 + var1));
      com.aspose.slides.ms.System.u3.n5(this.u9, 0, this.u9.length);
   }

   private void n5(short[] var1, int var2, com.aspose.slides.internal.b7s.u3 var3, com.aspose.slides.internal.b7s.u3 var4) {
      int var5 = var1[0] - var2;
      int var6 = var5;
      if (var5 < 0) {
         var5 = -var5;
         var6--;
      }

      int var7 = 0;

      while (var5 != 0) {
         var7++;
         var5 >>= 1;
      }

      if (var7 > this.y4) {
         throw new com.aspose.slides.internal.h6t.n5(
            d1.n5(new String[]{"The DC coefficient is not valid. The maximum number of bits for DC coefficient is ", a3.l6(this.y4)})
         );
      }

      this.a6.n5(var3.l6()[var7], var3.k5()[var7]);
      if (var7 != 0) {
         this.a6.n5(var6, var7);
      }

      int[] var8 = var4.l6();
      int[] var9 = var4.k5();
      int var10 = 0;

      for (int var11 = 1; var11 < 64; var11++) {
         var5 = var1[com.aspose.slides.internal.n5p.u9.n5()[var11]];
         if (var5 == 0) {
            var10++;
         } else {
            while (var10 > 15) {
               this.a6.n5(var8[240], var9[240]);
               var10 -= 16;
            }

            var6 = var5;
            if (var5 < 0) {
               var5 = -var5;
               var6--;
            }

            var7 = 1;

            while ((var5 >>= 1) != 0) {
               var7++;
            }

            if (var7 > this.e2) {
               throw new com.aspose.slides.internal.h6t.n5(
                  d1.n5(new String[]{"The AC coefficient is not valid. The maximum number of bits for AC coefficient is ", a3.l6(this.e2)})
               );
            }

            int var12 = (var10 << 4) + var7;
            this.a6.n5(var8[var12], var9[var12]);
            this.a6.n5(var6, var7);
            var10 = 0;
         }
      }

      if (var10 > 0) {
         this.a6.n5(var8[0], var9[0]);
      }
   }
}
