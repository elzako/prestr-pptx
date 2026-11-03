package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class a9x {
   protected v5s n5;
   protected ISlideComponent l6;
   private y2p k5;
   private p3f u3;
   private int a6 = -1;
   private IFontData[] u9;

   a9x(v5s var1) {
      this.n5 = var1;
   }

   void t2() {
   }

   final void s7() {
      switch (this.n5.c8()) {
         case 1:
            this.l6 = this.t9().e2();
            break;
         case 2:
            this.l6 = this.t9().n5();
            break;
         case 3:
            this.l6 = this.t9().y4();
            break;
         case 4:
            this.l6 = this.t9().z3();
            break;
         case 5:
         case 6:
         default:
            this.l6 = this.t9().n5();
            throw new NotImplementedException();
         case 7:
            this.l6 = this.t9().x8();
            break;
         case 8:
            this.l6 = this.t9().t4();
            break;
         case 9:
            this.l6 = this.t9().q0();
            break;
         case 10:
            this.l6 = this.t9().l6((IAudio)null);
            break;
         case 11:
            this.l6 = this.t9().k5("");
            break;
         case 12:
            this.l6 = this.t9().s7();
            break;
         case 13:
            this.l6 = this.t9().t2();
            break;
         case 14:
            this.l6 = this.t9().a6();
            break;
         case 15:
            this.l6 = ((ControlCollection)this.y4().y4().getControls()).n5();
      }
   }

   void x8() {
      if (this.l6 != null) {
         this.t9().remove((IShape)this.l6);
      }
   }

   private void n5() {
      com.aspose.slides.internal.k0r.q5 var1 = this.n3();
      if (var1 != null) {
         this.l6();
         com.aspose.slides.internal.k0r.d3 var2 = var1.x8();
         if (var2 != null) {
            if (var2.l6().u3()) {
               this.a6 = var2.l6().j5().l6();
            }
         }
      }
   }

   private void l6() {
      com.aspose.slides.internal.k0r.c9 var1 = this.n3().s7();
      if (var1 != null) {
         if (var1.t2() != null) {
            this.k5 = new y2p(var1.t2());
         }

         if (var1.t4() != null) {
            this.k5 = new y2p(var1.t4());
         }

         if (var1.t9() != null) {
            this.k5 = new y2p(var1.t9());
         }
      }
   }

   final com.aspose.slides.internal.k0r.q5 n3() {
      return (com.aspose.slides.internal.k0r.q5)this.n5.k5();
   }

   final t2s y4() {
      return this.n5.u3();
   }

   final l3c e2() {
      return this.n5.u9();
   }

   final ShapeCollection t9() {
      return this.n5.h0();
   }

   final v5s z1() {
      return this.n5.x8();
   }

   final v5s t4() {
      return this.n5;
   }

   final y2p q0() {
      if (this.k5 == null) {
         this.n5();
      }

      return this.k5;
   }

   final p3f z3() {
      if (this.u3 == null) {
         this.u3 = new p3f(this);
      }

      return this.u3;
   }

   ISlideComponent m1() {
      if (this.l6 == null) {
         this.s7();
      }

      return this.l6;
   }

   final void n5(ISlideComponent var1) {
      this.x8();
      this.l6 = var1;
   }

   final int k7() {
      return this.a6;
   }

   final int m3() {
      return this.n5.c8();
   }

   final IFontData[] z8() {
      if (this.u9 == null) {
         this.u9 = this.m1().getPresentation().getFontsManager().getFonts();
      }

      return this.u9;
   }
}
