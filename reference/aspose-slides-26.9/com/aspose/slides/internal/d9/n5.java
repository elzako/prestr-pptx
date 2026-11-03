package com.aspose.slides.internal.d9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.a4.d5;
import com.aspose.slides.internal.a4.m3;
import com.aspose.slides.internal.b9.e2;
import com.aspose.slides.internal.b9.o5;
import com.aspose.slides.internal.b9.p8;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.i0.i1;
import com.aspose.slides.internal.k1.k7;
import com.aspose.slides.internal.k1.w1;
import com.aspose.slides.internal.l5.u9;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o1.u3;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.t5.t2;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.y6.c8;
import com.aspose.slides.internal.y6.l6;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class n5 extends l6 {
   private o5 n5;
   private com.aspose.slides.internal.p9.n5 l6;

   public n5(int var1, int var2) {
      super(var1, var2);
      this.n5 = new o5(this);
      this.n5.x8(1L);
      this.n5.t2(88);
      this.n5.n5(new t2());
      this.n5.n5().n5(new k7());
      this.n5.n5().n5(1179469088);
      this.n5.n5().u3(65536L);
      this.n5.n5().a6(88L);
      this.n5.n5().u9(1L);
      this.n5.n5().l6(1);
      this.n5.n5().k5(0);
      this.n5.n5().h0(0L);
      this.n5.n5().c8(0L);
      this.n5.n5().t2(0L);
      this.n5.n5().n5(new w1(1600L, 900L));
      this.n5.n5().l6(c8.n5(this.n5.n5().z1()));
      this.n5
         .n5()
         .l6(
            new k7(
               0,
               0,
               k5.u3(q1.u3(100.0F * (float)(this.n5.n5().t4().n5() & 4294967295L) * var1 / (float)(this.n5.n5().z1().n5() & 4294967295L) - 35.0F), 14),
               k5.u3(q1.u3(100.0F * (float)(this.n5.n5().t4().l6() & 4294967295L) * var2 / (float)(this.n5.n5().z1().l6() & 4294967295L)), 14) - 35
            )
         );
      this.n5().l6(this.n5);
      this.y4();
      e2 var3 = new e2();
      var3.t2(44);
      var3.u3(32L);
      var3.n5(726027589L);
      d5 var4 = new d5();
      var4.n5((short)0);
      var4.l6(28);
      var4.n5(16);
      var4.n5(false);
      var4.l6(true);
      var4.n5(1L);
      var4.k5(96);
      var4.u3(96);
      var4.n5(new i1());
      var3.n5(new b3[]{var4});
      this.n5().l6(var3);
      this.y4();
      e2 var5 = new e2();
      var5.t2(28);
      var5.u3(16L);
      var5.n5(726027589L);
      m3 var6 = new m3();
      var6.n5((short)0);
      var6.l6(12);
      var5.n5(new b3[]{var6});
      this.n5().l6(var5);
      this.y4();
      p8 var7 = new p8(this);
      var7.x8(14L);
      var7.t2(20);
      var7.n5(0L);
      var7.l6(0L);
      var7.k5(20L);
      this.n5().l6(var7);
      this.y4();
   }

   public n5() {
   }

   @Override
   public u9 s7() {
      if (this.n5().size() > 4) {
         throw new ArgumentException("Unable to create graphics from a not empty metafile");
      } else {
         return new com.aspose.slides.internal.n7.l6(this);
      }
   }

   @Override
   public y2 k5() {
      return this.n5.n5().u3().c8();
   }

   @Override
   public int E_() {
      int var1 = Integer.MIN_VALUE;
      if (this.x8() != null && this.x8().n5() != null) {
         var1 = this.x8().n5().z3().u3();
      }

      return var1;
   }

   @Override
   public int F_() {
      int var1 = Integer.MIN_VALUE;
      if (this.x8() != null && this.x8().n5() != null) {
         var1 = this.x8().n5().z3().c8();
      }

      return var1;
   }

   @Override
   public int u9() {
      int var1 = Integer.MIN_VALUE;
      if (this.x8() != null && this.x8().n5() != null) {
         var1 = this.x8().n5().z3().t2();
      }

      return var1;
   }

   @Override
   public int h0() {
      int var1 = Integer.MIN_VALUE;
      if (this.x8() != null && this.x8().n5() != null) {
         var1 = this.x8().n5().z3().l6();
      }

      return var1;
   }

   @Override
   public float c8() {
      return 25.4F * (float)(this.n5.n5().z1().n5() & 4294967295L) / (float)(this.n5.n5().t4().n5() & 4294967295L);
   }

   @Override
   public float t2() {
      return 25.4F * (float)(this.n5.n5().z1().l6() & 4294967295L) / (float)(this.n5.n5().t4().l6() & 4294967295L);
   }

   @Override
   public int l6() {
      if (this.n3() == null || this.n3().n5() == null) {
         return 3;
      } else {
         return this.n3().n5().k5() ? 5 : 4;
      }
   }

   public final o5 x8() {
      return this.n5;
   }

   public final void n5(o5 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.p9.n5 n3() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.p9.n5 var1) {
      this.l6 = var1;
   }

   @Override
   public void a_(t4 var1) {
      this.y4();
      com.aspose.slides.internal.d7.n5 var2 = new com.aspose.slides.internal.d7.n5(var1);
      var2.l6(this);
   }

   public final void y4() {
      int var1 = 0;
      this.x8().n5().u9(this.n5().size() & 4294967295L);

      for (int var2 = 0; var2 < this.n5().size(); var2++) {
         s9 var3 = (s9)this.n5().n5(var2);
         var3.n3(var1);
         var1 += var3.y2();
      }

      this.x8().n5().a6(var1 & 4294967295L);
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 u3() {
      return new com.aspose.slides.internal.o1.n5(this, u3.l6()).u3();
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      IGenericEnumerator var2 = this.n5().iterator();

      try {
         while (var2.hasNext()) {
            s9 var3 = (s9)var2.next();
            var1.l6(var3.toString());
         }
      } finally {
         if (k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }
}
