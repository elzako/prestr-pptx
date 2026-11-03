package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.d1;

class v8 implements com.aspose.slides.internal.b8u.y4 {
   private long[] n5;
   private final com.aspose.slides.internal.o9b.y2 l6 = new com.aspose.slides.internal.o9b.y2();

   public v8(com.aspose.slides.internal.o9b.y2 var1) {
      var1.u3(this.l6);
   }

   public final com.aspose.slides.internal.o9b.y2 n5() {
      return this.l6;
   }

   public final long[] l6() {
      return this.n5;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      throw new NotSupportedException(d1.n5(new String[]{"The processor ", com.aspose.slides.ms.System.j8.n5(this).q0(), " doesn't work with 32-bit data."}));
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, long[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      if (var1.equals(this.n5().n3())) {
         this.n5 = var2;
      } else {
         com.aspose.slides.internal.o9b.y2 var5 = com.aspose.slides.internal.o9b.y2.n5(this.n5().n3(), var1.n3()).n3();
         if (var5.t2() > 0 && var5.l6() > 0) {
            if (this.n5 == null) {
               try {
                  this.n5 = new long[(int)((long)this.n5().t2() * this.n5().l6())];
               } catch (OutOfMemoryError var11) {
                  throw new com.aspose.slides.internal.z3b.k5("Cannot allocate so many bytes. Use LoadPartialPixels instead.");
               } catch (OverflowException var12) {
                  throw new com.aspose.slides.internal.z3b.k5("Cannot allocate so many bytes. Use LoadPartialPixels instead.");
               }
            }

            int var6 = (var5.c8() - var1.c8()) * var1.t2();
            int var7 = (var5.c8() - this.n5().c8()) * this.n5().t2();
            if (var1.u3() == this.n5().u3() && var1.u9() == this.n5().u9()) {
               System.arraycopy(var2, var6, this.n5, var7, var5.t2() * var5.l6());
            } else {
               var6 += var5.u3() - var1.u3();
               var7 += var5.u3() - this.n5().u3();
               int var8 = var1.t2();
               int var9 = this.n5().t2();

               for (int var10 = 0; var10 < var5.l6(); var10++) {
                  System.arraycopy(var2, var6, this.n5, var7, var5.t2());
                  var6 += var8;
                  var7 += var9;
               }
            }
         }
      }
   }
}
