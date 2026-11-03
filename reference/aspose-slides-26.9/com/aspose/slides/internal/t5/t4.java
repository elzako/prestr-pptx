package com.aspose.slides.internal.t5;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.s3;

public class t4 extends n5 implements Cloneable {
   private long n5;
   private long l6;
   private int k5;
   private com.aspose.slides.internal.k1.c8 u3;
   private long a6;
   private long u9;
   private long[] h0;
   private com.aspose.slides.internal.k1.t2 c8;

   public long n5() {
      return this.n5;
   }

   public void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public int k5() {
      return (int)this.l6();
   }

   public final int u3() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public com.aspose.slides.internal.k1.c8 u9() {
      return this.u3;
   }

   public void n5(com.aspose.slides.internal.k1.c8 var1) {
      this.u3 = var1;
   }

   public final long h0() {
      return this.a6;
   }

   public final void k5(long var1) {
      this.a6 = var1;
   }

   public final long c8() {
      return this.u9;
   }

   public final void u3(long var1) {
      this.u9 = var1;
   }

   public final long[] t2() {
      return this.h0;
   }

   public final void n5(long[] var1) {
      this.h0 = var1;
   }

   public final com.aspose.slides.internal.k1.t2 s7() {
      return this.c8;
   }

   @Override
   public String toString() {
      return d1.n5(
         "PenStyle: {0}, Width: {1}, ActualWidth: {2}, BrushStyle: {3}, ColorRef: {4}, BrushHatch: {5}, NumStyleEntities: {6}, BrushDibPattern: {7}",
         s3.n5(com.aspose.slides.internal.c5.n3.class, this.n5()),
         this.l6(),
         this.k5(),
         s3.n5(com.aspose.slides.internal.o4.k5.class, this.u3()),
         this.u9(),
         this.h0(),
         this.c8(),
         this.s7()
      );
   }

   protected final boolean n5(t4 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && j8.n5(this.u3, var1.u3)
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && com.aspose.slides.internal.y6.c8.n5(this.h0, var1.h0)
         && j8.n5(this.s7(), var1.s7());
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((t4)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ this.k5 & 65535;
      var1 = var1 * 397 ^ (this.u3 != null ? this.u3.hashCode() : 0);
      var1 = var1 * 397 ^ (int)this.a6;
      var1 = var1 * 397 ^ (int)this.u9;
      var1 = var1 * 397 ^ (this.h0 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.h0)).hashCode() : 0);
      return var1 * 397 ^ (this.s7() != null ? this.s7().hashCode() : 0);
   }

   public com.aspose.slides.internal.o9b.m3 n5(com.aspose.slides.internal.r6.u9 var1) {
      if (this.n5() == 5L) {
         return null;
      }

      com.aspose.slides.internal.o9b.u3 var2 = new i1(this.u9().u9().o8());
      switch (this.u3()) {
         case 1:
            return null;
         case 2:
            switch ((int)this.h0()) {
               case 0:
               default:
                  var2 = this.n5(0, var1);
                  break;
               case 1:
                  var2 = this.n5(1, var1);
                  break;
               case 2:
                  var2 = this.n5(2, var1);
                  break;
               case 3:
                  var2 = this.n5(3, var1);
                  break;
               case 4:
                  var2 = this.n5(4, var1);
                  break;
               case 5:
                  var2 = this.n5(5, var1);
                  break;
               case 6:
                  var2 = new i1(this.u9().u9().o8());
                  break;
               case 7:
                  com.aspose.slides.internal.f8y.n5.k5("EmfHatchStyle.HS_DITHEREDCLR");
                  var2 = new i1(this.u9().u9().o8());
                  break;
               case 8:
                  var2 = new i1(var1.z3().o8());
                  break;
               case 9:
                  com.aspose.slides.internal.f8y.n5.k5("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                  var2 = new i1(var1.z3().o8());
                  break;
               case 10:
                  var2 = new i1(var1.q0().o8());
                  break;
               case 11:
                  com.aspose.slides.internal.f8y.n5.k5("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                  var2 = new i1(var1.q0().o8());
            }
         case 0:
         case 4:
         default:
            com.aspose.slides.internal.o9b.m3 var7;
            switch ((int)((int)this.n5() & 983040 & 4294967295L)) {
               case 0:
                  com.aspose.slides.internal.x4g.m1 var3 = var1.x9();
                  float var4 = q1.n5(var3.n5()[0]);
                  float var5 = q1.n5(var3.n5()[3]);
                  float var6 = 2.0F / (var4 + var5);
                  var7 = new com.aspose.slides.internal.o9b.m3(var2, var6);
                  break;
               case 65536:
                  var7 = new com.aspose.slides.internal.o9b.m3(var2, (float)(this.l6() & 4294967295L));
                  break;
               default:
                  var7 = new com.aspose.slides.internal.o9b.m3(var2);
            }

            switch ((int)((int)this.n5() & 15 & 4294967295L)) {
               case 0:
                  var7.k5(0);
                  break;
               case 1:
                  var7.k5(1);
                  break;
               case 2:
                  var7.k5(2);
                  break;
               case 3:
                  var7.k5(3);
                  break;
               case 4:
                  var7.k5(4);
               case 5:
               default:
                  break;
               case 6:
                  var7.k5(0);
                  break;
               case 7:
                  var7.k5(5);
                  float[] var8 = new float[(int)this.c8()];
                  float var9 = 1.0F;
                  if (((int)this.n5() & 983040 & 4294967295L) == 65536L) {
                     com.aspose.slides.internal.x4g.m1 var10 = var1.x9();
                     var9 = (q1.n5(var10.n5()[0]) + q1.n5(var10.n5()[3])) / 2.0F / 2.0F;
                  }

                  for (int var11 = 0; var11 < (this.c8() & 4294967295L); var11++) {
                     var8[var11] = (float)(this.t2()[var11] & 4294967295L) * var9;
                  }

                  var7.l6(var8);
                  break;
               case 8:
                  if (((int)this.n5() & 983040 & 4294967295L) == 0L) {
                     var7.k5(2);
                  }
            }

            switch ((int)((int)this.n5() & 3840 & 4294967295L)) {
               case 0:
                  var7.u3(2);
                  var7.a6(2);
                  var7.l6(2);
                  break;
               case 256:
                  var7.a6(1);
                  break;
               case 512:
                  var7.a6(0);
            }

            switch ((int)((int)this.n5() & 61440 & 4294967295L)) {
               case 0:
                  var7.u9(2);
                  break;
               case 4096:
                  var7.u9(1);
                  break;
               case 8192:
                  var7.u9(0);
            }

            var7.l6(var1.r4());
            return var7;
         case 3:
            throw new NotImplementedException();
         case 5:
            throw new NotImplementedException();
         case 6:
            throw new NotImplementedException();
      }
   }

   private com.aspose.slides.internal.x4g.n3 n5(int var1, com.aspose.slides.internal.r6.u9 var2) {
      return new com.aspose.slides.internal.x4g.n3(var1, this.u9().u9().o8(), var2.q0().o8());
   }
}
