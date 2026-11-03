package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;

@j3
public class t9 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;
   private int h0;
   private int c8;
   private static final int[] t2 = new int[]{4, 5, 4, 5, 2, 3, 6, 7};

   public t9() {
      this.a6 = 1.0F;
      this.n5 = 1.0F;
   }

   public t9(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5 = var1;
      this.u3 = var2;
      this.l6 = var3;
      this.a6 = var4;
      this.k5 = var5;
      this.u9 = var6;
      this.h0();
   }

   @Override
   public int hashCode() {
      long var1 = n1.n5(this.n5);
      var1 = var1 * 31L + n1.n5(this.l6);
      var1 = var1 * 31L + n1.n5(this.k5);
      var1 = var1 * 31L + n1.n5(this.u3);
      var1 = var1 * 31L + n1.n5(this.a6);
      var1 = var1 * 31L + n1.n5(this.u9);
      return (int)var1 ^ (int)(var1 >> 32);
   }

   @Override
   public boolean equals(Object obj) {
      return com.aspose.slides.internal.v6g.k5.l6(obj, t9.class) && n5(this, (t9)obj);
   }

   public static boolean n5(t9 var0, t9 var1) {
      if (j8.l6(var0, var1)) {
         return true;
      } else {
         return j8.l6(null, var0)
            ? false
            : var0.n5 == var1.n5 && var0.u3 == var1.u3 && var0.l6 == var1.l6 && var0.a6 == var1.a6 && var0.k5 == var1.k5 && var0.u9 == var1.u9;
      }
   }

   public float n5() {
      return this.n5;
   }

   public float l6() {
      return this.u3;
   }

   public float k5() {
      return this.l6;
   }

   public float u3() {
      return this.a6;
   }

   public float a6() {
      return this.k5;
   }

   public float u9() {
      return this.u9;
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, {1}, {2}, {3}, {4}, {5}",
         com.aspose.slides.internal.v6g.k5.n5(this.n5),
         com.aspose.slides.internal.v6g.k5.n5(this.u3),
         com.aspose.slides.internal.v6g.k5.n5(this.l6),
         com.aspose.slides.internal.v6g.k5.n5(this.a6),
         com.aspose.slides.internal.v6g.k5.n5(this.k5),
         com.aspose.slides.internal.v6g.k5.n5(this.u9)
      );
   }

   private void h0() {
      if (this.l6 == 0.0F && this.u3 == 0.0F) {
         if (this.n5 == 1.0F && this.a6 == 1.0F) {
            if (this.k5 == 0.0F && this.u9 == 0.0F) {
               this.h0 = 0;
               this.c8 = 0;
            } else {
               this.h0 = 1;
               this.c8 = 1;
            }
         } else if (this.k5 == 0.0F && this.u9 == 0.0F) {
            this.h0 = 2;
            this.c8 = -1;
         } else {
            this.h0 = 3;
            this.c8 = -1;
         }
      } else if (this.n5 == 0.0F && this.a6 == 0.0F) {
         if (this.k5 == 0.0F && this.u9 == 0.0F) {
            this.h0 = 4;
            this.c8 = -1;
         } else {
            this.h0 = 5;
            this.c8 = -1;
         }
      } else if (this.k5 == 0.0F && this.u9 == 0.0F) {
         this.h0 = 6;
         this.c8 = -1;
      } else {
         this.h0 = 7;
         this.c8 = -1;
      }
   }
}
