package com.aspose.slides.internal.k0r;

import com.aspose.slides.InvalidPasswordException;
import com.aspose.slides.PptReadException;

public class c0 {
   public m0l n5 = new m0l();
   public long l6;
   public x9 k5;
   public j9 u3;

   public final long n5() {
      return this.k5.n5().k5();
   }

   c0() {
   }

   c0(String var1) {
      this.n5 = new m0l();
      this.n5.n5 = 2;
      this.n5.l6 = 2;
      this.k5 = new x9();
      this.l6 = this.k5.s7();
      this.u3 = new j9(var1, this.k5.a6());
   }

   final int l6() {
      int var1 = this.k5.x8();
      int var2 = this.u3.n5();
      return 12 + var1 + var2;
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);
      var1.l6((int)this.n5());
      var1.l6((int)this.l6);
      this.k5.n5(var1);
      this.u3.n5(var1);
   }

   public static c0 n5(com.aspose.slides.internal.z0k.t4 var0) {
      c0 var1 = new c0();
      m0l.n5(var0).n5(var1.n5);
      if ((var1.n5.l6 & 65535) == 1) {
         var1.k5 = new x9();
         var1.k5.n5().l6(true);
         var1.l6 = var1.k5.s7();
         var1.u3 = j9.n5(var0, 16, false);
         return var1;
      } else {
         long var2 = com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L;
         var1.l6 = com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L;
         var1.k5 = x9.n5(var0, var1.l6);
         var1.u3 = j9.n5(var0, 20, true);
         return var1;
      }
   }

   public final l3 n5(String var1) {
      if (var1.length() > 255) {
         throw new InvalidPasswordException("The password is too long.");
      } else if (!this.k5.n3()) {
         throw new PptReadException("Unsupported cryptographic hash algorytm.");
      } else {
         return new l3(var1, this.u3.l6, this.k5.a6(), (this.n5.l6 & 65535) > 1);
      }
   }

   public final boolean n5(l3 var1) {
      c1 var2 = var1.n5(0L);
      byte[] var3 = new byte[this.u3.k5.length + this.u3.a6.length];
      System.arraycopy(this.u3.k5, 0, var3, 0, this.u3.k5.length);
      System.arraycopy(this.u3.a6, 0, var3, this.u3.k5.length, this.u3.a6.length);
      byte[] var4 = var2.n5(var3);
      byte[] var5 = new byte[this.u3.k5.length];
      System.arraycopy(var4, 0, var5, 0, var5.length);
      com.aspose.slides.internal.o8m.f2 var6 = n5((this.n5.l6 & 65535) > 1);

      try {
         byte[] var7 = var6.l6(var5);

         for (int var8 = 0; var8 < var7.length; var8++) {
            if ((var7[var8] & 255) != (var4[var5.length + var8] & 255)) {
               return false;
            }
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return true;
   }

   static com.aspose.slides.internal.o8m.f2 n5(boolean var0) {
      return !var0 ? com.aspose.slides.internal.o8m.z7.a6() : new com.aspose.slides.internal.o8m.h6();
   }
}
