package com.aspose.slides.internal.n8e;

import com.aspose.slides.exceptions.Exception;

public class g7 extends com.aspose.slides.internal.z0k.y1 {
   private com.aspose.slides.internal.z0k.y1 n5;
   private v3[] l6;
   private int k5;
   private char[] u3;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private char[] x8 = new char[1024];

   public g7(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5(new com.aspose.slides.internal.z0k.m3(var1, true), new v3[]{new v3(0, Integer.MAX_VALUE, null)});
   }

   public g7(com.aspose.slides.internal.z0k.t4 var1, j4 var2) {
      this.n5(new com.aspose.slides.internal.z0k.m3(var1, true), var2.n5());
   }

   private void n5(com.aspose.slides.internal.z0k.y1 var1, v3[] var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.u9 = this.h0;
      this.s7 = 0;
      v3 var3 = this.l6[0];
      if (var3.k5 == null && var3.n5 > this.s7) {
         int var4 = var3.n5 - this.s7;

         while (var4 > 0) {
            int var5 = this.n5.n5(this.x8, 0, com.aspose.slides.ms.System.q1.l6(1024, var4));
            if (var5 == 0) {
               this.c8 = this.l6.length;
            }

            var4 -= var5;
         }

         this.s7 = this.t2 = var3.n5;
      }
   }

   @Override
   public void u3() {
      this.n5.u3();
      super.u3();
   }

   @Override
   public int a6() {
      return this.u9 >= this.h0 && !this.l6() ? -1 : this.u3[this.u9];
   }

   @Override
   public int u9() {
      if (this.u9 >= this.h0 && !this.l6()) {
         return -1;
      }

      this.k5++;
      return this.u3[this.u9++];
   }

   @Override
   public int n5(char[] var1, int var2, int var3) {
      if (this.u9 >= this.h0 && !this.l6()) {
         return 0;
      }

      int var4 = 0;
      int var5 = com.aspose.slides.ms.System.q1.l6(var3, this.h0 - this.u9);

      for (int var6 = this.u9 + var5; this.u9 < var6; this.u9++) {
         var1[var2] = this.u3[this.u9];
         var2++;
      }

      var3 -= var5;
      this.k5 += var5;
      var4 += var5;

      while (var3 > 0) {
         if (!this.k5()) {
            return var4;
         }

         v3 var11 = this.l6[this.c8];
         var5 = com.aspose.slides.ms.System.q1.l6(var11.l6 - this.t2, var3);
         if (var11.k5 == null) {
            int var7 = this.n5.n5(var1, var2, var5);
            this.s7 += var7;
            this.k5 += var7;
            this.t2 += var7;
            var4 += var7;
            var3 -= var7;
            var2 += var7;
            if (var7 < var5) {
               return var4;
            }
         } else {
            if (var5 >= 0) {
               System.arraycopy(var11.k5, this.t2 + 0, var1, var2 + 0, var5);
            }

            this.k5 += var5;
            this.t2 += var5;
            var4 += var5;
            var3 -= var5;
            var2 += var5;
         }
      }

      return var4;
   }

   private boolean l6() {
      if (this.u9 == this.h0) {
         boolean var1 = this.k5();
         if (!var1) {
            return false;
         }

         v3 var2 = this.l6[this.c8];
         if (var2.k5 != null) {
            this.u3 = var2.k5;
            this.u9 = var2.n5 + this.t2;
            this.h0 = var2.l6;
            this.t2 = var2.l6;
         } else {
            this.u3 = this.x8;
            this.u9 = 0;
            int var3 = this.n5.n5(this.x8, 0, com.aspose.slides.ms.System.q1.l6(1024, var2.l6 - this.t2));
            if (var3 == 0) {
               this.c8 = this.l6.length;
               this.h0 = this.u9;
               return false;
            }

            this.h0 = this.u9 + var3;
            this.t2 += var3;
            this.s7 += var3;
         }
      }

      return true;
   }

   private boolean k5() {
      if (this.c8 >= this.l6.length) {
         return false;
      }

      v3 var1 = this.l6[this.c8];
      if (this.t2 < var1.l6) {
         return true;
      }

      this.c8++;
      if (this.c8 >= this.l6.length) {
         return false;
      }

      var1 = this.l6[this.c8];
      this.t2 = var1.n5;
      if (var1.k5 == null) {
         if (var1.n5 > this.s7) {
            int var2 = var1.n5 - this.s7;

            while (var2 > 0) {
               int var3 = this.n5.n5(this.x8, 0, com.aspose.slides.ms.System.q1.l6(1024, var2));
               if (var3 == 0) {
                  this.c8 = this.l6.length;
                  return false;
               }

               var2 -= var3;
            }

            this.s7 = var1.n5;
            this.u9 = this.h0 = 0;
         } else if (var1.n5 < this.s7) {
            throw new Exception("Inner error: wrong segment.");
         }
      }

      this.t2 = var1.n5;
      this.u9 = this.h0 = 0;
      return true;
   }

   public final int n5() {
      return this.k5;
   }
}
