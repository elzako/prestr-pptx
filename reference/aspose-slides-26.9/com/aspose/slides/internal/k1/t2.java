package com.aspose.slides.internal.k1;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;

public class t2 extends com.aspose.slides.internal.y6.u3 {
   private k5 n5;
   private byte[] l6;
   private byte[] k5;

   public final k5 n5() {
      return this.n5;
   }

   public final void n5(k5 var1) {
      this.n5 = var1;
   }

   public final int l6() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5(), u3.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.n5(), u3.class).u3() & 65535;
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5(), a6.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.n5(), a6.class).u3();
      } else {
         throw new ArgumentException("Unknown Header type.");
      }
   }

   public final int k5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5(), u3.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.n5(), u3.class).u9() & 65535;
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5(), a6.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.n5(), a6.class).u9();
      } else {
         throw new ArgumentException("Unknown Header type.");
      }
   }

   public final byte[] u3() {
      return this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final byte[] u9() {
      return this.k5;
   }

   public final void l6(byte[] var1) {
      this.k5 = var1;
   }

   public final byte[] n5(com.aspose.slides.internal.y6.k5 var1) {
      if (this.n5().k5() == 1 && (this.u3() == null || this.u3().length == 0) && this.n5().k5() == 1) {
         this.n5(new byte[]{0, 0, 0, 0, -1, -1, -1, 0});
      }

      if (this.n5().k5() == 8 && (this.u3() == null || this.u3().length == 0) && var1 != null) {
         int var2 = 0;
         this.n5(new byte[var1.k5() * 4]);

         for (byte var3 = 0; var3 < var1.k5() * 4; var2++) {
            com.aspose.slides.internal.o9b.c8 var4 = var1.l6()[var2].o8();
            this.u3()[var3] = var4.y4();
            this.u3()[var3 + 1] = var4.n3();
            this.u3()[var3 + 2] = var4.x8();
            this.u3()[var3 + 3] = 0;
            var3 += 4;
         }
      }

      int var15 = this.l6 != null ? this.l6.length : 0;
      byte[] var16 = new byte[(int)(((14L + (this.n5.n5() & 4294967295L) & 4294967295L) + var15 & 4294967295L) + this.k5.length)];
      com.aspose.slides.internal.z0k.e2 var17 = new com.aspose.slides.internal.z0k.e2(var16);

      try {
         com.aspose.slides.internal.z0k.l6 var5 = new com.aspose.slides.internal.z0k.l6(var17);

         try {
            n5 var6 = new n5();
            var6.n5(var16.length);
            var6.l6(14 + (int)this.n5.n5() + var15);
            var6.n5(var5);
            this.n5.n5(var5);
            if (var15 > 0) {
               var5.n5(this.l6);
            }

            var5.n5(this.k5);
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         if (var17 != null) {
            var17.dispose();
         }
      }

      return var16;
   }

   protected final boolean n5(t2 var1) {
      return j8.n5(this.n5, var1.n5) && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6) && com.aspose.slides.internal.y6.c8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((t2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
      return var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
   }

   public final com.aspose.slides.internal.o9b.l6 l6(com.aspose.slides.internal.y6.k5 var1) {
      try {
         return (com.aspose.slides.internal.o9b.l6)com.aspose.slides.internal.o9b.t4.n5(new com.aspose.slides.internal.z0k.e2(this.n5(var1)));
      } catch (RuntimeException var3) {
         com.aspose.slides.internal.f8y.n5.k5("Error:Unable to convert DIB to Bitmap");
         return new com.aspose.slides.internal.o9b.l6(this.l6(), q1.n5(this.k5()));
      }
   }

   public final int[] k5(com.aspose.slides.internal.y6.k5 var1) {
      com.aspose.slides.internal.o9b.l6 var2 = this.l6(var1);
      return com.aspose.slides.internal.r0.n5.n5(var2);
   }
}
