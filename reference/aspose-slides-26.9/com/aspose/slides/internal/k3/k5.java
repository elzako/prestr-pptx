package com.aspose.slides.internal.k3;

import com.aspose.slides.internal.g2.f2;
import com.aspose.slides.internal.g2.j5;
import com.aspose.slides.internal.i3.i1;
import com.aspose.slides.internal.i3.v4;
import com.aspose.slides.internal.i3.w1;
import com.aspose.slides.internal.o4.m3;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.q6.s7;
import com.aspose.slides.internal.q6.x8;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class k5 extends l6 {
   public k5(t4 var1) {
      super(var1);
   }

   public com.aspose.slides.internal.y6.l6 n5() {
      com.aspose.slides.internal.m0.n5 var1 = new com.aspose.slides.internal.m0.n5();
      i1 var2 = new i1();
      f2 var3 = new f2();
      long var4 = this.k5().getPosition();
      i1[] var6 = new i1[]{var2};
      boolean var7 = !var3.n5(var6, this.k5());
      var2 = var6[0];
      if (var7) {
         this.k5().seek(var4, 0);
      } else {
         y2 var8 = var2.l6().u9().n3();
         if (var8.t2() != 0 && var8.l6() != 0) {
            var1.n5(var2);
         }
      }

      w1 var26 = new w1();
      j5 var9 = new j5();
      w1[] var10 = new w1[]{var26};
      boolean var11 = !var9.n5(var10, this.k5());
      var26 = var10[0];
      if (var11) {
         throw new com.aspose.slides.internal.p5.k5();
      }

      var1.n5(var26);
      s7 var12 = new s7();

      while (this.k5().getPosition() < (((var1.x8().u3() & 4294967295L) * 2L & 4294967295L) + (var1.n3() != null ? var1.n3().u9() : 0) & 4294967295L)) {
         v4 var13 = new v4();
         long var14 = this.k5().getPosition();

         try {
            v4[] var16 = new v4[]{var13};
            boolean var17 = !com.aspose.slides.internal.o6.l6.n5(var16, this.k5());
            var13 = var16[0];
            if (var17) {
               throw new com.aspose.slides.internal.p5.l6("Unable to read wmf records");
            }
         } catch (RuntimeException var24) {
            break;
         }

         com.aspose.slides.internal.o6.l6 var30 = com.aspose.slides.internal.o6.k5.n5(var13.t9());
         v4[] var31 = new v4[]{var13};
         boolean var18 = var30.l6(var31, this.k5());
         var13 = var31[0];
         if (var18) {
            x8 var19 = com.aspose.slides.internal.v6g.k5.n5(var13, x8.class);
            if (var19 != null) {
               var12.n5(var19);
               if (var12.n5()) {
                  var1.n5().l6(var12);
                  var12 = new s7();
               }
            }

            var1.n5().l6(var13);
         } else {
            com.aspose.slides.internal.f8y.n5.k5(d1.n5(new String[]{"***Error***: Failed to read wmf record. Type:", s3.n5(m3.class, var13.t9())}));
         }

         if (var13.t9() != 0) {
            long var20 = (int)(this.k5().getPosition() - var14);
            long var22 = ((var13.e2() & 4294967295L) * 2L & 4294967295L) - var20;
            if (var22 > 0L) {
               this.k5().seek(var22, 1);
            } else if (var22 < 0L) {
               throw new com.aspose.slides.internal.p5.n5("Readed more bytes than the record size.");
            }

            if (this.k5().getPosition() + 6L <= (((var1.x8().u3() & 4294967295L) * 2L & 4294967295L) + (var1.n3() != null ? var1.n3().u9() : 0) & 4294967295L)) {
               continue;
            }
         }
         break;
      }

      return var1;
   }

   public boolean l6() {
      boolean var1 = true;
      long var2 = this.k5().getPosition();

      try {
         i1 var4 = new i1();
         f2 var5 = new f2();
         i1[] var6 = new i1[]{var4};
         boolean var7 = !var5.n5(var6, this.k5());
         var4 = var6[0];
         if (var7) {
            this.k5().seek(var2, 0);
         }

         w1 var8 = new w1();
         j5 var9 = new j5();
         w1[] var10 = new w1[]{var8};
         boolean var11 = !var9.n5(var10, this.k5());
         var8 = var10[0];
         if (var11) {
            var1 = false;
         }
      } finally {
         this.k5().seek(var2, 0);
      }

      return var1;
   }
}
