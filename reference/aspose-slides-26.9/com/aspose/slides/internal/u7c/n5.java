package com.aspose.slides.internal.u7c;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.y5s.a6;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.l6;
import com.aspose.slides.internal.y5s.m3;
import com.aspose.slides.internal.y5s.n3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public final class n5 extends m3 {
   private static int n5;
   private final int l6;
   private final int k5;
   private byte[] u3;
   private int[] a6;

   public n5(int var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
      this.q0();
      this.n5(new n5$n5(this));
   }

   @Override
   public int t9() {
      return this.l6;
   }

   @Override
   public int n3() {
      return this.k5;
   }

   @Override
   public boolean u3() {
      throw new NotImplementedException();
   }

   @Override
   public void a6() {
      throw new NotImplementedException();
   }

   @Override
   protected void l6(t4 var1) {
      throw new NotImplementedException();
   }

   @Override
   protected void n5(j5 var1, int[] var2) {
      n3.n5(var1.n3(), var2, this.l6, this.k5).n5(var1);
      int var3 = var1.h0();
      int var4 = var1.t2();
      int var5 = var1.c8();
      int var6 = var1.a6();
      int var7 = var1.u9();
      if (var3 == 0 && var4 == this.l6) {
         if (this.a6 != null) {
            int var20 = var4 * var7;
            int var25 = var5 * var4;
            System.arraycopy(var2, 0, this.a6, var25, var20);
         } else if (this.u3 != null) {
            int var21 = var4 * var7;
            int var26 = var5 * var4 * 4;

            for (int var29 = 0; var29 < var21; var29++) {
               int var32 = var2[var29];
               com.aspose.slides.internal.y5s.l6.n5(var32, this.u3, var26);
               var26 += 4;
            }
         } else {
            int var22 = var4 * var7;
            int var27 = var22 * 4;
            byte[] var30 = com.aspose.slides.internal.y5s.n5.n5(var27);
            int var33 = var30.length / 4 * 4;
            if (var33 == 0) {
               throw new OutOfMemoryException("The buffer allocated is too small to continue partial saving.");
            }

            int var35 = var5 * var4 * 4;
            int var36 = 0;

            while (var27 > 0) {
               int var37 = q1.l6(var33, var27);

               for (int var38 = 0; var38 < var37; var38 += 4) {
                  int var39 = var2[var36++];
                  com.aspose.slides.internal.y5s.l6.n5(var39, var30, var38);
               }

               this.k5().n5(var35, 0);
               this.k5().l6(var30, 0, var37);
               var35 += var37;
               var27 -= var37;
            }
         }
      } else if (this.a6 != null) {
         int var8 = var5 * this.l6 + var3;

         for (int var9 = 0; var9 < var7; var9++) {
            System.arraycopy(var2, var9 * var6, this.a6, var8, var6);
            var8 += this.l6;
         }
      } else if (this.u3 != null) {
         int var18 = 0;

         for (int var23 = 0; var23 < var7; var23++) {
            int var10 = ((var5 + var23) * this.l6 + var3) * 4;

            for (int var11 = 0; var11 < var6; var11++) {
               int var12 = var2[var18++];
               com.aspose.slides.internal.y5s.l6.n5(var12, this.u3, var10);
               var10 += 4;
            }
         }
      } else {
         int var19 = var6 * 4;
         byte[] var24 = com.aspose.slides.internal.y5s.n5.n5(var19);
         int var28 = var24.length / 4 * 4;
         if (var28 == 0) {
            throw new OutOfMemoryException("The buffer allocated is too small to continue partial saving.");
         }

         int var31 = 0;

         for (int var34 = 0; var34 < var7; var34++) {
            int var13 = var19;
            int var14 = ((var5 + var34) * this.l6 + var3) * 4;

            while (var13 > 0) {
               int var15 = q1.l6(var13, var28);

               for (int var16 = 0; var16 < var15; var16 += 4) {
                  int var17 = var2[var31++];
                  com.aspose.slides.internal.y5s.l6.n5(var17, var24, var16);
               }

               this.k5().n5(var14, 0);
               this.k5().l6(var24, 0, var15);
               var14 += var15;
               var13 -= var15;
            }
         }
      }
   }

   private void q0() {
      int var1 = this.l6 * this.k5;
      if (com.aspose.slides.internal.y5s.a6.u3() == 1) {
         int var2 = var1 * 4;
         this.n5(com.aspose.slides.internal.y5s.a6.n5(var2));
      } else {
         try {
            if (n5 != 0) {
               throw new OutOfMemoryException();
            }

            this.a6 = new int[var1];
         } catch (OutOfMemoryError var5) {
         }

         if (this.a6 == null) {
            int var6 = var1 * 4;

            try {
               if (n5 != 1) {
                  throw new OutOfMemoryException();
               }

               this.u3 = new byte[var6];
            } catch (OutOfMemoryError var4) {
            }

            if (this.u3 == null) {
               this.n5(com.aspose.slides.internal.y5s.a6.n5(var6));
            }
         }
      }
   }

   // $VF: synthetic method
   static int n5(n5 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int[] l6(n5 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static byte[] k5(n5 var0) {
      return var0.u3;
   }
}
