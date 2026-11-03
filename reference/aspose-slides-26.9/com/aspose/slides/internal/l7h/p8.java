package com.aspose.slides.internal.l7h;

import java.util.concurrent.atomic.AtomicReference;

public final class p8 extends s7 {
   private char k5 = 0;
   private int u3 = -1;
   private int a6;
   private s3 u9;
   private static AtomicReference<Object> h0 = new AtomicReference<>();

   private static Object a6() {
      if (h0.get() == null) {
         Object var0 = new Object();
         h0.set(var0);
      }

      return h0.get();
   }

   public p8(s3 var1) {
      this.u9 = var1;
      if (this.u9.l6 == null) {
         synchronized (a6()) {
            if (this.u9.l6 == null) {
               this.u9.l6 = var1.n5.j5();
            }
         }
      }
   }

   @Override
   public boolean n5(byte[] var1, int var2) {
      this.k5 = this.l6(var1);
      if (this.k5 == 0) {
         this.k5 = this.u9.k5;
      }

      this.u3 = this.a6 = 1;
      return true;
   }

   @Override
   public char n5() {
      this.u3--;
      if (this.u3 < 0) {
         return '\u0000';
      } else if (this.u3 == Integer.MAX_VALUE) {
         this.u3 = -1;
         return '\u0000';
      } else {
         return this.k5;
      }
   }

   @Override
   public int l6() {
      return this.u3 > 0 ? this.u3 : 0;
   }

   @Override
   public void k5() {
      this.u3 = -1;
      this.n5 = 0;
   }

   @Override
   public int l6(byte[] var1, int var2) {
      return 1;
   }

   private char l6(byte[] var1) {
      int var2 = 0;
      int var3 = this.u9.l6.length;
      if (var3 == 0) {
         return '\u0000';
      }

      if (var1.length != 0 && var1.length <= 2) {
         char var4;
         if (var1.length == 1) {
            var4 = (char)(var1[0] & 0xFF);
         } else {
            var4 = (char)(((var1[0] & 255) << 8) + (var1[1] & 255));
         }

         if (var4 >= this.u9.l6[0] && var4 <= this.u9.l6[var3 - 2]) {
            int var5;
            while ((var5 = var3 - var2) > 6) {
               int var6 = var5 / 2 + var2 & 65534;
               char var7 = this.u9.l6[var6];
               if (var7 == var4) {
                  return this.u9.l6[var6 + 1];
               }

               if (var7 < var4) {
                  var2 = var6;
               } else {
                  var3 = var6;
               }
            }

            for (int var8 = var2; var8 < var3; var8 += 2) {
               if (this.u9.l6[var8] == var4) {
                  return this.u9.l6[var8 + 1];
               }
            }

            return '\u0000';
         } else {
            return '\u0000';
         }
      } else {
         return '\u0000';
      }
   }
}
