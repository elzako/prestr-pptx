package com.aspose.slides.internal.v3s;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.e1x.a5;
import com.aspose.slides.internal.e1x.f0;
import com.aspose.slides.internal.e1x.j5;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.e1x.w1;
import com.aspose.slides.internal.n2d.k7;
import com.aspose.slides.ms.System.q1;

public class u3 extends u9 {
   private int u3;
   private int[] a6;
   private int[] u9;
   private int[] h0;
   private int[] c8;
   private int[] t2;
   private int s7;
   public int n5;
   public int l6;
   public int k5;
   private SortedList<Integer, Integer> x8 = new SortedList<>();

   public u3(int var1, int var2, f0 var3) {
      super(var1, var2, var3);
   }

   public final int n5() {
      return this.u3;
   }

   public final int[] l6() {
      return this.a6;
   }

   public final int[] k5() {
      return this.u9;
   }

   @Override
   public void n5(com.aspose.slides.internal.n2d.k5 var1) {
      int var2 = var1.a6();
      this.s7 = var1.a6() & 65535;
      this.u3 = (var1.a6() & 65535) / 2 & 65535;
      this.n5 = var1.a6() & 65535;
      this.l6 = var1.a6() & 65535;
      this.k5 = var1.a6() & 65535;
      this.a6 = new int[this.u3];

      for (int var3 = 0; var3 < this.a6.length; var3++) {
         this.a6[var3] = var1.a6() & 65535;
      }

      var1.a6();
      this.u9 = new int[this.u3];
      this.h0 = new int[this.u3];
      this.t2 = new int[this.u3];

      for (int var5 = 0; var5 < this.u9.length; var5++) {
         this.u9[var5] = var1.a6() & 65535;
      }

      for (int var6 = 0; var6 < this.h0.length; var6++) {
         this.h0[var6] = var1.a6() & 65535;
      }

      for (int var7 = 0; var7 < this.t2.length; var7++) {
         this.t2[var7] = var1.a6() & 65535;
      }

      int var8 = ((var2 & 65535) - (8 * this.u3 + 16)) / 2;
      if (var8 < 0) {
         var8 = this.u3;
      }

      this.c8 = new int[var8];

      for (int var4 = 0; var4 < var8; var4++) {
         this.c8[var4] = var1.a6() & 65535;
      }

      super.n5(var1);
   }

   @Override
   public a5 n5(w1 var1) {
      a5 var2 = new a5(((com.aspose.slides.internal.e1x.l6)this.u3()).k5());

      for (int var3 = 0; var3 < this.u3; var3++) {
         for (int var4 = this.u9[var3]; var4 <= this.a6[var3]; var4++) {
            int var5;
            if (var4 < 65535) {
               var5 = this.n5((char)var4, var3);
            } else {
               var5 = 0;
            }

            j5 var6 = var1.n5(var5).n5();
            u6 var7 = new u6((char)var4, var5, var6.n5 & 65535, var6.l6);
            var2.n5(var7);
            if (var7.l6() == 0) {
               var2.l6(var7);
            }
         }
      }

      return var2;
   }

   @Override
   public void n5(com.aspose.slides.internal.n2d.u3 var1) {
      var1.l6(4);
      int var2 = 16 + this.n5() * 8 + this.c8.length * 2;
      var1.l6(var2);
      var1.l6(this.s7);
      var1.l6(this.n5() * 2);
      var1.l6(this.n5);
      var1.l6(this.l6);
      var1.l6(this.k5);
      n5(this.a6, var1);
      var1.l6(0);
      n5(this.u9, var1);
      n5(this.h0, var1);
      n5(this.t2, var1);
      n5(this.c8, var1);
   }

   private static void n5(int[] var0, com.aspose.slides.internal.n2d.u3 var1) {
      for (int var5 : var0) {
         var1.l6(var5);
      }
   }

   @Override
   public int n5(int var1) {
      for (int var2 = 0; var2 < this.u3; var2++) {
         if (var1 <= this.a6[var2] && this.u9[var2] <= var1) {
            return this.n5(var1, var2);
         }

         if (var1 <= this.a6[var2]) {
            break;
         }
      }

      return 0;
   }

   private int n5(int var1, int var2) {
      if (this.t2[var2] > 0) {
         int var3 = this.t2[var2] / 2 + (var1 - this.u9[var2]) - (this.u3 - var2);
         if (var3 < this.c8.length) {
            return this.c8[var3];
         }
      }

      return (this.h0[var2] + var1) % 65536;
   }

   public final void n5(k7 var1) {
      int var2 = var1.n5() - 1;
      if (var1.u3(var2) != 65535) {
         throw new InvalidOperationException("Last character is supposed to be the 0xffff (the missing character).");
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var1.k5(var2), int.class) != 0) {
         throw new InvalidOperationException("Glyph index for the missing character is expected to be zero.");
      }

      this.u3 = var1.n5() & 65535;
      this.n5 = 2 << com.aspose.slides.internal.v6g.k5.u3(q1.k5(q1.t4(this.u3) / q1.t4(2.0)), 14);
      this.l6 = com.aspose.slides.internal.v6g.k5.u3(q1.t4(this.n5 / 2.0) / q1.t4(2.0), 14);
      this.k5 = 2 * this.u3 - this.n5;
      this.a6 = new int[this.u3];
      this.u9 = new int[this.u3];
      this.h0 = new int[this.u3];
      this.t2 = new int[this.u3];
      this.c8 = new int[0];

      for (int var3 = 0; var3 < var1.n5(); var3++) {
         int var4 = var1.u3(var3);
         int var5 = com.aspose.slides.internal.v6g.k5.u3(var1.k5(var3), int.class);
         this.a6[var3] = var4;
         this.u9[var3] = var4;
         this.h0[var3] = var5 - var4;
      }
   }
}
