package com.aspose.slides.internal.k0r;

public class f3l {
   private int c8 = 0;
   protected k4s n5 = null;
   protected int l6 = 0;
   protected int k5 = 0;
   protected boolean u3 = false;
   protected byte a6 = 0;
   protected boolean u9 = false;
   protected long[] h0 = null;

   final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.c8 = (int)var1.c4();
      if (this.n5(1)) {
         this.n5 = new k4s(var1);
      }

      if (this.n5(2)) {
         this.l6 = var1.r4();
      }

      if (this.n5(4)) {
         this.k5 = var1.r4();
      }

      if (this.n5(64)) {
         this.u3 = var1.k7() != 0;
      }

      if (this.n5(32)) {
         long var2 = var1.c4();
         this.a6 = (byte)(var2 & 4294967295L & 15L & 4294967295L);
         this.u9 = (var2 & 2147483648L & 4294967295L) != 0L;
      }

      if (this.n5(512)) {
         int var4 = var1.m3();
         this.h0 = new long[var4];

         for (int var5 = 0; var5 < var4; var5++) {
            this.h0[var5] = var1.c4();
         }
      }
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.c8 & 4294967295L);
      if (this.n5(1)) {
         this.n5.n5(var1);
      }

      if (this.n5(2)) {
         var1.n5(this.l6);
      }

      if (this.n5(4)) {
         var1.n5(this.k5);
      }

      if (this.n5(64)) {
         var1.n5((this.u3 ? 1 : 0) & 65535);
      }

      if (this.n5(32)) {
         var1.n5((this.a6 & 0xFF) + ((this.u9 ? 2147483648L : 0L) & 4294967295L) & 4294967295L & 4294967295L);
      }

      if (this.n5(512)) {
         var1.n5(this.h0.length & 4294967295L);

         for (int var2 = 0; var2 < this.h0.length; var2++) {
            var1.n5(this.h0[var2]);
         }
      }
   }

   final int c8() {
      int var1 = 4;
      if (this.n5(1)) {
         var1 += this.n5.n5();
      }

      if (this.n5(2)) {
         var1 += 2;
      }

      if (this.n5(4)) {
         var1 += 2;
      }

      if (this.n5(64)) {
         var1 += 2;
      }

      if (this.n5(32)) {
         var1 += 4;
      }

      if (this.n5(512)) {
         var1 += 4 + this.h0.length * 4;
      }

      return var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.l6(com.aspose.slides.ms.System.d1.n5("  SIMask: 0x{0:X}, {1}", this.c8 & 4294967295L, com.aspose.slides.ms.System.s3.n5(f1c.class, this.c8)));
      if (this.n5(1)) {
         var1.l6(com.aspose.slides.ms.System.d1.n5("  SpellInfo: {0}", new Object[]{this.n5}));
      }

      if (this.n5(2)) {
         var1.l6(com.aspose.slides.ms.System.d1.n5("  Language: {0}", new Object[]{this.l6}));
      }

      if (this.n5(4)) {
         var1.l6(com.aspose.slides.ms.System.d1.n5("  AltLanguage: {0}", new Object[]{this.k5}));
      }

      if (this.n5(64)) {
         var1.l6(com.aspose.slides.ms.System.d1.n5("  Bidirectional: {0}", new Object[]{this.u3}));
      }

      if (this.n5(32)) {
         var1.l6(com.aspose.slides.ms.System.d1.n5("  PP10RunID: 0x{0:X}", new Object[]{this.a6}));
         var1.l6(com.aspose.slides.ms.System.d1.n5("  GrammarError: {0}", new Object[]{this.u9}));
      }

      if (this.n5(512)) {
         var1.n5(com.aspose.slides.ms.System.d1.n5("  SmartTags: {0:X} item(s) [", new Object[]{this.h0.length}));

         for (int var2 = 0; var2 < this.h0.length; var2++) {
            if (var2 > 0) {
               var1.n5(com.aspose.slides.ms.System.d1.n5(", 0x{0}", new Object[]{this.h0[var2]}));
            } else {
               var1.n5(com.aspose.slides.ms.System.d1.n5("0x{0}", new Object[]{this.h0[var2]}));
            }
         }

         var1.l6("]");
      }

      return var1.toString();
   }

   public final boolean t2() {
      return this.c8 == 0;
   }

   final boolean n5(f3l var1) {
      if (this.c8 != var1.c8) {
         return false;
      }

      if (this.c8 == 0) {
         return true;
      }

      if (this.n5(1) && !this.n5.n5(var1.n5)) {
         return false;
      }

      if (this.n5(2) && (this.l6 & 65535) != (var1.l6 & 65535)) {
         return false;
      }

      if (this.n5(4) && (this.k5 & 65535) != (var1.k5 & 65535)) {
         return false;
      }

      if (this.n5(64) && this.u3 != var1.u3) {
         return false;
      }

      if (!this.n5(32) || (this.a6 & 255) == (var1.a6 & 255) && this.u9 == var1.u9) {
         if (this.n5(512)) {
            if (this.h0.length != var1.h0.length) {
               return false;
            }

            for (int var2 = 0; var2 < this.h0.length; var2++) {
               if ((this.h0[var2] & 4294967295L) != (var1.h0[var2] & 4294967295L)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected final boolean n5(int var1) {
      return (this.c8 & var1) != 0;
   }

   protected final void n5(int var1, boolean var2) {
      this.c8 |= var1;
      if (!var2) {
         this.c8 ^= var1;
      }
   }
}
