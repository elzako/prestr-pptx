package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class k1z extends f0o {
   private s0i t2;
   private z4m s7;
   protected f7q u3;
   protected IEffectFormat a6 = null;
   protected boolean u9 = false;
   protected boolean h0 = false;
   protected Shape c8 = null;
   private Effect x8 = null;
   private int n3 = 0;

   k1z(Shape var1, n6s var2) {
      this(var2);
      this.n5 = var1;
      this.a6().l6(this);
      this.z1();
   }

   k1z(Shape var1, Shape var2, n6s var3) {
      this(var3);
      this.n5 = var1;
      this.c8 = var2;
      this.a6().l6(this);
      this.z1();
   }

   k1z(n6s var1) {
      super(var1);
   }

   final void z1() {
      Shape var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, Shape.class);
      this.a6 = var1.getEffectFormat();
      AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class);
      if (var1.getPlaceholder() != null) {
         this.s7 = new z4m(this);
         v0q.n5(this);
      } else if (var2 != null) {
         this.n5(var2.getTextFrame(), 4);
      }

      this.t2();
   }

   private void t2() {
      this.x8 = null;
      this.n3 = 0;
      Shape var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, Shape.class);
      if (var1 != null) {
         IGenericEnumerator var2 = var1.getSlide().getTimeline().getMainSequence().iterator();

         try {
            while (var2.hasNext()) {
               IEffect var3 = (IEffect)var2.next();
               Effect var4 = com.aspose.slides.internal.v6g.k5.n5(var3, Effect.class);
               if (var4 != null) {
                  this.n3++;
                  Shape var5 = com.aspose.slides.internal.v6g.k5.n5(var4.k5().u3(), Shape.class);
                  if (var5 != null && (var5.v4() & 4294967295L) == (var1.v4() & 4294967295L) && var4.getPresetClassType() == 0) {
                     this.x8 = var4;
                     return;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   final void n5(ITextFrame var1, int var2) {
      if (var1 != null) {
         this.u3 = new f7q((TextFrame)var1, this);
         this.u3.n5(var2);
      }
   }

   @Override
   void n5() {
      this.l6 = new com.aspose.slides.internal.k0r.q5();
      this.l6.l6(true);
   }

   void c8() {
      if (this.u3 != null) {
         this.u3.l6();
      }

      Shape var1 = this.q0();
      if (var1 == null) {
         var1 = this.s7();
      }

      Shape var2 = var1;
      boolean var3 = var2 != null && var2.n3();
      if (!var3) {
         this.t4();
      }

      if (!this.h0) {
         this.k5.x8().e2().addItem(this.z3());
         this.h0 = true;
      }

      if (var3) {
         r2v.n5(this);
         this.t4();
      }
   }

   void e2() {
   }

   void t4() {
      this.z3().l6(false);
      if (this.z8() != null && this.z8().l6().n5() == 0) {
         this.z3().e2().removeItem(this.z8());
      }

      if (this.j5() != null && this.j5().l6().n5() == 0) {
         this.z3().e2().removeItem(this.j5());
      }

      if (this.w1() != null && this.w1().e2().size() < 1) {
         this.z3().e2().removeItem(this.w1());
         this.z3().y4();
      }
   }

   Shape s7() {
      return com.aspose.slides.internal.v6g.k5.n5(this.n5, Shape.class);
   }

   final Shape q0() {
      return this.c8;
   }

   final com.aspose.slides.internal.k0r.q5 z3() {
      return (com.aspose.slides.internal.k0r.q5)this.l6();
   }

   final f7q m1() {
      return this.u3;
   }

   final z4m k7() {
      return this.s7;
   }

   final com.aspose.slides.internal.k0r.p1 m3() {
      return this.z3().u3();
   }

   final com.aspose.slides.internal.k0r.r3 z8() {
      return this.z3().a6();
   }

   final com.aspose.slides.internal.k0r.a9 j5() {
      return this.z3().h0();
   }

   final com.aspose.slides.internal.k0r.c9 w1() {
      return this.z3().s7();
   }

   final s0i r4() {
      if (this.t2 == null) {
         this.t2 = new s0i(this);
      }

      return this.t2;
   }

   final IEffectFormat c4() {
      return this.a6;
   }

   final Effect y2() {
      return this.x8;
   }

   final int y1() {
      return this.n3;
   }

   final boolean a0() {
      return this.a6 != null && ((EffectFormat)this.a6).u3();
   }

   final boolean d2() {
      return this.u9;
   }
}
