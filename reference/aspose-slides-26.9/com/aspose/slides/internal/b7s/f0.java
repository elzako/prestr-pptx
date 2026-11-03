package com.aspose.slides.internal.b7s;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class f0 implements com.aspose.slides.internal.b8u.t9 {
   private final y0 n5;
   private com.aspose.slides.internal.g7e.n5 l6;
   private final com.aspose.slides.internal.r1x.v4 k5;
   private com.aspose.slides.internal.l3e.k5 u3;
   private int a6;
   private int u9 = 0;
   private int h0 = 0;
   private com.aspose.slides.internal.o9b.y2 c8 = new com.aspose.slides.internal.o9b.y2();
   private boolean t2 = false;
   private boolean s7 = false;
   private boolean x8 = false;
   private int n3 = 0;
   private com.aspose.slides.internal.e8b.k5 y4;

   public f0(
      y0 var1,
      com.aspose.slides.internal.g7e.n5 var2,
      com.aspose.slides.internal.o9b.y2 var3,
      com.aspose.slides.internal.r1x.v4 var4,
      com.aspose.slides.internal.l3e.k5 var5,
      int var6,
      com.aspose.slides.internal.e8b.k5 var7
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var4;
      this.a6 = 0;
      var3.u3(this.c8);
      this.n3 = var6;
      this.y4 = var7;
      if (this.l6 == null) {
         this.l6 = new com.aspose.slides.internal.g7e.n5();
      }

      this.u3 = var5;
   }

   public final com.aspose.slides.internal.e8b.k5 n5() {
      return this.y4 != null ? this.y4.l6() : null;
   }

   public final int l6() {
      return this.n3;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, byte[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      int var5 = this.c8.t2() * this.c8.l6();
      int var6 = this.c8.t2() * this.u3.l6() * 8;
      int var7 = this.u3.k5().x8() * 8;
      int var8 = 0;
      int var9 = var1.c8() * var7;
      short[][] var10 = this.u3.u3();
      int[] var11 = this.k5.m1();
      int var12 = this.k5.z3();
      int var13 = 0;
      int var14 = this.a6;

      for (int var15 = var1.c8(); var15 < var1.n5(); var15++) {
         for (int var16 = var1.u3(); var16 < var1.u9(); var16++) {
            int var17 = var9 + var16 - this.u9;

            for (int var18 = 0; var18 < var12; var18++) {
               if (var11[var18] == 8) {
                  var10[var18][var17] = (short)(var2[var8++] & 0xFF);
               } else {
                  if (var11[var18] != 12) {
                     throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                  }

                  var10[var18][var17] = (short)((var2[var8++] & 255) << 4);
               }
            }

            var14++;
            if (var14 % var6 == 0 || var14 == var5) {
               this.a6 = var14;
               this.n5(true);
               var13++;
               this.u9 = this.u9 + this.u3.k5().x8() * this.u3.l6() * 64;
            }
         }

         var9 += var7;
      }

      this.a6 = var14;
      if (var13 < 2 && com.aspose.slides.internal.o9b.y2.k5(var1, this.c8)) {
         short[][] var23 = new short[this.u3.u3().length][];
         System.arraycopy(this.u3.u3(), 0, var23, 0, var23.length);
         List var24 = null;
         boolean var25 = this.k5();
         if (this.n3 == 1) {
            var24 = this.u3.n5();
         }

         com.aspose.slides.internal.g7e.n5 var26 = this.u3.h0();
         y0 var19 = this.u3.k5().c8().n5();
         this.u3.dispose();

         for (this.u3 = null; var25; this.u3 = null) {
            this.a6 = 0;
            this.u9 = 0;
            this.h0 = 0;
            this.s7 = false;
            this.u3 = new com.aspose.slides.internal.l3e.k5(var1.n3(), var26, var19, this.k5, this.n3, var24);

            try {
               this.u3.n5(var23);
               this.a6 = var1.t2() * var1.l6();
               this.t2 = false;
               this.n5(false);
               this.u9 = this.u3.k5().x8() * this.u3.l6() * 64;
               var25 = this.k5();
               if (this.n3 == 1) {
                  var24 = this.u3.n5();
               }

               if (var25) {
                  var23 = new short[this.u3.u3().length][];
                  System.arraycopy(this.u3.u3(), 0, var23, 0, var23.length);
               }
            } finally {
               if (this.u3 != null) {
                  this.u3.dispose();
               }
            }
         }
      }
   }

   private boolean k5() {
      if (this.n3 == 2) {
         boolean var1 = com.aspose.slides.internal.l3e.k5.n5(this.u3.h0());
         this.n3 = var1 ? 0 : 1;
      } else if (this.n3 == 0) {
         this.n3 = 1;
      } else if (this.n3 == 1) {
         return false;
      }

      return true;
   }

   public final void n5(boolean var1) {
      if (!this.t2) {
         int var2 = this.c8.l6();
         int var3 = this.h0 + this.u3.l6() * 8 > var2 ? var2 - this.h0 : this.u3.l6();
         if (!var1) {
            this.h0 = this.h0 + q1.l6(this.c8.l6(), var3 * 8);
         } else {
            int var4 = q1.l6(this.c8.l6(), this.h0 + var3 * 8);
            int var5 = this.h0;
            int var6 = this.u3.k5().x8() * 8;
            int var7 = var5 * var6 - this.u9 + this.c8.u9();
            int var8 = var5 * var6 + this.c8.u9() - 1 - this.u9;
            int var9 = this.k5.z3();
            short[][] var10 = this.u3.u3();

            for (int var11 = var5; var11 < var4; var11++) {
               for (int var12 = this.c8.u9(); var12 < var6; var12++) {
                  for (int var13 = 0; var13 < var9; var13++) {
                     var10[var13][var7] = var10[var13][var8];
                  }

                  var7++;
               }

               var7 += this.c8.u9();
               var8 += var6;
            }

            this.h0 = this.h0 + q1.l6(this.c8.l6(), var3 * 8);
            if (this.a6 == this.c8.t2() * this.c8.l6()) {
               int var17 = (this.c8.n5() - 1) * 8 * this.u3.k5().x8() - this.u9;
               int var18 = 8 * this.u3.k5().x8();
               int var19 = this.c8.n5() * var18 - this.u9;
               int var14 = this.u3.k5().u3() * 8;

               for (int var15 = this.c8.n5(); var15 < var14; var15++) {
                  for (int var16 = 0; var16 < this.k5.z3(); var16++) {
                     System.arraycopy(this.u3.u3()[var16], var17, this.u3.u3()[var16], var19, var18);
                  }

                  var19 += var18;
               }
            }
         }

         this.u3();
         this.t2 = this.a6 == this.c8.t2() * this.c8.l6();
      }
   }

   private void u3() {
      if (this.n3 == 2 && this.u3.k5().u9().z3() != null) {
         this.y4 = this.u3.x8();
      }

      if (this.u3.k5().u9().z3() != null && this.n3 != 2 && !this.s7) {
         Dictionary var1 = this.u3.k5().h0();
         if (this.y4 != null) {
            var1.clear();

            for (byte var2 = 0; (var2 & 255) < this.y4.n5(); var2++) {
               var1.set_Item(var2, z6.n5(var2, this.y4.n5(var2), 50, true).k5());
            }
         }

         this.s7 = true;
      }

      if (this.n3 == 1 && !this.x8) {
         Dictionary$ValueCollection$Enumerator var6 = this.u3.k5().h0().getValues().iterator();

         try {
            while (var6.hasNext()) {
               z6 var7 = (z6)var6.next();
               z6.n5(this.n5, new z6[]{var7});
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         t4.n5(this.n5, this.u3.k5().a6());
         this.x8 = true;
      }

      if (this.n3 != 2) {
         this.u3.n5(this.n5);
      }
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(z6.class, new a3());
   }
}
