package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

final class p3f {
   private a9x n5;
   private com.aspose.slides.internal.k0r.q5 l6;
   private com.aspose.slides.internal.k0r.r5w k5;
   private int u3 = 4;
   private com.aspose.slides.internal.k0r.t9p a6 = null;
   private List<com.aspose.slides.internal.k0r.z1n> u9 = null;
   private TextFrame h0 = null;
   private boolean c8 = false;
   private boolean t2 = false;
   private boolean s7 = false;
   private boolean x8 = false;
   private s3f n3;
   private d5f y4 = null;
   private List<com.aspose.slides.internal.k0r.e6r> e2 = new List<>();

   p3f(a9x var1) {
      this.n5 = var1;
      this.l6 = var1.n3();
      this.t4();
      this.q0();
      this.z3();
      this.m1();
      this.k7();
      this.m3();
      this.z1();
   }

   p3f(TextFrame var1, com.aspose.slides.internal.k0r.d3 var2) {
      this.h0 = var1;
      this.k5 = var2.l6();
      this.m3();
   }

   final void n5() {
      this.n5(com.aspose.slides.internal.v6g.k5.n5(this.n5.m1(), AutoShape.class));
   }

   final void n5(AutoShape var1) {
      if (var1 != null && this.h0 != null) {
         var1.n5(this.h0());
      }
   }

   final void n5(Object var1) {
      d5f var2 = com.aspose.slides.internal.v6g.k5.n5(var1, d5f.class);
      if (var2 != null) {
         this.y4 = var2;
      }
   }

   private void z1() {
      this.n3 = null;
      if (this.l6() != null) {
         t2s var1 = this.l6().y4();
         t2s var2 = null;
         if (var1.n3() == 4) {
            var2 = var1.n5(2);
         }

         if (var2 == null) {
            var2 = var1.c8();
         }

         if (var1.c4() || var1.y2()) {
            var2 = var1.a6().w1();
         }

         if (var2 != null) {
            if (var2.e2()[this.u3] != null) {
               this.n3 = var2.e2()[this.u3];
            }
         } else if (var1.e2() != null && var1.e2()[this.u3] != null) {
            this.n3 = var1.e2()[this.u3];
         }
      }
   }

   private void t4() {
      com.aspose.slides.internal.k0r.c9 var1 = this.l6.s7();
      if (var1 != null) {
         com.aspose.slides.internal.k0r.k9m var2 = var1.x8();
         if (var2 != null && var2.l6() != null) {
            this.a6 = var2.l6().l6();
         }
      }
   }

   private void q0() {
      this.k5 = null;
      com.aspose.slides.internal.k0r.d3 var1 = this.l6.x8();
      if (var1 != null) {
         this.k5 = var1.l6();
      }
   }

   private void z3() {
      if (this.a6 == null) {
         if (this.n5 != null) {
            if (this.n5.q0() != null) {
               t2s var1 = this.l6().y4();
               if (var1.a6().h0().z1() != null) {
                  com.aspose.slides.internal.k0r.o0 var2 = var1.a6().h0().z1().u3();
                  if (var2 != null) {
                     com.aspose.slides.internal.k0r.p0 var3 = null;
                     com.aspose.slides.internal.k0r.g3 var4 = var2.l6();
                     if (var4 != null) {
                        var3 = var4.t4();
                     }

                     if (var3 != null) {
                        this.a6 = var3.n5(var1.y4().u3().n5(), (short)((int)this.n5.q0().l6() << 4));
                     }
                  }
               }
            }
         }
      }
   }

   private void m1() {
      if (this.l6.a6() != null && this.l6.a6().l6().l6(255)) {
         com.aspose.slides.internal.k0r.p6 var1 = com.aspose.slides.internal.v6g.k5.n5(this.l6.a6().l6().n5(255), com.aspose.slides.internal.k0r.p6.class);
         this.c8 = var1.h0();
      }
   }

   private void k7() {
      this.t2 = this.n5.q0() != null;
      int var1 = this.l6().k7();
      if (var1 >= 0) {
         com.aspose.slides.internal.k0r.r5w var2 = this.k5;
         this.k5 = this.l6().y4().m1().get_Item(var1);
         if (var2 == null) {
            return;
         }

         if (var2.n3()) {
            this.e2.addItem(var2.k7());
         }
      }
   }

   private void m3() {
      if (this.k5 != null) {
         if (this.k5.t2()) {
            this.u9 = this.k5.c4();
         }

         if (this.k5.a6()) {
            this.u3 = this.k5.m1().l6();
         }

         if (this.k5.u9()) {
            for (int var1 = 0; var1 < this.k5.m3().length(); var1++) {
               char var2 = this.k5.m3().charAt(var1);
               this.s7 = this.s7 | com.aspose.slides.internal.n2d.u9.u3((int)var2) == 2;
               if (this.s7) {
                  break;
               }
            }
         }

         boolean var3 = this.t2 && this.n5.q0().n5() == 0;
         this.x8 = var3;
         switch (this.u3) {
            case 0:
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
               this.x8 = true;
            case 3:
            case 4:
            default:
               if (var3) {
                  switch (this.l6().q0().k5()) {
                     case 7:
                     case 8:
                     case 9:
                        this.x8 = false;
                  }
               }
         }
      }
   }

   final a9x l6() {
      return this.n5;
   }

   final com.aspose.slides.internal.k0r.q5 k5() {
      return this.l6;
   }

   final int u3() {
      return this.u3;
   }

   final com.aspose.slides.internal.k0r.r5w a6() {
      return this.k5;
   }

   final com.aspose.slides.internal.k0r.t9p u9() {
      return this.a6;
   }

   final TextFrame h0() {
      if (this.h0 == null) {
         r0g var1 = (r0g)this.l6().m1();
         if (com.aspose.slides.internal.v6g.k5.l6(var1, AutoShape.class)) {
            TextFrame var2 = (TextFrame)((AutoShape)var1).getTextFrame();
            if (var2 == null) {
               var2 = new TextFrame(var1);
            }

            this.h0 = var2;
         } else {
            this.h0 = new TextFrame(var1);
         }
      }

      return this.h0;
   }

   final d5f c8() {
      if (this.y4 != null) {
         return this.y4;
      } else {
         return this.l6() != null ? this.l6().y4().a6() : null;
      }
   }

   final s3f t2() {
      return this.n3;
   }

   final List<com.aspose.slides.internal.k0r.e6r> s7() {
      return this.e2;
   }

   final List<com.aspose.slides.internal.k0r.z1n> x8() {
      return this.u9;
   }

   final boolean n3() {
      return this.x8;
   }

   final boolean y4() {
      return this.c8;
   }

   final boolean e2() {
      return this.t2;
   }

   final boolean t9() {
      return this.s7;
   }
}
