package com.aspose.slides.internal.e6a;

import com.aspose.slides.internal.l1b.k5;

public class l6 {
   private final long c8;
   private final long t2;
   private final long s7;
   public final int n5;
   private final long x8;
   public final long l6;
   public final long k5;
   public final long u3;
   public final long a6;
   public final byte[] u9;
   // $VF: synthetic field
   static final boolean h0 = !l6.class.desiredAssertionStatus();

   public l6(byte[] var1) {
      if (var1.length < 34) {
         throw new com.aspose.slides.internal.p7x.l6("META_ESCAPE_ENHANCED_METAFILE record is too short.");
      }

      int var2 = 0;
      this.c8 = com.aspose.slides.internal.l1b.k5.a6(var1, var2);
      var2 += 4;
      this.t2 = com.aspose.slides.internal.l1b.k5.a6(var1, var2);
      var2 += 4;
      this.s7 = com.aspose.slides.internal.l1b.k5.a6(var1, var2);
      var2 += 4;
      this.n5 = com.aspose.slides.internal.l1b.k5.k5(var1, var2);
      var2 += 2;
      this.x8 = com.aspose.slides.internal.l1b.k5.a6(var1, var2);
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.a6(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.a6(var1, var2);
      var2 += 4;
      this.u3 = com.aspose.slides.internal.l1b.k5.a6(var1, var2);
      var2 += 4;
      this.a6 = com.aspose.slides.internal.l1b.k5.a6(var1, var2);
      var2 += 4;
      assert var2 == 34;
      int var3 = var1.length - var2;
      this.u9 = new byte[var3];
      System.arraycopy(var1, var2, this.u9, 0, var3);
   }

   public static boolean n5(byte[] var0) {
      if (var0.length > 4) {
         long var1 = com.aspose.slides.internal.l1b.k5.a6(var0, 0);
         return var1 == 1128680791L;
      } else {
         return false;
      }
   }

   public boolean n5() {
      if (this.c8 != 1128680791L) {
         return false;
      } else if (this.t2 != 1L) {
         return false;
      } else if (this.s7 != 65536L) {
         return false;
      } else if (this.x8 != 0L) {
         return false;
      } else {
         return this.k5 > 8192L ? false : this.k5 == this.u9.length;
      }
   }
}
