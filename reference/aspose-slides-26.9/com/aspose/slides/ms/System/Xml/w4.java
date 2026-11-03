package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.b8c.k0t;

public final class w4 implements Cloneable {
   private z9 k5;
   private o8 u3;
   private int a6;
   private int u9;
   private int h0;
   private boolean c8;
   private long t2;
   private long s7;
   private boolean x8;
   private boolean n3;
   private boolean y4;
   private int e2;
   private int t9;
   private int z1;
   private k0t t4;
   private com.aspose.slides.internal.b8c.b4 q0;
   private boolean z3;
   private boolean m1;
   private boolean k7;
   com.aspose.slides.internal.b8c.b4 n5;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.internal.b8c.b4> l6 = new n0(this);
   private static com.aspose.slides.ms.System.o5<Boolean> m3 = new com.aspose.slides.ms.System.o5<>();

   public w4() {
      this.z8();
   }

   public final z9 n5() {
      return this.k5;
   }

   public final void n5(z9 var1) {
      this.n5("NameTable");
      this.k5 = var1;
   }

   public final boolean l6() {
      return this.k7;
   }

   public final void n5(boolean var1) {
      this.k7 = var1;
   }

   public final void n5(o8 var1) {
      this.n5("XmlResolver");
      this.u3 = var1;
      this.n5(true);
   }

   public final o8 k5() {
      return this.u3;
   }

   public final o8 u3() {
      return com.aspose.slides.internal.s5g.n5.n5() && !this.l6() ? null : this.u3;
   }

   public final int a6() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.n5("LineNumberOffset");
      this.a6 = var1;
   }

   public final int u9() {
      return this.u9;
   }

   public final void l6(int var1) {
      this.n5("LinePositionOffset");
      this.u9 = var1;
   }

   public final int h0() {
      return this.h0;
   }

   public final void k5(int var1) {
      this.n5("ConformanceLevel");
      if ((var1 & 4294967295L) > 2L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.h0 = var1;
   }

   public final boolean c8() {
      return this.c8;
   }

   public final void l6(boolean var1) {
      this.n5("CheckCharacters");
      this.c8 = var1;
   }

   public final long t2() {
      return this.t2;
   }

   public final void n5(long var1) {
      this.n5("MaxCharactersInDocument");
      if (var1 < 0L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.t2 = var1;
   }

   public final long s7() {
      return this.s7;
   }

   public final void l6(long var1) {
      this.n5("MaxCharactersFromEntities");
      if (var1 < 0L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.s7 = var1;
   }

   public final boolean x8() {
      return this.x8;
   }

   public final void k5(boolean var1) {
      this.n5("IgnoreWhitespace");
      this.x8 = var1;
   }

   public final boolean n3() {
      return this.n3;
   }

   public final void u3(boolean var1) {
      this.n5("IgnoreProcessingInstructions");
      this.n3 = var1;
   }

   public final boolean y4() {
      return this.y4;
   }

   public final void a6(boolean var1) {
      this.n5("IgnoreComments");
      this.y4 = var1;
   }

   public final int e2() {
      return this.e2;
   }

   public final void u3(int var1) {
      this.n5("DtdProcessing");
      if ((var1 & 4294967295L) > 2L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.e2 = var1;
   }

   public final boolean t9() {
      return this.z3;
   }

   public final void u9(boolean var1) {
      this.n5("CloseInput");
      this.z3 = var1;
   }

   public final int z1() {
      return this.t9;
   }

   public final void a6(int var1) {
      this.n5("ValidationType");
      if ((var1 & 4294967295L) > 4L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.t9 = var1;
   }

   public final int t4() {
      return this.z1;
   }

   public final void u9(int var1) {
      this.n5("ValidationFlags");
      if ((var1 & 4294967295L) > 31L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.z1 = var1;
   }

   public final k0t q0() {
      if (this.t4 == null) {
         this.t4 = new k0t();
      }

      return this.t4;
   }

   public final void n5(k0t var1) {
      this.n5("Schemas");
      this.t4 = var1;
   }

   public final w4 z3() {
      w4 var1 = com.aspose.slides.internal.v6g.k5.n5(this.m3(), w4.class);
      var1.h0(false);
      return var1;
   }

   public final com.aspose.slides.internal.b8c.b4 m1() {
      return this.q0;
   }

   public final c7 n5(String var1, b1 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("inputUri");
      }

      if (var1.length() == 0) {
         throw new ArgumentException(v3.n5("The string was not recognized as a valid Uri."), "inputUri");
      }

      o8 var3 = this.k5();
      if (var3 == null) {
         var3 = j5();
      }

      c7 var4 = new b0(var1, this, var2, var3);
      if (this.z1() != 0) {
         var4 = this.l6(var4);
      }

      return var4;
   }

   public final c7 n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.ms.System.r8 var2, String var3, b1 var4) {
      if (var1 == null) {
         throw new ArgumentNullException("input");
      }

      if (var3 == null) {
         if (var2 == null) {
            var3 = com.aspose.slides.ms.System.d1.n5;
         } else {
            var3 = var2.toString();
         }
      }

      c7 var5 = new b0(var1, null, 0, this, var2, var3, var4, this.z3);
      if (this.z1() != 0) {
         var5 = this.l6(var5);
      }

      return var5;
   }

   public final c7 n5(com.aspose.slides.internal.z0k.y1 var1, String var2, b1 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("input");
      }

      if (var2 == null) {
         var2 = com.aspose.slides.ms.System.d1.n5;
      }

      c7 var4 = new b0(var1, this, var2, var3);
      if (this.z1() != 0) {
         var4 = this.l6(var4);
      }

      return var4;
   }

   public final c7 n5(c7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("reader");
      } else {
         return this.k5(var1);
      }
   }

   public final void h0(boolean var1) {
      this.m1 = var1;
   }

   private void n5(String var1) {
      if (this.m1) {
         throw new XmlException(
            "The '{0}' property is read only and cannot be set.", com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7(), '.', var1})
         );
      }
   }

   private void z8() {
      this.l6((o8)null);
   }

   private void l6(o8 var1) {
      this.k5 = null;
      if (!k7()) {
         this.u3 = var1;
         this.s7 = com.aspose.slides.internal.v6g.k5.u9(1.0E7, 14);
      } else {
         this.u3 = var1 == null ? j5() : var1;
         this.s7 = 0L;
      }

      this.a6 = 0;
      this.u9 = 0;
      this.c8 = true;
      this.h0 = 2;
      this.x8 = false;
      this.n3 = false;
      this.y4 = false;
      this.e2 = 0;
      this.z3 = false;
      this.t2 = 0L;
      this.t4 = null;
      this.t9 = 0;
      this.z1 = 8;
      this.z1 |= 16;
      this.m1 = false;
      this.n5(false);
   }

   private static o8 j5() {
      return new k1();
   }

   public final c7 l6(c7 var1) {
      if (this.t9 == 4) {
         o8 var2 = this.u3();
         if (var2 == null && !this.l6() && !k7()) {
            var2 = new k1();
         }

         var1 = new c6(var1, var2, this);
      } else if (this.t9 == 2) {
         var1 = this.u3(var1);
      }

      return var1;
   }

   private s8 u3(c7 var1) {
      return new s8(var1, this.m1(), (this.t4() & 8) != 0);
   }

   public final c7 k5(c7 var1) {
      w4 var2 = var1.n5();
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      int var7 = -1;
      boolean var8 = false;
      if (var2 == null) {
         if (this.h0 != 0 && this.h0 != c7.n5(var1)) {
            throw new InvalidOperationException(
               v3.n5(
                  "Cannot change conformance checking to {0}. Make sure the ConformanceLevel in XmlReaderSettings is set to Auto for wrapping scenarios.",
                  com.aspose.slides.ms.System.s3.n5(n3.class, this.h0)
               )
            );
         }

         p5 var9 = com.aspose.slides.internal.v6g.k5.n5(var1, p5.class);
         if (var9 == null) {
            l8 var10 = com.aspose.slides.internal.v6g.k5.n5(var1, l8.class);
            if (var10 != null) {
               var9 = (p5)var10.t2();
            }
         }

         if (this.x8) {
            int var12 = 0;
            if (var9 != null) {
               var12 = var9.z7();
            }

            if (var12 == 0) {
               var4 = true;
               var8 = true;
            }
         }

         if (this.y4) {
            var5 = true;
            var8 = true;
         }

         if (this.n3) {
            var6 = true;
            var8 = true;
         }

         int var13 = 2;
         if (var9 != null) {
            var13 = var9.v4();
         }

         if (this.e2 == 0 && var13 != 0 || this.e2 == 1 && var13 == 2) {
            var7 = this.e2;
            var8 = true;
         }
      } else {
         if (this.h0 != var2.h0() && this.h0 != 0) {
            throw new InvalidOperationException(
               v3.n5(
                  "Cannot change conformance checking to {0}. Make sure the ConformanceLevel in XmlReaderSettings is set to Auto for wrapping scenarios.",
                  com.aspose.slides.ms.System.s3.n5(n3.class, this.h0)
               )
            );
         }

         if (this.c8 && !var2.c8()) {
            var3 = true;
            var8 = true;
         }

         if (this.x8 && !var2.x8()) {
            var4 = true;
            var8 = true;
         }

         if (this.y4 && !var2.y4()) {
            var5 = true;
            var8 = true;
         }

         if (this.n3 && !var2.n3()) {
            var6 = true;
            var8 = true;
         }

         if (this.e2 == 0 && var2.e2() != 0 || this.e2 == 1 && var2.e2() == 2) {
            var7 = this.e2;
            var8 = true;
         }
      }

      if (var8) {
         a3 var11 = com.aspose.slides.internal.v6g.k5.n5(var1, a3.class);
         return var11 != null ? new t3(var1, var11, var3, var4, var5, var6, var7) : new c2(var1, var3, var4, var5, var6, var7);
      } else {
         return var1;
      }
   }

   public static boolean k7() {
      if (m3.l6()) {
         return m3.n5();
      } else if (!com.aspose.slides.ms.System.Xml.a6.n5()) {
         m3 = new com.aspose.slides.ms.System.o5<>(true);
         return m3.n5();
      } else {
         m3 = new com.aspose.slides.ms.System.o5<>(false);
         return m3.n5();
      }
   }

   protected Object m3() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static void n5(w4 var0, String var1) {
      var0.n5(var1);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.b8c.b4 n5(w4 var0) {
      return var0.q0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.b8c.b4 n5(w4 var0, com.aspose.slides.internal.b8c.b4 var1) {
      return var0.q0 = var1;
   }
}
