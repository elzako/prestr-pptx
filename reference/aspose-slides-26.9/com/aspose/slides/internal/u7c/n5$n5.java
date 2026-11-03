package com.aspose.slides.internal.u7c;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.j3b.s7;
import com.aspose.slides.internal.j3b.u3;
import com.aspose.slides.internal.j3b.u9;
import com.aspose.slides.internal.y5s.c4;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.l6;
import com.aspose.slides.internal.y5s.z3;
import com.aspose.slides.internal.y5s.z8;
import com.aspose.slides.ms.System.q1;

class n5$n5 implements s7 {
   private final n5 n5;

   public n5$n5(n5 var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5() {
      return false;
   }

   @Override
   public z8 l6() {
      throw new NotImplementedException();
   }

   @Override
   public void n5(j5 var1, u9 var2) {
      int var3 = var1.a6() * var1.u9();
      if (com.aspose.slides.internal.y5s.u9.n5() > 0 && var3 > com.aspose.slides.internal.y5s.u9.n5()) {
         throw new OutOfMemoryException();
      }

      int var4 = var1.h0();
      int var5 = var1.t2();
      int var6 = var1.c8();
      int var7 = var1.s7();
      int var8 = var1.u9();
      int var9 = var1.a6();
      int[] var10 = new int[var3];
      if (var4 == 0 && var5 == com.aspose.slides.internal.u7c.n5.n5(this.n5)) {
         if (com.aspose.slides.internal.u7c.n5.l6(this.n5) != null) {
            int var24 = var5 * var8;
            int var29 = var6 * var5;
            System.arraycopy(com.aspose.slides.internal.u7c.n5.l6(this.n5), var29, var10, 0, var24);
         } else if (com.aspose.slides.internal.u7c.n5.k5(this.n5) != null) {
            int var25 = var5 * var8;
            int var30 = var6 * var5 * 4;

            for (int var33 = 0; var33 < var25; var33++) {
               int var36 = l6.n5(com.aspose.slides.internal.u7c.n5.k5(this.n5), var30);
               var10[var33] = var36;
               var30 += 4;
            }
         } else {
            int var26 = var5 * var8;
            int var31 = var26 * 4;
            byte[] var34 = com.aspose.slides.internal.y5s.n5.n5(var31);
            int var37 = var34.length / 4 * 4;
            if (var37 == 0) {
               throw new OutOfMemoryException("The buffer allocated is too small to continue partial loading.");
            }

            int var39 = var6 * var5 * 4;
            int var40 = 0;

            while (var31 > 0) {
               int var41 = q1.l6(var31, var37);
               this.n5.k5().n5(var39, 0);
               if (this.n5.k5().n5(var34, 0, var41) != var41) {
                  throw new com.aspose.slides.internal.d9m.l6("Cannot read the cached color data. Cannot continue execution.");
               }

               var37 = var41;
               var39 += var41;
               var31 -= var41;

               for (int var42 = 0; var42 < var37; var42 += 4) {
                  int var43 = l6.n5(var34, var42);
                  var10[var40++] = var43;
               }
            }
         }
      } else if (com.aspose.slides.internal.u7c.n5.l6(this.n5) != null) {
         int var11 = var6 * com.aspose.slides.internal.u7c.n5.n5(this.n5) + var4;

         for (int var12 = 0; var12 < var8; var12++) {
            System.arraycopy(com.aspose.slides.internal.u7c.n5.l6(this.n5), var11, var10, var12 * var9, var9);
            var11 += com.aspose.slides.internal.u7c.n5.n5(this.n5);
         }
      } else if (com.aspose.slides.internal.u7c.n5.k5(this.n5) != null) {
         int var22 = 0;

         for (int var27 = 0; var27 < var8; var27++) {
            int var13 = ((var6 + var27) * com.aspose.slides.internal.u7c.n5.n5(this.n5) + var4) * 4;

            for (int var14 = 0; var14 < var9; var14++) {
               int var15 = l6.n5(com.aspose.slides.internal.u7c.n5.k5(this.n5), var13);
               var10[var22++] = var15;
               var13 += 4;
            }
         }
      } else {
         int var23 = var9 * 4;
         byte[] var28 = com.aspose.slides.internal.y5s.n5.n5(var23);
         int var32 = var28.length / 4 * 4;
         if (var32 == 0) {
            throw new OutOfMemoryException("The buffer allocated is too small to continue partial loading.");
         }

         int var35 = 0;

         for (int var38 = 0; var38 < var8; var38++) {
            int var16 = var32;
            int var17 = ((var6 + var38) * com.aspose.slides.internal.u7c.n5.n5(this.n5) + var4) * 4;
            int var18 = var23;

            while (var18 > 0) {
               int var19 = q1.l6(var18, var16);
               this.n5.k5().n5(var17, 0);
               if (this.n5.k5().n5(var28, 0, var19) != var19) {
                  throw new com.aspose.slides.internal.d9m.l6("Cannot read the cached color data. Cannot continue execution.");
               }

               var17 += var19;
               var18 -= var19;
               var16 = var19;

               for (int var20 = 0; var20 < var16; var20 += 4) {
                  int var21 = l6.n5(var28, var20);
                  var10[var35++] = var21;
               }
            }
         }
      }

      if (this.n5.y4() != null) {
         this.n5(var10);
      }

      var2.n5(var1.n3(), var10, var1.l6().u3(), new z3(var5, var7));
   }

   @Override
   public void n5(j5 var1, z8 var2, c8 var3) {
      throw new NotImplementedException();
   }

   private void n5(int[] var1) {
      u3 var2 = this.n5.y4();
      c4 var3 = new c4(var2);

      for (int var4 = 0; var4 < var1.length; var4++) {
         var1[var4] = var2.l6(var3.n5(var1[var4]));
      }
   }
}
