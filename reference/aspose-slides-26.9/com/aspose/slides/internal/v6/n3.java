package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.b9.x5;
import com.aspose.slides.internal.b9.x9;
import com.aspose.slides.ms.System.q1;

public abstract class n3 extends com.aspose.slides.internal.r5.a6 {
   protected n3(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      x9 var3 = (x9)var1;
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.u3 var5 = null;
      x5 var6 = var3.u9();
      if (var3.u3() != 0L && var3.u3() != 1L) {
         if (var3.u3() == 2L) {
            int var21 = 0;
            float var23 = 1.0F / q1.n5(var2.l6().n5()[0]);

            for (com.aspose.slides.internal.t5.u9 var27 : var6.k5()) {
               com.aspose.slides.internal.t5.z8 var29 = var6.n5()[(int)var27.n5()];
               com.aspose.slides.internal.t5.z8 var31 = var6.n5()[(int)var27.l6()];
               com.aspose.slides.internal.t5.z8 var33 = var6.n5()[(int)var27.k5()];
               com.aspose.slides.internal.o9b.w1[] var16 = new com.aspose.slides.internal.o9b.w1[]{
                  new com.aspose.slides.internal.o9b.w1(var29.n5() - var23, var29.l6()),
                  new com.aspose.slides.internal.o9b.w1(var31.n5() + var23, var31.l6()),
                  new com.aspose.slides.internal.o9b.w1(var33.n5() + var23 * (var21 % 2 == 0 ? -1 : 1), var33.l6())
               };
               com.aspose.slides.internal.o9b.c8[] var17 = new com.aspose.slides.internal.o9b.c8[]{this.n5(var29), this.n5(var31), this.n5(var33)};
               var4.k5(var16);
               var21++;
               if (!var4.s7().u3()) {
                  if (var17[0].equals(var17[1].o8()) && var17[0].equals(var17[2].o8())) {
                     var5 = new com.aspose.slides.internal.o9b.i1(var17[0].o8());
                  } else {
                     var5 = new com.aspose.slides.internal.x4g.m3(var4);
                     ((com.aspose.slides.internal.x4g.m3)var5).n5(var17[0].o8());
                     ((com.aspose.slides.internal.x4g.m3)var5).n5(var16[0].u3());
                     ((com.aspose.slides.internal.x4g.m3)var5).n5(var17);
                  }
               }
            }
         }
      } else {
         for (com.aspose.slides.internal.t5.a6 var10 : var3.u9().l6()) {
            com.aspose.slides.internal.t5.z8 var11 = var6.n5()[(int)var10.n5()];
            com.aspose.slides.internal.t5.z8 var12 = var6.n5()[(int)var10.l6()];
            if (var3.u3() == 0L) {
               float var13 = (var11.l6() + var12.l6()) / 2.0F;
               com.aspose.slides.internal.o9b.w1 var14 = new com.aspose.slides.internal.o9b.w1(var11.n5(), var13);
               com.aspose.slides.internal.o9b.w1 var15 = new com.aspose.slides.internal.o9b.w1(var12.n5(), var13);
               var5 = new com.aspose.slides.internal.x4g.z3(var14.u3(), var15.u3(), this.n5(var11).o8(), this.n5(var12).o8());
            } else {
               float var28 = (var11.n5() + var12.n5()) / 2.0F;
               com.aspose.slides.internal.o9b.w1 var30 = new com.aspose.slides.internal.o9b.w1(var28, var11.l6());
               com.aspose.slides.internal.o9b.w1 var32 = new com.aspose.slides.internal.o9b.w1(var28, var12.l6());
               var5 = new com.aspose.slides.internal.x4g.z3(var30.u3(), var32.u3(), this.n5(var11).o8(), this.n5(var12).o8());
            }

            var4.l6(com.aspose.slides.internal.o9b.y2.n5(var11.n5(), var11.l6(), var12.n5(), var12.l6()).n3());
         }
      }

      if (var5 != null) {
         var2.n5(var5);
         if (var4.s7().k5() == 1.0F) {
            int var22 = var2.<com.aspose.slides.internal.o9b.z1>n5().t4();

            try {
               var2.<com.aspose.slides.internal.o9b.z1>n5().u9(3);
               this.n5(var4, var2);
            } finally {
               var2.<com.aspose.slides.internal.o9b.z1>n5().u9(var22);
            }
         } else {
            this.n5(var4, var2);
         }
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return true;
   }

   protected abstract void n5(com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.r6.u9 var2);

   private com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.t5.z8 var1) {
      int var2 = this.n5(var1.k5());
      int var3 = this.n5(var1.u3());
      int var4 = this.n5(var1.u9());
      return com.aspose.slides.internal.o9b.c8.n5(var2, var3, var4);
   }

   private int n5(int var1) {
      return (var1 & 65535) > 255 ? (var1 & 65535) >> 8 : var1 & 65535;
   }
}
