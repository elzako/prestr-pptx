package com.aspose.slides.internal.k3;

import com.aspose.slides.internal.b9.o5;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.w9.h2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.x8;

public class n5 extends l6 {
   public n5(t4 var1) {
      super(var1);
   }

   public com.aspose.slides.internal.y6.l6 n5() {
      com.aspose.slides.internal.d9.n5 var1 = new com.aspose.slides.internal.d9.n5();
      var1.n5().clear();
      var1.n5(new com.aspose.slides.internal.p9.n5());
      s9 var2 = new s9(var1);
      com.aspose.slides.internal.j6.n5.n5(var2, this.k5());
      s9[] var3 = new s9[]{var2};
      h2.n5(var3, this.k5());
      var2 = var3[0];
      if (((o5)var2).n5().q0()) {
         var1.n5().l6(var2);
         var1.n5((o5)var2);
         long var4 = (var1.x8().n5().s7() & 4294967295L) - 1L & 4294967295L;

         for (int var6 = 0; var6 < (var4 & 4294967295L); var6++) {
            s9 var7 = new s9(var1);
            long var8 = this.k5().getPosition();
            if (com.aspose.slides.internal.j6.n5.n5(var7, this.k5())) {
               s9[] var10 = new s9[]{var7};
               boolean var11 = com.aspose.slides.internal.j6.n5.n5(var10, this.k5());
               var7 = var10[0];
               if (var11) {
                  var1.n5().l6(var7);
               }

               int var12 = (int)(this.k5().getPosition() - var8);
               int var13 = var7.y2() - var12;
               if (var13 > 0) {
                  this.k5().seek(var13, 1);
               } else if (var13 < 0) {
                  throw new com.aspose.slides.internal.p5.n5("Readed more bytes than the record size.");
               }
            }
         }
      }

      return var1;
   }

   public boolean l6() {
      long var1 = this.k5().getPosition();
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(this.k5());
      byte[] var4 = var3.c8(64);
      this.k5().seek(var1, 0);
      return x8.l6(var4, 0) == 1L && x8.l6(var4, 40) == 1179469088L;
   }
}
