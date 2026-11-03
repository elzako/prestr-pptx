package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class r4 extends h0 {
   private y1 n5 = null;
   private y1 l6 = null;
   private y1 k5 = null;
   private y1 u3 = null;
   private y1 a6 = null;
   private IGenericDictionary<Object, Object> c8 = null;
   private boolean t2 = false;

   public r4() {
   }

   public r4(com.aspose.slides.internal.t1.z8 var1) {
      com.aspose.slides.internal.f2.n5 var2 = new com.aspose.slides.internal.f2.n5(var1.o0().u3(), var1.z7().u3());
      com.aspose.slides.internal.h2.n3 var3 = var1.e5();
      com.aspose.slides.internal.f2.t2 var4 = new com.aspose.slides.internal.f2.t2(null, 5, var2.n5);
      com.aspose.slides.internal.f2.t2 var5 = new com.aspose.slides.internal.f2.t2(null, 5, var2.l6);
      com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1(
         var3.k5.l6(var4), var3.n5.l6(var5), var2.n5 - var3.k5.l6(var4) - var3.u3.l6(var4), var2.l6 - var3.n5.l6(var5) - var3.l6.l6(var5)
      );
      com.aspose.slides.internal.f2.n5 var7 = new com.aspose.slides.internal.f2.n5(0, 0);
      e2 var8 = e2.n5(var1.v4(), var1.u6(), var6.y4(), var7);
      Dictionary$ValueCollection$Enumerator var9 = var1.i1().getValues().iterator();

      try {
         while (var9.hasNext()) {
            com.aspose.slides.internal.t1.x8 var10 = (com.aspose.slides.internal.t1.x8)var9.next();
            y1 var11 = n5(var10, var7, var8);
            y2 var12;
            if (var10.z3() == 58) {
               var12 = new n3((com.aspose.slides.internal.t1.t9)var10, var11);
            } else {
               var12 = new y2(var10, var11);
            }

            p6.n5(var12, var10.e5(), false, false, false, false, null);
            p6.l6(var12, var10.e5(), false, false, false, false, null);
            n5(var12, var10, var11.m3().y4());
            var11.n5(var12);
            this.n5(var10.z3(), var11);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }
   }

   public final void n5() {
      this.t2 = true;
   }

   private static y1 n5(com.aspose.slides.internal.t1.x8 var0, com.aspose.slides.internal.f2.n5 var1, e2 var2) {
      com.aspose.slides.internal.o9b.y1 var3 = var0.n5(var1).y4();
      com.aspose.slides.internal.o9b.y1 var4 = var2.n5(var3.y4()).y4();

      y1 var5;
      try {
         var5 = new y1(var4.y4());
      } catch (RuntimeException var7) {
         throw var7;
      }

      var5.k5(com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13));
      var5.l6(com.aspose.slides.internal.v6g.k5.u3(var3.s7(), 13));
      p6.n5(var5, var0.e5(), null);
      var5.l6(var0.o0() == 57 || var0.o0() == 42);
      return var5;
   }

   private static void n5(y2 var0, com.aspose.slides.internal.t1.x8 var1, com.aspose.slides.internal.o9b.y1 var2) {
      com.aspose.slides.internal.f2.n5 var3 = new com.aspose.slides.internal.f2.n5(0, 0);
      var0.n5(e2.n5(var1.v4(), var1.u6(), var2.y4(), var3));
      var0.l6(var3.n5 - var0.n3() - var0.y4());
      var0.k5(var3.l6 - var0.c8() - var0.x8());
   }

   public final void n5(int var1, y1 var2) {
      if (var1 == 57) {
         this.n5 = var2;
      } else if (var1 == 61) {
         this.l6 = var2;
      } else if (var1 == 58) {
         this.k5 = var2;
      } else if (var1 == 59) {
         this.u3 = var2;
      } else if (var1 == 56) {
         this.a6 = var2;
      }
   }

   public final y1 n5(int var1) {
      switch (var1) {
         case 56:
            return this.a6;
         case 57:
            return this.n5;
         case 58:
            return this.k5;
         case 59:
            return this.u3;
         case 60:
         default:
            throw new ArgumentException(d1.n5(new String[]{"No such area class with ID = ", a3.l6(var1)}));
         case 61:
            return this.l6;
      }
   }

   public final boolean l6() {
      if (this.t2) {
         return false;
      }

      if (this.k5 == null) {
         return true;
      }

      n3 var1 = (n3)this.k5.m1();
      return var1.j5();
   }

   @Override
   public final Object clone() {
      r4 var1 = (r4)super.n5(new r4());
      if (this.n5 != null) {
         var1.n5 = (y1)this.n5.clone();
      }

      if (this.l6 != null) {
         var1.l6 = (y1)this.l6.clone();
      }

      if (this.k5 != null) {
         var1.k5 = (y1)this.k5.clone();
      }

      if (this.u3 != null) {
         var1.u3 = (y1)this.u3.clone();
      }

      if (this.a6 != null) {
         var1.a6 = (y1)this.a6.clone();
      }

      return var1;
   }

   public final void n5(com.aspose.slides.internal.v8.u3 var1) {
      if (this.n5 != null) {
         this.n5.n5(var1);
      }

      if (this.l6 != null) {
         this.l6.n5(var1);
      }

      if (this.k5 != null) {
         this.k5.n5(var1);
      }

      if (this.u3 != null) {
         this.u3.n5(var1);
      }

      if (this.a6 != null) {
         this.a6.n5(var1);
      }
   }
}
