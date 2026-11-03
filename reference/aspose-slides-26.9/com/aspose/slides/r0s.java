package com.aspose.slides;

class r0s {
   float n5 = 1.0F;
   float l6;
   float k5;
   float u3;
   public static final r0s a6 = new r0s(0.0F, 0.0F, 0.0F);
   public static final r0s u9 = new r0s(1.0F, 1.0F, 1.0F);

   public r0s(float var1, float var2, float var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   public r0s(float var1, float var2, float var3, float var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public r0s(r0s var1) {
      if (var1 != null) {
         this.n5 = var1.n5;
         this.l6 = var1.l6;
         this.k5 = var1.k5;
         this.u3 = var1.u3;
      } else {
         this.l6 = this.k5 = this.u3 = 0.0F;
         this.n5 = 1.0F;
      }
   }

   public r0s(com.aspose.slides.internal.o9b.c8 var1) {
      if (!var1.t2()) {
         this.n5 = (var1.s7() & 0xFF) / 255.0F;
         this.l6 = (var1.x8() & 0xFF) / 255.0F;
         this.k5 = (var1.n3() & 0xFF) / 255.0F;
         this.u3 = (var1.y4() & 0xFF) / 255.0F;
      } else {
         this.l6 = this.k5 = this.u3 = 0.0F;
         this.n5 = 1.0F;
      }
   }

   public final void n5(float var1, float var2, float var3) {
      if (var2 < 1.0E-4) {
         this.l6 = this.k5 = this.u3 = var3;
      } else {
         float var4 = var3 < 0.5 ? var3 * (1.0F + var2) : var3 * (1.0F - var2) + var2;
         float var5 = 2.0F * var3 - var4;
         this.l6 = k5(u3(var5, var4, var1 + 120.0F), 0.0F, 1.0F);
         this.k5 = k5(u3(var5, var4, var1), 0.0F, 1.0F);
         this.u3 = k5(u3(var5, var4, var1 - 120.0F), 0.0F, 1.0F);
      }
   }

   public static r0s l6(float var0, float var1, float var2) {
      r0s var3 = new r0s(0.0F, 0.0F, 0.0F);
      var3.n5(var0, var1, var2);
      return var3;
   }

   public final com.aspose.slides.internal.o9b.c8 n5() {
      return !com.aspose.slides.ms.System.n1.k5(this.l6)
            && !com.aspose.slides.ms.System.n1.k5(this.k5)
            && !com.aspose.slides.ms.System.n1.k5(this.u3)
            && !com.aspose.slides.ms.System.n1.k5(this.n5)
         ? com.aspose.slides.internal.o9b.c8.n5(
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(l6(this.n5) * 255.0F), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(l6(this.l6) * 255.0F), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(l6(this.k5) * 255.0F), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(l6(this.u3) * 255.0F), 14)
         )
         : com.aspose.slides.internal.o9b.c8.u3.o8();
   }

   public final boolean n5(r0s var1) {
      return var1 != null && this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null || com.aspose.slides.ms.System.j8.n5(this) != com.aspose.slides.ms.System.j8.n5(obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : this.n5((r0s)obj);
      }
   }

   private static int n5(float var0) {
      return var0 == 0.0F ? 0 : (int)var0;
   }

   @Override
   public int hashCode() {
      return n5(this.n5) ^ n5(this.l6) ^ n5(this.k5) ^ n5(this.u3);
   }

   private static float l6(float var0) {
      if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   private static float u3(float var0, float var1, float var2) {
      if (var2 < 0.0F) {
         var2 += 360.0F;
      }

      if (var2 >= 360.0F) {
         var2 -= 360.0F;
      }

      if (var2 < 180.0F) {
         return var2 < 60.0F ? var0 + (var1 - var0) * var2 / 60.0F : var1;
      } else {
         return var2 < 240.0F ? var0 + (var1 - var0) * (240.0F - var2) / 60.0F : var0;
      }
   }

   public static float k5(float var0, float var1, float var2) {
      if (var0 < var1) {
         var0 = var1;
      }

      if (var0 > var2) {
         var0 = var2;
      }

      return var0;
   }
}
