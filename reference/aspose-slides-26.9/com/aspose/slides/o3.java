package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class o3 {
   private byte[] n5;
   private com.aspose.slides.internal.o9b.p8 l6 = new com.aspose.slides.internal.o9b.p8();
   private int k5;
   private int u3;

   public final int n5() {
      return this.l6.l6();
   }

   public final int l6() {
      return this.l6.k5();
   }

   public final int k5() {
      return this.u3;
   }

   public final int u3() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.p8 a6() {
      return this.l6;
   }

   static o3 n5(com.aspose.slides.internal.o9b.l6 var0) {
      o3 var1 = new o3();
      var1.l6 = new com.aspose.slides.internal.o9b.p8(var0.e2(), var0.h0());
      var1.u3 = var0.s7();
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      var1.k5 = var2.a6();
      var1.n5 = new byte[var1.u3() * var1.l6()];
      System.arraycopy(var2.u3().k5().n5(), 0, var1.n5, 0, var1.u3() * var1.l6());
      var0.n5(var2);
      return var1;
   }

   final com.aspose.slides.internal.o9b.l6 u9() {
      com.aspose.slides.internal.o9b.l6 var1 = new com.aspose.slides.internal.o9b.l6(this.n5(), this.l6(), this.k5());
      com.aspose.slides.internal.j9e.n5 var2 = var1.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var1.e2(), var1.h0()), 2, this.k5());
      System.arraycopy(this.n5, 0, var2.u3().k5().n5(), 0, this.n5.length);
      var1.n5(var2);
      return var1;
   }

   final byte n5(int var1, int var2) {
      if (this.k5() == 139273) {
         int var3 = var2 * this.u3() + var1 * 4;
         return (byte)com.aspose.slides.internal.v6g.k5.u3(
            (this.n5[var3] & 0xFF) * 0.299 + (this.n5[var3 + 1] & 0xFF) * 0.587 + (this.n5[var3 + 2] & 0xFF) * 0.114, 14
         );
      } else {
         throw new NotImplementedException();
      }
   }

   static o3 n5(int var0, int var1, int var2) {
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(var0, var1, var2);

      try {
         return n5(var3);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   final void n5(int var1, int var2, byte var3) {
      if (this.k5() == 139273) {
         int var5 = var2 * this.u3() + var1 * 4;
         this.n5[var5] = var3;
         this.n5[var5 + 1] = var3;
         this.n5[var5 + 2] = var3;
      } else if (this.k5() == 196865) {
         int var4 = var2 * this.u3() + var1 / 8;
         switch ((var3 & 255) >> 7) {
            case 1:
               this.n5[var4] = (byte)(this.n5[var4] & 0xFF | (byte)(128 >> var1 % 8) & 0xFF);
               break;
            default:
               this.n5[var4] = (byte)(this.n5[var4] & 0xFF & (byte)(~(128 >> var1 % 8)) & 0xFF);
         }
      } else {
         throw new NotImplementedException();
      }
   }

   static o3 n5(com.aspose.slides.internal.o9b.p8 var0, int var1) {
      return n5(var0.l6(), var0.k5(), var1);
   }
}
