package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.OverflowException;

public class s0 implements com.aspose.slides.internal.b8u.x8 {
   private int[] l6;
   com.aspose.slides.internal.o9b.y2 n5 = new com.aspose.slides.internal.o9b.y2();

   public s0(com.aspose.slides.internal.o9b.y2 var1) {
      var1.u3(this.n5);
   }

   public final int[] n5() {
      return this.l6;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      if (var1.equals(this.n5.n3())) {
         this.l6 = var2;
      } else {
         com.aspose.slides.internal.o9b.y2 var5 = com.aspose.slides.internal.o9b.y2.n5(this.n5.n3(), var1.n3()).n3();
         if (var5.t2() > 0 && var5.l6() > 0) {
            if (this.l6 == null) {
               try {
                  this.l6 = new int[(int)((long)this.n5.t2() * this.n5.l6())];
               } catch (OutOfMemoryError var11) {
                  throw new com.aspose.slides.internal.z3b.k5("Cannot allocate so many bytes. Use LoadPartialPixels instead.");
               } catch (OverflowException var12) {
                  throw new com.aspose.slides.internal.z3b.k5("Cannot allocate so many bytes. Use LoadPartialPixels instead.");
               }
            }

            int var6 = (var5.c8() - var1.c8()) * var1.t2();
            int var7 = (var5.c8() - this.n5.c8()) * this.n5.t2();
            if (var1.u3() == this.n5.u3() && var1.u9() == this.n5.u9()) {
               System.arraycopy(var2, var6, this.l6, var7, var5.t2() * var5.l6());
            } else {
               var6 += var5.u3() - var1.u3();
               var7 += var5.u3() - this.n5.u3();
               int var8 = var1.t2();
               int var9 = this.n5.t2();

               for (int var10 = 0; var10 < var5.l6(); var10++) {
                  System.arraycopy(var2, var6, this.l6, var7, var5.t2());
                  var6 += var8;
                  var7 += var9;
               }
            }
         }
      }
   }
}
