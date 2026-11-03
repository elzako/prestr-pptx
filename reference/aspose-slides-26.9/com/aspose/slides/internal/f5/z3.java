package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;

public class z3 extends r4 implements com.aspose.slides.internal.j3.z3 {
   public e2 n5;
   private l6 l6;
   private r4 k5;
   private d2 u3;

   public z3(e2 var1, z1 var2) {
      super(var2);
      this.n5 = var1;
      this.u3 = d2.n5(var1.n5());
      this.l6 = new l6(this);
   }

   @Override
   public String t2() {
      return this.n5.n5();
   }

   @Override
   public String s7() {
      return this.n5.k5();
   }

   @Override
   public String x8() {
      return this.n5.a6();
   }

   @Override
   public void k5(String var1) {
      this.n5.n5(this.y4().k5().n5(var1));
   }

   public final d2 u3() {
      return this.u3;
   }

   @Override
   public final String a6() {
      return this.u3.k5();
   }

   @Override
   public final String u3(String var1) {
      n5 var2 = this.u9(var1);
      return var2 != null ? var2.k5() : null;
   }

   @Override
   public final void n5(String var1, String var2) {
      n5 var3 = this.u9(var1);
      if (var3 != null) {
         var3.n5(var2);
      } else {
         com.aspose.slides.internal.j3.k5 var4 = this.y4().t2(var1);
         var4.n5(var2);
         this.n5(var4);
      }
   }

   public final void a6(String var1) {
      this.l6.k5(var1);
   }

   public final n5 u9(String var1) {
      return com.aspose.slides.internal.v6g.k5.n5(this.l6.l6(var1), n5.class);
   }

   public final l6 u9() {
      return this.l6;
   }

   @Override
   public com.aspose.slides.internal.j3.u3 A_() {
      return this.l6;
   }

   public final com.aspose.slides.internal.j3.k5 n5(com.aspose.slides.internal.j3.k5 var1) {
      return this.l6.n5((n5)var1);
   }

   public final com.aspose.slides.internal.j3.k5 l6(com.aspose.slides.internal.j3.k5 var1) {
      return this.l6.l6(var1);
   }

   public final com.aspose.slides.internal.j3.j5 h0(String var1) {
      return k7.n5(this, var1);
   }

   public final z3 c8(String var1) {
      if (this.a0() == null) {
         return null;
      }

      com.aspose.slides.internal.r8.u9 var2 = new com.aspose.slides.internal.r8.u9(this.a0(), 1, new com.aspose.slides.internal.r8.u3(var1), false);
      return com.aspose.slides.internal.v6g.k5.n5(var2.n5(), z3.class);
   }

   @Override
   public final String l6(String var1, String var2) {
      com.aspose.slides.internal.j3.k5 var3 = this.l6.n5(var1, var2);
      return var3 != null ? var3.k5() : null;
   }

   public final void n5(String var1, String var2, String var3) {
      com.aspose.slides.internal.j3.k5 var4 = this.l6.n5(var1, var2);
      if (var4 != null) {
         var4.n5(var3);
      } else {
         var4 = this.y4().l6(var1, var2);
         var4.n5(var3);
         this.n5((com.aspose.slides.internal.j3.k5)(var4));
      }
   }

   public final void k5(String var1, String var2) {
      this.l6.l6(var1, var2);
   }

   public final com.aspose.slides.internal.j3.k5 u3(String var1, String var2) {
      return this.l6.n5(var1, var2);
   }

   public final com.aspose.slides.internal.j3.k5 k5(com.aspose.slides.internal.j3.k5 var1) {
      return this.l6.k5(var1);
   }

   public final com.aspose.slides.internal.j3.j5 a6(String var1, String var2) {
      return k7.n5(this, var1, var2);
   }

   @Override
   public final boolean t2(String var1) {
      return this.u9().u3(var1) != null;
   }

   @Override
   public final boolean u9(String var1, String var2) {
      return this.l6.n5(var1, var2) != null;
   }

   public final com.aspose.slides.internal.j3.y2 t9() {
      return new s3(this);
   }

   public final void n5(String var1, boolean var2) {
      n5 var3 = this.u9(var1);
      if (var3 != null) {
         var3.n5(var2);
      }
   }

   public final void n5(String var1, String var2, boolean var3) {
      com.aspose.slides.internal.j3.k5 var4 = this.u3(var1, var2);
      if (var4 != null) {
         ((n5)var4).n5(var3);
      }
   }

   public final void n5(com.aspose.slides.internal.j3.k5 var1, boolean var2) {
      n5 var3 = this.u9(var1.n5());
      if (var3 != null) {
         var3.n5(var2);
      }
   }

   public final String z1() {
      com.aspose.slides.internal.p6.n5 var1 = (com.aspose.slides.internal.p6.n5)this.y4().u9().k5("LS", null);
      return var1.l6().n5(this);
   }

   @Override
   public String h0() {
      return this.a6();
   }

   @Override
   public byte n3() {
      return 1;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 l6(boolean var1) {
      z3 var2 = (z3)this.y4().n5(this.x8(), this.t2(), this.s7());
      if (this.i1()) {
         IEnumerator var3 = this.l6.iterator();

         try {
            while (var3.hasNext()) {
               n5 var4 = (n5)var3.next();
               n5 var5 = (n5)var4.l6(true);
               var2.u9().a6(var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }

      if (var1) {
         for (r4 var9 = this.a0(); var9 != null; var9 = var9.s3()) {
            var2.u3(var9.l6(var1));
         }
      }

      return var2;
   }

   public final com.aspose.slides.internal.j3.z3 t4() {
      com.aspose.slides.internal.d1.a6 var1 = this.y4().l6(this, 1, null, false);

      try {
         return com.aspose.slides.internal.v6g.k5.n5(var1.k5(), z3.class);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public final com.aspose.slides.internal.j3.z3 q0() {
      com.aspose.slides.internal.d1.a6 var1 = this.y4().l6(this, 1, null, false);

      try {
         return com.aspose.slides.internal.v6g.k5.n5(var1.u3(), z3.class);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   @Override
   public final com.aspose.slides.internal.j3.z3 z3() {
      r4 var1 = this.d5();
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.d1.u3 var2 = this.y4().n5(var1, 1, null, false);

      try {
         return com.aspose.slides.internal.v6g.k5.n5(var2.l6(), z3.class);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public final com.aspose.slides.internal.j3.z3 m1() {
      if (this.s3() == null) {
         return null;
      }

      com.aspose.slides.internal.d1.u3 var1 = this.y4().n5(this.s3(), 1, null, false);

      try {
         return com.aspose.slides.internal.v6g.k5.n5(var1.n5(), z3.class);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public final long k7() {
      return k7.n5(this).n5();
   }

   @Override
   public r4 w1() {
      return this.k5;
   }

   @Override
   public void n5(r4 var1) {
      this.k5 = var1;
   }

   public final boolean n5(d2 var1) {
      return j8.l6(null, var1) ? false : j8.l6(this.u3, var1);
   }
}
