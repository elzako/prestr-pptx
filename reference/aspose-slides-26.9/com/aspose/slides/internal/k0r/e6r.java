package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

public abstract class e6r {
   private boolean n5;
   private e6r l6;
   protected z6z x8 = new z6z();

   public final z6z w1() {
      return this.x8;
   }

   public final int r4() {
      return com.aspose.slides.internal.n8e.v4.n5(this.x8.u3());
   }

   public final byte c4() {
      return this.x8.l6();
   }

   public final short y2() {
      return this.x8.k5();
   }

   public final void k5(short var1) {
      this.x8.n5(var1);
   }

   public final int y1() {
      return this.x8.a6();
   }

   e6r() {
   }

   e6r(int var1, byte var2) {
      this.x8.n5(var1);
      this.x8.n5(var2);
   }

   public final void k5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1, new z6z(var1));
   }

   public final void n5(com.aspose.slides.internal.z0k.n5 var1, z6z var2) {
      this.x8 = var2;
      int var3 = (int)var1.x8().getPosition();
      this.n5(var1);
      int var4 = (int)var1.x8().getPosition() - var3;
      if (var4 < this.x8.a6()) {
         int var5 = this.x8.a6() - var4;
         if (var1.x8().getPosition() + var5 > var1.x8().getLength()) {
            String var11 = com.aspose.slides.ms.System.d1.n5(new String[]{
               "Can't read a record data (", com.aspose.slides.ms.System.p3.l6(var1.x8().getPosition() + var5 - var1.x8().getLength()), " byte(s) missing"
            });
            var11 = com.aspose.slides.ms.System.d1.n5(var11, com.aspose.slides.ms.System.d1.n5(new String[]{"\nRecord: ", this.toString()}));
            var11 = com.aspose.slides.ms.System.d1.n5(var11, com.aspose.slides.ms.System.d1.n5(new String[]{"\nOffset: 0x", com.aspose.slides.ms.System.a3.n5(var3, "X4")}));
            return;
         }

         byte[] var6 = var1.c8(var5);
      } else if (var4 > this.x8.a6()) {
         String var7 = com.aspose.slides.ms.System.d1.n5(new String[]{
            "Read wrong number of bytes [ 0x",
            com.aspose.slides.ms.System.a3.n5(var4, "X2"),
            " greater than hdr.Length=0x",
            com.aspose.slides.ms.System.a3.n5(this.x8.a6(), "X2"),
            " ] from record! "
         });
         var7 = com.aspose.slides.ms.System.d1.n5(var7, com.aspose.slides.ms.System.d1.n5(new String[]{"\nRecord: ", this.toString()}));
         var7 = com.aspose.slides.ms.System.d1.n5(var7, com.aspose.slides.ms.System.d1.n5(new String[]{"\nOffset: 0x", com.aspose.slides.ms.System.a3.n5(var3, "X4")}));
         var7 = com.aspose.slides.ms.System.d1.n5(
            var7, com.aspose.slides.ms.System.d1.n5(new String[]{" / From: 0x", com.aspose.slides.ms.System.p3.n5(var1.x8().getLength(), "X4")})
         );
         this.n5(var1, var3 - 8L, this.x8.a6() + 16);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, long var2, int var4) {
      long var5 = var1.x8().getPosition();
      var1.x8().setPosition(var2);
      long var7 = var1.x8().getLength();
      int var9 = var4;
      if (var2 + var9 > var7) {
         var9 = (int)(var7 - var2);
      }

      byte[] var10 = new byte[0];
      if (var9 < 8) {
         if (var9 > 0) {
            var10 = var1.c8(var9);
         }
      } else {
         int var11 = var1.r4();
         int var12 = var1.r4();
         var10 = var1.c8(4);
         long var13 = (var10[0] & 255) + ((var10[1] & 255) << 8) + ((var10[2] & 255) << 16) + ((var10[3] & 255) << 24) & 4294967295L;
         var9 -= 8;
         if (var9 >= 1) {
            var10 = var1.c8(var9);
            var1.x8().setPosition(var5);
         }
      }
   }

   protected abstract void n5(com.aspose.slides.internal.z0k.n5 var1);

   public final int l6(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = (int)var1.n5().getPosition();
      int var3 = var2 + 8;
      var1.n5().seek(var3, 0);
      this.n5(var1);
      int var4 = com.aspose.slides.ms.System.z3.h0(var1.n5().getPosition());
      this.w1().l6(var4 - var3);
      var1.n5().seek(var2, 0);
      this.w1().n5(var1);
      var1.n5().seek(var4, 0);
      int var5 = var4 - var2;
      int var6 = this.n5() + 8;
      if (var5 != var6) {
         String var7 = com.aspose.slides.ms.System.d1.n5(new String[]{
            "Writed number of bytes [0x",
            com.aspose.slides.ms.System.a3.n5(var5, "X4"),
            "] not equal to record size [0x",
            com.aspose.slides.ms.System.a3.n5(var6, "X4"),
            "] ",
            this.toString()
         });
         throw new Exception(var7);
      } else {
         return var5;
      }
   }

   public abstract void n5(com.aspose.slides.internal.z0k.l6 var1);

   public abstract int n5();

   final boolean a0() {
      return this.n5;
   }

   public final e6r d2() {
      this.n5 = true;
      return this;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0}, Header:{1}",new Object[]{ com.aspose.slides.ms.System.j8.n5(this).s7(), this.x8.toString()});
   }

   public final e6r d5() {
      return this.l6;
   }

   public final void l6(e6r var1) {
      this.l6 = var1;
   }
}
