package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;

public class b8c extends s7k {
   private float n5;
   private f1c l6 = null;
   private f1c k5 = null;
   private e4w u3 = null;
   private y9w a6 = null;

   public b8c(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final f1c n5() {
      return this.l6;
   }

   public final f1c l6() {
      return this.k5;
   }

   public final e4w k5() {
      return this.u3;
   }

   public static byte n5(int var0) {
      if (var0 >= 1 && var0 <= 4) {
         return (byte)var0;
      } else {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Incorrect class number = {0} passed to calculate GDEF class type", new Object[]{var0}));
      }
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.d2() & 4294967295L);
      this.n5 = var1.u3();
      int var2 = var1.n3();
      int var3 = var1.n3();
      int var4 = var1.n3();
      int var5 = var1.n3();
      int var6 = this.n5 == 1.2F ? var1.n3() : 0;
      long var7 = var1.n5();
      if ((var2 & 65535) != 0) {
         this.l6 = f1s.n5(new f1c(this.d2() & 4294967295L, var2 & 65535), var1);
      }

      if ((var5 & 65535) != 0) {
         this.k5 = f1s.n5(new f1c(this.d2() & 4294967295L, var5 & 65535), var1);
      }

      if ((var6 & 65535) != 0) {
         this.u3 = f1s.n5(new e4w(this.d2() & 4294967295L, var6 & 65535), var1);
      }

      if ((var3 & 65535) != 0) {
         this.a6 = f1s.n5(new y9w(this.d2() & 4294967295L, var3 & 65535), var1);
      }

      super.n5(var1);
   }
}
