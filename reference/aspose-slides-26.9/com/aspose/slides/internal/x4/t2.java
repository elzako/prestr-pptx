package com.aspose.slides.internal.x4;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.q1;

public class t2 implements l6 {
   private int n5 = 0;
   private float l6 = 1.0F;
   private com.aspose.slides.internal.p1s.n5 k5 = com.aspose.slides.internal.p1s.n5.c8;
   private int u3;
   private int a6 = 0;
   private byte[] u9;
   private int h0 = 1;

   public final void n5(z1 var1, int var2) {
      this.n5 = var1.k7();
      short var3 = var1.k7();
      if (var3 == 0) {
         if (var2 != Integer.MIN_VALUE && var2 != Integer.MAX_VALUE) {
            this.l6 = var2;
         } else {
            this.l6 = q1.n5(var3, (short)1);
         }
      } else {
         this.l6 = q1.n5(var3, (short)1);
      }

      var1.k7();
      this.k5 = var1.u9();
      this.k5();
   }

   public final void n5(t9 var1) {
      this.u3 = var1.m3();
      this.n5 = var1.m3();
      this.l6 = q1.n5(var1.m3(), 1);
      var1.m3();
      this.k5 = var1.a6();
      this.k5();
   }

   public final void l6(t9 var1) {
      this.u3 = var1.m3();
      var1.m3();
      int var2 = var1.m3();
      var1.m3();
      int var3 = var1.m3();
      this.n5 = (int)var1.c4();
      this.l6 = q1.n5(var1.m3(), 1);
      int var4 = (int)var1.c4();
      if (var4 != 0 && var4 != 2) {
         var1.m3();
      } else {
         this.k5 = var1.a6();
      }

      this.a6 = var1.m3();
      if ((var4 & 2) == 2) {
         this.h0 = 2;
      }

      var1.n5();
      if (var4 == 6) {
         this.h0 = 3;
         var1.m3();
         this.u9 = com.aspose.slides.internal.k4d.a6.n5(var1, var2, var3);
      }

      this.k5();
   }

   public final com.aspose.slides.internal.w0.s7 n5(com.aspose.slides.internal.p1s.n5 var1) {
      com.aspose.slides.internal.w0.s7 var2 = null;
      switch (this.h0) {
         case 0:
            return var2;
         case 1:
         default:
            var2 = new com.aspose.slides.internal.w0.s7(this.k5, this.l6);
            break;
         case 2:
            com.aspose.slides.internal.w0.a6 var5 = new com.aspose.slides.internal.w0.a6(this.a6, this.k5, var1);
            var2 = new com.aspose.slides.internal.w0.s7(var5, this.l6);
            break;
         case 3:
            com.aspose.slides.internal.w0.y4 var3 = new com.aspose.slides.internal.w0.y4(this.u9, 0);
            var2 = new com.aspose.slides.internal.w0.s7(var3, this.l6);
      }

      n5(var2, this.n5 & 15);
      l6(var2, this.n5 & 3840);
      k5(var2, this.n5 & 61440);
      return var2;
   }

   private void k5() {
      if ((this.n5 & 15) == 5) {
         this.h0 = 0;
      }
   }

   private static void n5(com.aspose.slides.internal.w0.s7 var0, int var1) {
      switch (var1) {
         case 0:
            var0.u9(0);
            break;
         case 1:
            var0.u9(1);
            break;
         case 2:
            var0.u9(2);
            break;
         case 3:
            var0.u9(3);
            break;
         case 4:
            var0.u9(4);
      }
   }

   private static void l6(com.aspose.slides.internal.w0.s7 var0, int var1) {
      byte var2;
      switch (var1) {
         case 0:
            var2 = 2;
            break;
         case 256:
            var2 = 1;
            break;
         case 512:
            var2 = 0;
            break;
         default:
            throw new InvalidOperationException("Unknown pen end cap style.");
      }

      var0.l6(var2);
      var0.k5(var2);
   }

   private static void k5(com.aspose.slides.internal.w0.s7 var0, int var1) {
      switch (var1) {
         case 0:
            var0.u3(2);
            break;
         case 4096:
            var0.u3(1);
            break;
         case 8192:
            var0.u3(0);
            break;
         default:
            throw new InvalidOperationException("Unknown pen join style.");
      }
   }

   @Override
   public final int n5() {
      return 2;
   }

   @Override
   public final int l6() {
      return this.u3;
   }

   @Override
   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final void l6(int var1) {
      this.n5 = var1;
      this.k5();
   }

   public final void l6(com.aspose.slides.internal.p1s.n5 var1) {
      this.k5 = var1;
   }
}
