package com.aspose.slides.internal.r3;

import com.aspose.slides.internal.q7.c8;
import com.aspose.slides.internal.q7.h0;
import com.aspose.slides.internal.q7.l6$n5;
import com.aspose.slides.internal.q7.y4;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class n5 implements c8 {
   private final l6$n5 n5;
   private final t4 l6;
   private final com.aspose.slides.internal.q7.u3 k5;
   private c8 u3;

   public n5(t4 var1, com.aspose.slides.internal.q7.u3 var2, l6$n5 var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.n5 = var3;
   }

   @Override
   public final byte[] n5() {
      if (this.u3 == null) {
         byte[] var1 = com.aspose.slides.internal.q7.n5.n5(this.l6, this.k5.u3());
         this.u3 = h0.n5(var1);
         return this.u3.n5();
      } else {
         return this.u3.n5();
      }
   }

   @Override
   public final t4 l6() {
      this.u3();
      return this.u3.l6();
   }

   @Override
   public final long k5() {
      return this.u3 == null ? 0L : this.u3.k5();
   }

   @Override
   public final void dispose() {
      if (this.u3 != null) {
         this.u3.dispose();
         this.u3 = null;
      }
   }

   public final void u3() {
      if (this.u3 == null) {
         byte[] var1 = null;
         boolean var2 = this.n5.n5(this, this.k5.l6());
         byte[][] var3 = new byte[][]{var1};
         boolean var4 = var2 && this.n5(this.k5.l6(), var3);
         var1 = var3[0];
         if (var4) {
            this.u3 = h0.n5(var1);
         } else {
            a6 var5 = new a6(this.k5, this.l6, var1);

            try {
               var5.u3();
               this.u3 = var5;
            } catch (y4 var7) {
               var5.dispose();
               this.k5.k5().n5(var7.toString());
               if (!var2) {
                  throw new RuntimeException(var7.getInnerException());
               }

               this.u3 = this.n5(var1, this.l6);
            } catch (RuntimeException var8) {
               var5.dispose();
               throw var8;
            }
         }
      }
   }

   private c8 n5(byte[] var1, t4 var2) {
      e2 var3 = new e2();

      try {
         if (var1 != null) {
            var3.write(var1, 0, var1.length);
         }

         byte[] var4 = com.aspose.slides.internal.q7.n5.n5(var2, this.k5.u3());
         var3.write(var4, 0, var4.length);
         return h0.n5(var3.toArray());
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private boolean n5(long var1, byte[][] var3) {
      var3[0] = null;
      long var4 = var1 < this.k5.u3() ? var1 : this.k5.u3();
      if (var4 == 0L) {
         return false;
      }

      e2[] var6 = new e2[]{new e2()};

      try {
         boolean var7 = com.aspose.slides.internal.q7.n5.n5(this.l6, new n5$1(this, var6, var1), this.k5.u3());
         var3[0] = var6[0].toArray();
         return var7;
      } finally {
         if (var6[0] != null) {
            var6[0].dispose();
         }
      }
   }
}
