package com.aspose.slides.internal.o9n;

import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.o0;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

class n5$n5 implements com.aspose.slides.internal.b8u.e2 {
   protected final com.aspose.slides.internal.b8u.x8 n5;
   protected final n5$n5$n5 l6;

   public n5$n5(n5 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, y2 var4) {
      this.n5 = var3;
      int var5 = com.aspose.slides.internal.o9n.n5.n5(var1) ? com.aspose.slides.internal.o9n.n5.l6(var1) : var1.u9();
      int var6 = var1.s7();
      com.aspose.slides.internal.r2q.u9 var7 = new com.aspose.slides.internal.r2q.u9(
         var2, var1.c8(), var1.h0(), com.aspose.slides.internal.o9n.n5.k5(var1), com.aspose.slides.internal.o9n.n5.u3(var1), var6
      );
      int var8 = var7.u3(var4.x8());
      com.aspose.slides.internal.r2q.u3 var9 = new com.aspose.slides.internal.r2q.u3(var4.n3(), var1.u9(), var8, var1.c8().y2() == 0);
      d2 var10 = com.aspose.slides.internal.o9n.n5.a6(var1);
      switch (var1.t2()) {
         case 2:
            this.l6 = new n5$n5$u9(var5, var7, var9, var10, var4.n3());
            break;
         case 3:
            long var11 = var1.c8().b3();
            if ((var11 & 2L) == 2L) {
               throw new com.aspose.slides.internal.h6t.u3("Uncompressed mode is not supported for CcittFax3.");
            }

            if ((var11 & 1L) == 1L) {
               this.l6 = new n5$n5$u3(var5, var7, var9, var10, var4.n3());
            } else {
               this.l6 = new n5$n5$k5(var5, var7, var9, var10, var4.n3());
            }
            break;
         case 4:
            this.l6 = new n5$n5$a6(var5, var7, var9, var10, var4.n3());
            break;
         default:
            throw new com.aspose.slides.internal.h6t.u3(
               d1.n5(new String[]{"The compression ", s3.n5(com.aspose.slides.internal.w2a.a6.class, var1.t2()), " is not supported"})
            );
      }
   }

   @Override
   public void n5(y2 var1) {
      int var2 = var1.t2() * var1.l6();
      if (com.aspose.slides.internal.o9n.n5.x8() > 0 && var2 > com.aspose.slides.internal.o9n.n5.x8()) {
         throw new OutOfMemoryException();
      }

      int[] var3 = this.l6.n5(var1.n3());
      n5$n5$c8 var4 = new n5$n5$c8(var3, this.n5, var1.n3());
      o0.n5(var1.n3(), var4);
   }
}
