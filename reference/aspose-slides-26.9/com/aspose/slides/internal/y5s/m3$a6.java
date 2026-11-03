package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.OverflowException;

class m3$a6 implements com.aspose.slides.internal.j3b.u9 {
   private int[] n5;
   private j5 l6 = new j5();

   public m3$a6(j5 var1) {
      var1.n5(this.l6);
   }

   public int[] n5() {
      return this.n5;
   }

   @Override
   public void n5(j5 var1, int[] var2, z3 var3, z3 var4) {
      if (var1.equals(com.aspose.slides.internal.v6g.k5.n5(this.l6))) {
         this.n5 = var2;
      } else {
         j5 var5 = j5.n5(this.l6.n3(), var1.n3()).n3();
         if (var5.a6() > 0 && var5.u9() > 0) {
            if (this.n5 == null) {
               try {
                  this.n5 = new int[(int)((long)this.l6.a6() * this.l6.u9())];
               } catch (OutOfMemoryError var12) {
                  throw new com.aspose.slides.internal.d9m.n5("Cannot allocate so many bytes. Use LoadPartialPixels instead.");
               } catch (OverflowException var13) {
                  throw new com.aspose.slides.internal.d9m.n5("Cannot allocate so many bytes. Use LoadPartialPixels instead.");
               }
            }

            if (var1.h0() == this.l6.h0() && var1.t2() == this.l6.t2()) {
               int var14 = 0;
               int var15 = (var1.c8() - this.l6.c8()) * this.l6.a6();
               if (var15 < 0) {
                  var14 = var15 * -1;
                  var15 = 0;
               }

               System.arraycopy(var2, var14, this.n5, var15, var5.a6() * var5.u9());
            } else {
               int var6 = 0;
               int var7 = var1.c8() - this.l6.c8();
               if (var7 < 0) {
                  var6 = (this.l6.c8() - var1.c8()) * var1.a6();
                  var7 = 0;
               }

               int var8 = var1.h0() - this.l6.h0();
               if (var8 < 0) {
                  var6 += var8 * -1;
                  var8 = 0;
               }

               for (int var9 = 0; var9 < var5.u9(); var9++) {
                  int var10 = var6 + var9 * var1.a6();
                  int var11 = var7++ * this.l6.a6() + var8;
                  System.arraycopy(var2, var10, this.n5, var11, var5.a6());
               }
            }
         }
      }
   }
}
